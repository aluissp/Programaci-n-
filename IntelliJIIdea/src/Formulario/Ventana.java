package Formulario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ventana  implements ActionListener {
    private JButton btSaludar;


    @Override
    public void actionPerformed(ActionEvent e) {
        btSaludar.addActionListener(this);
        if (e.getSource() == btSaludar) {
            JOptionPane.showMessageDialog(null, "Hola amigos como estan??");
        }


    }
}
