/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloSql;

import ModeloClases.Estudiante;
import ModeloClases.Tutor;
import com.mysql.cj.jdbc.result.ResultSetImpl;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class SQLSecretario extends Conexion {

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

    public boolean RegistrarEstudiante(Estudiante est) {
        String sql = "INSERT INTO tblestudiante VALUES ('" + est.getDni() + "',"
                + "'" + est.getNombre() + "',"
                + "'" + est.getApellido() + "',"
                + "'" + est.getTelefono() + "',"
                + "'" + est.getCorreo() + "',"
                + "'" + est.getFechaNacimiento() + "',"
                + "'" + est.getTipoDeSangre() + "',"
                + "'" + est.getNota1() + "',"
                + "'" + est.getNota2() + "',"
                + "'" + est.getPromedio() + "',"
                + "'" + est.getDiasAsistidos() + "',"
                + "'" + (est.getMatriculado() ? "1" : "0") + "',"
                + "'0'," + " '11' " + ", NULL);";

        return MySQL(sql);
    }

    public boolean RegistrarTutor(Tutor tutor) {
        String sql = "INSERT INTO tbltutor VALUES ('" + tutor.getDni() + "',"
                + "'" + tutor.getNombre() + "',"
                + "'" + tutor.getApellido() + "',"
                + "'" + tutor.getTelefono() + "',"
                + "'" + tutor.getCorreo() + "',"
                + "'" + tutor.getFechaNacimiento() + "',"
                + "'" + tutor.getParentesco() + "')";

        return MySQL(sql);
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

    public boolean AñadirTutor(String dniTutor, Estudiante est) {
        String sql = "UPDATE tblestudiante SET dnitutor =  '" + dniTutor + "' "
                + "WHERE dni = '" + est.getDni() + "'";
        return MySQL(sql);
    }

    public boolean ActualizarTutor(Tutor tutor) {
        String sql = "UPDATE tbltutor SET nombre =  '" + tutor.getNombre() + "',"
                + "apellido = '" + tutor.getApellido() + "',"
                + "telefono = '" + tutor.getTelefono() + "',"
                + "correo = '" + tutor.getCorreo() + "',"
                + "fechanacimiento = '" + tutor.getFechaNacimiento() + "',"
                + "parentesco = '" + tutor.getParentesco() + "' "
                + "WHERE dni = '" + tutor.getDni() + "'";
        return MySQL(sql);
    }

    public boolean EliminarEstudiante(Estudiante est) {
        String sql = "DELETE FROM tblestudiante"
                + " WHERE dni = '" + est.getDni() + "'";
        return MySQL(sql);
    }

    public boolean EliminarTutor(Tutor tutor) {
        String sql = "DELETE FROM tbltutor"
                + " WHERE dni = '" + tutor.getDni() + "'";
        return MySQL(sql);
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

    public boolean BuscarTutor(Tutor tutor) {
        boolean registrado = false;
        Connection c;//select * from tblestudiante where dni=?
        String sql = "select nombre,apellido,telefono,correo,fechanacimiento,parentesco "
                + "from tbltutor where dni= '" + tutor.getDni() + "'";
        try {
            c = this.getConnection();
            stm = (Statement) c.createStatement();
            rs = (ResultSetImpl) stm.executeQuery(sql);
            if (rs.next()) {

                tutor.setNombre(rs.getString(1));
                tutor.setApellido(rs.getString(2));
                tutor.setTelefono(rs.getString(3));
                tutor.setCorreo(rs.getString(4));
                tutor.setFechaNacimiento(rs.getDate(5).toString());
                tutor.setParentesco(rs.getString(6));
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

    public List<Estudiante> BuscarCurso() {
        Connection c;//select * from tblestudiante where dni=?
        String sql = "select nombre,apellido,telefono,correo,fechanacimiento,"
                + "tiposangre,nota1,nota2,promedio,diasasistidos,matriculado,dni "
                + "from tblestudiante order by dni";
        List<Estudiante> listCurso = new ArrayList<Estudiante>();;

        try {
            c = this.getConnection();
            stm = (Statement) c.createStatement();
            rs = (ResultSetImpl) stm.executeQuery(sql);
            Estudiante e;
            while (rs.next()) {
                e = new Estudiante();
                e.setNombre(rs.getString(1));
                e.setApellido(rs.getString(2));
                e.setTelefono(rs.getString(3));
                e.setCorreo(rs.getString(4));
                e.setFechaNacimiento(rs.getDate(5).toString());
                e.setTipoDeSangre(rs.getString(6));
                e.setNota1(rs.getDouble(7));
                e.setNota2(rs.getDouble(8));
                e.setPromedio(rs.getDouble(9));
                e.setDiasAsistidos(rs.getInt(10));
                e.setMatriculado(rs.getBoolean(11));
                e.setDni(rs.getString(12));
                listCurso.add(e);

            }
            stm.close();
            rs.close();
            c.close();
        } catch (SQLException e) {
            System.err.println("Error, " + e);
        }

        return listCurso;
    }
}
