/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Armando Perugachi
 */
public class Archivos {

    public void escribirArchivo(Persona persona, String nombreDocumento) {
        try {
            File f = new File(nombreDocumento + ".csv");
            FileWriter fw;
            BufferedWriter bw;

            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.close();
            }

            String usuario = persona.getNombre() + ";" + persona.getDni() + ";" + persona.getDireccion() + ";"
                    + persona.getTelefono() + ";" + persona.getCorreo();

            if (persona instanceof Administrativo) {
                usuario += ";" + ((Administrativo) persona).getTitulo() + ";" + ((Administrativo) persona).getSueldo()
                        + ";" + ((Administrativo) persona).getAnoIngreso() + ";" + ((Administrativo) persona).getCargo();
            } else if (persona instanceof Docente) {
                usuario += ";" + ((Docente) persona).getTitulo() + ";" + ((Docente) persona).getSueldo()
                        + ";" + ((Docente) persona).getHorasClase() + ";" + ((Docente) persona).getNroMaterias();
            } else {
                usuario += ";" + ((Estudiante) persona).getFacultad() + ";" + ((Estudiante) persona).getCarrera()
                        + ";" + ((Estudiante) persona).getNivel() + ";" + ((Estudiante) persona).getHorasDeClases()
                        + ";" + ((Estudiante) persona).getNroAsignatura() + ";" + ((Estudiante) persona).getTituloSerBachiller()
                        + ";" + ((Estudiante) persona).getCredencialUniversidad()
                        + ";" + ((Estudiante) persona).getAsignatura().getNombre() + ";" + ((Estudiante) persona).getAsignatura().getHorasClase()
                        + ";" + ((Estudiante) persona).getAsignatura().getNota1() + ";" + ((Estudiante) persona).getAsignatura().getNota2()
                        + ";" + ((Estudiante) persona).getAsignatura().getPromedio();
                if (persona instanceof EstudiantePresencial) {
                    usuario += ";" + ((EstudiantePresencial) persona).getNroAula();
                } else {
                    usuario += ";" + ((EstudianteVirtual) persona).getPlataforma();
                }
            }
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(usuario);

            bw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo");
        }
    }

    public void leerArchivo(DefaultTableModel modelo, String nombreDocumento) {

        try {
            File f = new File(nombreDocumento + ".csv");
            FileReader fr;
            BufferedReader br;

            if (f.exists()) {
                fr = new FileReader(f);
                br = new BufferedReader(fr);
                String linea;

                while ((linea = br.readLine()) != null) {
                    String[] arrayUsuario = linea.split(";");
                    modelo.addRow(arrayUsuario);
                }

            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo");

        }
    }
}
