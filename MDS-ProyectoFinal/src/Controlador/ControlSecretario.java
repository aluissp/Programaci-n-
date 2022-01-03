/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.JFrmSecretario;
import ModeloClases.Estudiante;
import ModeloClases.Tutor;
import ModeloSql.SQLSecretario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ControlSecretario implements ActionListener {

    private JFrmSecretario vistaSecretario;
    private Estudiante est;
    private Tutor tutor;
    private SQLSecretario sql;
    private DefaultTableModel modeloLegalizar;

    public ControlSecretario(JFrmSecretario vistaSecretario) {
        this.vistaSecretario = vistaSecretario;
        ActivarEventosVistaSecretario();
        this.modeloLegalizar = (DefaultTableModel) vistaSecretario.tblLegalizar.getModel();
        est = new Estudiante();
        tutor = new Tutor();
        sql = new SQLSecretario();
        cargarCurso(modeloLegalizar);
    }

    private void ActivarEventosVistaSecretario() {
        vistaSecretario.btnActualizar.addActionListener(this);
        vistaSecretario.btnAñadirTutor.addActionListener(this);
        vistaSecretario.btnBuscar.addActionListener(this);
        vistaSecretario.btnEliminar.addActionListener(this);
        vistaSecretario.btnPagar.addActionListener(this);
        vistaSecretario.btnLegalizar.addActionListener(this);
        vistaSecretario.btnBuscarPostulante.addActionListener(this);
        vistaSecretario.btnRegistrar.addActionListener(this);
        vistaSecretario.btnMenu.addActionListener(this);
        vistaSecretario.rbRegistroTutor.addActionListener(this);
        vistaSecretario.btnAñadirTutor.addActionListener(this);
        vistaSecretario.btnBuscarTutor.addActionListener(this);

        habilitarAñadirTutor(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaSecretario.btnMenu) {
            vistaSecretario.setVisible(false);
        }

        if (vistaSecretario.rbRegistroTutor.isSelected()) {
//            System.out.println("selectec tutor");
            habilitarTxtTutor(true);

            if (e.getSource() == vistaSecretario.btnRegistrar) {
                try {
                    obtenerDatosTutor(tutor);
                    if (sql.RegistrarTutor(tutor)) {
                        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente el Tutor\n" + tutor);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo registrar el tutor");
                    }
                } catch (Exception ex) {
                    System.out.println("error: " + ex.getMessage());
                }
            } else if (e.getSource() == vistaSecretario.btnActualizar) {
                try {
                    obtenerDatosTutor(tutor);
                    if (sql.ActualizarTutor(tutor)) {
                        JOptionPane.showMessageDialog(null, "Se ha actualizado correctamente el Tutor\n" + tutor);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se ha actualizado el Tutor");
                    }
                } catch (Exception ex) {
                    System.out.println("error: " + ex.getMessage());
                }
            } else if (e.getSource() == vistaSecretario.btnEliminar) {
                try {
                    tutor.setDni(vistaSecretario.txtDNI.getText());
                    sql.BuscarTutor(tutor);
                    if (sql.EliminarTutor(tutor)) {
                        JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente el Tutor\n" + tutor);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se ha eliminado el Tutor");
                    }
                } catch (Exception ex) {
                    System.out.println("error: " + ex.getMessage());
                }
            } else if (e.getSource() == vistaSecretario.btnBuscarPostulante) {
                try {
                    tutor.setDni(vistaSecretario.txtDNI.getText());
                    sql.BuscarTutor(tutor);
                    ingresarDatosTutor(tutor);
                } catch (Exception ex) {
                    System.out.println("error: " + ex.getMessage());
                }
            }

        } else {
            habilitarTxtTutor(false);
//            System.out.println("no selected tutor");
            if (e.getSource() == vistaSecretario.btnRegistrar) {
                try {
                    obtenerDatosTxt(est);
                    if (sql.RegistrarEstudiante(est)) {
                        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente el\n" + est);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se ha registrado el estudiante");
                    }
                } catch (Exception ex) {
                    System.out.println("error: " + ex.getMessage());
                }
            } else if (e.getSource() == vistaSecretario.btnActualizar) {
                try {
                    obtenerDatosTxt(est);
                    if (sql.ActualizarEstudiante(est)) {
                        JOptionPane.showMessageDialog(null, "Se ha actualizado correctamente el\n" + est);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se ha actualizado el estudiante");
                    }
                } catch (Exception ex) {
                    System.out.println("error: " + ex.getMessage());
                }
            } else if (e.getSource() == vistaSecretario.btnEliminar) {
                try {
                    est.setDni(vistaSecretario.txtDNI.getText());
                    sql.BuscarEstudiante(est);
                    if (sql.EliminarEstudiante(est)) {
                        JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente el\n" + est);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se ha eliminado el estudiante");
                    }
                } catch (Exception ex) {
                    System.out.println("error: " + ex.getMessage());
                }
            } else if (e.getSource() == vistaSecretario.btnBuscarPostulante) {
                try {
                    est.setDni(vistaSecretario.txtDNI.getText());
                    sql.BuscarEstudiante(est);
                    ingresarDatosTxt(est);
                } catch (Exception ex) {
                    System.out.println("error: " + ex.getMessage());
                }
            }
        }

        //  LEGALIZAR MATRICULA
        if (e.getSource() == vistaSecretario.btnBuscar) {
            try {
                est.setDni(vistaSecretario.txtDniBuscar.getText());
                sql.BuscarEstudiante(est);
                vistaSecretario.txtDniBuscar.setText(est.getDni());
                vistaSecretario.txtPagoMatricula.setText(String.valueOf(est.getPrecioCurso()));

                if (esMenor(est.getFechaNacimiento())) {
                    habilitarAñadirTutor(true);
                } else {
                    habilitarAñadirTutor(false);
                }
            } catch (Exception ex) {
                System.out.println("error: " + ex.getMessage());
            }
        } else if (e.getSource() == vistaSecretario.btnPagar) {
            est.setDni(vistaSecretario.txtDniBuscar.getText());
            sql.BuscarEstudiante(est);
            double precio = Double.parseDouble(vistaSecretario.txtPagoMatricula.getText()) + est.getPrecioCurso();
            if (precio <= 100) {
                est.setPrecioCurso(precio);
                if (sql.ActualizarEstudiante(est)) {
                    JOptionPane.showMessageDialog(null, "Ha cancelado " + precio);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo pagar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ha cancelado el valor completo del curso");
            }
        } else if (e.getSource() == vistaSecretario.btnBuscarTutor) {
            try {
                tutor.setDni(vistaSecretario.txtDniTutor.getText());
                if (!sql.BuscarTutor(tutor)) {
                    JOptionPane.showMessageDialog(null, "No se encontro el tutor");
                } else {
                    vistaSecretario.txtNombreTutor.setText(tutor.getNombre());
                    vistaSecretario.txtApellidoTutor.setText(tutor.getApellido());
                    vistaSecretario.txtParentesco.setText(tutor.getParentesco());
                }
            } catch (Exception ex) {
                System.out.println("error: " + ex.getMessage());
            }
        } else if (e.getSource() == vistaSecretario.btnAñadirTutor) {
            try {

                if (!sql.AñadirTutor(vistaSecretario.txtDniTutor.getText(), est)) {
                    JOptionPane.showMessageDialog(null, "No se añadir el tutor");
                } else {
                    vistaSecretario.txtNombreTutor.setText(tutor.getNombre());
                    vistaSecretario.txtApellidoTutor.setText(tutor.getApellido());
                    vistaSecretario.txtParentesco.setText(tutor.getParentesco());
                    JOptionPane.showMessageDialog(null, "Se añadio correctamente el tutor");
                }
            } catch (Exception ex) {
                System.out.println("error: " + ex.getMessage());
            }
        } else if (e.getSource() == vistaSecretario.btnLegalizar) {
            if (JOptionPane.showConfirmDialog(null, "Esta seguro de legalizar la matricula") == JOptionPane.YES_OPTION) {
                est.setMatriculado(true);
            }
            if (sql.ActualizarEstudiante(est)) {
                JOptionPane.showMessageDialog(null, "El estudiante esta matriculado");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo matricular al estudiante");
            }
        }
    }

    private void obtenerDatosTxt(Estudiante est) {
        est.setDni(vistaSecretario.txtDNI.getText());
        est.setNombre(vistaSecretario.txtNombre.getText());
        est.setApellido(vistaSecretario.txtApellido.getText());
        est.setTelefono(vistaSecretario.txtTelefono.getText());
        est.setCorreo(vistaSecretario.txtCorreo.getText());
        est.setFechaNacimiento(vistaSecretario.txtFecha.getText());
        est.setTipoDeSangre(vistaSecretario.txtSangre.getText());
        est.setNota1(0);
        est.setNota2(0);
        est.setPromedio(0);
        est.setMatriculado(false);
    }

    private void obtenerDatosTutor(Tutor tutor) {
        tutor.setDni(vistaSecretario.txtDNI.getText());
        tutor.setNombre(vistaSecretario.txtNombre.getText());
        tutor.setApellido(vistaSecretario.txtApellido.getText());
        tutor.setTelefono(vistaSecretario.txtTelefono.getText());
        tutor.setCorreo(vistaSecretario.txtCorreo.getText());
        tutor.setFechaNacimiento(vistaSecretario.txtFecha.getText());
        tutor.setParentesco(vistaSecretario.txtParentescoRegistrar.getText());
    }

    private void ingresarDatosTutor(Tutor tutor) {
        vistaSecretario.txtNombre.setText(tutor.getNombre());
        vistaSecretario.txtApellido.setText(tutor.getApellido());
        vistaSecretario.txtTelefono.setText(tutor.getTelefono());
        vistaSecretario.txtCorreo.setText(tutor.getCorreo());
        vistaSecretario.txtFecha.setText(tutor.getFechaNacimiento().toString());
        vistaSecretario.txtParentescoRegistrar.setText(tutor.getParentesco());
    }

    private void ingresarDatosTxt(Estudiante est) {
        vistaSecretario.txtNombre.setText(est.getNombre());
        vistaSecretario.txtApellido.setText(est.getApellido());
        vistaSecretario.txtTelefono.setText(est.getTelefono());
        vistaSecretario.txtCorreo.setText(est.getCorreo());
        vistaSecretario.txtFecha.setText(est.getFechaNacimiento().toString());
        vistaSecretario.txtSangre.setText(est.getTipoDeSangre());
    }

    private void cargarCurso(DefaultTableModel modelo) {
        List<Estudiante> e = sql.BuscarCurso();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (int x = 0; x < e.size(); x++) {
            this.est = (Estudiante) e.get(x);
            modelo.addRow(new Object[]{est.getDni(),
                est.getNombre(),
                est.getApellido(),
                est.getTelefono(),
                est.getCorreo(),
                est.getFechaNacimiento(),
                est.getTipoDeSangre()});
        }
    }

    private boolean esMenor(Date f) {
        int a = Integer.valueOf(((f.toString()).split("-"))[0]);
        int n = LocalDate.now().getYear();

        return ((n - a) >= 16 && (n - a) < 18);
    }

    private void habilitarAñadirTutor(boolean habilitar) {
        vistaSecretario.txtDniTutor.setEnabled(habilitar);
        vistaSecretario.txtNombreTutor.setEnabled(habilitar);
        vistaSecretario.txtApellidoTutor.setEnabled(habilitar);
        vistaSecretario.txtParentesco.setEnabled(habilitar);
        vistaSecretario.btnAñadirTutor.setEnabled(habilitar);
        vistaSecretario.btnBuscarTutor.setEnabled(habilitar);
    }

    private void habilitarTxtTutor(boolean habiliar) {
        vistaSecretario.txtSangre.setEnabled(!habiliar);
        vistaSecretario.txtParentescoRegistrar.setEnabled(habiliar);
    }

    public void desplegar(boolean encendido) {
        this.vistaSecretario.setVisible(encendido);
    }

}
