package Principal;

import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        jpFraccion.setVisible(true);
        jpFMixta.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        jpFMixta = new javax.swing.JPanel();
        lbFraccion1 = new javax.swing.JLabel();
        lbFraccion2 = new javax.swing.JLabel();
        tfEntero1 = new javax.swing.JTextField();
        tfEntero2 = new javax.swing.JTextField();
        tfNum1 = new javax.swing.JTextField();
        tfDen1 = new javax.swing.JTextField();
        tfNum2 = new javax.swing.JTextField();
        tfDen2 = new javax.swing.JTextField();
        btAsignarM = new javax.swing.JButton();
        btSumarM = new javax.swing.JButton();
        btRestarM = new javax.swing.JButton();
        btMultiplicarM = new javax.swing.JButton();
        btDividirM = new javax.swing.JButton();
        tfSumaM = new javax.swing.JTextField();
        tfRestaM = new javax.swing.JTextField();
        tfMultiM = new javax.swing.JTextField();
        tfDivicionM = new javax.swing.JTextField();
        jrFracciones = new javax.swing.JRadioButton();
        jpFraccion = new javax.swing.JPanel();
        lbFr1 = new javax.swing.JLabel();
        lbFr2 = new javax.swing.JLabel();
        tfFNum1 = new javax.swing.JTextField();
        tfFDen1 = new javax.swing.JTextField();
        tfFNum2 = new javax.swing.JTextField();
        tfFDen2 = new javax.swing.JTextField();
        btFAsignar = new javax.swing.JButton();
        btSumarF = new javax.swing.JButton();
        tfSuma = new javax.swing.JTextField();
        btRestarF = new javax.swing.JButton();
        tfResta = new javax.swing.JTextField();
        btMultiplicarF = new javax.swing.JButton();
        tfMultiplicacion = new javax.swing.JTextField();
        btDividirF = new javax.swing.JButton();
        tfdivision = new javax.swing.JTextField();
        jbSalir = new javax.swing.JButton();
        jrFraccionesM = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de fracciones");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTitulo.setText("Calculadora de Fraciones ");
        getContentPane().add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 210, 30));

        jpFMixta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbFraccion1.setText("Fraccion 1:");
        jpFMixta.add(lbFraccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        lbFraccion2.setText("Fraccion 2:");
        jpFMixta.add(lbFraccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        tfEntero1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfEntero1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfEntero1.setText("1");
        jpFMixta.add(tfEntero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 30, 40));

        tfEntero2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfEntero2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfEntero2.setText("2");
        jpFMixta.add(tfEntero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 30, 40));

        tfNum1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfNum1.setText("2");
        jpFMixta.add(tfNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 30, -1));

        tfDen1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfDen1.setText("3");
        jpFMixta.add(tfDen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 30, -1));

        tfNum2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfNum2.setText("3");
        jpFMixta.add(tfNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 30, -1));

        tfDen2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfDen2.setText("4");
        jpFMixta.add(tfDen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 30, -1));

        btAsignarM.setText("Asignar");
        btAsignarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAsignarMActionPerformed(evt);
            }
        });
        jpFMixta.add(btAsignarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        btSumarM.setText("Sumar");
        btSumarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSumarMActionPerformed(evt);
            }
        });
        jpFMixta.add(btSumarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        btRestarM.setText("Restar");
        btRestarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRestarMActionPerformed(evt);
            }
        });
        jpFMixta.add(btRestarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        btMultiplicarM.setText("Multiplicar");
        btMultiplicarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiplicarMActionPerformed(evt);
            }
        });
        jpFMixta.add(btMultiplicarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        btDividirM.setText("Dividir");
        btDividirM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDividirMActionPerformed(evt);
            }
        });
        jpFMixta.add(btDividirM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        tfSumaM.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jpFMixta.add(tfSumaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 100, -1));

        tfRestaM.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jpFMixta.add(tfRestaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 100, -1));

        tfMultiM.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jpFMixta.add(tfMultiM, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 100, -1));

        tfDivicionM.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jpFMixta.add(tfDivicionM, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 100, -1));

        getContentPane().add(jpFMixta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 510, 350));

        jrFracciones.setSelected(true);
        jrFracciones.setText("Fracciones");
        jrFracciones.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jrFraccionesComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jrFraccionesComponentRemoved(evt);
            }
        });
        jrFracciones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrFraccionesItemStateChanged(evt);
            }
        });
        jrFracciones.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrFraccionesStateChanged(evt);
            }
        });
        jrFracciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrFraccionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jrFraccionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jrFraccionesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jrFraccionesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jrFraccionesMouseReleased(evt);
            }
        });
        jrFracciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrFraccionesActionPerformed(evt);
            }
        });
        getContentPane().add(jrFracciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jpFraccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbFr1.setText("Fraccion 1");
        jpFraccion.add(lbFr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        lbFr2.setText("Fraccion 2");
        jpFraccion.add(lbFr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        tfFNum1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfFNum1.setText("5");
        jpFraccion.add(tfFNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 40, 30));

        tfFDen1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfFDen1.setText("3");
        jpFraccion.add(tfFDen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 40, 30));

        tfFNum2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfFNum2.setText("11");
        jpFraccion.add(tfFNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 40, 30));

        tfFDen2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfFDen2.setText("4");
        jpFraccion.add(tfFDen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 40, 30));

        btFAsignar.setText("Asignar");
        btFAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFAsignarActionPerformed(evt);
            }
        });
        jpFraccion.add(btFAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        btSumarF.setText("Sumar");
        btSumarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSumarFActionPerformed(evt);
            }
        });
        jpFraccion.add(btSumarF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        tfSuma.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jpFraccion.add(tfSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 70, 30));

        btRestarF.setText("Restar");
        btRestarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRestarFActionPerformed(evt);
            }
        });
        jpFraccion.add(btRestarF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        tfResta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jpFraccion.add(tfResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 70, 30));

        btMultiplicarF.setText("Multiplicar");
        btMultiplicarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiplicarFActionPerformed(evt);
            }
        });
        jpFraccion.add(btMultiplicarF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        tfMultiplicacion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMultiplicacionActionPerformed(evt);
            }
        });
        jpFraccion.add(tfMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 70, 30));

        btDividirF.setText("Dividir");
        btDividirF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDividirFActionPerformed(evt);
            }
        });
        jpFraccion.add(btDividirF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        tfdivision.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfdivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdivisionActionPerformed(evt);
            }
        });
        jpFraccion.add(tfdivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 70, 30));

        getContentPane().add(jpFraccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 530, 320));

        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, -1, -1));

        jrFraccionesM.setText("Fracciones Mixtas");
        jrFraccionesM.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jrFraccionesMComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jrFraccionesMComponentRemoved(evt);
            }
        });
        jrFraccionesM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrFraccionesMItemStateChanged(evt);
            }
        });
        jrFraccionesM.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrFraccionesMStateChanged(evt);
            }
        });
        jrFraccionesM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrFraccionesMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jrFraccionesMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jrFraccionesMMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jrFraccionesMMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jrFraccionesMMouseReleased(evt);
            }
        });
        jrFraccionesM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrFraccionesMActionPerformed(evt);
            }
        });
        getContentPane().add(jrFraccionesM, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrFraccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrFraccionesActionPerformed
        jrFracciones.setSelected(true);
        jpFraccion.setVisible(true);

        jrFraccionesM.setSelected(false);
        jpFMixta.setVisible(false);
    }//GEN-LAST:event_jrFraccionesActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        JOptionPane.showMessageDialog(null, "Hasta la proxima");
        System.exit(0);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jrFraccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrFraccionesMouseClicked
        //jpFraccion.setVisible(true);
    }//GEN-LAST:event_jrFraccionesMouseClicked

    private void jrFraccionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrFraccionesMousePressed

    }//GEN-LAST:event_jrFraccionesMousePressed

    private void jrFraccionesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrFraccionesStateChanged

    }//GEN-LAST:event_jrFraccionesStateChanged

    private void jrFraccionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrFraccionesMouseExited

    }//GEN-LAST:event_jrFraccionesMouseExited

    private void jrFraccionesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrFraccionesMouseReleased
        //jpFraccion.setVisible(false);
    }//GEN-LAST:event_jrFraccionesMouseReleased

    private void jrFraccionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrFraccionesMouseEntered

    }//GEN-LAST:event_jrFraccionesMouseEntered

    private void jrFraccionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrFraccionesItemStateChanged

    }//GEN-LAST:event_jrFraccionesItemStateChanged

    private void jrFraccionesComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jrFraccionesComponentAdded

    }//GEN-LAST:event_jrFraccionesComponentAdded

    private void jrFraccionesComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jrFraccionesComponentRemoved
        //jpFraccion.setVisible(false);
    }//GEN-LAST:event_jrFraccionesComponentRemoved

    private void jrFraccionesMComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jrFraccionesMComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jrFraccionesMComponentAdded

    private void jrFraccionesMComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jrFraccionesMComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jrFraccionesMComponentRemoved

    private void jrFraccionesMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrFraccionesMItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jrFraccionesMItemStateChanged

    private void jrFraccionesMStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrFraccionesMStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jrFraccionesMStateChanged

    private void jrFraccionesMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrFraccionesMMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jrFraccionesMMouseClicked

    private void jrFraccionesMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrFraccionesMMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jrFraccionesMMouseEntered

    private void jrFraccionesMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrFraccionesMMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jrFraccionesMMouseExited

    private void jrFraccionesMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrFraccionesMMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrFraccionesMMousePressed

    private void jrFraccionesMMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrFraccionesMMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jrFraccionesMMouseReleased

    private void jrFraccionesMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrFraccionesMActionPerformed
        jrFraccionesM.setSelected(true);
        jpFMixta.setVisible(true);

        jrFracciones.setSelected(false);
        jpFraccion.setVisible(false);
    }//GEN-LAST:event_jrFraccionesMActionPerformed

    private void btAsignarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAsignarMActionPerformed
        int entero1, a1, b1, b2;

        if (tfEntero1.getText().equals("") || tfEntero2.getText().equals("") || tfNum1.getText().equals("")
                || tfNum2.getText().equals("") || tfDen1.getText().equals("") || tfDen2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Asigne valores en los recuadros vacios");
        } else {
            entero1 = Integer.parseInt(tfEntero1.getText());
            a1 = Integer.parseInt(tfNum1.getText());
            b1 = Integer.parseInt(tfDen1.getText());
            b2 = Integer.parseInt(tfDen2.getText());

            if (b1 == 0 || b2 == 0) {
                JOptionPane.showMessageDialog(null, "Asigne valores diferentes de 0 en los denominadores");
            } else {
                if (fM1 == null) {
                    fM1 = new FraccionesMixtas(entero1, new Fracciones(a1, b1));
                } else {
                    fM1.setEntero(entero1);
                    fM1.setF1(a1, b1);
                }
                JOptionPane.showMessageDialog(null, "Valores asignados correctamente");
            }
        }
    }//GEN-LAST:event_btAsignarMActionPerformed

    private void btSumarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSumarMActionPerformed
        int entero2, a2, b2, auxEntero, auxA, auxB;

        if (tfEntero1.getText().equals("") || tfEntero2.getText().equals("") || tfNum1.getText().equals("")
                || tfNum2.getText().equals("") || tfDen1.getText().equals("") || tfDen2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Asigne valores en los recuadros vacios");
        } else {
            if (fM1 == null) {
                JOptionPane.showMessageDialog(null, "Asigne valores de las Fracciones Mixtas");
            } else {

                auxEntero = fM1.getEntero();
                auxA = fM1.getF1().getA();
                auxB = fM1.getF1().getB();

                entero2 = Integer.parseInt(tfEntero2.getText());
                a2 = Integer.parseInt(tfNum2.getText());
                b2 = Integer.parseInt(tfDen2.getText());

                fM1.Sumar(entero2, a2, b2);

                tfSumaM.setText(fM1.imprimirMixto());

                fM1.setEntero(auxEntero);
                fM1.setF1(auxA, auxB);
            }
        }

    }//GEN-LAST:event_btSumarMActionPerformed

    private void btRestarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRestarMActionPerformed
        int entero2, a2, b2, auxEntero, auxA, auxB;

        if (tfEntero1.getText().equals("") || tfEntero2.getText().equals("") || tfNum1.getText().equals("")
                || tfNum2.getText().equals("") || tfDen1.getText().equals("") || tfDen2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Asigne valores en los recuadros vacios");
        } else {
            if (fM1 == null) {
                JOptionPane.showMessageDialog(null, "Asigne valores de las Fracciones Mixtas");
            } else {

                auxEntero = fM1.getEntero();
                auxA = fM1.getF1().getA();
                auxB = fM1.getF1().getB();

                entero2 = Integer.parseInt(tfEntero2.getText());
                a2 = Integer.parseInt(tfNum2.getText());
                b2 = Integer.parseInt(tfDen2.getText());

                fM1.Restar(entero2, a2, b2);

                tfRestaM.setText(fM1.imprimirMixto());

                fM1.setEntero(auxEntero);
                fM1.setF1(auxA, auxB);
            }
        }
    }//GEN-LAST:event_btRestarMActionPerformed

    private void btMultiplicarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultiplicarMActionPerformed
        int entero2, a2, b2, auxEntero, auxA, auxB;

        if (tfEntero1.getText().equals("") || tfEntero2.getText().equals("") || tfNum1.getText().equals("")
                || tfNum2.getText().equals("") || tfDen1.getText().equals("") || tfDen2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Asigne valores en los recuadros vacios");
        } else {
            if (fM1 == null) {
                JOptionPane.showMessageDialog(null, "Asigne valores de las Fracciones Mixtas");
            } else {

                auxEntero = fM1.getEntero();
                auxA = fM1.getF1().getA();
                auxB = fM1.getF1().getB();

                entero2 = Integer.parseInt(tfEntero2.getText());
                a2 = Integer.parseInt(tfNum2.getText());
                b2 = Integer.parseInt(tfDen2.getText());

                fM1.Multiplicar(entero2, a2, b2);

                tfMultiM.setText(fM1.imprimirMixto());

                fM1.setEntero(auxEntero);
                fM1.setF1(auxA, auxB);
            }
        }
    }//GEN-LAST:event_btMultiplicarMActionPerformed

    private void btDividirMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDividirMActionPerformed
        int entero2, a2, b2, auxEntero, auxA, auxB;

        if (tfEntero1.getText().equals("") || tfEntero2.getText().equals("") || tfNum1.getText().equals("")
                || tfNum2.getText().equals("") || tfDen1.getText().equals("") || tfDen2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Asigne valores en los recuadros vacios");
        } else {
            if (fM1 == null) {
                JOptionPane.showMessageDialog(null, "Asigne valores de las Fracciones Mixtas");
            } else {

                auxEntero = fM1.getEntero();
                auxA = fM1.getF1().getA();
                auxB = fM1.getF1().getB();

                entero2 = Integer.parseInt(tfEntero2.getText());
                a2 = Integer.parseInt(tfNum2.getText());
                b2 = Integer.parseInt(tfDen2.getText());

                fM1.Dividir(entero2, a2, b2);

                tfDivicionM.setText(fM1.imprimirMixto());

                fM1.setEntero(auxEntero);
                fM1.setF1(auxA, auxB);
            }
        }
    }//GEN-LAST:event_btDividirMActionPerformed

    private void tfMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMultiplicacionActionPerformed

    }//GEN-LAST:event_tfMultiplicacionActionPerformed

    private void tfdivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdivisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdivisionActionPerformed

    private void btFAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFAsignarActionPerformed
        int a1, b1, b2;

        if (tfFNum1.getText().equals("") || tfFNum2.getText().equals("")
                || tfFDen1.getText().equals("") || tfFDen2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Asigne valores en los recuadros vacios");
        } else {
            a1 = Integer.parseInt(tfFNum1.getText());
            b1 = Integer.parseInt(tfFDen1.getText());
            b2 = Integer.parseInt(tfFDen2.getText());

            if (b1 != 0 && b2 != 0) {
                if (fr == null) {
                    fr = new Fracciones(a1, b1);
                } else {
                    fr.setA(a1);
                    fr.setB(b1);
                }

                JOptionPane.showMessageDialog(null, "Valores asignados correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se admite 0 como denominador");
            }
        }
    }//GEN-LAST:event_btFAsignarActionPerformed

    private void btSumarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSumarFActionPerformed
        int a2, b2, auxA, auxB;

        if (tfFNum1.getText().equals("") || tfFNum2.getText().equals("")
                || tfFDen1.getText().equals("") || tfFDen2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Asigne valores en los recuadros vacios");
        } else {
            if (fr != null) {
                auxA = fr.getA();
                auxB = fr.getB();

                a2 = Integer.parseInt(tfFNum2.getText());
                b2 = Integer.parseInt(tfFDen2.getText());

                fr.sumar(a2, b2);
                tfSuma.setText(fr.imprimirFraccion());

                fr.setA(auxA);
                fr.setB(auxB);
            } else {
                JOptionPane.showMessageDialog(null, "Asigne los valores de las fracciones");
            }
        }
    }//GEN-LAST:event_btSumarFActionPerformed

    private void btRestarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRestarFActionPerformed
        int a2, b2, auxA, auxB;

        if (tfFNum1.getText().equals("") || tfFNum2.getText().equals("")
                || tfFDen1.getText().equals("") || tfFDen2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Asigne valores en los recuadros vacios");
        } else {
            if (fr != null) {
                auxA = fr.getA();
                auxB = fr.getB();

                a2 = Integer.parseInt(tfFNum2.getText());
                b2 = Integer.parseInt(tfFDen2.getText());

                fr.restar(a2, b2);
                tfResta.setText(fr.imprimirFraccion());

                fr.setA(auxA);
                fr.setB(auxB);
            } else {
                JOptionPane.showMessageDialog(null, "Asigne los valores de las fracciones");
            }
        }
    }//GEN-LAST:event_btRestarFActionPerformed

    private void btMultiplicarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultiplicarFActionPerformed
        int a2, b2, auxA, auxB;

        if (tfFNum1.getText().equals("") || tfFNum2.getText().equals("")
                || tfFDen1.getText().equals("") || tfFDen2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Asigne valores en los recuadros vacios");
        } else {
            if (fr != null) {
                auxA = fr.getA();
                auxB = fr.getB();

                a2 = Integer.parseInt(tfFNum2.getText());
                b2 = Integer.parseInt(tfFDen2.getText());

                fr.multiplicacion(a2, b2);
                tfMultiplicacion.setText(fr.imprimirFraccion());

                fr.setA(auxA);
                fr.setB(auxB);
            } else {
                JOptionPane.showMessageDialog(null, "Asigne los valores de las fracciones");
            }
        }
    }//GEN-LAST:event_btMultiplicarFActionPerformed

    private void btDividirFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDividirFActionPerformed
        int a2, b2, auxA, auxB;

        if (tfFNum1.getText().equals("") || tfFNum2.getText().equals("")
                || tfFDen1.getText().equals("") || tfFDen2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Asigne valores en los recuadros vacios");
        } else {
            if (fr != null) {
                auxA = fr.getA();
                auxB = fr.getB();

                a2 = Integer.parseInt(tfFNum2.getText());
                b2 = Integer.parseInt(tfFDen2.getText());

                fr.division(a2, b2);
                tfdivision.setText(fr.imprimirFraccion());

                fr.setA(auxA);
                fr.setB(auxB);
            } else {
                JOptionPane.showMessageDialog(null, "Asigne los valores de las fracciones");
            }
        }
    }//GEN-LAST:event_btDividirFActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    //Atributos Fraccion
    Fracciones fr;

    //Atributos Fraccion Mixta
    FraccionesMixtas fM1;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAsignarM;
    private javax.swing.JButton btDividirF;
    private javax.swing.JButton btDividirM;
    private javax.swing.JButton btFAsignar;
    private javax.swing.JButton btMultiplicarF;
    private javax.swing.JButton btMultiplicarM;
    private javax.swing.JButton btRestarF;
    private javax.swing.JButton btRestarM;
    private javax.swing.JButton btSumarF;
    private javax.swing.JButton btSumarM;
    private javax.swing.JButton jbSalir;
    private javax.swing.JPanel jpFMixta;
    private javax.swing.JPanel jpFraccion;
    private javax.swing.JRadioButton jrFracciones;
    private javax.swing.JRadioButton jrFraccionesM;
    private javax.swing.JLabel lbFr1;
    private javax.swing.JLabel lbFr2;
    private javax.swing.JLabel lbFraccion1;
    private javax.swing.JLabel lbFraccion2;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField tfDen1;
    private javax.swing.JTextField tfDen2;
    private javax.swing.JTextField tfDivicionM;
    private javax.swing.JTextField tfEntero1;
    private javax.swing.JTextField tfEntero2;
    private javax.swing.JTextField tfFDen1;
    private javax.swing.JTextField tfFDen2;
    private javax.swing.JTextField tfFNum1;
    private javax.swing.JTextField tfFNum2;
    private javax.swing.JTextField tfMultiM;
    private javax.swing.JTextField tfMultiplicacion;
    private javax.swing.JTextField tfNum1;
    private javax.swing.JTextField tfNum2;
    private javax.swing.JTextField tfResta;
    private javax.swing.JTextField tfRestaM;
    private javax.swing.JTextField tfSuma;
    private javax.swing.JTextField tfSumaM;
    private javax.swing.JTextField tfdivision;
    // End of variables declaration//GEN-END:variables
}
