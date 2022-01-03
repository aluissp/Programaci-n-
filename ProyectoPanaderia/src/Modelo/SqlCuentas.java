/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Armando Perugachi
 */
public class SqlCuentas extends Conexion {

    PreparedStatement ps;
    ResultSet rs;

    public boolean actualizarAdminitrador(Administrador administrador) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("update administrador set  nombre=?, apellido=?, contraseña=?, cedula=?"
                    + " where idAdministrador=?;");
            ps.setString(1, administrador.getNombre());
            ps.setString(2, administrador.getApellido());
            ps.setString(3, administrador.getContraseña());
            ps.setInt(4, administrador.getCedula());
            ps.setInt(5, administrador.getIdAdministrador());

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

    public ArrayList<Object[]> cargarTablaEmpleados() {
        Connection conexion = this.getConnection();
        ArrayList<Object[]> tabla = new ArrayList<Object[]>();

        try {
            ps = conexion.prepareStatement("select * from empleado");
            rs = ps.executeQuery();//Obtener resultados

            while (rs.next()) {
                Object[] fila = new Object[5];
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
            } catch (SQLException e) {
                System.err.print("Error, " + e);
            }
        }

        return tabla;
    }

    public boolean actualizarEmpleado(Empleado empleado) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("update empleado set nombre=?,apellido=?,"
                    + "contraseña=?,cedula=? where idEmpleado=?;");
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getApellido());
            ps.setString(3, empleado.getContraseña());
            ps.setInt(4, empleado.getCedula());
            ps.setInt(5, empleado.getIdEmpleado());

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

    public boolean buscarEmpleado(Empleado empleado) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("select * from empleado where idEmpleado=?;");
            ps.setInt(1, empleado.getIdEmpleado());

            rs = ps.executeQuery();
            if (rs.next()) {
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

    public boolean insertarEmpleado(Empleado empleado) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("insert into empleado(nombre,apellido,contraseña,cedula) values (?,?,?,?)");
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getApellido());
            ps.setString(3, empleado.getContraseña());
            ps.setInt(4, empleado.getCedula());

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

    public boolean eliminarEmpleado(Empleado empleado) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("delete from empleado where idEmpleado=?");
            ps.setInt(1, empleado.getIdEmpleado());

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

    public ArrayList<Object[]> cargarTablaProveedores() {
        Connection conexion = this.getConnection();
        ArrayList<Object[]> tabla = new ArrayList<Object[]>();

        try {
            ps = conexion.prepareStatement("select * from proveedor");
            rs = ps.executeQuery();//Obtener resultados

            while (rs.next()) {
                Object[] fila = new Object[6];
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

    public boolean buscarProveedor(Proveedor proveedor) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("select * from proveedor where idProveedor=?;");
            ps.setInt(1, proveedor.getIdProveedor());

            rs = ps.executeQuery();
            if (rs.next()) {
                proveedor.setIdProveedor(rs.getInt("idProveedor"));
                proveedor.setNombre(rs.getString("nombre"));
                proveedor.setApellido(rs.getString("apellido"));
                proveedor.setEmpresa(rs.getString("empresa"));
                proveedor.setProducto(rs.getString("producto"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedor.setIdPanaderia(rs.getInt("idPanaderia"));

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

    public boolean actualizarProveedor(Proveedor proveedor) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("update proveedor set nombre=?,apellido=?,"
                    + "empresa=?,producto=?,telefono=? where idProveedor=?;");
            ps.setString(1, proveedor.getNombre());
            ps.setString(2, proveedor.getApellido());
            ps.setString(3, proveedor.getEmpresa());
            ps.setString(4, proveedor.getProducto());
            ps.setString(5, proveedor.getTelefono());
            ps.setInt(6, proveedor.getIdProveedor());

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

    public boolean insertarProveedor(Proveedor proveedor) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("insert into proveedor(nombre,apellido,empresa,producto,telefono) values (?,?,?,?,?)");
            ps.setString(1, proveedor.getNombre());
            ps.setString(2, proveedor.getApellido());
            ps.setString(3, proveedor.getEmpresa());
            ps.setString(4, proveedor.getProducto());
            ps.setString(5, proveedor.getTelefono());

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

    public boolean eliminarProveedor(Proveedor proveedor) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("delete from proveedor where idProveedor=?");
            ps.setInt(1, proveedor.getIdProveedor());

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
