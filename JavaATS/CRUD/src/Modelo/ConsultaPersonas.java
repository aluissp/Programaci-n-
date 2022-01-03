package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultaPersonas extends connection {

    PreparedStatement ps;//Insertar
    ResultSet rs;//Obtener

    public boolean insertar(Persona persona) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("insert into persona(clave,nombre,celular,genero,edad) values (?,?,?,?,?)");
            ps.setString(1, persona.getClave());
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getCelular());
            ps.setString(4, persona.getGenero());
            ps.setInt(5, persona.getEdad());

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

    public boolean buscar(Persona persona) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("select * from persona where clave=?");
            ps.setString(1, persona.getClave());

            rs = ps.executeQuery();
            if (rs.next()) {
                persona.setIdPersona(rs.getInt("idPersona"));
                persona.setClave(rs.getString("clave"));
                persona.setNombre(rs.getString("nombre"));
                persona.setEdad(rs.getInt("edad"));
                persona.setCelular(rs.getString("celular"));
                persona.setGenero(rs.getString("genero"));

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

    public boolean modificar(Persona persona) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("update persona set clave=?, nombre=?, celular=?, genero=?, edad=? where idPersona=?");
            ps.setString(1, persona.getClave());
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getCelular());
            ps.setString(4, persona.getGenero());
            ps.setInt(5, persona.getEdad());
            ps.setInt(6, persona.getIdPersona());

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

    public boolean eliminar(Persona persona) {
        Connection conexion = this.getConnection();

        try {
            ps = conexion.prepareStatement("delete from persona where idPersona=?");
            ps.setInt(1, persona.getIdPersona());

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
