/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

/**
 *
 * @author Usuario
 */
public class VistaAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Panadero
     */
    public VistaAdministrador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_principalPanadero = new javax.swing.JPanel();
        lb_panadero = new javax.swing.JLabel();
        tp_opcionesVendedor = new javax.swing.JTabbedPane();
        pn_inventarioVendedor = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbMateriaPrima = new javax.swing.JTable();
        txtCantidad = new javax.swing.JTextField();
        btInsertar = new javax.swing.JButton();
        lbFechaA1 = new javax.swing.JLabel();
        comboMateriaPrima = new javax.swing.JComboBox<>();
        Cantidad = new javax.swing.JLabel();
        btEliminar = new javax.swing.JButton();
        txtCantidadEliminar = new javax.swing.JTextField();
        pn_registrarVentaVendedor = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lbPanadero = new javax.swing.JLabel();
        lbFechaA2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbVentas = new javax.swing.JTable();
        btPdf = new javax.swing.JButton();
        btBuscarVentasPorFecha = new javax.swing.JButton();
        btCargarTodasLasVentas = new javax.swing.JButton();
        pnProductos = new javax.swing.JPanel();
        lbFechaA3 = new javax.swing.JLabel();
        btAñadirProducto = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbProductos = new javax.swing.JTable();
        comboProductos = new javax.swing.JComboBox<>();
        txtCantidadProductoA = new javax.swing.JTextField();
        txtPrecioA = new javax.swing.JTextField();
        btActualizarPrecio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnClientes = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        txtIdCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtApellidoCliente = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtCedulaCliente = new javax.swing.JTextField();
        btActualizarCliente = new javax.swing.JButton();
        btEliminarCliente = new javax.swing.JButton();
        btBuscarCliente = new javax.swing.JButton();
        btLimpiarClientes = new javax.swing.JButton();
        pnCuentas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProveedores = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        lbFechaA4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIdProveedor = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtApellidoProveedor = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtNombreProveedor = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtEmpresaProveedor = new javax.swing.JTextField();
        btActualizarProveedor = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbEmpleados = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtNombreEmpleados = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtApellidoEmpleados = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtCedulaEmpleados = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtContraseñaEmpleados = new javax.swing.JTextField();
        btActualizarEmpleados = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtIdAdministrador = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtNombreAdministrador = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtApelllidoAdministrador = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtCedulaAdministrador = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtContraseñaAdministrador = new javax.swing.JTextField();
        btAcualizarAdministrador = new javax.swing.JButton();
        btBuscarEmpleados = new javax.swing.JButton();
        btEliminarEmpleados = new javax.swing.JButton();
        btInsertarEmpleados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtProductoProveedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefonoProveedor = new javax.swing.JTextField();
        btEliminarProveedor = new javax.swing.JButton();
        btBuscarProveedor = new javax.swing.JButton();
        btInsertarProveedor = new javax.swing.JButton();
        btLimpiarProveedor = new javax.swing.JButton();
        btLimpiarEmpleados = new javax.swing.JButton();
        btVolver = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_principalPanadero.setBackground(new java.awt.Color(3, 13, 66));
        pn_principalPanadero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_panadero.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        lb_panadero.setForeground(new java.awt.Color(255, 255, 255));
        lb_panadero.setText("PANADERO");
        pn_principalPanadero.add(lb_panadero, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 174, 50));

        tp_opcionesVendedor.setBackground(new java.awt.Color(57, 64, 69));

        pn_inventarioVendedor.setBackground(new java.awt.Color(255, 255, 255));

        tbMateriaPrima.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Producto", "Cantidad", "Unidad de Medida"
            }
        ));
        jScrollPane2.setViewportView(tbMateriaPrima);

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        btInsertar.setText("Añadir");
        btInsertar.setFocusPainted(false);

        lbFechaA1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbFechaA1.setText("Fecha del sistema");

        comboMateriaPrima.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Harina", "Huevos", "Azúcar", "Sal", "Levadura", "Mantequilla", "Leche" }));

        Cantidad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Cantidad.setText("Cantidad");

        btEliminar.setText("Eliminar");
        btEliminar.setFocusPainted(false);

        txtCantidadEliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadEliminarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pn_inventarioVendedorLayout = new javax.swing.GroupLayout(pn_inventarioVendedor);
        pn_inventarioVendedor.setLayout(pn_inventarioVendedorLayout);
        pn_inventarioVendedorLayout.setHorizontalGroup(
            pn_inventarioVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_inventarioVendedorLayout.createSequentialGroup()
                .addGap(578, 578, 578)
                .addComponent(lbFechaA1)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_inventarioVendedorLayout.createSequentialGroup()
                .addGroup(pn_inventarioVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_inventarioVendedorLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_inventarioVendedorLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(comboMateriaPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pn_inventarioVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_inventarioVendedorLayout.createSequentialGroup()
                                .addComponent(txtCantidadEliminar)
                                .addGap(145, 145, 145)
                                .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_inventarioVendedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        pn_inventarioVendedorLayout.setVerticalGroup(
            pn_inventarioVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_inventarioVendedorLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbFechaA1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(pn_inventarioVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMateriaPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(pn_inventarioVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pn_inventarioVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        tp_opcionesVendedor.addTab("INVENTARIO / MATERIALES", pn_inventarioVendedor);

        pn_registrarVentaVendedor.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Panadero  :");

        lbPanadero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbPanadero.setText("------------------------------");

        lbFechaA2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbFechaA2.setText("Fecha del sistema");

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("                                                                                             VENTAS DEL DÍA                                                                                             ");

        tbVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Producto", "Cantidad", "Precio", "Fecha de venta", "Nombre", "Apellido", "Cédula"
            }
        ));
        tbVentas.setAlignmentX(0.0F);
        tbVentas.setAlignmentY(0.0F);
        jScrollPane4.setViewportView(tbVentas);

        btPdf.setText("Generar Pdf");
        btPdf.setFocusPainted(false);

        btBuscarVentasPorFecha.setText("Buscar ventas por fecha");

        btCargarTodasLasVentas.setText("Cargar todas las ventas");

        javax.swing.GroupLayout pn_registrarVentaVendedorLayout = new javax.swing.GroupLayout(pn_registrarVentaVendedor);
        pn_registrarVentaVendedor.setLayout(pn_registrarVentaVendedorLayout);
        pn_registrarVentaVendedorLayout.setHorizontalGroup(
            pn_registrarVentaVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_registrarVentaVendedorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pn_registrarVentaVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_registrarVentaVendedorLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_registrarVentaVendedorLayout.createSequentialGroup()
                        .addGroup(pn_registrarVentaVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pn_registrarVentaVendedorLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(26, 26, 26)
                                .addComponent(lbPanadero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbFechaA2))
                            .addGroup(pn_registrarVentaVendedorLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btBuscarVentasPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btCargarTodasLasVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(btPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))))
            .addGroup(pn_registrarVentaVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_registrarVentaVendedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pn_registrarVentaVendedorLayout.setVerticalGroup(
            pn_registrarVentaVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_registrarVentaVendedorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pn_registrarVentaVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbPanadero)
                    .addComponent(lbFechaA2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                .addGroup(pn_registrarVentaVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCargarTodasLasVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btPdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btBuscarVentasPorFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
            .addGroup(pn_registrarVentaVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_registrarVentaVendedorLayout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(148, Short.MAX_VALUE)))
        );

        tp_opcionesVendedor.addTab("  REGISTRO DE VENTAS ", pn_registrarVentaVendedor);

        pnProductos.setBackground(new java.awt.Color(255, 255, 255));

        lbFechaA3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbFechaA3.setText("Fecha del sistema");

        btAñadirProducto.setText("Añadir Producto");
        btAñadirProducto.setFocusPainted(false);

        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Producto", "Precio", "Cantidad"
            }
        ));
        jScrollPane3.setViewportView(tbProductos);

        comboProductos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        comboProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Pan integral", "Pan de caña", "Pan de maíz", "Pan de trigo", "Quesadilla" }));

        txtCantidadProductoA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadProductoAKeyTyped(evt);
            }
        });

        txtPrecioA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioAKeyTyped(evt);
            }
        });

        btActualizarPrecio.setText("Actualizar Precio");

        jLabel2.setText("Digite la cantidad de producto que desea añadir");

        jLabel3.setText("Digite el precio que desea actualizar");

        javax.swing.GroupLayout pnProductosLayout = new javax.swing.GroupLayout(pnProductos);
        pnProductos.setLayout(pnProductosLayout);
        pnProductosLayout.setHorizontalGroup(
            pnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnProductosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbFechaA3)
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnProductosLayout.createSequentialGroup()
                .addGroup(pnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnProductosLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(pnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3)
                            .addGroup(pnProductosLayout.createSequentialGroup()
                                .addComponent(comboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnProductosLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(pnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(txtPrecioA)
                            .addComponent(txtCantidadProductoA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addGroup(pnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAñadirProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btActualizarPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        pnProductosLayout.setVerticalGroup(
            pnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFechaA3)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnProductosLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btAñadirProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(txtCantidadProductoA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btActualizarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))
                    .addGroup(pnProductosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214))))
        );

        tp_opcionesVendedor.addTab(" PRODUCTOS ", pnProductos);

        pnClientes.setBackground(new java.awt.Color(255, 255, 255));

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido", "Cédula"
            }
        ));
        jScrollPane6.setViewportView(tbClientes);

        txtIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdClienteKeyTyped(evt);
            }
        });

        jLabel12.setText("ID:");

        jLabel44.setText("Nombre:");

        jLabel45.setText("Apellido:");

        jLabel46.setText("Cédula");

        txtCedulaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaClienteKeyTyped(evt);
            }
        });

        btActualizarCliente.setText("Actualizar");
        btActualizarCliente.setFocusPainted(false);

        btEliminarCliente.setText("Eliminar");

        btBuscarCliente.setText("Buscar");

        btLimpiarClientes.setText("Limpiar");

        javax.swing.GroupLayout pnClientesLayout = new javax.swing.GroupLayout(pnClientes);
        pnClientes.setLayout(pnClientesLayout);
        pnClientesLayout.setHorizontalGroup(
            pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClientesLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnClientesLayout.createSequentialGroup()
                        .addGroup(pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnClientesLayout.createSequentialGroup()
                                .addComponent(btActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addGroup(pnClientesLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel44)
                                .addGap(12, 12, 12)
                                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnClientesLayout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnClientesLayout.createSequentialGroup()
                                .addComponent(btBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(btLimpiarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(pnClientesLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(btEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnClientesLayout.setVerticalGroup(
            pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClientesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45)
                    .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(pnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpiarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        tp_opcionesVendedor.addTab("        CLIENTES        ", pnClientes);

        pnCuentas.setBackground(new java.awt.Color(255, 255, 255));

        tbProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido", "Empresa", "Producto", "Teléfono"
            }
        ));
        jScrollPane1.setViewportView(tbProveedores);

        jLabel5.setText("Proveedores");

        lbFechaA4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbFechaA4.setText("Fecha del sistema");

        jLabel10.setText("ID:");

        txtIdProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdProveedorKeyTyped(evt);
            }
        });

        jLabel25.setText("Nombre:");

        jLabel29.setText("Apellido:");

        jLabel30.setText("Empresa");

        btActualizarProveedor.setText("Acualizar");
        btActualizarProveedor.setFocusPainted(false);

        tbEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido", "Contraseña", "Cédula"
            }
        ));
        jScrollPane5.setViewportView(tbEmpleados);

        jLabel32.setText("Datos Vendedor/Empleado");

        jLabel33.setText("ID:");

        txtIdEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdEmpleadoKeyTyped(evt);
            }
        });

        jLabel34.setText("Nombre:");

        jLabel35.setText("Apellido:");

        jLabel36.setText("Cédula");

        txtCedulaEmpleados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaEmpleadosKeyTyped(evt);
            }
        });

        jLabel37.setText("Contr:");

        btActualizarEmpleados.setText("Actualizar");
        btActualizarEmpleados.setFocusPainted(false);

        jLabel38.setText("Datos Panadero/Administrador");

        jLabel39.setText("ID:");

        txtIdAdministrador.setText("                    ");
        txtIdAdministrador.setEnabled(false);

        jLabel40.setText("Nombre:");

        jLabel41.setText("Apellido:");

        jLabel42.setText("Cédula");

        txtCedulaAdministrador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaAdministradorKeyTyped(evt);
            }
        });

        jLabel43.setText("Contr:");

        btAcualizarAdministrador.setText("Actualizar");
        btAcualizarAdministrador.setFocusPainted(false);

        btBuscarEmpleados.setText("Buscar");

        btEliminarEmpleados.setText("Eliminar");

        btInsertarEmpleados.setText("Insertar");

        jLabel1.setText("Producto");

        jLabel4.setText("Teléfono");

        btEliminarProveedor.setText("Eliminar");

        btBuscarProveedor.setText("Buscar");

        btInsertarProveedor.setText("Insertar");

        btLimpiarProveedor.setText("Limpiar");

        btLimpiarEmpleados.setText("Limpiar");

        javax.swing.GroupLayout pnCuentasLayout = new javax.swing.GroupLayout(pnCuentas);
        pnCuentas.setLayout(pnCuentasLayout);
        pnCuentasLayout.setHorizontalGroup(
            pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCuentasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(313, 313, 313))
            .addGroup(pnCuentasLayout.createSequentialGroup()
                .addGroup(pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCuentasLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApelllidoAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCedulaAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCuentasLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbFechaA4)
                            .addGroup(pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCuentasLayout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(332, 332, 332))
                                .addGroup(pnCuentasLayout.createSequentialGroup()
                                    .addGroup(pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pnCuentasLayout.createSequentialGroup()
                                            .addComponent(jLabel43)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtContraseñaAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btAcualizarAdministrador))
                                        .addGroup(pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnCuentasLayout.createSequentialGroup()
                                                .addGroup(pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel30)
                                                    .addComponent(jLabel39))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtIdProveedor)
                                                    .addComponent(txtEmpresaProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(pnCuentasLayout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtProductoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(pnCuentasLayout.createSequentialGroup()
                                                        .addComponent(jLabel25)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtNombreProveedor)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(pnCuentasLayout.createSequentialGroup()
                                                        .addComponent(jLabel29)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtApellidoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(14, 14, 14)
                                                        .addComponent(btActualizarProveedor)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(btBuscarProveedor))
                                                    .addGroup(pnCuentasLayout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(btEliminarProveedor)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(btInsertarProveedor))))
                                            .addGroup(pnCuentasLayout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btLimpiarProveedor))
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pnCuentasLayout.createSequentialGroup()
                                                .addComponent(jLabel33)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(pnCuentasLayout.createSequentialGroup()
                                                        .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel34)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtNombreEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel35)
                                                        .addGap(18, 18, 18))
                                                    .addGroup(pnCuentasLayout.createSequentialGroup()
                                                        .addComponent(btBuscarEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(34, 34, 34)
                                                        .addComponent(btActualizarEmpleados)
                                                        .addGap(39, 39, 39)))
                                                .addGroup(pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btInsertarEmpleados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtApellidoEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(pnCuentasLayout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(jLabel36)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtCedulaEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtContraseñaEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(pnCuentasLayout.createSequentialGroup()
                                                        .addGap(47, 47, 47)
                                                        .addComponent(btEliminarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(44, 44, 44)
                                                        .addComponent(btLimpiarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGap(6, 6, 6)))))
                    .addGroup(pnCuentasLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnCuentasLayout.setVerticalGroup(
            pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCuentasLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFechaA4)
                    .addComponent(jLabel38))
                .addGap(13, 13, 13)
                .addGroup(pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtIdAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(txtNombreAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(txtApelllidoAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(txtCedulaAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(txtContraseñaAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAcualizarAdministrador))
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(txtCedulaEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraseñaEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35))
                .addGap(20, 20, 20)
                .addGroup(pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpiarEmpleados)
                    .addComponent(btInsertarEmpleados)
                    .addComponent(btEliminarEmpleados)
                    .addComponent(btActualizarEmpleados)
                    .addComponent(btBuscarEmpleados))
                .addGroup(pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCuentasLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btLimpiarProveedor))
                    .addGroup(pnCuentasLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addGroup(pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25)
                        .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29)
                        .addComponent(txtApellidoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btActualizarProveedor)
                        .addComponent(btBuscarProveedor)))
                .addGap(18, 18, 18)
                .addGroup(pnCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtEmpresaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtProductoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEliminarProveedor)
                    .addComponent(btInsertarProveedor))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        tp_opcionesVendedor.addTab("CUENTAS Y PROVEEDORES", pnCuentas);

        pn_principalPanadero.add(tp_opcionesVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 746, 510));

        btVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P_Entrar.Oscuro.png"))); // NOI18N
        btVolver.setToolTipText("Ir al home");
        btVolver.setContentAreaFilled(false);
        btVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVolver.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P_Entrar.Oscuro.png"))); // NOI18N
        btVolver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P_Entrar.Claro.png"))); // NOI18N
        btVolver.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pn_principalPanadero.add(btVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 50));

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P_Salir.Oscuro.png"))); // NOI18N
        btn_salir.setToolTipText("salir");
        btn_salir.setContentAreaFilled(false);
        btn_salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P_Salir.Oscuro.png"))); // NOI18N
        btn_salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P_Salir.Claro.png"))); // NOI18N
        btn_salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        pn_principalPanadero.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 70, 60));

        getContentPane().add(pn_principalPanadero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        cancelarLetras(evt);
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtCantidadEliminarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadEliminarKeyTyped
        cancelarLetras(evt);
    }//GEN-LAST:event_txtCantidadEliminarKeyTyped

    private void txtCantidadProductoAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadProductoAKeyTyped
        cancelarLetras(evt);
    }//GEN-LAST:event_txtCantidadProductoAKeyTyped

    private void txtPrecioAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioAKeyTyped
        cancelarLetras(evt);
    }//GEN-LAST:event_txtPrecioAKeyTyped

    private void txtIdClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdClienteKeyTyped
        cancelarLetras(evt);
    }//GEN-LAST:event_txtIdClienteKeyTyped

    private void txtCedulaClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaClienteKeyTyped
        cancelarLetras(evt);
    }//GEN-LAST:event_txtCedulaClienteKeyTyped

    private void txtCedulaAdministradorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaAdministradorKeyTyped
        cancelarLetras(evt);
    }//GEN-LAST:event_txtCedulaAdministradorKeyTyped

    private void txtIdEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdEmpleadoKeyTyped
        cancelarLetras(evt);
    }//GEN-LAST:event_txtIdEmpleadoKeyTyped

    private void txtCedulaEmpleadosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaEmpleadosKeyTyped
        cancelarLetras(evt);
    }//GEN-LAST:event_txtCedulaEmpleadosKeyTyped

    private void txtIdProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdProveedorKeyTyped
        cancelarLetras(evt);
    }//GEN-LAST:event_txtIdProveedorKeyTyped

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void cancelarLetras(java.awt.event.KeyEvent evt) {
        char validar = evt.getKeyChar();
        if ((validar < 48 || validar > 57) && validar != 8 && validar != 46) {
            getToolkit().beep();
            evt.consume();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAdministrador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cantidad;
    public javax.swing.JButton btActualizarCliente;
    public javax.swing.JButton btActualizarEmpleados;
    public javax.swing.JButton btActualizarPrecio;
    public javax.swing.JButton btActualizarProveedor;
    public javax.swing.JButton btAcualizarAdministrador;
    public javax.swing.JButton btAñadirProducto;
    public javax.swing.JButton btBuscarCliente;
    public javax.swing.JButton btBuscarEmpleados;
    public javax.swing.JButton btBuscarProveedor;
    public javax.swing.JButton btBuscarVentasPorFecha;
    public javax.swing.JButton btCargarTodasLasVentas;
    public javax.swing.JButton btEliminar;
    public javax.swing.JButton btEliminarCliente;
    public javax.swing.JButton btEliminarEmpleados;
    public javax.swing.JButton btEliminarProveedor;
    public javax.swing.JButton btInsertar;
    public javax.swing.JButton btInsertarEmpleados;
    public javax.swing.JButton btInsertarProveedor;
    public javax.swing.JButton btLimpiarClientes;
    public javax.swing.JButton btLimpiarEmpleados;
    public javax.swing.JButton btLimpiarProveedor;
    public javax.swing.JButton btPdf;
    public javax.swing.JButton btVolver;
    public javax.swing.JButton btn_salir;
    public javax.swing.JComboBox<String> comboMateriaPrima;
    public javax.swing.JComboBox<String> comboProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    public javax.swing.JLabel lbFechaA1;
    public javax.swing.JLabel lbFechaA2;
    public javax.swing.JLabel lbFechaA3;
    public javax.swing.JLabel lbFechaA4;
    public javax.swing.JLabel lbPanadero;
    private javax.swing.JLabel lb_panadero;
    private javax.swing.JPanel pnClientes;
    private javax.swing.JPanel pnCuentas;
    private javax.swing.JPanel pnProductos;
    private javax.swing.JPanel pn_inventarioVendedor;
    private javax.swing.JPanel pn_principalPanadero;
    private javax.swing.JPanel pn_registrarVentaVendedor;
    public javax.swing.JTable tbClientes;
    public javax.swing.JTable tbEmpleados;
    public javax.swing.JTable tbMateriaPrima;
    public javax.swing.JTable tbProductos;
    public javax.swing.JTable tbProveedores;
    public javax.swing.JTable tbVentas;
    private javax.swing.JTabbedPane tp_opcionesVendedor;
    public javax.swing.JTextField txtApellidoCliente;
    public javax.swing.JTextField txtApellidoEmpleados;
    public javax.swing.JTextField txtApellidoProveedor;
    public javax.swing.JTextField txtApelllidoAdministrador;
    public javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtCantidadEliminar;
    public javax.swing.JTextField txtCantidadProductoA;
    public javax.swing.JTextField txtCedulaAdministrador;
    public javax.swing.JTextField txtCedulaCliente;
    public javax.swing.JTextField txtCedulaEmpleados;
    public javax.swing.JTextField txtContraseñaAdministrador;
    public javax.swing.JTextField txtContraseñaEmpleados;
    public javax.swing.JTextField txtEmpresaProveedor;
    public javax.swing.JTextField txtIdAdministrador;
    public javax.swing.JTextField txtIdCliente;
    public javax.swing.JTextField txtIdEmpleado;
    public javax.swing.JTextField txtIdProveedor;
    public javax.swing.JTextField txtNombreAdministrador;
    public javax.swing.JTextField txtNombreCliente;
    public javax.swing.JTextField txtNombreEmpleados;
    public javax.swing.JTextField txtNombreProveedor;
    public javax.swing.JTextField txtPrecioA;
    public javax.swing.JTextField txtProductoProveedor;
    public javax.swing.JTextField txtTelefonoProveedor;
    // End of variables declaration//GEN-END:variables
}
