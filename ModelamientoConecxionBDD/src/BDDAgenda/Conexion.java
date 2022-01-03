package BDDAgenda;

import com.mysql.cj.jdbc.result.ResultSetImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//import javax.swing.JOptionPane;

public class Conexion {

    public static final String URL = "jdbc:mysql://localhost:33065/dbagenda";
    public static final String usuario = "root";
    public static final String contraseña = "";

    public Connection getConnection() {
        Connection conexion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, usuario, contraseña);
//            JOptionPane.showMessageDialog(null, "Conexion exitosa :3");

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error: " + e);
        }

        return conexion;
    }

    public List<Persona> Obtener() {
        Connection c = null;
        Statement stm = null;
        ResultSetImpl rs = null;
        String sql = "select * from tbl_persona order by dni";
        List<Persona> listDatos = null;

        try {
            c = this.getConnection();
            stm = (Statement) c.createStatement();
            rs = (ResultSetImpl) stm.executeQuery(sql);
            listDatos = new ArrayList<Persona>();

            while (rs.next()) {
                Persona p = new Persona();
                p.setDNI(rs.getString(1));
                p.setNombre(rs.getString(2));
                p.setTelefono(rs.getString(3));
                p.setCorreo(rs.getString(4));
                listDatos.add(p);
            }
            stm.close();
            rs.close();
            c.close();

        } catch (Exception e) {
            System.err.println("Error, " + e);
        }
        return listDatos;
    }

    public void Ingresar(Persona persona) {
        String sql = "insert into tbl_persona values('" + persona.getDNI() + "',"
                + "'" + persona.getNombre() + "','" + persona.getTelefono() + "',"
                + "'" + persona.getCorreo() + "')";
        miSQL(sql);

    }

    public void Actualizar(Persona persona) {
        String sql = "update tbl_persona set nombre = '" + persona.getNombre() + "',"
                + "telefono = '" + persona.getTelefono() + "', correo = '" + persona.getCorreo() + "' "
                + "where dni = '" + persona.getDNI() + "'";
        miSQL(sql);
    }

    public void Eliminar(Persona persona) {
        String sql = "delete from tbl_persona where dni = '" + persona.getDNI() + "'";
        miSQL(sql);
    }

    private boolean miSQL(String sql) {
        boolean registro = false;
        Connection c = null;
        Statement stm = null;

        System.out.println(sql);

        try {
            c = this.getConnection();
            stm = (Statement) c.createStatement();
            stm.execute(sql);
            registro = true;
            stm.close();
            c.close();

        } catch (SQLException e) {
            System.out.println("Error, " + e);
        }

        return registro;
    }
}
