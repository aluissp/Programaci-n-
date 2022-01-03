package Inicial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Ventana extends javax.swing.JFrame {

    private Timer tiempo;//Hacemos uso de la clase timer
    private int centesimaSegundo = 0, segundos = 0, minutos = 0, horas = 0;//Parametros para controlar el tiempo en la clase timer

    private ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            centesimaSegundo++;

            if (centesimaSegundo == 100) {
                segundos++;
                centesimaSegundo = 0;
            } else if (segundos == 60) {
                minutos++;
                segundos = 0;
            } else if (minutos == 60) {
                horas++;
                minutos = 0;
            }

            actualizarTiempo();
        }
    };

    private void actualizarTiempo() {
        String tiempotxt = (horas < 10 ? "0" : "") + horas + ":" + (minutos < 10 ? "0" : "") + minutos + ":" + (segundos < 10 ? "0" : "")
                + segundos + ":" + (centesimaSegundo < 10 ? "0" : "") + centesimaSegundo;
        lbTiempo.setText(tiempotxt);

    }

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        tiempo = new Timer(10, acciones);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lbIcono = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbTiempo = new javax.swing.JLabel();
        btIniciar = new javax.swing.JButton();
        btPausar = new javax.swing.JButton();
        btDetener = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cronómetro");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbIcono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono.png"))); // NOI18N
        lbIcono.setText("jLabel1");
        panel.add(lbIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 260));

        lbTitulo.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(51, 51, 255));
        lbTitulo.setText("CRONÓMETRO");
        panel.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 50));

        lbTiempo.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        lbTiempo.setForeground(new java.awt.Color(204, 204, 255));
        lbTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTiempo.setText("00:00:00:00");
        panel.add(lbTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 310, -1));

        btIniciar.setBackground(new java.awt.Color(153, 255, 255));
        btIniciar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btIniciar.setText("INICIAR");
        btIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarActionPerformed(evt);
            }
        });
        panel.add(btIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        btPausar.setBackground(new java.awt.Color(153, 255, 255));
        btPausar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btPausar.setText("PAUSAR");
        btPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPausarActionPerformed(evt);
            }
        });
        panel.add(btPausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        btDetener.setBackground(new java.awt.Color(153, 255, 255));
        btDetener.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btDetener.setText("DETENER");
        btDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDetenerActionPerformed(evt);
            }
        });
        panel.add(btDetener, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        panel.add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarActionPerformed
        tiempo.start();

        btIniciar.setEnabled(false);
        btIniciar.setText("Reanudar");
        btPausar.setEnabled(true);
        btDetener.setEnabled(true);
    }//GEN-LAST:event_btIniciarActionPerformed

    private void btPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPausarActionPerformed
        tiempo.stop();
        btIniciar.setEnabled(true);
        btPausar.setEnabled(false);
        btDetener.setEnabled(true);
    }//GEN-LAST:event_btPausarActionPerformed

    private void btDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDetenerActionPerformed
        if (tiempo.isRunning()) {
            tiempo.stop();
            btIniciar.setEnabled(true);
        }
        btIniciar.setText("Iniciar");
        btPausar.setEnabled(false);
        btDetener.setEnabled(false);

        horas = 0;
        minutos = 0;
        segundos = 0;
        centesimaSegundo = 0;

        actualizarTiempo();
    }//GEN-LAST:event_btDetenerActionPerformed

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
    private javax.swing.JButton btDetener;
    private javax.swing.JButton btIniciar;
    private javax.swing.JButton btPausar;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbIcono;
    private javax.swing.JLabel lbTiempo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
