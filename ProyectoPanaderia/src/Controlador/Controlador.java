package Controlador;

import Modelo.Administrador;
import Modelo.Clientes;
import Modelo.Documento;
import Modelo.Empleado;
import Modelo.MateriaPrima;
import Modelo.Productos;
import Modelo.Proveedor;
import Modelo.SqlAdministrador;
import Modelo.SqlCuentas;
import Modelo.SqlEmpleado;
import Modelo.Ventas;
import Ventana.Home;
import Ventana.Login;
import Ventana.VistaAdministrador;
import Ventana.VistaEmpleado;
import Ventana.VistaRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Controlador implements ActionListener {

    Administrador administrador;
    Empleado empleado;
    SqlAdministrador sqlAdministrador;
    SqlEmpleado sqlEmpleado;
    SqlCuentas sqlCuentas;
    Login login;
    Clientes clientes;
    Proveedor proveedor;
    Home home;
    Documento documento;
    //Administrador
    MateriaPrima materiaPrima;
    Productos productos;
    Ventas ventas;
    VistaAdministrador vistaA;
    VistaEmpleado vistaE;
    VistaRegistro vistaR;
    //Tablas y arraylist
    DefaultTableModel modeloMateriaPrima = new DefaultTableModel();
    DefaultTableModel modeloVentas = new DefaultTableModel();
    DefaultTableModel modeloVentasCopy = new DefaultTableModel();
    DefaultTableModel modeloProductos = new DefaultTableModel();
    DefaultTableModel modeloClientes = new DefaultTableModel();
    DefaultTableModel modeloEmpleados = new DefaultTableModel();
    DefaultTableModel modeloProveedores = new DefaultTableModel();
    ArrayList<Ventas> acumularVentas = new ArrayList<Ventas>();
    String fecha = LocalDate.now() + "";

    public Controlador(Administrador administrador, Empleado empleado, Clientes clientes,
            Proveedor proveedor, SqlAdministrador sqlAdministrador, SqlEmpleado sqlEmpleado,
            Login login, MateriaPrima materiaPrima, Productos productos, Ventas ventas,
            VistaAdministrador vistaA, VistaEmpleado vistaE, VistaRegistro vistaR,
            SqlCuentas sqlCuentas, Home home, Documento documento) {
        this.administrador = administrador;
        this.empleado = empleado;
        this.sqlAdministrador = sqlAdministrador;
        this.sqlEmpleado = sqlEmpleado;
        this.login = login;
        this.materiaPrima = materiaPrima;
        this.vistaA = vistaA;
        this.productos = productos;
        this.ventas = ventas;
        this.vistaE = vistaE;
        this.clientes = clientes;
        this.proveedor = proveedor;
        this.sqlCuentas = sqlCuentas;
        this.vistaR = vistaR;
        this.home = home;
        this.documento = documento;

        home.btn_admin.addActionListener(this);
        home.btn_user.addActionListener(this);
        login.btn_home.addActionListener(this);
        login.btIniciarSesion.addActionListener(this);

        //Admin
        vistaA.btInsertar.addActionListener(this);
        vistaA.btEliminar.addActionListener(this);
        vistaA.btVolver.addActionListener(this);
        vistaA.btBuscarVentasPorFecha.addActionListener(this);
        vistaA.btCargarTodasLasVentas.addActionListener(this);
        vistaA.btActualizarPrecio.addActionListener(this);
        vistaA.btAñadirProducto.addActionListener(this);
        vistaA.btActualizarCliente.addActionListener(this);
        vistaA.btBuscarCliente.addActionListener(this);
        vistaA.btEliminarCliente.addActionListener(this);
        vistaA.btLimpiarClientes.addActionListener(this);
        //Empleado
        vistaE.btRegistrarVenta.addActionListener(this);
        vistaE.btVolverE.addActionListener(this);
        vistaR.btRegistrarCliente.addActionListener(this);
        vistaE.btRegistrarCliente.addActionListener(this);
        vistaE.btAñadirProducto.addActionListener(this);
        vistaE.btVaciarRegistro.addActionListener(this);
        //Cuentas
        vistaA.btAcualizarAdministrador.addActionListener(this);
        vistaA.btBuscarEmpleados.addActionListener(this);
        vistaA.btActualizarEmpleados.addActionListener(this);
        vistaA.btInsertarEmpleados.addActionListener(this);
        vistaA.btEliminarEmpleados.addActionListener(this);
        vistaA.btLimpiarEmpleados.addActionListener(this);
        vistaE.btActualizarEmpleado.addActionListener(this);
        vistaA.btLimpiarProveedor.addActionListener(this);
        vistaA.btActualizarProveedor.addActionListener(this);
        vistaA.btInsertarProveedor.addActionListener(this);
        vistaA.btBuscarProveedor.addActionListener(this);
        vistaA.btEliminarProveedor.addActionListener(this);
        //Documentos
        vistaA.btPdf.addActionListener(this);
        vistaE.btPdf.addActionListener(this);
    }

    public void Iniciar() {
        vistaA.lbFechaA1.setText(fecha);
        vistaA.lbFechaA2.setText(fecha);
        vistaA.lbFechaA3.setText(fecha);
        vistaA.lbFechaA4.setText(fecha);

        vistaE.lbFechaE1.setText(fecha);
        vistaE.lbFechaE2.setText(fecha);

    }

    //Eventos de los botones
    @Override
    public void actionPerformed(ActionEvent e) {
        //Eventos Admin
        if (e.getSource() == login.btIniciarSesion) {// Iniciar Sesion
            String nombre = login.txtNombre.getText();
            String pass = new String(login.txtContraseña.getPassword());
            administrador.setNombre(nombre);
            administrador.setContraseña(pass);
            empleado.setNombre(nombre);
            empleado.setContraseña(pass);

            if (sqlAdministrador.iniciarSesion(administrador)) {
                JOptionPane.showMessageDialog(null, "Sesión iniciada correctamente");
                cargarTablaMateriaPrima();
                cargarTablaVentas(this.fecha, vistaA.tbVentas);
                cargarTablaProductos(vistaA.tbProductos);
                cargarTablaClientes();
                llenarCamposAdministrador();
                cargarTablaEmpleados();
                cargarTablaProveedores();
                //
                vistaA.btEliminarCliente.setVisible(false);
                login.setVisible(false);
                vistaA.setVisible(true);
                vistaE.setVisible(false);
                vistaA.lbPanadero.setText(administrador.getNombre() + " " + administrador.getApellido());
            } else if (sqlEmpleado.iniciarSesion(empleado)) {
                JOptionPane.showMessageDialog(null, "Sesión iniciada correctamente");
                cargarTablaVentas(this.fecha, vistaE.tbVentas);
                cargarTablaProductos(vistaE.tbProductos);
                login.setVisible(false);
                vistaA.setVisible(false);
                vistaE.setVisible(true);

                vistaE.lbUsuario.setText(empleado.getNombre() + " " + empleado.getApellido());
                vistaE.lbEmpleado.setText(empleado.getNombre() + " " + empleado.getApellido());
                infoPan();
                llenarCamposEmpleado();
            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
            }
        } else if (e.getSource() == vistaA.btInsertar) {

            if (!vistaA.txtCantidad.getText().equals("") && cargarMateriaPrima()) {

                if (JOptionPane.showConfirmDialog(null, "Esta seguro de añadir la materia prima seleccionada?") == 0) {
                    materiaPrima.setCantidad(Integer.parseInt(vistaA.txtCantidad.getText()));
                    if (sqlAdministrador.insertarMateriaPrima(materiaPrima)) {
                        cargarTablaMateriaPrima();
                        JOptionPane.showMessageDialog(null, "Se ha añadido la materia prima exitosamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo añadir");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ha cancelado añadir la materia prima");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un producto y digite una cantidad a añadir");
            }

        } else if (e.getSource() == vistaA.btEliminar) {

            if (!vistaA.txtCantidadEliminar.getText().equals("") && cargarMateriaPrima()) {

                if (JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar la materia prima?") == 0) {
                    materiaPrima.setCantidad(-1 * Integer.parseInt(vistaA.txtCantidadEliminar.getText()));

                    if (sqlAdministrador.insertarMateriaPrima(materiaPrima)) {
                        cargarTablaMateriaPrima();
                        JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo eliminar");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ha cancelado eliminar la materia prima");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un producto y digite una cantidad a eliminar");
            }
        } else if (e.getSource() == vistaA.btBuscarVentasPorFecha) {
            try {
                Date fechaA = Date.valueOf(JOptionPane.showInputDialog("Digite una fecha para buscar", "0000-00-00"));
                cargarTablaVentas(fechaA.toString(), vistaA.tbVentas);
            } catch (IllegalArgumentException ie) {
                JOptionPane.showMessageDialog(null, "Digite un formato de fecha válido");
                System.err.print("Error, " + ie);
            }
        } else if (e.getSource() == vistaA.btCargarTodasLasVentas) {
            cargarTablaVentas();
        } else if (e.getSource() == vistaA.btAñadirProducto) {

            if (!vistaA.txtCantidadProductoA.getText().equals("") && cargarProductosAdmin()) {

                if (JOptionPane.showConfirmDialog(null, "Esta seguro de añadir mas productos?") == 0) {
                    productos.setCantidad(Integer.parseInt(vistaA.txtCantidadProductoA.getText()));

                    if (sqlAdministrador.insertarProductos(productos)) {
                        cargarTablaProductos(vistaA.tbProductos);
                        JOptionPane.showMessageDialog(null, "Se ha añadido el producto exitosamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo añadir");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ha cancelado añadir mas productos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un producto y digite una cantidad a añadir");
            }
        } else if (e.getSource() == vistaA.btActualizarPrecio) {

            if (!vistaA.txtPrecioA.getText().equals("") && cargarProductosAdmin()) {

                if (JOptionPane.showConfirmDialog(null, "Esta seguro de acualizar el precio del producto?") == 0) {
                    productos.setPrecio(Double.parseDouble(vistaA.txtPrecioA.getText()));
                    productos.setCantidad(0);

                    if (sqlAdministrador.insertarProductos(productos)) {
                        cargarTablaProductos(vistaA.tbProductos);
                        JOptionPane.showMessageDialog(null, "Se ha actualizado el precio exitosamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo actualizar");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ha cancelado actualizar el precio");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un producto y digite un precio a actualizar");
            }
        } else if (e.getSource() == vistaA.btActualizarCliente) {
            if (camposCliente()) {

                if (vistaA.txtCedulaCliente.getText().length() == 10) {
                    clientes.setIdClientes(Integer.parseInt(vistaA.txtIdCliente.getText()));
                    sqlAdministrador.buscarCliente(clientes);
                    if (JOptionPane.showConfirmDialog(null, "Esta seguro de guardar los cambios del cliente "
                            + clientes.getNombre() + " " + clientes.getApellido() + "?") == 0) {
                        clientes.setNombre(vistaA.txtNombreCliente.getText());
                        clientes.setApellido(vistaA.txtApellidoCliente.getText());
                        clientes.setCedula(Integer.parseInt(vistaA.txtCedulaCliente.getText()));

                        if (sqlAdministrador.actualizarCliente(clientes)) {
                            JOptionPane.showMessageDialog(null, "Se ha guardado los cambios");
                            cargarTablaClientes();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La cédula debe tener 10 dígitos numericos");
                }

            }
        } else if (e.getSource() == vistaA.btBuscarCliente) {
            if (!vistaA.txtIdCliente.getText().equals("")) {
                clientes.setIdClientes(Integer.parseInt(vistaA.txtIdCliente.getText()));

                if (sqlAdministrador.buscarCliente(clientes)) {
                    vistaA.txtNombreCliente.setText(clientes.getNombre());
                    vistaA.txtApellidoCliente.setText(clientes.getApellido());
                    vistaA.txtCedulaCliente.setText(String.valueOf(clientes.getCedula()));
                } else {
                    JOptionPane.showMessageDialog(null, "No es encontro al cliente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor digite el id del cliente");
            }
        } else if (e.getSource() == vistaA.btEliminarCliente) {
            if (!vistaA.txtIdCliente.getText().equals("")) {
                clientes.setIdClientes(Integer.parseInt(vistaA.txtIdCliente.getText()));

                if (JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el cliente?") == 0) {
                    if (sqlAdministrador.eliminarCliente(clientes)) {
                        vaciarCamposClientes();
                        cargarTablaClientes();
                        JOptionPane.showMessageDialog(null, "Cliente eliminado");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor digite el id del cliente");
            }
        } else if (e.getSource() == vistaA.btLimpiarClientes) {
            vaciarCamposClientes();
        } else if (e.getSource() == vistaA.btVolver) {
            login.setVisible(true);
            vistaA.setVisible(false);
            vistaE.setVisible(false);

            //Eventos del vendedor
        } else if (e.getSource() == vistaE.btRegistrarVenta) {
            if (acumularVentas.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se ha insertado ni un producto");
            } else {

                if (JOptionPane.showConfirmDialog(null, "Esta seguro de realizar la venta?") == 0) {
                    JOptionPane.showMessageDialog(null, "Registro de venta exitoso");

                    for (int i = 0; i < acumularVentas.size(); i++) {
                        if (!registrarVentas(acumularVentas.get(i), productos)) {
                            //JOptionPane.showMessageDialog(null, "No se pudo registar la venta");
                            break;
                        }
                    }

                    infoPan();
                    vistaE.comboProductos.setSelectedIndex(0);
                    cargarTablaVentas(this.fecha, vistaE.tbVentas);
                    cargarTablaProductos(vistaE.tbProductos);
                    acumularVentas.clear();
                } else {
                    JOptionPane.showMessageDialog(null, "Registro de venta cancelado");
                }
            }
        } else if (e.getSource() == vistaE.btVolverE) {
            login.setVisible(true);
            vistaA.setVisible(false);
            vistaE.setVisible(false);
        } else if (e.getSource() == vistaE.btRegistrarCliente) {
            //System.out.println("visible??");
            vistaR.setVisible(true);

        } else if (e.getSource() == vistaR.btRegistrarCliente) {
            if (registrarCliente()) {
                JOptionPane.showMessageDialog(null, "Registro exitoso");
                vistaE.txtCliente.setText(String.valueOf(clientes.getCedula()));
                vistaR.setVisible(false);
            }
        } else if (e.getSource() == vistaE.btAñadirProducto) {
            if (!(vistaE.txtCantidad.getText().equals("") || vistaE.comboProductos.getSelectedItem().toString().equals("Seleccionar"))) {
                ventasAcumuladas();
            } else {
                JOptionPane.showMessageDialog(null, "Complete los campos vacios");
            }
        } else if (e.getSource() == vistaE.btVaciarRegistro) {
            limpiarRegistros();
            JOptionPane.showMessageDialog(null, "Ventas insertadas limpiadas");

            //Eventos de las cuentas
        } else if (e.getSource() == vistaA.btAcualizarAdministrador) {
            if (camposAdministrador()) {
                if (vistaA.txtCedulaAdministrador.getText().length() == 10) {

                    if (JOptionPane.showConfirmDialog(null, "Esta seguro de guardar los cambios del administrador?") == 0) {
                        administrador.setNombre(vistaA.txtNombreAdministrador.getText());
                        administrador.setApellido(vistaA.txtApelllidoAdministrador.getText());
                        administrador.setCedula(Integer.parseInt(vistaA.txtCedulaAdministrador.getText()));
                        administrador.setContraseña(vistaA.txtContraseñaAdministrador.getText());

                        if (sqlCuentas.actualizarAdminitrador(administrador)) {
                            llenarCamposAdministrador();
                            JOptionPane.showMessageDialog(null, "Se ha guardado los cambios");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La cédula debe tener 10 dígitos numericos");
                }
            }
        } else if (e.getSource() == vistaA.btActualizarEmpleados) {
            if (camposEmpleados()) {

                if (vistaA.txtCedulaEmpleados.getText().length() == 10) {
                    empleado.setIdEmpleado(Integer.parseInt(vistaA.txtIdEmpleado.getText()));
                    sqlCuentas.buscarEmpleado(empleado);
                    if (JOptionPane.showConfirmDialog(null, "Esta seguro de guardar los cambios del empleado "
                            + empleado.getNombre() + " " + empleado.getApellido() + "?") == 0) {
                        empleado.setNombre(vistaA.txtNombreEmpleados.getText());
                        empleado.setApellido(vistaA.txtApellidoEmpleados.getText());
                        empleado.setCedula(Integer.parseInt(vistaA.txtCedulaEmpleados.getText()));
                        empleado.setContraseña(vistaA.txtContraseñaEmpleados.getText());
                        if (sqlCuentas.actualizarEmpleado(empleado)) {
                            JOptionPane.showMessageDialog(null, "Se ha guardado los cambios");
                            cargarTablaEmpleados();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La cédula debe tener 10 dígitos numericos");
                }

            }
        } else if (e.getSource() == vistaA.btBuscarEmpleados) {
            if (!vistaA.txtIdEmpleado.getText().equals("")) {
                empleado.setIdEmpleado(Integer.parseInt(vistaA.txtIdEmpleado.getText()));

                if (sqlCuentas.buscarEmpleado(empleado)) {
                    vistaA.txtIdEmpleado.setText(String.valueOf(empleado.getIdEmpleado()));
                    vistaA.txtNombreEmpleados.setText(empleado.getNombre());
                    vistaA.txtApellidoEmpleados.setText(empleado.getApellido());
                    vistaA.txtContraseñaEmpleados.setText(empleado.getContraseña());
                    vistaA.txtCedulaEmpleados.setText(String.valueOf(empleado.getCedula()));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor digite el id del empleado");
            }
        } else if (e.getSource() == vistaA.btInsertarEmpleados) {
            if (camposEmpleadosRegistro()) {

                if (vistaA.txtCedulaEmpleados.getText().length() == 10) {
                    if (JOptionPane.showConfirmDialog(null, "Esta seguro añadir un nuevo empleado?") == 0) {
                        empleado.setNombre(vistaA.txtNombreEmpleados.getText());
                        empleado.setApellido(vistaA.txtApellidoEmpleados.getText());
                        empleado.setCedula(Integer.parseInt(vistaA.txtCedulaEmpleados.getText()));
                        empleado.setContraseña(vistaA.txtContraseñaEmpleados.getText());

                        if (sqlCuentas.insertarEmpleado(empleado)) {
                            cargarTablaEmpleados();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La cedula debe tener 10 digitos numericos");
                }
            }
        } else if (e.getSource() == vistaA.btEliminarEmpleados) {
            if (!vistaA.txtIdEmpleado.getText().equals("")) {
                empleado.setIdEmpleado(Integer.parseInt(vistaA.txtIdEmpleado.getText()));
                sqlCuentas.buscarEmpleado(empleado);

                if (JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el empleado "
                        + empleado.getNombre() + " " + empleado.getApellido() + "?") == 0) {
                    if (sqlCuentas.eliminarEmpleado(empleado)) {
                        vaciarCamposEmpleado();
                        cargarTablaEmpleados();
                        JOptionPane.showMessageDialog(null, "Empleado eliminado");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor digite el id del empleado");
            }
        } else if (e.getSource() == vistaA.btLimpiarEmpleados) {
            vaciarCamposEmpleado();
        } else if (e.getSource() == vistaE.btActualizarEmpleado) {
            if (camposEmpleadoVistaE()) {

                if (vistaE.txtCedulaEmpleado.getText().length() == 10) {
                    empleado.setIdEmpleado(Integer.parseInt(vistaE.txtIdEmpleado.getText()));
                    sqlCuentas.buscarEmpleado(empleado);
                    if (JOptionPane.showConfirmDialog(null, "Esta seguro de guardar los cambios?") == 0) {
                        empleado.setNombre(vistaE.txtNombreEmpleado.getText());
                        empleado.setApellido(vistaE.txtApellidoEmpleado.getText());
                        empleado.setCedula(Integer.parseInt(vistaE.txtCedulaEmpleado.getText()));
                        empleado.setContraseña(vistaE.txtContraseñaEmpleado.getText());
                        if (sqlCuentas.actualizarEmpleado(empleado)) {
                            JOptionPane.showMessageDialog(null, "Se ha guardado los cambios");
                            llenarCamposEmpleado();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La cédula debe tener 10 dígitos numericos");
                }

            }
            //Eventos Proveedores
        } else if (e.getSource() == vistaA.btBuscarProveedor) {
            if (!vistaA.txtIdProveedor.getText().equals("")) {
                proveedor.setIdProveedor(Integer.parseInt(vistaA.txtIdProveedor.getText()));

                if (sqlCuentas.buscarProveedor(proveedor)) {
                    vistaA.txtIdProveedor.setText(String.valueOf(proveedor.getIdProveedor()));
                    vistaA.txtNombreProveedor.setText(proveedor.getNombre());
                    vistaA.txtApellidoProveedor.setText(proveedor.getApellido());
                    vistaA.txtEmpresaProveedor.setText(proveedor.getEmpresa());
                    vistaA.txtProductoProveedor.setText(proveedor.getProducto());
                    vistaA.txtTelefonoProveedor.setText(proveedor.getTelefono());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor digite el id del proveedor");
            }
        } else if (e.getSource() == vistaA.btActualizarProveedor) {
            if (camposProveedores()) {
                proveedor.setIdProveedor(Integer.parseInt(vistaA.txtIdProveedor.getText()));
                sqlCuentas.buscarProveedor(proveedor);
                if (JOptionPane.showConfirmDialog(null, "Esta seguro de guardar los cambios del proveedor "
                        + proveedor.getNombre() + " " + proveedor.getApellido() + "?") == 0) {
                    proveedor.setNombre(vistaA.txtNombreProveedor.getText());
                    proveedor.setApellido(vistaA.txtApellidoProveedor.getText());
                    proveedor.setEmpresa(vistaA.txtEmpresaProveedor.getText());
                    proveedor.setProducto(vistaA.txtProductoProveedor.getText());
                    proveedor.setTelefono(vistaA.txtTelefonoProveedor.getText());
                    if (sqlCuentas.actualizarProveedor(proveedor)) {
                        JOptionPane.showMessageDialog(null, "Se ha guardado los cambios");
                        cargarTablaProveedores();
                    }
                }
            }
        } else if (e.getSource() == vistaA.btInsertarProveedor) {
            if (camposProveedores()) {

                if (JOptionPane.showConfirmDialog(null, "Esta seguro añadir un nuevo proveedor?") == 0) {
                    proveedor.setNombre(vistaA.txtNombreProveedor.getText());
                    proveedor.setApellido(vistaA.txtApellidoProveedor.getText());
                    proveedor.setEmpresa(vistaA.txtEmpresaProveedor.getText());
                    proveedor.setProducto(vistaA.txtProductoProveedor.getText());
                    proveedor.setTelefono(vistaA.txtTelefonoProveedor.getText());

                    if (sqlCuentas.insertarProveedor(proveedor)) {
                        cargarTablaProveedores();
                    }
                }
            }
        } else if (e.getSource() == vistaA.btEliminarProveedor) {
            if (!vistaA.txtIdProveedor.getText().equals("")) {
                proveedor.setIdProveedor(Integer.parseInt(vistaA.txtIdProveedor.getText()));
                sqlCuentas.buscarProveedor(proveedor);

                if (JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el proveedor "
                        + proveedor.getNombre() + " " + proveedor.getApellido() + "?") == 0) {
                    if (sqlCuentas.eliminarProveedor(proveedor)) {
                        limpiarCamposProveedores();
                        cargarTablaProveedores();
                        JOptionPane.showMessageDialog(null, "Proveedor eliminado");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor digite el id del proveedor");
            }
        } else if (e.getSource() == vistaA.btLimpiarProveedor) {
            limpiarCamposProveedores();
        } else if (e.getSource() == home.btn_admin) {
            //HOME
            login.pn_colorTitulo.setBackground(new java.awt.Color(12, 100, 167));
            login.lb_titulo.setText("ADMINISTRADOR");
            login.txtNombre.setText("Rodrigo");
            login.btn_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Admin_194.png")));
            login.setVisible(true);
            home.setVisible(false);

        } else if (e.getSource() == home.btn_user) {

            login.pn_colorTitulo.setBackground(new java.awt.Color(0, 122, 204));
            login.lb_titulo.setText("        USUARIO");
            login.btn_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User_194.png")));
            login.txtNombre.setText("Gerry");
            login.setVisible(true);
            home.setVisible(false);
        } else if (e.getSource() == login.btn_home) {

            home.setVisible(true);
            login.setVisible(false);

            //GENERAR PDF
        } else if (e.getSource() == vistaA.btPdf) {
            //cargarTablaVentas( fecha, vistaA.tbVentas);

            if (documento.pdfVentasEmpleado(modeloVentasCopy)) {
                JOptionPane.showMessageDialog(null, "Documento generado exitosamente");
            }
        } else if (e.getSource() == vistaE.btPdf) {
            if (documento.pdfVentasEmpleado(sqlAdministrador.cargarTablaVentas(fecha))) {
                JOptionPane.showMessageDialog(null, "Documento generado exitosamente");
            }
        }
    }

    //Metodos Administrador
    private void cargarTablaMateriaPrima() {
        vistaA.tbMateriaPrima.setModel(modeloMateriaPrima);
        modeloMateriaPrima.setColumnCount(0);
        modeloMateriaPrima.setRowCount(0);

        modeloMateriaPrima.addColumn("Id");
        modeloMateriaPrima.addColumn("Producto");
        modeloMateriaPrima.addColumn("Cantidad");
        modeloMateriaPrima.addColumn("Unidad de medida");

        Object[][] tabla = sqlAdministrador.cargarTablaMateriaPrima();

        for (int i = 0; i < tabla.length; i++) {
            Object[] fila = new Object[4];
            for (int j = 0; j < fila.length; j++) {
                fila[j] = tabla[i][j];
                //System.out.println(fila[i]);
            }
            modeloMateriaPrima.addRow(fila);
        }

        modeloMateriaPrima.addRow(new Object[4]);
        modeloMateriaPrima.addRow(new Object[4]);

    }

    private boolean camposCliente() {
        if (vistaA.txtApellidoCliente.getText().equals("") || vistaA.txtCedulaCliente.getText().equals("")
                || vistaA.txtIdCliente.getText().equals("") || vistaA.txtNombreCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            return false;
        } else {
            return true;
        }
    }

    private boolean cargarMateriaPrima() {
        if (!vistaA.comboMateriaPrima.getSelectedItem().toString().equals("Seleccionar")) {
            materiaPrima.setMateria(vistaA.comboMateriaPrima.getSelectedItem().toString());
            if (!sqlAdministrador.cargarMateriaPrima(materiaPrima)) {
                JOptionPane.showMessageDialog(null, "No se pudo cargar la materia prima");
                return false;
            } else {
                return true;
            }

        } else {
            materiaPrima.setMateria("");
            return false;
        }
    }

    private void cargarTablaVentas() {
        vistaA.tbVentas.setModel(modeloVentas);
        modeloVentas.setColumnCount(0);
        modeloVentas.setRowCount(0);

        modeloVentas.addColumn("Id");
        modeloVentas.addColumn("Producto");
        modeloVentas.addColumn("Cantidad");
        modeloVentas.addColumn("Precio");
        modeloVentas.addColumn("Fecha de venta");
        modeloVentas.addColumn("Nombre");
        modeloVentas.addColumn("Apellido");
        modeloVentas.addColumn("Cédula");

        modeloVentasCopy.setColumnCount(0);
        modeloVentasCopy.setRowCount(0);
        modeloVentasCopy.addColumn("Id");
        modeloVentasCopy.addColumn("Producto");
        modeloVentasCopy.addColumn("Cantidad");
        modeloVentasCopy.addColumn("Precio");
        modeloVentasCopy.addColumn("Fecha de venta");
        modeloVentasCopy.addColumn("Nombre");
        modeloVentasCopy.addColumn("Apellido");
        modeloVentasCopy.addColumn("Cédula");

        ArrayList<Object[]> tabla = sqlAdministrador.cargarTablaVentas();

        for (int i = 0; i < tabla.size(); i++) {
            modeloVentas.addRow(tabla.get(i));
            modeloVentasCopy.addRow(tabla.get(i));
        }
    }

    private void cargarTablaClientes() {
        vistaA.tbClientes.setModel(modeloClientes);
        modeloClientes.setColumnCount(0);
        modeloClientes.setRowCount(0);

        modeloClientes.addColumn("Id");
        modeloClientes.addColumn("Nombre");
        modeloClientes.addColumn("Apellido");
        modeloClientes.addColumn("Cédula");

        ArrayList<Object[]> tabla = sqlAdministrador.cargarTablaClientes();

        for (int i = 0; i < tabla.size(); i++) {
            modeloClientes.addRow(tabla.get(i));
        }
    }

    private void cargarTablaVentas(String fecha, JTable a) {
        a.setModel(modeloVentas);
        modeloVentas.setColumnCount(0);
        modeloVentas.setRowCount(0);

        modeloVentas.addColumn("Id");
        modeloVentas.addColumn("Producto");
        modeloVentas.addColumn("Cantidad");
        modeloVentas.addColumn("Precio");
        modeloVentas.addColumn("Fecha de venta");
        modeloVentas.addColumn("Nombre");
        modeloVentas.addColumn("Apellido");
        modeloVentas.addColumn("Cédula");

        modeloVentasCopy.setColumnCount(0);
        modeloVentasCopy.setRowCount(0);
        modeloVentasCopy.addColumn("Id");
        modeloVentasCopy.addColumn("Producto");
        modeloVentasCopy.addColumn("Cantidad");
        modeloVentasCopy.addColumn("Precio");
        modeloVentasCopy.addColumn("Fecha de venta");
        modeloVentasCopy.addColumn("Nombre");
        modeloVentasCopy.addColumn("Apellido");
        modeloVentasCopy.addColumn("Cédula");

        ArrayList<Object[]> tabla = sqlAdministrador.cargarTablaVentas(fecha);
        for (int i = 0; i < tabla.size(); i++) {
            modeloVentas.addRow(tabla.get(i));
            modeloVentasCopy.addRow(tabla.get(i));
        }
    }

    private void cargarTablaProductos(JTable a) {
        a.setModel(modeloProductos);
        modeloProductos.setColumnCount(0);
        modeloProductos.setRowCount(0);

        modeloProductos.addColumn("Id");
        modeloProductos.addColumn("Producto");
        modeloProductos.addColumn("Precio");
        modeloProductos.addColumn("Cantidad");

        Object[][] tabla = sqlAdministrador.cargarTablaProductos();

        for (int i = 0; i < tabla.length; i++) {
            Object[] fila = new Object[4];
            for (int j = 0; j < fila.length; j++) {
                fila[j] = tabla[i][j];
                //System.out.println(fila[i]);
            }
            modeloProductos.addRow(fila);
        }
    }

    private boolean cargarProductosAdmin() {
        if (!vistaA.comboProductos.getSelectedItem().toString().equals("Seleccionar")) {
            productos.setNombre(vistaA.comboProductos.getSelectedItem().toString());
            if (!sqlEmpleado.cargarProductos(productos)) {
                JOptionPane.showMessageDialog(null, "No se pudo cargar el producto");
                return false;
            }
            return true;
        }
        productos.setNombre("");
        return false;
    }

    private void vaciarCamposClientes() {
        vistaA.txtIdCliente.setText("");
        vistaA.txtNombreCliente.setText("");
        vistaA.txtApellidoCliente.setText("");
        vistaA.txtCedulaCliente.setText("");
    }

    //Metodos Empleado
    private boolean cargarProductos() {
        if (!vistaE.comboProductos.getSelectedItem().toString().equals("Seleccionar")) {
            productos.setNombre(vistaE.comboProductos.getSelectedItem().toString());
            if (!sqlEmpleado.cargarProductos(productos)) {
                JOptionPane.showMessageDialog(null, "No se pudo cargar el producto");
                return false;
            }
            vistaE.lbPrecioUnitario.setText("$ " + productos.getPrecio());
            return true;
        }
        return false;
    }

    private boolean registrarVentas(Ventas ventas, Productos productos) {
        return sqlEmpleado.registrarVenta(ventas, productos);
    }

    private boolean registrarCliente() {
        String nombre = vistaR.txtNombreCliente.getText();
        String apellido = vistaR.txtApellidoCliente.getText();
        String cedula = vistaR.txtCedulaCliente.getText();

        if (nombre.equals("") || apellido.equals("") || cedula.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            return false;
        } else if (cedula.length() == 10) {
            this.clientes.setNombre(nombre);
            this.clientes.setApellido(apellido);
            this.clientes.setCedula(Integer.parseInt(cedula));

            return sqlEmpleado.registrarCliente(clientes);

        } else {
            JOptionPane.showMessageDialog(null, "El número de cedula debe tener 10 dígitos");
            return false;
        }
    }

    private void ventasAcumuladas() {
        if (cargarProductos() && cargarCliente()) {
            //Object[] venta = new Object[8];
            Ventas venta = new Ventas();
            venta.setNombre(productos.getNombre());
            venta.setCantidad(Integer.parseInt(vistaE.txtCantidad.getText()));
            venta.setPrecio(Math.round(productos.getPrecio() * venta.getCantidad() * 100.0) / 100.0);
            venta.setFechaDeVenta(LocalDate.now() + "");
            venta.setIdProducto(productos.getIdProductos());
            venta.setIdClientes(clientes.getIdClientes());

            acumularVentas.add(venta);
            double preciosTotal = 0;
            for (int i = 0; i < acumularVentas.size(); i++) {
                preciosTotal += acumularVentas.get(i).getPrecio();
            }
            vistaE.lbPrecioTotal.setText("$ " + String.valueOf(preciosTotal));
            JOptionPane.showMessageDialog(null, "Producto añadido exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo acumular la venta");
        }
    }

    private boolean cargarCliente() {

        if (vistaE.txtCliente.getText().equals("")) {
            this.clientes.setCedula(1000000000);
            this.clientes.setIdClientes(1);
        } else if (vistaE.txtCliente.getText().length() == 10) {
            this.clientes.setCedula(Integer.parseInt(vistaE.txtCliente.getText()));
        } else {
            JOptionPane.showMessageDialog(null, "Digite un número de cédula como cliente");
            return false;
        }

        if (sqlEmpleado.cargarCliente(clientes)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo cargar el cliente");
            return false;
        }
    }

    private void limpiarRegistros() {
        vistaE.comboProductos.setSelectedIndex(0);
        vistaE.lbPrecioTotal.setText("$ 0");
        vistaE.lbPrecioUnitario.setText("$ 0");
        vistaE.txtCantidad.setText(null);
        vistaE.txtCliente.setText(null);
        acumularVentas.clear();
    }

    private void infoPan() {
        int productosVendidos = 0;
        int productosDisponibles = 0;

        ArrayList<Object[]> ventasE = sqlAdministrador.cargarTablaVentas(fecha);
        Object[][] productosE = sqlAdministrador.cargarTablaProductos();

        try {
            for (Object[] productosE1 : productosE) {
                productosDisponibles += (int) productosE1[3];
            }

            for (int i = 0; i < ventasE.size(); i++) {
                productosVendidos += (int) ventasE.get(i)[2];
            }
        } catch (Exception e) {
            System.err.print("Error, " + e);
        }

        String aux = "Cantidad total de panes disponibles: " + productosDisponibles;
        vistaE.lbProductosDisponibles.setText(aux);

        aux = "Cantidad total de panes vendidos: " + productosVendidos;
        vistaE.lbProductosVendidos.setText(aux);
    }

    //Metodos de Cuentas
    private boolean camposAdministrador() {
        if (vistaA.txtIdAdministrador.getText().equals("") || vistaA.txtNombreAdministrador.getText().equals("")
                || vistaA.txtApelllidoAdministrador.getText().equals("") || vistaA.txtCedulaAdministrador.getText().equals("")
                || vistaA.txtContraseñaAdministrador.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            return false;
        } else {
            return true;
        }
    }

    private void llenarCamposAdministrador() {
        vistaA.txtIdAdministrador.setText(String.valueOf(administrador.getIdAdministrador()));
        vistaA.txtNombreAdministrador.setText(administrador.getNombre());
        vistaA.txtApelllidoAdministrador.setText(administrador.getApellido());
        vistaA.txtCedulaAdministrador.setText(String.valueOf(administrador.getCedula()));
        vistaA.txtContraseñaAdministrador.setText(administrador.getContraseña());
    }

    private void cargarTablaEmpleados() {
        vistaA.tbEmpleados.setModel(modeloEmpleados);
        modeloEmpleados.setColumnCount(0);
        modeloEmpleados.setRowCount(0);

        modeloEmpleados.addColumn("Id");
        modeloEmpleados.addColumn("Nombre");
        modeloEmpleados.addColumn("Apellido");
        modeloEmpleados.addColumn("Contraseña");
        modeloEmpleados.addColumn("Cédula");

        ArrayList<Object[]> tabla = sqlCuentas.cargarTablaEmpleados();

        for (int i = 0; i < tabla.size(); i++) {
            modeloEmpleados.addRow(tabla.get(i));
        }
    }

    private boolean camposEmpleados() {
        if (vistaA.txtIdEmpleado.getText().equals("")
                || vistaA.txtNombreEmpleados.getText().equals("")
                || vistaA.txtApellidoEmpleados.getText().equals("")
                || vistaA.txtCedulaEmpleados.getText().equals("")
                || vistaA.txtContraseñaEmpleados.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            return false;
        } else {
            return true;
        }
    }

    private boolean camposEmpleadosRegistro() {
        if (vistaA.txtNombreEmpleados.getText().equals("")
                || vistaA.txtApellidoEmpleados.getText().equals("")
                || vistaA.txtCedulaEmpleados.getText().equals("")
                || vistaA.txtContraseñaEmpleados.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            return false;
        } else {
            return true;
        }
    }

    private void vaciarCamposEmpleado() {
        vistaA.txtIdEmpleado.setText("");
        vistaA.txtNombreEmpleados.setText("");
        vistaA.txtApellidoEmpleados.setText("");
        vistaA.txtContraseñaEmpleados.setText("");
        vistaA.txtCedulaEmpleados.setText("");
    }

    //VistaE
    private void llenarCamposEmpleado() {
        vistaE.txtIdEmpleado.setText(String.valueOf(empleado.getIdEmpleado()));
        vistaE.txtNombreEmpleado.setText(empleado.getNombre());
        vistaE.txtApellidoEmpleado.setText(empleado.getApellido());
        vistaE.txtCedulaEmpleado.setText(String.valueOf(empleado.getCedula()));
        vistaE.txtContraseñaEmpleado.setText(empleado.getContraseña());
    }

    private boolean camposEmpleadoVistaE() {
        if (vistaE.txtNombreEmpleado.getText().equals("")
                || vistaE.txtApellidoEmpleado.getText().equals("")
                || vistaE.txtCedulaEmpleado.getText().equals("")
                || vistaE.txtContraseñaEmpleado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos");
            return false;
        } else {
            return true;
        }
    }

    //Proveedores
    private void cargarTablaProveedores() {
        vistaA.tbProveedores.setModel(modeloProveedores);
        modeloProveedores.setColumnCount(0);
        modeloProveedores.setRowCount(0);

        modeloProveedores.addColumn("Id");
        modeloProveedores.addColumn("Nombre");
        modeloProveedores.addColumn("Apellido");
        modeloProveedores.addColumn("Empresa");
        modeloProveedores.addColumn("Producto");
        modeloProveedores.addColumn("Teléfono");

        ArrayList<Object[]> tabla = sqlCuentas.cargarTablaProveedores();

        for (int i = 0; i < tabla.size(); i++) {
            modeloProveedores.addRow(tabla.get(i));
        }
    }

    private boolean camposProveedores() {
        if (vistaA.txtIdProveedor.getText().equals("")
                || vistaA.txtNombreProveedor.getText().equals("")
                || vistaA.txtApellidoProveedor.getText().equals("")
                || vistaA.txtEmpresaProveedor.getText().equals("")
                || vistaA.txtProductoProveedor.getText().equals("")
                || vistaA.txtTelefonoProveedor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            return false;
        } else {
            return true;
        }
    }

    private void limpiarCamposProveedores() {
        vistaA.txtIdProveedor.setText("");
        vistaA.txtNombreProveedor.setText("");
        vistaA.txtApellidoProveedor.setText("");
        vistaA.txtEmpresaProveedor.setText("");
        vistaA.txtProductoProveedor.setText("");
        vistaA.txtTelefonoProveedor.setText("");
    }
}
