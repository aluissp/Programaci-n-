package Controlador;

import Modelo.Persona;
import Modelo.ConsultaPersonas;
import Vista.vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorPersona implements ActionListener {

    private vista vista;
    private Persona persona;
    private ConsultaPersonas modelo;

    public ControladorPersona(vista vista, Persona persona, ConsultaPersonas modelo) {
        this.vista = vista;
        this.persona = persona;
        this.modelo = modelo;
        vista.btInsertar.addActionListener(this);
        vista.btLimpiar.addActionListener(this);
        vista.btBuscar.addActionListener(this);
        vista.btModificar.addActionListener(this);
        vista.btEliminar.addActionListener(this);
    }

    public void Iniciar() {
        vista.setTitle("CRUD Escuela");
        vista.setLocationRelativeTo(null);
        vista.txtId.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btInsertar) {
            persona.setClave(vista.txtClave.getText());
            persona.setNombre(vista.txtNombre.getText());
            persona.setCelular(vista.txtCelular.getText());
            persona.setGenero(vista.comboGenero.getSelectedItem().toString());
            persona.setEdad(Integer.parseInt(vista.txtEdad.getText()));

            if (modelo.insertar(persona)) {
                JOptionPane.showMessageDialog(null, "Registro insertado correctamente :3");
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar :c");
                Limpiar();
            }
        } else if (e.getSource() == vista.btLimpiar) {
            Limpiar();
        } else if (e.getSource() == vista.btBuscar) {
            persona.setClave(vista.clave.getText());

            if (modelo.buscar(persona)) {
                vista.txtId.setText(String.valueOf(persona.getIdPersona()));
                vista.txtCelular.setText(persona.getCelular());
                vista.comboGenero.setSelectedItem(persona.getGenero());
                vista.txtEdad.setText(String.valueOf(persona.getEdad()));
                vista.txtNombre.setText(persona.getNombre());
                vista.txtClave.setText(persona.getClave());

                //System.out.println(vista.txtId.getText());
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con esa clave");
            }
        } else if (e.getSource() == vista.btModificar) {
            System.out.println(vista.txtId.getText());
            persona.setIdPersona(Integer.valueOf(vista.txtId.getText()));
            persona.setClave(vista.txtClave.getText());
            persona.setNombre(vista.txtNombre.getText());
            persona.setCelular(vista.txtCelular.getText());
            persona.setGenero(vista.comboGenero.getSelectedItem().toString());
            persona.setEdad(Integer.parseInt(vista.txtEdad.getText()));

            if (modelo.modificar(persona)) {
                JOptionPane.showMessageDialog(null, "Registro modificado correctamente :3");
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar :c");
                Limpiar();
            }
        } else if (e.getSource() == vista.btEliminar) {
            persona.setIdPersona(Integer.parseInt(vista.txtId.getText()));

            if (modelo.eliminar(persona)) {
                JOptionPane.showMessageDialog(null, "Eliminado correctamente :3");
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar :c");
                Limpiar();
            }
        }
    }

    public void Limpiar() {
        vista.txtCelular.setText(null);
        vista.txtEdad.setText(null);
        vista.txtId.setText(null);
        vista.txtNombre.setText(null);
        vista.comboGenero.setSelectedIndex(0);
        vista.clave.setText(null);
        vista.txtClave.setText(null);
    }

}

