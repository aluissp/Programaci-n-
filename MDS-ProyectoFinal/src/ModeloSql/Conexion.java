/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloSql;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    public static final String URL = "jdbc:mysql://localhost:33065/dbescuelaconduccion";
    public static final String usuario = "root";
    public static final String contraseña = "";

    public Connection getConnection() {
        Connection conexion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, usuario, contraseña);
            System.out.println("Conexion exitosa :'3");

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        return conexion;
    }

}
