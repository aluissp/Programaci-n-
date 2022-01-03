/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

/**
 *
 * @author Usuario
 */
public class VistaEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Vendedor
     */
    public VistaEmpleado() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_principalVendedor = new javax.swing.JPanel();
        lb_vendedor = new javax.swing.JLabel();
        tp_opcionesVendedor = new javax.swing.JTabbedPane();
        pn_registrarVentaVendedor = new javax.swing.JPanel();
        lbFechaE1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboProductos = new javax.swing.JComboBox<>();
        lbPrecioUnitario = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btRegistrarVenta = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lbPrecioTotal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        btRegistrarCliente = new javax.swing.JButton();
        btAñadirProducto = new javax.swing.JButton();
        btVaciarRegistro = new javax.swing.JButton();
        pn_inventarioVendedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbEmpleado = new javax.swing.JLabel();
        lbFechaE2 = new javax.swing.JLabel();
        lbProductosDisponibles = new javax.swing.JLabel();
        lbProductosVendidos = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbVentas = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        btPdf = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbProductos = new javax.swing.JTable();
        pn_Cuenta = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        txtApellidoEmpleado = new javax.swing.JTextField();
        btActualizarEmpleado = new javax.swing.JButton();
        txtNombreEmpleado = new javax.swing.JTextField();
        txtIdEmpleado = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtContraseñaEmpleado = new javax.swing.JTextField();
        txtCedulaEmpleado = new javax.swing.JTextField();
        btn_salir = new javax.swing.JButton();
        btVolverE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pn_principalVendedor.setBackground(new java.awt.Color(3, 13, 66));
        pn_principalVendedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_vendedor.setFont(new java.awt.Font("Cambria Math", 1, 26)); // NOI18N
        lb_vendedor.setForeground(new java.awt.Color(255, 255, 255));
        lb_vendedor.setText(" VENDEDOR");
        pn_principalVendedor.add(lb_vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 174, 50));

        pn_registrarVentaVendedor.setBackground(new java.awt.Color(255, 255, 255));
        pn_registrarVentaVendedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbFechaE1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbFechaE1.setText("Fecha del sistema");
        pn_registrarVentaVendedor.add(lbFechaE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Tipo de pan");
        pn_registrarVentaVendedor.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 79, 470, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Precio Unitario");
        pn_registrarVentaVendedor.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        comboProductos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        comboProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Pan integral", "Pan de caña", "Pan de maíz", "Pan de trigo", "Quesadilla" }));
        pn_registrarVentaVendedor.add(comboProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 134, -1));

        lbPrecioUnitario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbPrecioUnitario.setText("$ 0");
        pn_registrarVentaVendedor.add(lbPrecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 140, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Cantidad de panes");
        pn_registrarVentaVendedor.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txtCantidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        pn_registrarVentaVendedor.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 140, 30));

        btRegistrarVenta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btRegistrarVenta.setText("Registrar venta");
        btRegistrarVenta.setFocusPainted(false);
        pn_registrarVentaVendedor.add(btRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("TOTAL");
        pn_registrarVentaVendedor.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 440, -1));

        lbPrecioTotal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbPrecioTotal.setText("$ 0");
        pn_registrarVentaVendedor.add(lbPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 140, 20));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Empleado:");
        pn_registrarVentaVendedor.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 9, -1, 40));

        lbUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pn_registrarVentaVendedor.add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 11, 221, 40));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Cliente");
        pn_registrarVentaVendedor.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 440, 30));

        txtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClienteKeyTyped(evt);
            }
        });
        pn_registrarVentaVendedor.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 140, 30));

        btRegistrarCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btRegistrarCliente.setText("Registrar Cliente");
        btRegistrarCliente.setFocusPainted(false);
        pn_registrarVentaVendedor.add(btRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        btAñadirProducto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btAñadirProducto.setText("Añadir producto");
        btAñadirProducto.setFocusPainted(false);
        pn_registrarVentaVendedor.add(btAñadirProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 180, -1));

        btVaciarRegistro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btVaciarRegistro.setText("Vaciar registro");
        btVaciarRegistro.setFocusPainted(false);
        pn_registrarVentaVendedor.add(btVaciarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 140, -1));

        tp_opcionesVendedor.addTab("               REGISTRAR VENTA                 ", pn_registrarVentaVendedor);

        pn_inventarioVendedor.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Empleado  : ");

        lbEmpleado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbEmpleado.setText("------------------------------");

        lbFechaE2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbFechaE2.setText("Fecha del sistema");

        lbProductosDisponibles.setText("Cantidad total de panes disponibles");

        lbProductosVendidos.setText("Cantidad total de panes vendidos");

        tbVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Producto", "Cantidad", "Precio", "Fecha de venta", "Nombre", "Apellido", "Cédula"
            }
        ));
        tbVentas.setAlignmentX(0.0F);
        tbVentas.setAlignmentY(0.0F);
        jScrollPane4.setViewportView(tbVentas);

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("                                                                                             VENTAS DEL DÍA                                                                                             ");

        btPdf.setText("Generar pdf de las ventas del día");
        btPdf.setFocusPainted(false);

        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Producto", "Precio", "Cantidad"
            }
        ));
        jScrollPane3.setViewportView(tbProductos);

        javax.swing.GroupLayout pn_inventarioVendedorLayout = new javax.swing.GroupLayout(pn_inventarioVendedor);
        pn_inventarioVendedor.setLayout(pn_inventarioVendedorLayout);
        pn_inventarioVendedorLayout.setHorizontalGroup(
            pn_inventarioVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_inventarioVendedorLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pn_inventarioVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_inventarioVendedorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addComponent(lbEmpleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbFechaE2)
                        .addGap(30, 30, 30))
                    .addGroup(pn_inventarioVendedorLayout.createSequentialGroup()
                        .addGroup(pn_inventarioVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(pn_inventarioVendedorLayout.createSequentialGroup()
                                .addComponent(lbProductosVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(lbProductosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(pn_inventarioVendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_inventarioVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btPdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        pn_inventarioVendedorLayout.setVerticalGroup(
            pn_inventarioVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_inventarioVendedorLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pn_inventarioVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbEmpleado)
                    .addComponent(lbFechaE2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_inventarioVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProductosVendidos)
                    .addComponent(lbProductosDisponibles))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tp_opcionesVendedor.addTab("                  INVENTARIO/VENTAS                    ", pn_inventarioVendedor);

        pn_Cuenta.setBackground(new java.awt.Color(255, 255, 255));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setText("DATOS DEL EMPLEADO");

        btActualizarEmpleado.setText("Actualizar");
        btActualizarEmpleado.setFocusPainted(false);

        txtIdEmpleado.setEnabled(false);

        jLabel33.setText("ID:");

        jLabel34.setText("Nombre:");

        jLabel35.setText("Apellido:");

        jLabel36.setText("Cédula");

        jLabel37.setText("Contraseña:");

        txtCedulaEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaEmpleadoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pn_CuentaLayout = new javax.swing.GroupLayout(pn_Cuenta);
        pn_Cuenta.setLayout(pn_CuentaLayout);
        pn_CuentaLayout.setHorizontalGroup(
            pn_CuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_CuentaLayout.createSequentialGroup()
                .addGroup(pn_CuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_CuentaLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(pn_CuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pn_CuentaLayout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(18, 18, 18)
                                .addComponent(txtContraseñaEmpleado))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_CuentaLayout.createSequentialGroup()
                                .addGroup(pn_CuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pn_CuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn_CuentaLayout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(pn_CuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                            .addComponent(txtIdEmpleado)
                                            .addComponent(txtApellidoEmpleado)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_CuentaLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(txtCedulaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(102, 102, 102)
                        .addComponent(btActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_CuentaLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        pn_CuentaLayout.setVerticalGroup(
            pn_CuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_CuentaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pn_CuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_CuentaLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(pn_CuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addGap(18, 18, 18)
                        .addGroup(pn_CuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addGap(33, 33, 33)
                        .addGroup(pn_CuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn_CuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedulaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addGap(22, 22, 22)
                        .addGroup(pn_CuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContraseñaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addContainerGap(99, Short.MAX_VALUE))
                    .addGroup(pn_CuentaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
        );

        tp_opcionesVendedor.addTab("                      CUENTA                     ", pn_Cuenta);

        pn_principalVendedor.add(tp_opcionesVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 740, 500));

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P_Salir.Oscuro.png"))); // NOI18N
        btn_salir.setToolTipText("salir");
        btn_salir.setContentAreaFilled(false);
        btn_salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P_Salir.Oscuro.png"))); // NOI18N
        btn_salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P_Salir.Claro.png"))); // NOI18N
        btn_salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        pn_principalVendedor.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        btVolverE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P_Entrar.Oscuro.png"))); // NOI18N
        btVolverE.setToolTipText("Ir al home");
        btVolverE.setContentAreaFilled(false);
        btVolverE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVolverE.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P_Entrar.Oscuro.png"))); // NOI18N
        btVolverE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P_Entrar.Claro.png"))); // NOI18N
        btVolverE.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pn_principalVendedor.add(btVolverE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_principalVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_principalVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteKeyTyped
        cancelarLetras(evt);
    }//GEN-LAST:event_txtClienteKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        cancelarLetras(evt);
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtCedulaEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaEmpleadoKeyTyped
        cancelarLetras(evt);
    }//GEN-LAST:event_txtCedulaEmpleadoKeyTyped

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void cancelarLetras(java.awt.event.KeyEvent evt) {
        char validar = evt.getKeyChar();
        if ((validar < 48 || validar > 57) && validar != 8) {
            getToolkit().beep();
            evt.consume();
        }
    }

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
            java.util.logging.Logger.getLogger(VistaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do modify                     
    Login home;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btActualizarEmpleado;
    public javax.swing.JButton btAñadirProducto;
    public javax.swing.JButton btPdf;
    public javax.swing.JButton btRegistrarCliente;
    public javax.swing.JButton btRegistrarVenta;
    public javax.swing.JButton btVaciarRegistro;
    public javax.swing.JButton btVolverE;
    public javax.swing.JButton btn_salir;
    public javax.swing.JComboBox<String> comboProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JLabel lbEmpleado;
    public javax.swing.JLabel lbFechaE1;
    public javax.swing.JLabel lbFechaE2;
    public javax.swing.JLabel lbPrecioTotal;
    public javax.swing.JLabel lbPrecioUnitario;
    public javax.swing.JLabel lbProductosDisponibles;
    public javax.swing.JLabel lbProductosVendidos;
    public javax.swing.JLabel lbUsuario;
    private javax.swing.JLabel lb_vendedor;
    private javax.swing.JPanel pn_Cuenta;
    private javax.swing.JPanel pn_inventarioVendedor;
    private javax.swing.JPanel pn_principalVendedor;
    private javax.swing.JPanel pn_registrarVentaVendedor;
    public javax.swing.JTable tbProductos;
    public javax.swing.JTable tbVentas;
    private javax.swing.JTabbedPane tp_opcionesVendedor;
    public javax.swing.JTextField txtApellidoEmpleado;
    public javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtCedulaEmpleado;
    public javax.swing.JTextField txtCliente;
    public javax.swing.JTextField txtContraseñaEmpleado;
    public javax.swing.JTextField txtIdEmpleado;
    public javax.swing.JTextField txtNombreEmpleado;
    // End of variables declaration//GEN-END:variables
}
