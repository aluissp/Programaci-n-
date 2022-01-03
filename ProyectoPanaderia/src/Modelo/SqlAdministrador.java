/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Armando Perugachi
 */
public class SqlAdministrador extends Conexion {

    PreparedStatement ps;
    ResultSet rs;

    public boolean iniciarSesion(Administrador administrador) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("select idAdministrador,nombre,apellido,contraseña,cedula,idPanaderia from administrador where nombre=?");
            ps.setString(1, administrador.getNombre());
            rs = ps.executeQuery();//Obtener resultados

            if (rs.next()) {
                if (administrador.getContraseña().equals(rs.getString("contraseña"))) {

                    administrador.setIdAdministrador(rs.getInt("idAdministrador"));
                    administrador.setNombre(rs.getString("nombre"));
                    administrador.setApellido(rs.getString("apellido"));
                    administrador.setContraseña(rs.getString("contraseña"));
                    administrador.setCedula(rs.getInt("cedula"));
                    administrador.setIdPanaderia(rs.getInt("idPanaderia"));

                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }
        } catch (Exception e) {
            System.err.println("Error, " + e);
            return false;
        }
    }

    public Object[][] cargarTablaMateriaPrima() {
        Connection conexion = this.getConnection();
        Object[][] tabla = new Object[7][4];
        int j = 0;

        try {
            ps = conexion.prepareStatement("select idMateriaPrima,materia,cantidad,unidadMedida from materiaprima");
            rs = ps.executeQuery();//Obtener resultados

            while (rs.next()) {
                for (int i = 0; i < tabla[i].length; i++) {
                    tabla[j][i] = rs.getObject(i + 1);
                }
                j++;
            }

        } catch (Exception e) {
            System.err.print("Error, " + e);
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.print("Error, " + e);
            }
        }

        return tabla;
    }

    public boolean insertarMateriaPrima(MateriaPrima materiaPrima) {
        Connection conexion = this.getConnection();
        try {

            //buscamos y salvamos
            ps = conexion.prepareStatement("select * from materiaprima where materia=?");
            ps.setString(1, materiaPrima.getMateria());

            rs = ps.executeQuery();

            if (rs.next()) {
                int aux = rs.getInt("cantidad") + materiaPrima.getCantidad();
                materiaPrima.setCantidad(aux);
            }

            //insertamos
            ps = conexion.prepareStatement("update materiaPrima set cantidad=? where idMateriaPrima=?");
            ps.setInt(1, materiaPrima.getCantidad());
            ps.setInt(2, materiaPrima.getIdMateriaPrima());
            int resultado = ps.executeUpdate();//Cuando insertamos datos

            if (resultado > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.err.print("Error, " + e);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.print("Error, " + e);
            }
        }
    }

    public boolean cargarMateriaPrima(MateriaPrima materiaPrima) {
        Connection conexion = this.getConnection();
        //System.out.println(materiaPrima.getMateria());

        try {
            ps = conexion.prepareStatement("select * from materiaprima where materia=?");
            ps.setString(1, materiaPrima.getMateria());

            rs = ps.executeQuery();

            if (rs.next()) {
                materiaPrima.setIdMateriaPrima(rs.getInt("idMateriaPrima"));
                materiaPrima.setMateria(rs.getString("materia"));
                materiaPrima.setCantidad(rs.getInt("cantidad"));
                materiaPrima.setUnidadMedida(rs.getString("unidadMedida"));
                materiaPrima.setIdPanaderia(rs.getInt("idPanaderia"));

                return true;
            } else {
                System.out.println(":ccc");
                return false;
            }
        } catch (Exception e) {
            System.err.print("Error, " + e);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.print("Error, " + e);
            }
        }

    }

    public ArrayList<Object[]> cargarTablaVentas() {
        Connection conexion = this.getConnection();
        ArrayList<Object[]> tabla = new ArrayList<Object[]>();

        try {
            ps = conexion.prepareStatement("select v.idVentas,v.nombre,v.cantidad,v.precio,"
                    + "v.fecha_de_venta,c.nombre,c.apellido,c.cedula "
                    + "from ventas as v inner join clientes as c on c.idClientes = v.idClientes "
                    + "where v.idVentas>=1;");
            rs = ps.executeQuery();//Obtener resultados

            while (rs.next()) {
                Object[] fila = new Object[8];
                for (int i = 0; i < fila.length; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                tabla.add(fila);
            }

        } catch (Exception e) {
            System.err.print("Error, " + e);
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.print("Error, " + e);
            }
        }

        return tabla;
    }

    public ArrayList<Object[]> cargarTablaVentas(String fecha) {
        Connection conexion = this.getConnection();
        ArrayList<Object[]> tabla = new ArrayList<Object[]>();

        try {
            ps = conexion.prepareStatement("select v.idVentas,v.nombre,v.cantidad,v.precio,v.fecha_de_venta,"
                    + "c.nombre,c.apellido,c.cedula from ventas as v inner join clientes as c on"
                    + " v.idClientes = c.idClientes where v.fecha_de_venta=?");
            ps.setString(1, fecha);
            rs = ps.executeQuery();//Obtener resultados
            //return tabla;

            while (rs.next()) {
                Object[] fila = new Object[8];
                for (int i = 0; i < fila.length; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                tabla.add(fila);
            }

        } catch (Exception e) {
            System.err.print("Error, " + e);
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.print("Error, " + e);
            }
        }

        return tabla;
    }

    public Object[][] cargarTablaProductos() {
        Connection conexion = this.getConnection();
        Object[][] tabla = new Object[5][4];
        int j = 0;

        try {
            ps = conexion.prepareStatement("select * from productos");
            rs = ps.executeQuery();//Obtener resultados

            while (rs.next()) {
                for (int i = 0; i < tabla[i].length; i++) {
                    tabla[j][i] = rs.getObject(i + 1);
                }
                j++;
            }

        } catch (Exception e) {
            System.err.print("Error, " + e);
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.print("Error, " + e);
            }
        }

        return tabla;
    }

    public ArrayList<Object[]> cargarTablaClientes() {
        Connection conexion = this.getConnection();
        ArrayList<Object[]> tabla = new ArrayList<Object[]>();

        try {
            ps = conexion.prepareStatement("select * from clientes");
            rs = ps.executeQuery();//Obtener resultados

            while (rs.next()) {
                Object[] fila = new Object[4];
                for (int i = 0; i < fila.length; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                tabla.add(fila);
            }

        } catch (Exception e) {
            System.err.print("Error, " + e);
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.print("Error, " + e);
            }
        }

        return tabla;
    }

    public boolean insertarProductos(Productos productos) {
        Connection conexion = this.getConnection();
        try {

            //buscamos y salvamos
            ps = conexion.prepareStatement("select * from productos where nombre=?");
            ps.setString(1, productos.getNombre());

            rs = ps.executeQuery();

            if (rs.next()) {
                int aux = rs.getInt("cantidad") + productos.getCantidad();
                productos.setCantidad(aux);
            }

            //insertamos
            ps = conexion.prepareStatement("update productos set cantidad=?,precio=? where idProductos=?;");
            ps.setInt(1, productos.getCantidad());
            ps.setDouble(2, productos.getPrecio());
            ps.setInt(3, productos.getIdProductos());
            int resultado = ps.executeUpdate();//Cuando insertamos datos

            if (resultado > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.err.print("Error, " + e);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.print("Error, " + e);
            }
        }
    }

    public boolean actualizarCliente(Clientes clientes) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("update clientes set nombre=?,apellido=?,cedula=? where idClientes=?");
            ps.setString(1, clientes.getNombre());
            ps.setString(2, clientes.getApellido());
            ps.setInt(3, clientes.getCedula());
            ps.setInt(4, clientes.getIdClientes());

            int resultado = ps.executeUpdate();//Cuando insertamos datos

            if (resultado > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.err.print("Error, " + e);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.print("Error, " + e);
            }
        }
    }

    public boolean buscarCliente(Clientes clientes) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("select * from clientes where idClientes=?");
            ps.setInt(1, clientes.getIdClientes());

            rs = ps.executeQuery();
            if (rs.next()) {
                clientes.setIdClientes(rs.getInt("idClientes"));
                clientes.setNombre(rs.getString("nombre"));
                clientes.setApellido(rs.getString("apellido"));
                clientes.setCedula(rs.getInt("cedula"));
                clientes.setIdPanaderia(rs.getInt("idPanaderia"));

                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.err.print("Error, " + e);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.print("Error, " + e);
            }
        }
    }

    public boolean eliminarCliente(Clientes clientes) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("delete from clientes where idClientes=?");
            ps.setInt(1, clientes.getIdClientes());

            int resultado = ps.executeUpdate();//Cuando insertamos datos

            if (resultado > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.err.print("Error, " + e);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.print("Error, " + e);
            }
        }
    }
}
