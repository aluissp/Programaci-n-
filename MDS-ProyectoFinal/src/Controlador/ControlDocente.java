/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloClases.Estudiante;
import ModeloSql.SqlDocente;
import Vista.JFrmAula;
import Vista.JFrmDocente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Armando Perugachi
 */
public class ControlDocente implements ActionListener {

    JFrmDocente vistaDocente;
    JFrmAula vistaAula;
    SqlDocente sql;
    Estudiante es;
    DefaultTableModel modeloAsistencia;
    DefaultTableModel modeloE1;
    DefaultTableModel modeloE2;
    DefaultTableModel modeloAula;

    public ControlDocente(JFrmDocente vistaDocente, JFrmAula vistaAula) {
        this.vistaDocente = vistaDocente;
        this.vistaAula = vistaAula;
        sql = new SqlDocente();
        es = new Estudiante();
        modeloE1 = (DefaultTableModel) vistaDocente.tblBuscar.getModel();
        modeloE2 = (DefaultTableModel) vistaDocente.tblBuscar1.getModel();
        modeloAsistencia = (DefaultTableModel) vistaDocente.tblAsistencia.getModel();
        modeloAula = (DefaultTableModel) vistaAula.tblAula.getModel();
        ActivarEventosVistaAula();
        ActivarEventosVistaDocente();
        cargarcurso(modeloAsistencia);
    }

    private void ActivarEventosVistaAula() {
        vistaAula.btRegistroAcademico.addActionListener(this);
        vistaAula.btnMenu.addActionListener(this);
    }

    private void ActivarEventosVistaDocente() {
        vistaDocente.btnBuscar.addActionListener(this);
        vistaDocente.btnRegistrarAsistencia.addActionListener(this);
        vistaDocente.btnRegistrarNota.addActionListener(this);
        vistaDocente.btnMenu.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaDocente.btnMenu) {
            vistaDocente.setVisible(false);
        } else if (e.getSource() == vistaAula.btnMenu) {
            vistaAula.setVisible(false);
        }
        if (e.getSource() == vistaDocente.btnBuscar) {
            try {
                if (vistaDocente.txtDNI.getText().length() > 0) {
                    es.setDni(vistaDocente.txtDNI.getText());

                    if (sql.BuscarEstudiante(es)) {
                        while (modeloE1.getRowCount() > 0 && modeloE2.getRowCount() > 0) {
                            modeloE1.removeRow(0);
                            modeloE2.removeRow(0);
                        }

                        modeloE1.addRow(new Object[]{es.getDni(),
                            es.getNombre(),
                            es.getApellido(),
                            es.getTelefono(),
                            es.getCorreo(),
                            es.getFechaNacimiento()});

                        modeloE2.addRow(new Object[]{
                            es.getTipoDeSangre(),
                            es.getNota1(),
                            es.getNota2(),
                            es.getPromedio(),
                            es.getDiasAsistidos()});
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se ha encotrado el estudiante");
                }
            } catch (Exception ex) {
                System.out.println("error: " + ex.getMessage());
            }
        } else if (e.getSource() == vistaDocente.btnRegistrarNota) {
            if (vistaDocente.txtDNI.getText().length() > 0) {
                es.setDni((String) vistaDocente.tblBuscar.getValueAt(0, 0));
                es.setNombre((String) vistaDocente.tblBuscar.getValueAt(0, 1));
                es.setApellido((String) vistaDocente.tblBuscar.getValueAt(0, 2));
                es.setTelefono((String) vistaDocente.tblBuscar.getValueAt(0, 3));
                es.setCorreo((String) vistaDocente.tblBuscar.getValueAt(0, 4));
                es.setFechaNacimiento(((Date) vistaDocente.tblBuscar.getValueAt(0, 5)).toString());

                es.setTipoDeSangre((String) vistaDocente.tblBuscar1.getValueAt(0, 0));
                es.setNota1((double) vistaDocente.tblBuscar1.getValueAt(0, 1));
                es.setNota2((double) vistaDocente.tblBuscar1.getValueAt(0, 2));
                es.setPromedio((double) vistaDocente.tblBuscar1.getValueAt(0, 3));
                es.setDiasAsistidos((int) vistaDocente.tblBuscar1.getValueAt(0, 4));
            }

            if (sql.ActualizarEstudiante(es)) {
                JOptionPane.showMessageDialog(null, "Se ha guardado correctamente los cambios");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar");
            }
        } else if (e.getSource() == vistaDocente.btnRegistrarAsistencia) {
            try {
                if (JOptionPane.showConfirmDialog(null, "Esta seguro de guardar la asistencia de los estudiantes") == JOptionPane.YES_OPTION) {
                    for (int i = 0; i < modeloAsistencia.getRowCount(); i++) {
                        es = new Estudiante();
                        es.setDni((String) vistaDocente.tblAsistencia.getValueAt(i, 0));
                        sql.BuscarEstudiante(es);
                        es.setNombre((String) vistaDocente.tblAsistencia.getValueAt(i, 1));
                        boolean s = (boolean) vistaDocente.tblAsistencia.getValueAt(i, 2);
                        es.setDiasAsistidos(s ? (1 + es.getDiasAsistidos()) : es.getDiasAsistidos());

                        sql.ActualizarEstudiante(es);
                    }
                    JOptionPane.showMessageDialog(null, "Se ha guardado correctamente los cambios");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo guardar");
                }
            } catch (Exception ex) {
                System.out.println("error: " + ex.getMessage());
            }
        } else if (e.getSource() == vistaAula.btRegistroAcademico) {
            while (modeloAula.getRowCount() > 0) {
                modeloAula.removeRow(0);
            }

            List<Estudiante> m = sql.ObtenerCursoFinal();

            for (int x = 0; x < m.size(); x++) {
                this.es = (Estudiante) m.get(x);
                System.out.println(es);
                modeloAula.addRow(new Object[]{es.getDni(),
                    es.getNombre(),
                    es.getNota1(),
                    es.getNota2(),
                    es.getPromedio(),
                    es.getDiasAsistidos()});
            }
            System.out.println("registro");
        }
    }

    public void desplegarDocente(boolean encendido) {
        this.vistaDocente.setVisible(encendido);
    }

    public void desplegarAula(boolean encendido) {
        this.vistaAula.setVisible(encendido);
    }

    private void cargarcurso(DefaultTableModel modelo) {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        List<Estudiante> e = sql.ObtenerCurso();

        for (int x = 0; x < e.size(); x++) {
            this.es = (Estudiante) e.get(x);
            modelo.addRow(new Object[]{es.getDni(),
                es.getNombre(),
                false});
        }
    }
}
