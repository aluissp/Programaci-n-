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

    public void escribirArchivo(Estudiantes nuevoEstudiante) {
        try {
            File f = new File("estudiante.csv");
            FileWriter fw;
            BufferedWriter bw;

            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.close();
            }

            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(nuevoEstudiante.getCedula() + ";"
                    + nuevoEstudiante.getNombre() + ";"
                    + nuevoEstudiante.getNota1() + ";"
                    + nuevoEstudiante.getNota2());

            bw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo");
        }
    }

    public void leerArchivo(DefaultTableModel modeloEstudiante) {

        try {
            File f = new File("estudiante.csv");
            FileReader fr;
            BufferedReader br;

            if (f.exists()) {
                fr = new FileReader(f);
                br = new BufferedReader(fr);
                String linea;

                Estudiantes est = new Estudiantes();

                while ((linea = br.readLine()) != null) {
                    String[] arrayEstudiante = linea.split(";");
                    est.setCedula(arrayEstudiante[0]);
                    est.setNombre(arrayEstudiante[1]);
                    est.setNota1(Integer.parseInt(arrayEstudiante[2]));
                    est.setNota2(Integer.parseInt(arrayEstudiante[3]));
                    modeloEstudiante.addRow(new Object[]{
                        est.getCedula(),
                        est.getNombre(),
                        est.getNota1(),
                        est.getNota2()
                    });
                }
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo");

        }
    }
}
