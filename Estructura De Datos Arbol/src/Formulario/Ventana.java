/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import EstructuraArbol.ArbolBB;
import EstructuraArbol.NodoABB;
import EstructuraArbol.Votante;

/**
 *
 * @author Armando Perugachi
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    ArbolBB arbol;
    Votante votante;

    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
        arbol = new ArbolBB();
        arbol.ingresarElemento(new Votante("500", "Juan", 1, 1, 1, null, 1));
        arbol.ingresarElemento(new Votante("300", "Maria", 1, 1, 1, null, 1));
        arbol.ingresarElemento(new Votante("900", "Emilio", 1, 1, 1, null, 1));
        arbol.ingresarElemento(new Votante("100", "Matias", 1, 1, 1, null, 1));
        arbol.ingresarElemento(new Votante("400", "Kevin", 1, 1, 1, null, 1));
        arbol.ingresarElemento(new Votante("700", "Jeremias", 1, 1, 1, null, 1));
        arbol.ingresarElemento(new Votante("920", "Martin", 1, 1, 1, null, 1));
        arbol.ingresarElemento(new Votante("050", "Jhojan", 1, 1, 1, null, 1));
        arbol.ingresarElemento(new Votante("750", "Maite", 1, 1, 1, null, 1));
        arbol.ingresarElemento(new Votante("800", "Rosa", 1, 1, 1, null, 1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpInicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCodProvincia = new javax.swing.JTextField();
        txtCodCanton = new javax.swing.JTextField();
        txtRecinto = new javax.swing.JTextField();
        btPreorder = new javax.swing.JToggleButton();
        btIngresar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCampoTexto = new javax.swing.JTextArea();
        btPostorder = new javax.swing.JToggleButton();
        btInorder = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNMesa = new javax.swing.JTextField();
        txtCodParroquia = new javax.swing.JTextField();
        btBuscarCedula = new javax.swing.JToggleButton();
        btExamen = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Estructura de datos árbol binario de búsqueda");
        jpInicio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 550, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Ingrese la información del votante: ");
        jpInicio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Nombre: ");
        jpInicio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Código de cantón");
        jpInicio.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 140, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Cédula: ");
        jpInicio.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Recinto ");
        jpInicio.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Código de provincia ");
        jpInicio.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 30));

        txtCedula.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jpInicio.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 260, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jpInicio.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 260, -1));

        txtCodProvincia.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jpInicio.add(txtCodProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 260, -1));

        txtCodCanton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jpInicio.add(txtCodCanton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 260, -1));

        txtRecinto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jpInicio.add(txtRecinto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 260, -1));

        btPreorder.setBackground(new java.awt.Color(247, 246, 251));
        btPreorder.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btPreorder.setText("PreOrder");
        btPreorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPreorderActionPerformed(evt);
            }
        });
        jpInicio.add(btPreorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 170, -1));

        btIngresar.setBackground(new java.awt.Color(247, 246, 251));
        btIngresar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btIngresar.setText("Ingresar");
        btIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresarActionPerformed(evt);
            }
        });
        jpInicio.add(btIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 170, -1));

        txtCampoTexto.setColumns(20);
        txtCampoTexto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtCampoTexto.setRows(5);
        jScrollPane1.setViewportView(txtCampoTexto);

        jpInicio.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 370, 200));

        btPostorder.setBackground(new java.awt.Color(247, 246, 251));
        btPostorder.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btPostorder.setText("PostOrder");
        btPostorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPostorderActionPerformed(evt);
            }
        });
        jpInicio.add(btPostorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 170, -1));

        btInorder.setBackground(new java.awt.Color(247, 246, 251));
        btInorder.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btInorder.setText("InOrder");
        jpInicio.add(btInorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 170, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Realizado por: Perugachi Luis");
        jpInicio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Número de mesa");
        jpInicio.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Código de parroquia ");
        jpInicio.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 30));

        txtNMesa.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jpInicio.add(txtNMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 260, -1));

        txtCodParroquia.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jpInicio.add(txtCodParroquia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 260, -1));

        btBuscarCedula.setBackground(new java.awt.Color(247, 246, 251));
        btBuscarCedula.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btBuscarCedula.setText("Buscar por cedula");
        btBuscarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarCedulaActionPerformed(evt);
            }
        });
        jpInicio.add(btBuscarCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 170, -1));

        btExamen.setBackground(new java.awt.Color(247, 246, 251));
        btExamen.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btExamen.setText("Examen");
        btExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExamenActionPerformed(evt);
            }
        });
        jpInicio.add(btExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 170, -1));

        getContentPane().add(jpInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPreorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPreorderActionPerformed
        try {
            if (arbol != null) {
                this.txtCampoTexto.setText("Recorrido del árbol binario de búsqueda en PreOrder: \n" + arbol.recorrerPreOrder(arbol.getRaiz()));
            } else {
                this.txtCampoTexto.setText("No hay elementos en el árbol");
            }
        } catch (NullPointerException e) {
            this.txtCampoTexto.setText("Por favor cree la el árbol binario de búsqueda");
        }
    }//GEN-LAST:event_btPreorderActionPerformed

    private void btIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresarActionPerformed
        try {
            String cedula = this.txtCedula.getText();
            String nombre = this.txtNombre.getText();
            int codProvincia = Integer.valueOf(this.txtCodProvincia.getText());
            int codCanton = Integer.valueOf(this.txtCodCanton.getText());
            int codParroquia = Integer.parseInt(this.txtCodParroquia.getText());
            String recinto = this.txtRecinto.getText();
            int nMesa = Integer.valueOf(this.txtNMesa.getText());

            votante = new Votante(cedula, nombre, codProvincia, codCanton, codParroquia, recinto, nMesa);

            this.txtCampoTexto.setText(arbol.ingresarElemento(votante));
            //LimpiarCajas();
        } catch (NumberFormatException e) {
            this.txtCampoTexto.setText("Por favor digite un número\nen los campos Código de provincia\nCódigo de catón\nCódigo de parroquia\nNúmero de mesa");
        } catch (NullPointerException e) {
            this.txtCampoTexto.setText("Por favor cree el árbol binario de búsqueda");
        }
    }//GEN-LAST:event_btIngresarActionPerformed

    private void LimpiarCajas() {
        this.txtCedula.setText("");
        this.txtCodProvincia.setText("");
        this.txtCodParroquia.setText("");
        this.txtNMesa.setText("");
        this.txtNombre.setText("");
        this.txtCodCanton.setText("");
        this.txtRecinto.setText("");
    }
    private void btPostorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPostorderActionPerformed
        try {
            if (arbol.getRaiz() != null) {
                this.txtCampoTexto.setText("El recorrido en PostOrder es: \n" + arbol.recorrerPostOrder(arbol.getRaiz()));
            } else {
                this.txtCampoTexto.setText("No hay elementos en el árbol");
            }
        } catch (NullPointerException e) {
            this.txtCampoTexto.setText("Asegurese de haber creado el árbol binario de búsqueda");
        }
    }//GEN-LAST:event_btPostorderActionPerformed

    private void btBuscarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarCedulaActionPerformed
        if ((arbol.buscarElemento(this.txtCedula.getText())) != null) {
            this.votante = ((Votante) ((NodoABB) arbol.buscarElemento(this.txtCedula.getText())).getInformacion());
            this.txtCampoTexto.setText("" + votante);
        } else {
            this.txtCampoTexto.setText("No se encontro el votante");
        }

    }//GEN-LAST:event_btBuscarCedulaActionPerformed

    private void btExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExamenActionPerformed
        String[] arrayCedulas = this.txtCedula.getText().split(",");
        NodoABB[] nodos = new NodoABB[arrayCedulas.length];
        int mayor, menor;
        int[] nroNodos = new int[arrayCedulas.length];
        String nodoMayor, nodoMenor;
        nodoMayor = nodoMenor = "";
        
        for (int i = 0; i < arrayCedulas.length; i++) {
            nodos[i] = arbol.buscarElemento(arrayCedulas[i]);

            if (nodos[i] != null) {
                recorrerArbol(nodos[i], nroNodos, i);
            }
        }

        mayor = menor = nroNodos[0];
        for (int i = 1; i < nroNodos.length; i++) {
            if (mayor < nroNodos[i] && nroNodos[i] > 0) {
                mayor = nroNodos[i];
            } else if (menor > nroNodos[i] && nroNodos[i] > 0) {
                menor = nroNodos[i];
            }
        }

        for (int i = 0; i < nodos.length; i++) {
            if (nroNodos[i] == mayor && nodos[i] != null) {
                String cedula = ((Votante) nodos[i].getInformacion()).getCedula();
                nodoMayor = "El subarbol formado por la cedula " + cedula
                        + "\nes el que tiene mas nodos, formado por " + mayor + " nodos\n\n";
            }

            if (nroNodos[i] == menor && nodos[i] != null) {
                String cedula = ((Votante) nodos[i].getInformacion()).getCedula();
                nodoMenor = "El subarbol formado por la cedula " + cedula
                        + "\nes el que tiene menos nodos, formado por " + menor + " nodos\n\n";
            }
        }

        this.txtCampoTexto.setText(nodoMayor + nodoMenor);
    }//GEN-LAST:event_btExamenActionPerformed

    public void recorrerArbol(NodoABB nodo, int[] nroNodos, int i) {
        if (nodo != null) {
            nroNodos[i]++;
            recorrerArbol(nodo.getHIzquierdo(), nroNodos, i);
            recorrerArbol(nodo.getHDerecho(), nroNodos, i);
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btBuscarCedula;
    private javax.swing.JToggleButton btExamen;
    private javax.swing.JToggleButton btIngresar;
    private javax.swing.JToggleButton btInorder;
    private javax.swing.JToggleButton btPostorder;
    private javax.swing.JToggleButton btPreorder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpInicio;
    private javax.swing.JTextArea txtCampoTexto;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodCanton;
    private javax.swing.JTextField txtCodParroquia;
    private javax.swing.JTextField txtCodProvincia;
    private javax.swing.JTextField txtNMesa;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRecinto;
    // End of variables declaration//GEN-END:variables
}