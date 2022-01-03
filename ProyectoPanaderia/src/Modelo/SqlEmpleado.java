/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Armando Perugachi
 */
public class SqlEmpleado extends Conexion {

    PreparedStatement ps;//Insertar
    ResultSet rs;//Obtener

    public boolean iniciarSesion(Empleado empleado) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("select idEmpleado,nombre,apellido,contraseña,cedula,idPanaderia from empleado where nombre=?");
            ps.setString(1, empleado.getNombre());
            rs = ps.executeQuery();//Obtener resultados

            if (rs.next()) {
                if (empleado.getContraseña().equals(rs.getString("contraseña"))) {

                    empleado.setIdEmpleado(rs.getInt("idEmpleado"));
                    empleado.setNombre(rs.getString("nombre"));
                    empleado.setApellido(rs.getString("apellido"));
                    empleado.setContraseña(rs.getString("contraseña"));
                    empleado.setCedula(rs.getInt("cedula"));
                    empleado.setIdPanaderia(rs.getInt("idPanaderia"));

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

    public boolean cargarProductos(Productos producto) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("select * from productos where nombre=?");
            ps.setString(1, producto.getNombre());

            rs = ps.executeQuery();

            if (rs.next()) {
                producto.setNombre(rs.getString("nombre"));
                producto.setIdProductos(rs.getInt("idProductos"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setIdPanaderia(rs.getInt("idPanaderia"));
                producto.setCantidad(rs.getInt("cantidad"));

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

    public boolean registrarVenta(Ventas ventas, Productos productos) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("insert into ventas(nombre,cantidad,precio,fecha_de_venta,idProducto,idClientes) values (?,?,?,?,?,?)");
            ps.setString(1, ventas.getNombre());
            ps.setInt(2, ventas.getCantidad());
            ps.setDouble(3, ventas.getPrecio());
            ps.setDate(4, ventas.getFechaDeVenta());
            ps.setInt(5, ventas.getIdProducto());
            ps.setInt(6, ventas.getIdClientes());

            int resultado = ps.executeUpdate();//Cuando insertamos datos

            if (resultado > 0) {
                productos.setNombre(ventas.getNombre());
                cargarProductos(productos);
                return actualizarProducto(productos, ventas.getCantidad());
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

    public boolean registrarCliente(Clientes clientes) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("insert into clientes  (nombre,apellido,cedula) values (?,?,?)");
            ps.setString(1, clientes.getNombre());
            ps.setString(2, clientes.getApellido());
            ps.setInt(3, clientes.getCedula());

            int resultado = ps.executeUpdate();//Cuando insertamos datos

            if (resultado > 0) {
                cargarCliente(clientes);
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

    public boolean cargarCliente(Clientes clientes) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("select * from clientes where cedula=?");
            ps.setInt(1, clientes.getCedula());

            rs = ps.executeQuery();

            if (rs.next()) {
                clientes.setNombre(rs.getString("nombre"));
                clientes.setIdClientes(rs.getInt("idClientes"));
                clientes.setIdPanaderia(rs.getInt("idPanaderia"));
                clientes.setApellido(rs.getString("apellido"));
                clientes.setCedula(rs.getInt("cedula"));

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

    public boolean cargarVentas(Ventas ventas) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("select * from ventas where fecha_de_venta=?,idProducto=?,idClientes");
            ps.setDate(1, ventas.getFechaDeVenta());
            ps.setInt(2, ventas.getIdClientes());
            ps.setInt(2, ventas.getIdProducto());

            rs = ps.executeQuery();

            if (rs.next()) {
                ventas.setIdVentas(rs.getInt("idVentas"));
                ventas.setNombre(rs.getString("nombre"));
                ventas.setCantidad(rs.getInt("cantidad"));
                ventas.setPrecio(rs.getDouble("precio"));
                ventas.setFechaDeVenta(rs.getDate("fecha_de_venta"));
                ventas.setIdProducto(rs.getInt("idProducto"));
                ventas.setIdClientes(rs.getInt("idClientes"));
                ventas.setIdPanaderia(rs.getInt("idPanaderia"));

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

    private boolean actualizarProducto(Productos productos, int cantidadVendida) {
        Connection conexion = this.getConnection();
        int aux = productos.getCantidad() - cantidadVendida;
        productos.setCantidad(aux);

        try {
            ps = conexion.prepareStatement("update productos set cantidad=? where idProductos=?");
            ps.setInt(1, productos.getCantidad());
            ps.setInt(2, productos.getIdProductos());

            int resultado = ps.executeUpdate();//Cuando insertamos datos

            if (resultado > 0) {
                return cargarProductos(productos);
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
