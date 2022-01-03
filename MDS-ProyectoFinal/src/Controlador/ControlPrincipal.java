/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.JFrmAula;
import Vista.JFrmDocente;
import Vista.JFrmMenu;
import Vista.JFrmSecretario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class ControlPrincipal implements ActionListener {

    private ControlSecretario controlS;
    private ControlDocente controlD;
    private JFrmMenu vistaMenu;

    public ControlPrincipal(JFrmDocente vistaDocente, JFrmAula vistaAula, JFrmSecretario vistaSecretario, JFrmMenu vistaMenu) {
        controlS = new ControlSecretario(vistaSecretario);
        controlD = new ControlDocente(vistaDocente, vistaAula);
        this.vistaMenu = vistaMenu;
        ActivarEventosVistaMenu();
    }

    private void ActivarEventosVistaMenu() {
        vistaMenu.btnAula.addActionListener(this);
        vistaMenu.btnDocente.addActionListener(this);
        vistaMenu.btnSecretario.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaMenu.btnSecretario) {
//            vistaMenu.setVisible(false);
            controlS.desplegar(true);
        } else if (e.getSource() == vistaMenu.btnDocente) {
//            vistaMenu.setVisible(false);
            controlD.vistaDocente.setVisible(true);
        } else if (e.getSource() == vistaMenu.btnAula) {
//            vistaMenu.setVisible(false);
            controlD.vistaAula.setVisible(true);
        }
        //-----------------------------VISTA------------------------------------
        /*if (e.getSource() == vistaMenu.btnAula) {
            vistaAula.setVisible(true);
            vistaMenu.setVisible(false);
        } else if (e.getSource() == vistaMenu.btnDocente) {
            vistaDocente.setVisible(true);
            vistaMenu.setVisible(false);
        } else if (e.getSource() == vistaMenu.btnSecretario) {
            vistaSecretario.setVisible(true);
            vistaMenu.setVisible(false);
        } else if (e.getSource() == vistaDocente.btnMenu) {
            vistaDocente.setVisible(false);
            vistaMenu.setVisible(true);
        } else if (e.getSource() == vistaAula.btnMenu) {
            vistaAula.setVisible(false);
            vistaMenu.setVisible(true);
        } else if (e.getSource() == vistaSecretario.btnMenu) {
            vistaSecretario.setVisible(false);
            vistaMenu.setVisible(true);
        }*/
    }

    public JFrmMenu getVistaMenu() {
        return vistaMenu;
    }

}
