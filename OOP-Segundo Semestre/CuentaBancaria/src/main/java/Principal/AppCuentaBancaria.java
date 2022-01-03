package Principal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppCuentaBancaria extends javax.swing.JFrame {

    public AppCuentaBancaria() {
        initComponents();
        jpCrearCuenta.setVisible(false);
        jpCuenta.setVisible(false);
        cuentaDemo = new CuentaBancaria(new Usuario("Maite", new Fecha(23, 9, 2009)), "hola", 320);
        CuentaBancaria.saldoMinimo = 50;
        cuentasUsuario.add(cuentaDemo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfClave = new javax.swing.JTextField();
        lbCuenta = new javax.swing.JLabel();
        lbeContraseña = new javax.swing.JLabel();
        btIniciarSesion = new javax.swing.JButton();
        lbMsessage = new javax.swing.JLabel();
        btCrearCuenta = new javax.swing.JButton();
        jpCrearCuenta = new javax.swing.JPanel();
        lbMensaje = new javax.swing.JLabel();
        tfCNombre = new javax.swing.JTextField();
        lbCNombre = new javax.swing.JLabel();
        lbCFechaN = new javax.swing.JLabel();
        tfCFechaDia = new javax.swing.JTextField();
        lbCSaldo = new javax.swing.JLabel();
        tfCSaldo = new javax.swing.JTextField();
        lbCcontrasena = new javax.swing.JLabel();
        tfCContraseña = new javax.swing.JTextField();
        btCCuenta = new javax.swing.JButton();
        tfCFechaMes = new javax.swing.JTextField();
        tfCFechaAño = new javax.swing.JTextField();
        btCmVolver = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        jpCuenta = new javax.swing.JPanel();
        lbMensajeC = new javax.swing.JLabel();
        btDeposito = new javax.swing.JButton();
        lbDepositar = new javax.swing.JLabel();
        tfDeposito = new javax.swing.JTextField();
        lbRetirar = new javax.swing.JLabel();
        tfRetiro = new javax.swing.JTextField();
        btRetiro = new javax.swing.JButton();
        lbInfo = new javax.swing.JLabel();
        lbCinfo1 = new javax.swing.JLabel();
        lbCinfo2 = new javax.swing.JLabel();
        btCambiarDatos = new javax.swing.JButton();
        jpCambiaDatos = new javax.swing.JPanel();
        lbCmNombre = new javax.swing.JLabel();
        lbCmFechaN = new javax.swing.JLabel();
        lbCmContraseña = new javax.swing.JLabel();
        btGuardarCambios = new javax.swing.JButton();
        tfCambioNombre = new javax.swing.JTextField();
        tfCambioDia = new javax.swing.JTextField();
        tfCambioMes = new javax.swing.JTextField();
        tfCambioAño = new javax.swing.JTextField();
        tfCambioContraseña = new javax.swing.JTextField();
        btCVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cuenta Bancaria");
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Cuenta bancaria");
        getContentPane().add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });
        getContentPane().add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 120, -1));

        tfClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClaveActionPerformed(evt);
            }
        });
        getContentPane().add(tfClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 120, -1));

        lbCuenta.setText("Nombre");
        getContentPane().add(lbCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 60, 20));

        lbeContraseña.setText("Clave");
        getContentPane().add(lbeContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 60, 20));

        btIniciarSesion.setText("Iniciar Sesión");
        btIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        lbMsessage.setText("Si no dispone de una cuenta bancaria, cree ahora su cuenta ");
        getContentPane().add(lbMsessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        btCrearCuenta.setText("Crear Cuenta");
        btCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(btCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        jpCrearCuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbMensaje.setText("Para crear su cuenta, por favor complete el formulario");
        jpCrearCuenta.add(lbMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        tfCNombre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jpCrearCuenta.add(tfCNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 210, 30));

        lbCNombre.setText("Nombre");
        jpCrearCuenta.add(lbCNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 30));

        lbCFechaN.setText("Fecha de nacimiento       Día                  Mes                   Año");
        jpCrearCuenta.add(lbCFechaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 390, 30));

        tfCFechaDia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfCFechaDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCFechaDiaActionPerformed(evt);
            }
        });
        jpCrearCuenta.add(tfCFechaDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 50, 30));

        lbCSaldo.setText("Saldo minimo 50");
        jpCrearCuenta.add(lbCSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, 30));

        tfCSaldo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfCSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCSaldoActionPerformed(evt);
            }
        });
        jpCrearCuenta.add(tfCSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 210, 30));

        lbCcontrasena.setText("Contraseña");
        jpCrearCuenta.add(lbCcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, 30));

        tfCContraseña.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfCContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCContraseñaActionPerformed(evt);
            }
        });
        jpCrearCuenta.add(tfCContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 210, 30));

        btCCuenta.setText("Crear Cuenta");
        btCCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCCuentaActionPerformed(evt);
            }
        });
        jpCrearCuenta.add(btCCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        tfCFechaMes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfCFechaMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCFechaMesActionPerformed(evt);
            }
        });
        jpCrearCuenta.add(tfCFechaMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 60, 30));

        tfCFechaAño.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfCFechaAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCFechaAñoActionPerformed(evt);
            }
        });
        jpCrearCuenta.add(tfCFechaAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 70, 30));

        btCmVolver.setText("Volver");
        btCmVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCmVolverActionPerformed(evt);
            }
        });
        jpCrearCuenta.add(btCmVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        getContentPane().add(jpCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 610, 400));

        btSalir.setText("SALIR");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 70, 30));

        jpCuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbMensajeC.setText("Bienvenido a su cuenta bancaria ");
        jpCuenta.add(lbMensajeC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        btDeposito.setText("Depositar");
        btDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositoActionPerformed(evt);
            }
        });
        jpCuenta.add(btDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        lbDepositar.setText("Digite el valor que desea depositar");
        jpCuenta.add(lbDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 20));

        tfDeposito.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jpCuenta.add(tfDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 120, -1));

        lbRetirar.setText("Digite el valor que desea retirar");
        jpCuenta.add(lbRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 20));

        tfRetiro.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jpCuenta.add(tfRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 140, -1));

        btRetiro.setText("Retirar");
        btRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetiroActionPerformed(evt);
            }
        });
        jpCuenta.add(btRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        lbInfo.setText("Informacion de su cuenta");
        jpCuenta.add(lbInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));
        jpCuenta.add(lbCinfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 390, 50));
        jpCuenta.add(lbCinfo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 390, 50));

        btCambiarDatos.setText("Cambiar Datos");
        btCambiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCambiarDatosActionPerformed(evt);
            }
        });
        jpCuenta.add(btCambiarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        jpCambiaDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCmNombre.setText("Nombre: ");
        jpCambiaDatos.add(lbCmNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 60, 30));

        lbCmFechaN.setText("Fecha de nacimiento         Día              Mes                Año");
        jpCambiaDatos.add(lbCmFechaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 360, 30));

        lbCmContraseña.setText("Contraseña");
        jpCambiaDatos.add(lbCmContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 70, 30));

        btGuardarCambios.setText("Guardar  Cambios");
        btGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarCambiosActionPerformed(evt);
            }
        });
        jpCambiaDatos.add(btGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        tfCambioNombre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfCambioNombre.setText("Maite");
        tfCambioNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCambioNombreActionPerformed(evt);
            }
        });
        jpCambiaDatos.add(tfCambioNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 150, 30));

        tfCambioDia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfCambioDia.setText("5");
        tfCambioDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCambioDiaActionPerformed(evt);
            }
        });
        jpCambiaDatos.add(tfCambioDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 40, 30));

        tfCambioMes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfCambioMes.setText("1");
        tfCambioMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCambioMesActionPerformed(evt);
            }
        });
        jpCambiaDatos.add(tfCambioMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 40, 30));

        tfCambioAño.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfCambioAño.setText("2002");
        tfCambioAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCambioAñoActionPerformed(evt);
            }
        });
        jpCambiaDatos.add(tfCambioAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 60, 30));

        tfCambioContraseña.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfCambioContraseña.setText("12345678");
        jpCambiaDatos.add(tfCambioContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 180, 30));

        jpCuenta.add(jpCambiaDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 500, 290));

        btCVolver.setText("Volver");
        btCVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCVolverActionPerformed(evt);
            }
        });
        jpCuenta.add(btCVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 110, -1));

        getContentPane().add(jpCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 600, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfClaveActionPerformed

    private void tfCFechaDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCFechaDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCFechaDiaActionPerformed

    private void tfCSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCSaldoActionPerformed

    private void tfCContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCContraseñaActionPerformed

    private void btCCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCCuentaActionPerformed
        //Crear cuenta
        int dia = 0, mes = 0, año = 0, saldo;
        String nombre, contraseña;

        if (tfCNombre.getText().equals("") || tfCFechaDia.getText().equals("")
                || tfCFechaMes.getText().equals("") || tfCFechaAño.getText().equals("")
                || tfCSaldo.getText().equals("") || tfCContraseña.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor complete los recuadros vacios");
        } else {
            nombre = tfCNombre.getText();
            contraseña = tfCContraseña.getText();

            saldo = Integer.parseInt(tfCSaldo.getText());

            //Analizando la fecha ingresada
            if (Integer.parseInt(tfCFechaAño.getText()) > 1900) {
                año = Integer.parseInt(tfCFechaAño.getText());

                if (Integer.parseInt(tfCFechaMes.getText()) > 0 && Integer.parseInt(tfCFechaMes.getText()) <= 12) {
                    mes = Integer.parseInt(tfCFechaMes.getText());

                    if (Integer.parseInt(tfCFechaDia.getText()) > 0 && Integer.parseInt(tfCFechaDia.getText()) <= 31) {
                        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && Integer.parseInt(tfCFechaDia.getText()) <= 30) {
                            dia = Integer.parseInt(tfCFechaDia.getText());
                        } else if (mes == 2 && Integer.parseInt(tfCFechaDia.getText()) <= 28 && añoBisiesto(año) == false) {
                            dia = Integer.parseInt(tfCFechaDia.getText());
                        } else if (mes == 2 && Integer.parseInt(tfCFechaDia.getText()) <= 29 && añoBisiesto(año) == true) {
                            dia = Integer.parseInt(tfCFechaDia.getText());
                        } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && Integer.parseInt(tfCFechaDia.getText()) <= 31) {
                            dia = Integer.parseInt(tfCFechaDia.getText());
                        }
                    }

                }
            }

            if (año != 0 && mes != 0 && dia != 0 && saldo >= CuentaBancaria.saldoMinimo && contraseña.length() > 7) {
                nuevaCuenta(nombre, dia, mes, año, contraseña, saldo);
                JOptionPane.showMessageDialog(null, "Cuenta creada exitosamente");

                jpCrearCuenta.setVisible(false);
                pantallaInicioVisible(true);

                tfCNombre.setText("");
                tfCFechaDia.setText("");
                tfCFechaMes.setText("");
                tfCFechaAño.setText("");
                tfCSaldo.setText("");
                tfCContraseña.setText("");

            } else if (contraseña.length() < 8) {
                JOptionPane.showMessageDialog(null, "Por favor asigne minimo 8 caracteres como contraseña");
            } else if (saldo < CuentaBancaria.saldoMinimo) {
                JOptionPane.showMessageDialog(null, "Por favor asigne el saldo minimo requerido");
            } else {
                JOptionPane.showMessageDialog(null, "Por favor digite una fecha correcta");
            }
        }

    }//GEN-LAST:event_btCCuentaActionPerformed

    private void pantallaInicioVisible(boolean bol) {
        if (bol) {
            tfNombre.setVisible(true);
            tfClave.setVisible(true);
            lbCuenta.setVisible(true);
            lbeContraseña.setVisible(true);
            btIniciarSesion.setVisible(true);
            lbMsessage.setVisible(true);
            btCrearCuenta.setVisible(true);

        } else {
            tfNombre.setVisible(false);
            tfClave.setVisible(false);
            lbCuenta.setVisible(false);
            lbeContraseña.setVisible(false);
            btIniciarSesion.setVisible(false);
            lbMsessage.setVisible(false);
            btCrearCuenta.setVisible(false);
        }
    }

    private void limpiarCuenta(boolean bol) {

        if (bol) {
            lbMensajeC.setVisible(true);
            btDeposito.setVisible(true);
            lbDepositar.setVisible(true);
            tfDeposito.setVisible(true);
            lbRetirar.setVisible(true);
            tfRetiro.setVisible(true);
            btRetiro.setVisible(true);
            lbInfo.setVisible(true);
            lbCinfo1.setVisible(true);
            lbCinfo2.setVisible(true);
            btCambiarDatos.setVisible(true);
        } else {
            lbMensajeC.setVisible(false);
            btDeposito.setVisible(false);
            lbDepositar.setVisible(false);
            tfDeposito.setVisible(false);
            lbRetirar.setVisible(false);
            tfRetiro.setVisible(false);
            btRetiro.setVisible(false);
            lbInfo.setVisible(false);
            lbCinfo1.setVisible(false);
            lbCinfo2.setVisible(false);
            btCambiarDatos.setVisible(false);
        }
    }

    private boolean añoBisiesto(int año) {
        boolean bisiesto;
        if (año % 4 == 0) {

            if (año % 100 == 0) {

                if (año % 400 == 0) {
                    bisiesto = true;
                } else {
                    bisiesto = false;
                }
            } else {
                bisiesto = true;
            }

        } else {
            bisiesto = false;
        }
        return bisiesto;
    }

    private void btDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositoActionPerformed
        double auxValor;
        CuentaBancaria auxC = null;

        if (tfDeposito.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor asigne un saldo a depositar");
        } else {
            auxValor = Double.parseDouble(tfDeposito.getText());

            if (auxValor > 0) {
                auxC = direccionCuenta();

                auxC.depositar(auxValor);

                lbCinfo1.setText(String.valueOf(direccionCuenta().getUsuarioN().imprimirUsuario()));
                lbCinfo2.setText(String.valueOf(direccionCuenta().imprimirDatos()));

                JOptionPane.showMessageDialog(null, "Usted a depositado " + auxValor + " Dolares");

            } else {
                JOptionPane.showMessageDialog(null, "Digite un monto mayor a 0");
            }
        }
    }//GEN-LAST:event_btDepositoActionPerformed

    private CuentaBancaria direccionCuenta() {
        CuentaBancaria auxCuenta = null;

        String auxNombre = tfNombre.getText();
        String auxContraseña = tfClave.getText();

        for (CuentaBancaria cuentas : getCuentas()) {
            if (cuentas.getContraseña().equals(auxContraseña) && cuentas.getUsuarioN().getNombre().equals(auxNombre)) {
                auxCuenta = cuentas;
            }
        }
        return auxCuenta;
    }

    private void btRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetiroActionPerformed
        double auxValor;
        CuentaBancaria auxC = null;

        if (tfRetiro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor asigne un saldo a depositar");
        } else {
            auxValor = Double.parseDouble(tfRetiro.getText());

            auxC = direccionCuenta();

            if ((auxC.getSaldo() - auxValor) >= CuentaBancaria.saldoMinimo) {

                auxC.retirar(auxValor);

                lbCinfo1.setText(String.valueOf(direccionCuenta().getUsuarioN().imprimirUsuario()));
                lbCinfo2.setText(String.valueOf(direccionCuenta().imprimirDatos()));

                JOptionPane.showMessageDialog(null, "Usted a retirado " + auxValor + " Dolares");

            } else {
                JOptionPane.showMessageDialog(null, "Digite un monto menor a retirar");
            }
        }
    }//GEN-LAST:event_btRetiroActionPerformed

    private void tfCambioNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCambioNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCambioNombreActionPerformed

    private void tfCambioDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCambioDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCambioDiaActionPerformed

    private void tfCambioMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCambioMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCambioMesActionPerformed

    private void tfCambioAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCambioAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCambioAñoActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        JOptionPane.showMessageDialog(null, "Hasta la proxima");
        System.exit(0);
    }//GEN-LAST:event_btSalirActionPerformed

    private void btIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarSesionActionPerformed

        String auxContraseña, auxNombre;
        Boolean login = false;

        if (tfNombre.getText().equals("") || tfClave.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nombre o contraseña vacios");
        } else {
            auxNombre = tfNombre.getText();
            auxContraseña = tfClave.getText();

            for (CuentaBancaria cuentas : getCuentas()) {
                if (cuentas.getContraseña().equals(auxContraseña) && cuentas.getUsuarioN().getNombre().equals(auxNombre)) {
                    login = true;
                }
            }

            if (login) {
                tfNombre.setVisible(false);
                tfClave.setVisible(false);
                lbCuenta.setVisible(false);
                lbeContraseña.setVisible(false);
                btIniciarSesion.setVisible(false);
                lbMsessage.setVisible(false);
                btCrearCuenta.setVisible(false);
                jpCrearCuenta.setVisible(false);

                jpCuenta.setVisible(true);
                jpCambiaDatos.setVisible(false);

                //Mostrando info de la cuenta
                lbCinfo1.setText(String.valueOf(direccionCuenta().getUsuarioN().imprimirUsuario()));
                lbCinfo2.setText(String.valueOf(direccionCuenta().imprimirDatos()));

            } else {
                JOptionPane.showMessageDialog(null, "Nombre o usuario incorrecto");
            }
        }
    }//GEN-LAST:event_btIniciarSesionActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed

    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfCFechaMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCFechaMesActionPerformed

    }//GEN-LAST:event_tfCFechaMesActionPerformed

    private void tfCFechaAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCFechaAñoActionPerformed

    }//GEN-LAST:event_tfCFechaAñoActionPerformed

    private void btCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearCuentaActionPerformed
        //Pantalla inicio
        tfNombre.setVisible(false);
        tfClave.setVisible(false);
        lbCuenta.setVisible(false);
        lbeContraseña.setVisible(false);
        btIniciarSesion.setVisible(false);
        lbMsessage.setVisible(false);
        btCrearCuenta.setVisible(false);

        //Paneles
        jpCuenta.setVisible(false);
        jpCambiaDatos.setVisible(false);

        jpCrearCuenta.setVisible(true);
    }//GEN-LAST:event_btCrearCuentaActionPerformed

    private void btCambiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCambiarDatosActionPerformed
        jpCuenta.setVisible(true);
        jpCambiaDatos.setVisible(true);
        jpCrearCuenta.setVisible(false);
        limpiarCuenta(false);

    }//GEN-LAST:event_btCambiarDatosActionPerformed

    private void btGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarCambiosActionPerformed
        String nombre, contraseña;
        int dia, mes, año;
        CuentaBancaria auxC;

        if (tfCambioDia.getText().equals("") || tfCambioMes.getText().equals("") || tfCambioAño.getText().equals("") || tfCambioNombre.equals("") || tfCambioContraseña.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor rellene los recuadros vacios");
        } else {
            dia = Integer.parseInt(tfCambioDia.getText());
            mes = Integer.parseInt(tfCambioMes.getText());
            año = Integer.parseInt(tfCambioAño.getText());

            nombre = tfCambioNombre.getText();
            contraseña = tfCambioContraseña.getText();

            auxC = direccionCuenta();

            auxC.setUsuarioN(nombre, dia, mes, año);

            auxC.setContraseña(contraseña);

            JOptionPane.showMessageDialog(null, "Datos cambiados correctamente, vuelva a iniciar sesion");
            jpCuenta.setVisible(false);
            pantallaInicioVisible(true);
            limpiarCuenta(true);

            tfDeposito.setText("");
            tfRetiro.setText("");
            //Limpiando 
            tfCambioDia.setText("");
            tfCambioMes.setText("");
            tfCambioAño.setText("");
            tfCambioNombre.setText("");
            tfCambioContraseña.setText("");
        }
    }//GEN-LAST:event_btGuardarCambiosActionPerformed

    private void refrescarC(boolean bol) {
        if (bol) {
            lbCinfo1.setText(String.valueOf(direccionCuenta().getUsuarioN().imprimirUsuario()));
            lbCinfo2.setText(String.valueOf(direccionCuenta().imprimirDatos()));
        }
    }
    private void btCVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCVolverActionPerformed
        jpCuenta.setVisible(false);
        pantallaInicioVisible(true);
        limpiarCuenta(true);
        tfDeposito.setText("");
        tfRetiro.setText("");
    }//GEN-LAST:event_btCVolverActionPerformed

    private void btCmVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCmVolverActionPerformed
        jpCrearCuenta.setVisible(false);
        pantallaInicioVisible(true);
    }//GEN-LAST:event_btCmVolverActionPerformed

    //Controlando el arreglo de objetos
    public void nuevaCuenta(String nombre, int dia, int mes, int año, String contraseña, double saldo) {
        cuentasUsuario.add(new CuentaBancaria(new Usuario(nombre, new Fecha(dia, mes, año)), contraseña, saldo));
    }

    public ArrayList<CuentaBancaria> getCuentas() {
        return cuentasUsuario;
    }

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
            java.util.logging.Logger.getLogger(AppCuentaBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppCuentaBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppCuentaBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppCuentaBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppCuentaBancaria().setVisible(true);
            }
        });
    }

    ArrayList<CuentaBancaria> cuentasUsuario = new ArrayList<>();

    //Cuenta demo
    CuentaBancaria cuentaDemo;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCCuenta;
    private javax.swing.JButton btCVolver;
    private javax.swing.JButton btCambiarDatos;
    private javax.swing.JButton btCmVolver;
    private javax.swing.JButton btCrearCuenta;
    private javax.swing.JButton btDeposito;
    private javax.swing.JButton btGuardarCambios;
    private javax.swing.JButton btIniciarSesion;
    private javax.swing.JButton btRetiro;
    private javax.swing.JButton btSalir;
    private javax.swing.JPanel jpCambiaDatos;
    private javax.swing.JPanel jpCrearCuenta;
    private javax.swing.JPanel jpCuenta;
    private javax.swing.JLabel lbCFechaN;
    private javax.swing.JLabel lbCNombre;
    private javax.swing.JLabel lbCSaldo;
    private javax.swing.JLabel lbCcontrasena;
    private javax.swing.JLabel lbCinfo1;
    private javax.swing.JLabel lbCinfo2;
    private javax.swing.JLabel lbCmContraseña;
    private javax.swing.JLabel lbCmFechaN;
    private javax.swing.JLabel lbCmNombre;
    private javax.swing.JLabel lbCuenta;
    private javax.swing.JLabel lbDepositar;
    private javax.swing.JLabel lbInfo;
    private javax.swing.JLabel lbMensaje;
    private javax.swing.JLabel lbMensajeC;
    private javax.swing.JLabel lbMsessage;
    private javax.swing.JLabel lbRetirar;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbeContraseña;
    private javax.swing.JTextField tfCContraseña;
    private javax.swing.JTextField tfCFechaAño;
    private javax.swing.JTextField tfCFechaDia;
    private javax.swing.JTextField tfCFechaMes;
    private javax.swing.JTextField tfCNombre;
    private javax.swing.JTextField tfCSaldo;
    private javax.swing.JTextField tfCambioAño;
    private javax.swing.JTextField tfCambioContraseña;
    private javax.swing.JTextField tfCambioDia;
    private javax.swing.JTextField tfCambioMes;
    private javax.swing.JTextField tfCambioNombre;
    private javax.swing.JTextField tfClave;
    private javax.swing.JTextField tfDeposito;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfRetiro;
    // End of variables declaration//GEN-END:variables
}
