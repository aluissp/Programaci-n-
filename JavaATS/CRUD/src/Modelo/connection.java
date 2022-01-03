
package Modelo;

//import static borrador.conexion.URL;
//import static borrador.conexion.contraseña;
//import static borrador.conexion.usuario;
import java.sql.Connection;
import java.sql.DriverManager;

public class connection {

    public static final String URL = "jdbc:mysql://localhost:3306/escuela";
    public static final String usuario = "root";
    public static final String contraseña = "1004796395";

    public Connection getConnection() {
        Connection conexion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, usuario, contraseña);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa :3");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return conexion;
    }

}
