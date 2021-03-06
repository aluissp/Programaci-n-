/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import javax.swing.JOptionPane;

/**
 *
 * @author Armando Perugachi
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lbUsuario = new javax.swing.JLabel();
        lbSalir = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        lbLogo = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        Usuario = new javax.swing.JTextField();
        lbIniciarSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panel.setBackground(new java.awt.Color(45, 43, 43));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbUsuario.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuario.setText("usuario");
        panel.add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        lbSalir.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 24)); // NOI18N
        lbSalir.setForeground(new java.awt.Color(255, 255, 255));
        lbSalir.setText("salir");
        lbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbSalirMousePressed(evt);
            }
        });
        panel.add(lbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        lbTitulo.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(8, 132, 242));
        lbTitulo.setText("INICIAR SESI??N");
        panel.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        lbPassword.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 24)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(255, 255, 255));
        lbPassword.setText("contrase??a");
        panel.add(lbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/login.png"))); // NOI18N
        panel.add(lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 150, 150));

        Password.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(45, 43, 43));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        panel.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 300, 30));

        Usuario.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        Usuario.setForeground(new java.awt.Color(45, 43, 43));
        Usuario.setCaretColor(new java.awt.Color(45, 43, 43));
        panel.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 300, 30));

        lbIniciarSesion.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 24)); // NOI18N
        lbIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        lbIniciarSesion.setText("continuar");
        lbIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbIniciarSesionMousePressed(evt);
            }
        });
        panel.add(lbIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSalirMousePressed
        System.exit(0);
    }//GEN-LAST:event_lbSalirMousePressed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
    }//GEN-LAST:event_PasswordActionPerformed

    private void lbIniciarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIniciarSesionMousePressed
        String usuario = "Luis";
        String contrase??a = "perugachi";

        if (usuario.equals(Usuario.getText())) {
            String auxPassword = "";

            for (int i = 0; i < Password.getPassword().length; i++) {
                auxPassword += Password.getPassword()[i];
            }

            if (contrase??a.equals(auxPassword)) {
                JOptionPane.showMessageDialog(null, "Ingresaste al sistema");
            } else {
                JOptionPane.showMessageDialog(null, "Error, contrase??a invalida");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error, usuario desconocido");
        }
    }//GEN-LAST:event_lbIniciarSesionMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Usuario;
    private javax.swing.JLabel lbIniciarSesion;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbSalir;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
