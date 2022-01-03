package GrupoDePersonas;

import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Ventana extends javax.swing.JFrame {

    private DefaultComboBoxModel<Persona> modelo = new DefaultComboBoxModel<Persona>();//Para Añadir un modelo a nuestro combo box
    private DefaultTableModel modeloTabla = new DefaultTableModel();//Para insertar un modelo a nuestra Tabla

    public Ventana() {
        agregarModeloTabla();
        llenarModeloComboBox();
        initComponents();
        setLocationRelativeTo(null);
    }

    private void agregarModeloTabla() {
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellidos");
        modeloTabla.addColumn("Email");
        modeloTabla.addColumn("Celular");
        modeloTabla.addColumn("Direccion");
    }

    private void llenarModeloComboBox() {
        modelo.addElement(new Persona("Luis", "Perugachi", "armando@mail.com", "097826595", "Cotacachi"));
        modelo.addElement(new Persona("Maite", "Perugachi", "maite@mail.com", "0978269483", "Cotacachi"));
        modelo.addElement(new Persona("Tarquino", "Perugachi", "tarquino@mail.com", "097822648", "Quito"));
        modelo.addElement(new Persona("Mateo", "Perugachi", "mateo@mail.com", "0978293114", "Ibarra"));
        modelo.addElement(new Persona("Denisse", "Santos", "denisse@mail.com", "0978256736", "Otavalo"));
        modelo.addElement(new Persona("Ana", "Díaz de la Vega", "ana@mail.com", "097821498", "San Pablo"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPanel = new javax.swing.JPanel();
        lbPersona = new javax.swing.JLabel();
        cbComboPersonas = new javax.swing.JComboBox<>();
        btInsertar = new javax.swing.JButton();
        scTabla = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        Separador = new javax.swing.JSeparator();
        lbDatos = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        lbApellidos = new javax.swing.JLabel();
        tfApellidos = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        tfCelular = new javax.swing.JTextField();
        lbCelular = new javax.swing.JLabel();
        lbDireccion = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbPersona.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbPersona.setText("Persona");

        cbComboPersonas.setModel(modelo);

        btInsertar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btInsertar.setText("Insertar Persona");
        btInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsertarActionPerformed(evt);
            }
        });

        jtTabla.setModel(modeloTabla
        );
        ListSelectionListener oyenteSeleccion=new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e){
                if(e.getValueIsAdjusting()){
                    int filaSeleccionada = jtTabla.getSelectedRow();

                    String nombre = (String) modeloTabla.getValueAt(filaSeleccionada , 0);
                    String apellido = (String) modeloTabla.getValueAt(filaSeleccionada , 1);
                    String email = (String) modeloTabla.getValueAt(filaSeleccionada , 2);
                    String celular = (String) modeloTabla.getValueAt(filaSeleccionada , 3);
                    String direccion = (String) modeloTabla.getValueAt(filaSeleccionada , 4);

                    tfNombre.setText(nombre);
                    tfApellidos.setText(apellido);
                    tfEmail.setText(email);
                    tfCelular.setText(celular);
                    tfDireccion.setText(direccion);
                    //System.out.println("Fila Seleccionada");
                }
            }
        };

        jtTabla.getSelectionModel().addListSelectionListener(oyenteSeleccion);

        scTabla.setViewportView(jtTabla);

        lbDatos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbDatos.setText("Datos de la persona");

        lbNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNombre.setText("Nombre");

        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });

        lbApellidos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbApellidos.setText("Apellidos");

        lbEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbEmail.setText("Email");

        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        tfCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCelularActionPerformed(evt);
            }
        });

        lbCelular.setText("Celular");

        lbDireccion.setText("Dirección");

        tfDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDireccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPanelLayout = new javax.swing.GroupLayout(jpPanel);
        jpPanel.setLayout(jpPanelLayout);
        jpPanelLayout.setHorizontalGroup(
            jpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPanelLayout.createSequentialGroup()
                        .addGroup(jpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombre)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfApellidos)
                            .addGroup(jpPanelLayout.createSequentialGroup()
                                .addComponent(lbApellidos)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jpPanelLayout.createSequentialGroup()
                        .addGroup(jpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbPersona)
                                .addGroup(jpPanelLayout.createSequentialGroup()
                                    .addComponent(cbComboPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(scTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(Separador))
                            .addComponent(lbDatos)
                            .addComponent(lbDireccion)
                            .addGroup(jpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPanelLayout.createSequentialGroup()
                                    .addGroup(jpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbEmail))
                                    .addGap(18, 18, 18)
                                    .addGroup(jpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbCelular)
                                        .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpPanelLayout.setVerticalGroup(
            jpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPersona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(cbComboPersonas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(lbApellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(lbCelular))
                .addGap(4, 4, 4)
                .addGroup(jpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsertarActionPerformed
        Persona p = (Persona) cbComboPersonas.getSelectedItem();

        String nombre = p.getNombre();
        String apellido = p.getApellido();
        String email = p.getEmail();
        String celular = p.getCelular();
        String direccion = p.getDireccion();

        String[] persona = {nombre, apellido, email, celular, direccion};
        modeloTabla.addRow(persona);//Añadimos una fila la tabla
    }//GEN-LAST:event_btInsertarActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
    }//GEN-LAST:event_tfEmailActionPerformed

    private void tfCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCelularActionPerformed
    }//GEN-LAST:event_tfCelularActionPerformed

    private void tfDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDireccionActionPerformed
    }//GEN-LAST:event_tfDireccionActionPerformed

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
    private javax.swing.JSeparator Separador;
    private javax.swing.JButton btInsertar;
    private javax.swing.JComboBox<Persona> cbComboPersonas;
    private javax.swing.JPanel jpPanel;
    private javax.swing.JTable jtTabla;
    private javax.swing.JLabel lbApellidos;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbDatos;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPersona;
    private javax.swing.JScrollPane scTabla;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables

}
