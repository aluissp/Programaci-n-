package Ventana;

//import Controlador.Controlador;
//import Modelo.Administrador;
//import Modelo.Clientes;
//import Modelo.Empleado;
//import Modelo.MateriaPrima;
//import Modelo.Productos;
//import Modelo.Proveedor;
//import Modelo.SqlAdministrador;
//import Modelo.SqlCuentas;
//import Modelo.SqlEmpleado;
//import Modelo.Ventas;
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        //CrearComponentes();
    }

//    private void CrearComponentes() {
//        Empleado empleado = new Empleado();
//        Administrador administrador = new Administrador();
//        Clientes clientes = new Clientes();
//        Proveedor proveedor = new Proveedor();
//        SqlAdministrador sqlAdministrador = new SqlAdministrador();
//        SqlEmpleado sqlEmpleado = new SqlEmpleado();
//        SqlCuentas sqlCuentas = new SqlCuentas();
//        VistaRegistro vistaR = new VistaRegistro(this, rootPaneCheckingEnabled);
//        Home home = new Home();
//
//        //Admin
//        MateriaPrima materiaPrima = new MateriaPrima();
//        Productos productos = new Productos();
//        Ventas ventas = new Ventas();
//        VistaAdministrador vistaA = new VistaAdministrador();
//        VistaEmpleado vistaE = new VistaEmpleado();
//
//        Controlador controlador = new Controlador(administrador, empleado, clientes, proveedor,
//                sqlAdministrador, sqlEmpleado, this, materiaPrima, productos, ventas, vistaA,
//                vistaE, vistaR, sqlCuentas, home);
//
//        controlador.Iniciar();
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        btIniciarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_logo = new javax.swing.JButton();
        pn_colorTitulo = new javax.swing.JPanel();
        lb_titulo = new javax.swing.JLabel();
        btn_home = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        txtNombre.setText("Gerry");
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 290, 50));

        txtContraseña.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        txtContraseña.setText("12345");
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 405, 290, 50));

        btIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btIniciarSesion.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        btIniciarSesion.setText("Iniciar Sesión");
        jPanel1.add(btIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 190, 60));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        jLabel1.setText("USUARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 127, 40));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        jLabel2.setText("CONTRASEÑA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        btn_logo.setContentAreaFilled(false);
        btn_logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_logo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(btn_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 230, 200));

        pn_colorTitulo.setBackground(new java.awt.Color(0, 153, 255));
        pn_colorTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_titulo.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("Administrador");
        pn_colorTitulo.add(lb_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 390, 50));

        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P_Entrar.Oscuro.png"))); // NOI18N
        btn_home.setToolTipText("Ir al home");
        btn_home.setContentAreaFilled(false);
        btn_home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_home.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P_Entrar.Oscuro.png"))); // NOI18N
        btn_home.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P_Entrar.Claro.png"))); // NOI18N
        btn_home.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pn_colorTitulo.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

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
        pn_colorTitulo.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        jPanel1.add(pn_colorTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 770, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btIniciarSesion;
    public javax.swing.JButton btn_home;
    public javax.swing.JButton btn_logo;
    public javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lb_titulo;
    public javax.swing.JPanel pn_colorTitulo;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
