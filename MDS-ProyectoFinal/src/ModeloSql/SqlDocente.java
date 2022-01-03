/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloSql;

import ModeloClases.Estudiante;
import com.mysql.cj.jdbc.result.ResultSetImpl;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Armando Perugachi
 */
public class SqlDocente extends Conexion {

    Statement stm;
    ResultSetImpl rs;

    private boolean MySQL(String sql) {
        boolean registro = false;
        Connection co = null;
        stm = null;
//        System.out.println(sql);
        try {

            co = super.getConnection();
            stm = (Statement) co.createStatement();
            stm.execute(sql);
            registro = true;
            stm.close();

        } catch (SQLException e) {
            System.out.println("Error en SQL: " + e.getMessage());

        }
        return registro;
    }

    public boolean BuscarEstudiante(Estudiante est) {
        boolean registrado = false;
        Connection c;//select * from tblestudiante where dni=?
        String sql = "select nombre,apellido,telefono,correo,fechanacimiento,"
                + "tiposangre,nota1,nota2,promedio,diasasistidos,matriculado,precioCurso "
                + "from tblestudiante where dni= '" + est.getDni() + "'";
        try {
            c = this.getConnection();
            stm = (Statement) c.createStatement();
            rs = (ResultSetImpl) stm.executeQuery(sql);
            if (rs.next()) {

                est.setNombre(rs.getString(1));
                est.setApellido(rs.getString(2));
                est.setTelefono(rs.getString(3));
                est.setCorreo(rs.getString(4));
                est.setFechaNacimiento(rs.getDate(5).toString());
                est.setTipoDeSangre(rs.getString(6));
                est.setNota1(rs.getDouble(7));
                est.setNota2(rs.getDouble(8));
                est.setPromedio(rs.getDouble(9));
                est.setDiasAsistidos(rs.getInt(10));
                est.setMatriculado(rs.getBoolean(11));
                est.setPrecioCurso(rs.getDouble(12));
//                System.out.println("fecha: " + est.getFechaNacimiento());
            }
            stm.close();
            rs.close();
            c.close();
            registrado = true;
        } catch (SQLException e) {
            System.err.println("Error, " + e);
        }

        return registrado;
    }

    public boolean ActualizarEstudiante(Estudiante est) {
        String sql = "UPDATE tblestudiante SET nombre =  '" + est.getNombre() + "',"
                + "apellido = '" + est.getApellido() + "',"
                + "telefono = '" + est.getTelefono() + "',"
                + "correo = '" + est.getCorreo() + "',"
                + "fechanacimiento = '" + est.getFechaNacimiento() + "',"
                + "tiposangre = '" + est.getTipoDeSangre() + "',"
                + "nota1 = '" + est.getNota1() + "',"
                + "nota2 = '" + est.getNota2() + "',"
                + "promedio = '" + est.getPromedio() + "',"
                + "diasasistidos = '" + est.getDiasAsistidos() + "',"
                + "matriculado = '" + (est.getMatriculado() ? "1" : "0") + "', "
                + "precioCurso = '" + est.getPrecioCurso() + "' "
                + "WHERE dni = '" + est.getDni() + "'";
        return MySQL(sql);
    }

    //--------------------
    public List<Estudiante> ObtenerCurso() {

        Connection co = null;
        stm = null;
        rs = null;
        String sql = "Select dni,nombre From tblestudiante Order by dni ";
        List<Estudiante> listDatos = new ArrayList<Estudiante>();
        try {
            co = this.getConnection();
            stm = (Statement) co.createStatement();
            rs = (ResultSetImpl) stm.executeQuery(sql);

            while (rs.next()) {
                Estudiante est = new Estudiante();
                est.setDni(rs.getString(1));
                est.setNombre(rs.getString(2));
                listDatos.add(est);
            }
            stm.close();
            co.close();
            rs.close();
        } catch (Exception e) {
            System.out.println("Error al obtener los datos");
            System.out.println("Error en: " + e.getMessage());
        }
        return listDatos;
    }

    public List<Estudiante> ObtenerCursoFinal() {

        Connection co = null;
        stm = null;
        rs = null;
        String sql = "Select dni,nombre,nota1,nota2,promedio,diasasistidos From tblestudiante Order by dni ";
        List<Estudiante> listDatos = new ArrayList<Estudiante>();
        try {
            co = this.getConnection();
            stm = (Statement) co.createStatement();
            rs = (ResultSetImpl) stm.executeQuery(sql);

            while (rs.next()) {
                Estudiante est = new Estudiante();
                est.setDni(rs.getString(1));
                est.setNombre(rs.getString(2));
                est.setNota1(rs.getDouble(3));
                est.setNota2(rs.getDouble(4));
                double promedio = est.getNota1() * 0.3 + est.getNota2() * 0.7;
                est.setPromedio(promedio);
                est.setDiasAsistidos(rs.getInt(6));
                listDatos.add(est);
            }
            stm.close();
            co.close();
            rs.close();
        } catch (Exception e) {
            System.out.println("Error al obtener los datos");
            System.out.println("Error en: " + e.getMessage());
        }
        return listDatos;
    }

}
