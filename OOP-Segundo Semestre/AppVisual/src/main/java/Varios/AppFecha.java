/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Varios;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Armando Perugachi
 */
public class AppFecha extends javax.swing.JFrame {

    /**
     * Creates new form AppFecha
     */
    public AppFecha() {
        initComponents();
        
        f1 = new Fecha();
        f2 = new Fecha();
        date1 = new Fecha(date.get(Calendar.DAY_OF_MONTH), date.get(Calendar.MONTH) + 1, date.get(Calendar.YEAR));
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
        jPanel2 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        lbFecha1 = new javax.swing.JLabel();
        btAsignarFechaActual1 = new javax.swing.JButton();
        lbDia = new javax.swing.JLabel();
        lbMes = new javax.swing.JLabel();
        lbAño = new javax.swing.JLabel();
        tfDia1 = new javax.swing.JTextField();
        tfMes1 = new javax.swing.JTextField();
        tfAño1 = new javax.swing.JTextField();
        btAsignar1 = new javax.swing.JButton();
        btDiaMas1 = new javax.swing.JButton();
        btDiaMenos1 = new javax.swing.JButton();
        btNDiasMas = new javax.swing.JButton();
        btNDiasMenos = new javax.swing.JButton();
        btDiasMes = new javax.swing.JButton();
        btBisiesto = new javax.swing.JButton();
        lbFecha2 = new javax.swing.JLabel();
        tfDia2 = new javax.swing.JTextField();
        tfMes2 = new javax.swing.JTextField();
        tfAño2 = new javax.swing.JTextField();
        btAsignar2 = new javax.swing.JButton();
        lbDia1 = new javax.swing.JLabel();
        lbMes1 = new javax.swing.JLabel();
        lbAño1 = new javax.swing.JLabel();
        btAsignarFechaActual2 = new javax.swing.JButton();
        lbEdad = new javax.swing.JLabel();
        jbEdadActual = new javax.swing.JButton();
        jbEdadf2 = new javax.swing.JButton();
        lbCompararF = new javax.swing.JLabel();
        jbCFechaActual = new javax.swing.JButton();
        jbCFecha2 = new javax.swing.JButton();
        lbDiaMasR = new javax.swing.JLabel();
        lbDiaMenosR = new javax.swing.JLabel();
        lbDiaMasNR1 = new javax.swing.JLabel();
        lbDiaMenosNR2 = new javax.swing.JLabel();
        tfNDias1 = new javax.swing.JTextField();
        tfNDias2 = new javax.swing.JTextField();
        lbRDiasMes = new javax.swing.JLabel();
        lbRBisiesto = new javax.swing.JLabel();
        lbREdad = new javax.swing.JLabel();
        lbEdadFecha2 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 11, -1, -1));

        txtTitulo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("FECHA  ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 400, 40));

        lbFecha1.setText("Fecha 1");
        getContentPane().add(lbFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 60, 40));

        btAsignarFechaActual1.setText("Asignar fecha actual");
        btAsignarFechaActual1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAsignarFechaActual1ActionPerformed(evt);
            }
        });
        getContentPane().add(btAsignarFechaActual1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        lbDia.setText("Dia");
        getContentPane().add(lbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        lbMes.setText("Mes");
        getContentPane().add(lbMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        lbAño.setText("Año");
        getContentPane().add(lbAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        tfDia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDia1ActionPerformed(evt);
            }
        });
        getContentPane().add(tfDia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 40, 30));
        getContentPane().add(tfMes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 50, 30));
        getContentPane().add(tfAño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 50, 30));

        btAsignar1.setText("Asignar");
        btAsignar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAsignar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btAsignar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, 30));

        btDiaMas1.setText("Aumentar 1 dia");
        btDiaMas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDiaMas1ActionPerformed(evt);
            }
        });
        getContentPane().add(btDiaMas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 120, 30));

        btDiaMenos1.setText("Disminuir 1 dia");
        btDiaMenos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDiaMenos1ActionPerformed(evt);
            }
        });
        getContentPane().add(btDiaMenos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 120, 30));

        btNDiasMas.setText("Aumentar Dias");
        btNDiasMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNDiasMasActionPerformed(evt);
            }
        });
        getContentPane().add(btNDiasMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 110, 30));

        btNDiasMenos.setText("Disminuir dias");
        btNDiasMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNDiasMenosActionPerformed(evt);
            }
        });
        getContentPane().add(btNDiasMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 110, 30));

        btDiasMes.setText("Dias Mes");
        btDiasMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDiasMesActionPerformed(evt);
            }
        });
        getContentPane().add(btDiasMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 80, 40));

        btBisiesto.setText("Bisiesto");
        btBisiesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBisiestoActionPerformed(evt);
            }
        });
        getContentPane().add(btBisiesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 80, 40));

        lbFecha2.setText("Fecha 2");
        getContentPane().add(lbFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 60, 40));
        getContentPane().add(tfDia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 40, 30));

        tfMes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMes2ActionPerformed(evt);
            }
        });
        getContentPane().add(tfMes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 40, 30));
        getContentPane().add(tfAño2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 50, 30));

        btAsignar2.setText("Asignar");
        btAsignar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAsignar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btAsignar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, 30));

        lbDia1.setText("Dia");
        getContentPane().add(lbDia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        lbMes1.setText("Mes");
        getContentPane().add(lbMes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, -1));

        lbAño1.setText("Año");
        getContentPane().add(lbAño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, -1, -1));

        btAsignarFechaActual2.setText("Asignar fecha actual");
        btAsignarFechaActual2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAsignarFechaActual2ActionPerformed(evt);
            }
        });
        getContentPane().add(btAsignarFechaActual2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        lbEdad.setText("Edad");
        getContentPane().add(lbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        jbEdadActual.setText("Edad Actual");
        jbEdadActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEdadActualActionPerformed(evt);
            }
        });
        getContentPane().add(jbEdadActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        jbEdadf2.setText("Edad con Fecha 2");
        jbEdadf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEdadf2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbEdadf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        lbCompararF.setText("Comparar Fechas");
        getContentPane().add(lbCompararF, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, 20));

        jbCFechaActual.setText("Comparar con la Fecha Actual");
        jbCFechaActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCFechaActualActionPerformed(evt);
            }
        });
        getContentPane().add(jbCFechaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));

        jbCFecha2.setText("Comparar con la Fecha 2");
        jbCFecha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCFecha2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbCFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 353, -1, 30));
        getContentPane().add(lbDiaMasR, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 140, 40));
        getContentPane().add(lbDiaMenosR, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 130, 40));

        lbDiaMasNR1.setName(""); // NOI18N
        getContentPane().add(lbDiaMasNR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 130, 30));
        getContentPane().add(lbDiaMenosNR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 130, 30));
        getContentPane().add(tfNDias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 80, 30));

        tfNDias2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNDias2ActionPerformed(evt);
            }
        });
        getContentPane().add(tfNDias2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 80, 30));
        getContentPane().add(lbRDiasMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 150, 40));
        getContentPane().add(lbRBisiesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 150, 40));
        getContentPane().add(lbREdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 190, 40));
        getContentPane().add(lbEdadFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 190, 40));

        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 80, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAsignarFechaActual1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAsignarFechaActual1ActionPerformed
        // TODO add your handling code here:
        if (f1.getDia() != 0 || f1.getMes() != 0 || f1.getAño() != 0) {
            JOptionPane.showMessageDialog(null, "Fecha ingresada");
        } else {
            f1.setAño(date.get(Calendar.YEAR));
            f1.setMes(date.get(Calendar.MONTH) + 1);
            f1.setDia(date.get(Calendar.DAY_OF_MONTH));

            //Volvemos los valores a los recuadros
            tfDia1.setText(String.valueOf(f1.getDia()));
            tfMes1.setText(String.valueOf(f1.getMes()));
            tfAño1.setText(String.valueOf(f1.getAño()));
            
        }

    }//GEN-LAST:event_btAsignarFechaActual1ActionPerformed

    private void btAsignarFechaActual2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAsignarFechaActual2ActionPerformed
        // TODO add your handling code here:
        if (f2.getDia() != 0 || f2.getMes() != 0 || f2.getAño() != 0) {
            JOptionPane.showMessageDialog(null, "Fecha ingresada");
        } else {
            f2.setAño(date.get(Calendar.YEAR));
            f2.setMes(date.get(Calendar.MONTH) + 1);
            f2.setDia(date.get(Calendar.DAY_OF_MONTH));

            //Volvemos los valores a los recuadros
            tfDia2.setText(String.valueOf(f2.getDia()));
            tfMes2.setText(String.valueOf(f2.getMes()));
            tfAño2.setText(String.valueOf(f2.getAño()));
            
        }
    }//GEN-LAST:event_btAsignarFechaActual2ActionPerformed

    private void jbEdadActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEdadActualActionPerformed
        // TODO add your handling code here:
        if (f1.compararFecha() <= 1) {
            lbREdad.setText(f1.Edad());
        }else{
            JOptionPane.showMessageDialog(null, "No se puede calcular la edad");
        }

    }//GEN-LAST:event_jbEdadActualActionPerformed

    private void jbEdadf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEdadf2ActionPerformed
        // TODO add your handling code here:
        if (f1.compararFecha() <= 1) {
            lbEdadFecha2.setText(f1.Edad(f2));
        }else{
            JOptionPane.showMessageDialog(null, "No se puede calcular la edad");
        }
        
    }//GEN-LAST:event_jbEdadf2ActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Gracias por usar la app");
        System.exit(0);

    }//GEN-LAST:event_jbSalirActionPerformed

    private void btAsignar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAsignar1ActionPerformed
        
        if (f1.getDia() != 0 || f1.getMes() != 0 || f1.getAño() != 0) {
            JOptionPane.showMessageDialog(null, "Fecha ingresada");
        } else {
            
            if ("".equals(tfDia1.getText()) || "".equals(tfMes1.getText()) || "".equals(tfAño1.getText())) {
                JOptionPane.showMessageDialog(null, "Fecha no asignada");
            } else {
                int dia = Integer.parseInt(tfDia1.getText());
                int mes = Integer.parseInt(tfMes1.getText());
                int año = Integer.parseInt(tfAño1.getText());
                f1.setAño(año);
                f1.setMes(mes);
                f1.setDia(dia);
                
                if (f1.getDia() == 0 || f1.getMes() == 0 || f1.getAño() == 0) {
                    JOptionPane.showMessageDialog(null, "Fecha ingresada incorrecta");
                }
                
            }
        }

    }//GEN-LAST:event_btAsignar1ActionPerformed

    private void btDiaMas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDiaMas1ActionPerformed
        // TODO add your handling code here:
        if (f1.getDia() == 0 || f1.getMes() == 0 || f1.getAño() == 0) {
            JOptionPane.showMessageDialog(null, "Fecha no ingresado");
        } else {
            f1.incrementaDia();
            
            lbDiaMasR.setText(f1.imprimirDatos(true));

            //Volvemos los valores a los recuadros
            tfDia1.setText(String.valueOf(f1.getDia()));
            tfMes1.setText(String.valueOf(f1.getMes()));
            tfAño1.setText(String.valueOf(f1.getAño()));
        }
    }//GEN-LAST:event_btDiaMas1ActionPerformed

    private void btDiaMenos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDiaMenos1ActionPerformed
        // TODO add your handling code here:
        if (f1.getDia() == 0 || f1.getMes() == 0 || f1.getAño() == 0) {
            JOptionPane.showMessageDialog(null, "Fecha no ingresado");
        } else {
            f1.decrementarDia();
            lbDiaMenosR.setText(f1.imprimirDatos(true));

            //Volvemos los valores a los recuadros
            tfDia1.setText(String.valueOf(f1.getDia()));
            tfMes1.setText(String.valueOf(f1.getMes()));
            tfAño1.setText(String.valueOf(f1.getAño()));
        }
    }//GEN-LAST:event_btDiaMenos1ActionPerformed

    private void btNDiasMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNDiasMasActionPerformed
        // TODO add your handling code here:
        if (f1.getDia() == 0 || f1.getMes() == 0 || f1.getAño() == 0) {
            JOptionPane.showMessageDialog(null, "Fecha no ingresado");
        } else {
            int auxN;
            if ("".equals(tfNDias1.getText())) {
                JOptionPane.showMessageDialog(null, "Asigne un valor");
            } else {
                auxN = Integer.parseInt(tfNDias1.getText());
                
                f1.incrementaDia(auxN);
                
                lbDiaMasNR1.setText(f1.imprimirDatos(true));

                //Volvemos los valores a los recuadros
                tfDia1.setText(String.valueOf(f1.getDia()));
                tfMes1.setText(String.valueOf(f1.getMes()));
                tfAño1.setText(String.valueOf(f1.getAño()));
            }
            
        }
    }//GEN-LAST:event_btNDiasMasActionPerformed

    private void tfNDias2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNDias2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNDias2ActionPerformed

    private void btNDiasMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNDiasMenosActionPerformed
        // TODO add your handling code here:
        if (f1.getDia() == 0 || f1.getMes() == 0 || f1.getAño() == 0) {
            JOptionPane.showMessageDialog(null, "Fecha no ingresado");
        } else {
            int auxN;
            if ("".equals(tfNDias2.getText())) {
                JOptionPane.showMessageDialog(null, "Asigne un valor");
            } else {
                auxN = Integer.parseInt(tfNDias2.getText());
                
                f1.decrementaDia(auxN);
                
                lbDiaMenosNR2.setText(f1.imprimirDatos(true));

                //Devolvemos los valores a los recuadros
                tfDia1.setText(String.valueOf(f1.getDia()));
                tfMes1.setText(String.valueOf(f1.getMes()));
                tfAño1.setText(String.valueOf(f1.getAño()));
            }
            
        }
    }//GEN-LAST:event_btNDiasMenosActionPerformed

    private void btDiasMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDiasMesActionPerformed
        // TODO add your handling code here:
        if (f1.getDia() == 0 || f1.getMes() == 0 || f1.getAño() == 0) {
            JOptionPane.showMessageDialog(null, "Fecha no ingresado");
        } else {
            lbRDiasMes.setText(String.valueOf(f1.diasMes()) + " Dias");
        }
    }//GEN-LAST:event_btDiasMesActionPerformed

    private void btBisiestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBisiestoActionPerformed
        // TODO add your handling code here:
        if (f1.getDia() == 0 || f1.getMes() == 0 || f1.getAño() == 0) {
            JOptionPane.showMessageDialog(null, "Fecha no ingresado");
        } else {
            if (f1.añoBisiesto() == true) {
                lbRBisiesto.setText("El año es bisiesto");
            } else {
                lbRBisiesto.setText("El año no es bisiesto");
            }
        }
    }//GEN-LAST:event_btBisiestoActionPerformed

    private void tfMes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMes2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMes2ActionPerformed

    private void btAsignar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAsignar2ActionPerformed
        // TODO add your handling code here:
        if (f2.getDia() != 0 || f2.getMes() != 0 || f2.getAño() != 0) {
            JOptionPane.showMessageDialog(null, "Fecha ingresada");
        } else {
            
            if ("".equals(tfDia2.getText()) || "".equals(tfMes2.getText()) || "".equals(tfAño2.getText())) {
                JOptionPane.showMessageDialog(null, "Fecha no asignada");
            } else {
                int dia = Integer.parseInt(tfDia2.getText());
                int mes = Integer.parseInt(tfMes2.getText());
                int año = Integer.parseInt(tfAño2.getText());
                f2.setAño(año);
                f2.setMes(mes);
                f2.setDia(dia);
                
                if (f2.getDia() == 0 || f2.getMes() == 0 || f2.getAño() == 0) {
                    JOptionPane.showMessageDialog(null, "Fecha ingresada incorrecta");
                }

            }
        }
        

    }//GEN-LAST:event_btAsignar2ActionPerformed

    private void jbCFechaActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCFechaActualActionPerformed
        // TODO add your handling code here:
        
        if(f1.compararFecha()==-1){
            JOptionPane.showMessageDialog(null, "Fecha 1 es mayor que la fecha actual");
        }else if(f1.compararFecha()==0){
            JOptionPane.showMessageDialog(null, "Fecha 1 es igual que la fecha actual");
        }else if(f1.compararFecha()==1){
            JOptionPane.showMessageDialog(null, "Fecha 1 es menor que la fecha actual");
        }
    }//GEN-LAST:event_jbCFechaActualActionPerformed

    private void jbCFecha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCFecha2ActionPerformed
        // TODO add your handling code here:
        if(f1.compararFecha(f2)==-1){
            JOptionPane.showMessageDialog(null, "Fecha 1 es mayor que la fecha 2");
        }else if(f1.compararFecha(f2)==0){
            JOptionPane.showMessageDialog(null, "Fecha 1 es igual que la fecha 2");
        }else if(f1.compararFecha(f2)==1){
            JOptionPane.showMessageDialog(null, "Fecha 1 es menor que la fecha 2");
        }
    }//GEN-LAST:event_jbCFecha2ActionPerformed

    private void tfDia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDia1ActionPerformed

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
            java.util.logging.Logger.getLogger(AppFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppFecha().setVisible(true);
            }
        });
    }
    
    private Calendar date = new GregorianCalendar();
    private Fecha f1, f2, date1;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAsignar1;
    private javax.swing.JButton btAsignar2;
    private javax.swing.JButton btAsignarFechaActual1;
    private javax.swing.JButton btAsignarFechaActual2;
    private javax.swing.JButton btBisiesto;
    private javax.swing.JButton btDiaMas1;
    private javax.swing.JButton btDiaMenos1;
    private javax.swing.JButton btDiasMes;
    private javax.swing.JButton btNDiasMas;
    private javax.swing.JButton btNDiasMenos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbCFecha2;
    private javax.swing.JButton jbCFechaActual;
    private javax.swing.JButton jbEdadActual;
    private javax.swing.JButton jbEdadf2;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel lbAño;
    private javax.swing.JLabel lbAño1;
    private javax.swing.JLabel lbCompararF;
    private javax.swing.JLabel lbDia;
    private javax.swing.JLabel lbDia1;
    private javax.swing.JLabel lbDiaMasNR1;
    private javax.swing.JLabel lbDiaMasR;
    private javax.swing.JLabel lbDiaMenosNR2;
    private javax.swing.JLabel lbDiaMenosR;
    private javax.swing.JLabel lbEdad;
    private javax.swing.JLabel lbEdadFecha2;
    private javax.swing.JLabel lbFecha1;
    private javax.swing.JLabel lbFecha2;
    private javax.swing.JLabel lbMes;
    private javax.swing.JLabel lbMes1;
    private javax.swing.JLabel lbRBisiesto;
    private javax.swing.JLabel lbRDiasMes;
    private javax.swing.JLabel lbREdad;
    private javax.swing.JTextField tfAño1;
    private javax.swing.JTextField tfAño2;
    private javax.swing.JTextField tfDia1;
    private javax.swing.JTextField tfDia2;
    private javax.swing.JTextField tfMes1;
    private javax.swing.JTextField tfMes2;
    private javax.swing.JTextField tfNDias1;
    private javax.swing.JTextField tfNDias2;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
