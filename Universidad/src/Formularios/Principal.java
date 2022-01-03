/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author Armando Perugachi
 */
public class Principal extends javax.swing.JFrame {

    private final frmAdministrativo administrativo = new frmAdministrativo(this, rootPaneCheckingEnabled);
    private final frmDocente docente = new frmDocente(this, rootPaneCheckingEnabled);
    private final frmEstudiantePresencial estudiantePresencial = new frmEstudiantePresencial(this, rootPaneCheckingEnabled);
    private final frmEstudianteVirtual estudianteVirtual = new frmEstudianteVirtual(this, rootPaneCheckingEnabled);

    /**
     * Creates new form Ventana
     */
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btRegistrarDocente = new javax.swing.JButton();
        btRegistrarAdministrativo = new javax.swing.JButton();
        btRegistrarEstudiantePresencial = new javax.swing.JButton();
        btRegistrarEstudianteVirtual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel1.setText("Sistema de registro de usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 320, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione una opcion:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 170, 30));

        btRegistrarDocente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btRegistrarDocente.setText("Registrar Docente");
        btRegistrarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarDocenteActionPerformed(evt);
            }
        });
        jPanel1.add(btRegistrarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 230, 50));

        btRegistrarAdministrativo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btRegistrarAdministrativo.setText("Regsitrar Administrativo");
        btRegistrarAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarAdministrativoActionPerformed(evt);
            }
        });
        jPanel1.add(btRegistrarAdministrativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 230, 50));

        btRegistrarEstudiantePresencial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btRegistrarEstudiantePresencial.setText("Registrar Estudiante Presencial");
        btRegistrarEstudiantePresencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarEstudiantePresencialActionPerformed(evt);
            }
        });
        jPanel1.add(btRegistrarEstudiantePresencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 230, 50));

        btRegistrarEstudianteVirtual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btRegistrarEstudianteVirtual.setText("Registrar Estudiante Virtual");
        btRegistrarEstudianteVirtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarEstudianteVirtualActionPerformed(evt);
            }
        });
        jPanel1.add(btRegistrarEstudianteVirtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 230, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRegistrarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarDocenteActionPerformed
//        docente = new frmDocente(this, rootPaneCheckingEnabled);
        docente.setVisible(true);
    }//GEN-LAST:event_btRegistrarDocenteActionPerformed

    private void btRegistrarAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarAdministrativoActionPerformed
        administrativo.setVisible(true);
    }//GEN-LAST:event_btRegistrarAdministrativoActionPerformed

    private void btRegistrarEstudiantePresencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarEstudiantePresencialActionPerformed
        estudiantePresencial.setVisible(true);
    }//GEN-LAST:event_btRegistrarEstudiantePresencialActionPerformed

    private void btRegistrarEstudianteVirtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarEstudianteVirtualActionPerformed
        estudianteVirtual.setVisible(true);
    }//GEN-LAST:event_btRegistrarEstudianteVirtualActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRegistrarAdministrativo;
    private javax.swing.JButton btRegistrarDocente;
    private javax.swing.JButton btRegistrarEstudiantePresencial;
    private javax.swing.JButton btRegistrarEstudianteVirtual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}