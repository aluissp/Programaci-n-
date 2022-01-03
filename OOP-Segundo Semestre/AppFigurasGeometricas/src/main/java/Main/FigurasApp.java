package Main;

import javax.swing.JOptionPane;

public class FigurasApp extends javax.swing.JFrame {

    Recta r1;
    Circunferencia c1;
    Cuadrado cd;
    Rectangulo rt;
    Triangulo tr;
    Elipse el;

    public FigurasApp() {
        initComponents();
        plRecta.setVisible(false);
        plRectangulo.setVisible(false);
        plCuadrado.setVisible(false);
        plCircunferencia.setVisible(false);
        plTriangulo.setVisible(false);
        plElipse.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        btCircunferencia = new javax.swing.JButton();
        btTriangulo = new javax.swing.JButton();
        btRecta1 = new javax.swing.JButton();
        btCuadrado1 = new javax.swing.JButton();
        btRectangulo1 = new javax.swing.JButton();
        btElipse1 = new javax.swing.JButton();
        plRecta = new javax.swing.JPanel();
        lbPunto1 = new javax.swing.JLabel();
        lbPunto2 = new javax.swing.JLabel();
        lbX1 = new javax.swing.JLabel();
        lbX2 = new javax.swing.JLabel();
        lbY1 = new javax.swing.JLabel();
        lbY2 = new javax.swing.JLabel();
        tfX1 = new javax.swing.JTextField();
        tfX2 = new javax.swing.JTextField();
        tfY1 = new javax.swing.JTextField();
        tfY2 = new javax.swing.JTextField();
        lbLongitud = new javax.swing.JLabel();
        tfXmover = new javax.swing.JTextField();
        tfYmover = new javax.swing.JTextField();
        lbResultado = new javax.swing.JLabel();
        btAsignar = new javax.swing.JButton();
        lbX3 = new javax.swing.JLabel();
        lbY3 = new javax.swing.JLabel();
        btAsignar1 = new javax.swing.JButton();
        lbMover = new javax.swing.JLabel();
        plCuadrado = new javax.swing.JPanel();
        lbCLado = new javax.swing.JLabel();
        lbCCentro = new javax.swing.JLabel();
        lbCX = new javax.swing.JLabel();
        lbCY = new javax.swing.JLabel();
        tfCdX = new javax.swing.JTextField();
        tfCdY = new javax.swing.JTextField();
        tfCdLado = new javax.swing.JTextField();
        btAsignarCd = new javax.swing.JButton();
        lbAreaCd = new javax.swing.JLabel();
        lbPerimetroCd = new javax.swing.JLabel();
        lbMoverCd = new javax.swing.JLabel();
        lbMcdx = new javax.swing.JLabel();
        lbMcdy = new javax.swing.JLabel();
        tfMCdx = new javax.swing.JTextField();
        tfMCdy = new javax.swing.JTextField();
        btMoverCd = new javax.swing.JButton();
        lbRcd2 = new javax.swing.JLabel();
        lbRcd1 = new javax.swing.JLabel();
        plCircunferencia = new javax.swing.JPanel();
        lbCentro = new javax.swing.JLabel();
        tfCentro1 = new javax.swing.JTextField();
        lbX11 = new javax.swing.JLabel();
        lbY11 = new javax.swing.JLabel();
        tfCentro2 = new javax.swing.JTextField();
        lbRadio = new javax.swing.JLabel();
        tfRadio = new javax.swing.JTextField();
        btAsignar3 = new javax.swing.JButton();
        lbArea = new javax.swing.JLabel();
        lbPerimetro = new javax.swing.JLabel();
        lbArea1 = new javax.swing.JLabel();
        lbPerimetro1 = new javax.swing.JLabel();
        lbCMover = new javax.swing.JLabel();
        lbX12 = new javax.swing.JLabel();
        lbY12 = new javax.swing.JLabel();
        tfCMoverX = new javax.swing.JTextField();
        tfCMoverY = new javax.swing.JTextField();
        btAsignar4 = new javax.swing.JButton();
        plElipse = new javax.swing.JPanel();
        lbE = new javax.swing.JLabel();
        lbE1 = new javax.swing.JLabel();
        lbE2 = new javax.swing.JLabel();
        tfEx = new javax.swing.JTextField();
        tfEy = new javax.swing.JTextField();
        lbE3 = new javax.swing.JLabel();
        lbE4 = new javax.swing.JLabel();
        tfejeMy = new javax.swing.JTextField();
        tfejeMn = new javax.swing.JTextField();
        lbEarea = new javax.swing.JLabel();
        lbEa = new javax.swing.JLabel();
        lbEarea1 = new javax.swing.JLabel();
        lbEp = new javax.swing.JLabel();
        btEasignar = new javax.swing.JButton();
        lbEMover = new javax.swing.JLabel();
        lbE5 = new javax.swing.JLabel();
        lbE6 = new javax.swing.JLabel();
        tfExm = new javax.swing.JTextField();
        tfEym = new javax.swing.JTextField();
        btEm = new javax.swing.JButton();
        plRectangulo = new javax.swing.JPanel();
        lbRcx = new javax.swing.JLabel();
        lbRcY = new javax.swing.JLabel();
        tfRcx = new javax.swing.JTextField();
        tfRcy = new javax.swing.JTextField();
        lbRcl1 = new javax.swing.JLabel();
        lbRcl2 = new javax.swing.JLabel();
        tfRcl1 = new javax.swing.JTextField();
        tfRcl2 = new javax.swing.JTextField();
        btRcAsignar = new javax.swing.JButton();
        lbRcArea = new javax.swing.JLabel();
        lbRcRa = new javax.swing.JLabel();
        lbRcPerimetro = new javax.swing.JLabel();
        lbRcRp = new javax.swing.JLabel();
        lbRcMover = new javax.swing.JLabel();
        lbRcx1 = new javax.swing.JLabel();
        lbRcY1 = new javax.swing.JLabel();
        tfRcMx = new javax.swing.JTextField();
        tfRcMy = new javax.swing.JTextField();
        btMoverRc = new javax.swing.JButton();
        plTriangulo = new javax.swing.JPanel();
        lbTp1 = new javax.swing.JLabel();
        lbTp2 = new javax.swing.JLabel();
        lbTp3 = new javax.swing.JLabel();
        lbT1 = new javax.swing.JLabel();
        lbT2 = new javax.swing.JLabel();
        tfP1 = new javax.swing.JTextField();
        tfP2 = new javax.swing.JTextField();
        tfP3 = new javax.swing.JTextField();
        tfP4 = new javax.swing.JTextField();
        tfP5 = new javax.swing.JTextField();
        tfP6 = new javax.swing.JTextField();
        btTAsignar = new javax.swing.JButton();
        lbTArea = new javax.swing.JLabel();
        lbTRa = new javax.swing.JLabel();
        lbTp = new javax.swing.JLabel();
        lbTRp = new javax.swing.JLabel();
        lbMT = new javax.swing.JLabel();
        lbT3 = new javax.swing.JLabel();
        lbT4 = new javax.swing.JLabel();
        tfP7 = new javax.swing.JTextField();
        tfP8 = new javax.swing.JTextField();
        btTAsignar1 = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setText("FIGURAS GEOMETRICAS");
        getContentPane().add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 154, 27));

        btCircunferencia.setText("Circunferencia");
        btCircunferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCircunferenciaActionPerformed(evt);
            }
        });
        getContentPane().add(btCircunferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        btTriangulo.setText("Triangulo");
        btTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTrianguloActionPerformed(evt);
            }
        });
        getContentPane().add(btTriangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        btRecta1.setText("Recta");
        btRecta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRecta1ActionPerformed(evt);
            }
        });
        getContentPane().add(btRecta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        btCuadrado1.setText("Cuadrado");
        btCuadrado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCuadrado1ActionPerformed(evt);
            }
        });
        getContentPane().add(btCuadrado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        btRectangulo1.setText("Rectangulo");
        btRectangulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRectangulo1ActionPerformed(evt);
            }
        });
        getContentPane().add(btRectangulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        btElipse1.setText("Elipse");
        btElipse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btElipse1ActionPerformed(evt);
            }
        });
        getContentPane().add(btElipse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        plRecta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbPunto1.setText("Punto 2");
        plRecta.add(lbPunto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        lbPunto2.setText("Punto 1");
        plRecta.add(lbPunto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        lbX1.setText("X");
        plRecta.add(lbX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 40, -1));

        lbX2.setText("X");
        plRecta.add(lbX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 40, -1));

        lbY1.setText("Y");
        plRecta.add(lbY1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 40, -1));

        lbY2.setText("Y");
        plRecta.add(lbY2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 30, -1));

        tfX1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfX1ActionPerformed(evt);
            }
        });
        plRecta.add(tfX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 30, -1));
        plRecta.add(tfX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 30, -1));
        plRecta.add(tfY1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 30, -1));
        plRecta.add(tfY2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 30, -1));

        lbLongitud.setText("Longitud:");
        plRecta.add(lbLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        plRecta.add(tfXmover, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 30, -1));
        plRecta.add(tfYmover, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 30, -1));
        plRecta.add(lbResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 90, 20));

        btAsignar.setText("Asignar");
        btAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAsignarActionPerformed(evt);
            }
        });
        plRecta.add(btAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        lbX3.setText("X");
        plRecta.add(lbX3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 40, -1));

        lbY3.setText("Y");
        plRecta.add(lbY3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 40, -1));

        btAsignar1.setText("Asignar");
        btAsignar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAsignar1ActionPerformed(evt);
            }
        });
        plRecta.add(btAsignar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        lbMover.setText("Mover:");
        plRecta.add(lbMover, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 60, 30));

        getContentPane().add(plRecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 430, 190));

        plCuadrado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCLado.setText("Lado");
        plCuadrado.add(lbCLado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 30, 20));

        lbCCentro.setText("Centro");
        plCuadrado.add(lbCCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        lbCX.setText("X");
        plCuadrado.add(lbCX, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 20, -1));

        lbCY.setText("Y");
        plCuadrado.add(lbCY, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 20, -1));

        tfCdX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCdXActionPerformed(evt);
            }
        });
        plCuadrado.add(tfCdX, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 40, -1));

        tfCdY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCdYActionPerformed(evt);
            }
        });
        plCuadrado.add(tfCdY, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 40, -1));

        tfCdLado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCdLadoActionPerformed(evt);
            }
        });
        plCuadrado.add(tfCdLado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 50, -1));

        btAsignarCd.setText("Asignar");
        btAsignarCd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAsignarCdActionPerformed(evt);
            }
        });
        plCuadrado.add(btAsignarCd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        lbAreaCd.setText("Area:");
        plCuadrado.add(lbAreaCd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        lbPerimetroCd.setText("Perímetro:");
        plCuadrado.add(lbPerimetroCd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        lbMoverCd.setText("Mover Cuadrado");
        plCuadrado.add(lbMoverCd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        lbMcdx.setText("X");
        plCuadrado.add(lbMcdx, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        lbMcdy.setText("Y");
        plCuadrado.add(lbMcdy, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        tfMCdx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMCdxActionPerformed(evt);
            }
        });
        plCuadrado.add(tfMCdx, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 50, -1));

        tfMCdy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMCdyActionPerformed(evt);
            }
        });
        plCuadrado.add(tfMCdy, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 50, -1));

        btMoverCd.setText("Mover");
        btMoverCd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMoverCdActionPerformed(evt);
            }
        });
        plCuadrado.add(btMoverCd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));
        plCuadrado.add(lbRcd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 100, 20));
        plCuadrado.add(lbRcd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 100, 20));

        getContentPane().add(plCuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 430, 240));

        plCircunferencia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCentro.setText("Centro: ");
        plCircunferencia.add(lbCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        plCircunferencia.add(tfCentro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 40, -1));

        lbX11.setText("X");
        plCircunferencia.add(lbX11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 20, -1));

        lbY11.setText("Y");
        plCircunferencia.add(lbY11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 20, -1));
        plCircunferencia.add(tfCentro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 40, -1));

        lbRadio.setText("Radio:");
        plCircunferencia.add(lbRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        plCircunferencia.add(tfRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 100, -1));

        btAsignar3.setText("Asignar");
        btAsignar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAsignar3ActionPerformed(evt);
            }
        });
        plCircunferencia.add(btAsignar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        lbArea.setText("Area:");
        plCircunferencia.add(lbArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        lbPerimetro.setText("Perimetro:");
        plCircunferencia.add(lbPerimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        plCircunferencia.add(lbArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 100, 20));
        plCircunferencia.add(lbPerimetro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 100, 20));

        lbCMover.setText("Mover:");
        plCircunferencia.add(lbCMover, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        lbX12.setText("X");
        plCircunferencia.add(lbX12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 20, -1));

        lbY12.setText("Y");
        plCircunferencia.add(lbY12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 20, -1));
        plCircunferencia.add(tfCMoverX, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 50, -1));
        plCircunferencia.add(tfCMoverY, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 50, -1));

        btAsignar4.setText("Asignar");
        btAsignar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAsignar4ActionPerformed(evt);
            }
        });
        plCircunferencia.add(btAsignar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        getContentPane().add(plCircunferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 350, 240));

        plElipse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbE.setText("Punto Centro");
        plElipse.add(lbE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lbE1.setText("Y");
        plElipse.add(lbE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 30, -1));

        lbE2.setText("X");
        plElipse.add(lbE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 20, 20, -1));

        tfEx.setText("1");
        plElipse.add(tfEx, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 50, -1));

        tfEy.setText("1");
        plElipse.add(tfEy, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 50, -1));

        lbE3.setText("Eje Mayor");
        plElipse.add(lbE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lbE4.setText("Eje Menor");
        plElipse.add(lbE4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        tfejeMy.setText("24.5");
        tfejeMy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfejeMyActionPerformed(evt);
            }
        });
        plElipse.add(tfejeMy, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 70, -1));

        tfejeMn.setText("10.12");
        tfejeMn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfejeMnActionPerformed(evt);
            }
        });
        plElipse.add(tfejeMn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 70, -1));

        lbEarea.setText("Perimetro");
        plElipse.add(lbEarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));
        plElipse.add(lbEa, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 90, 30));

        lbEarea1.setText("Area");
        plElipse.add(lbEarea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));
        plElipse.add(lbEp, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 90, 30));

        btEasignar.setText("Asignar");
        btEasignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEasignarActionPerformed(evt);
            }
        });
        plElipse.add(btEasignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lbEMover.setText("Mover");
        plElipse.add(lbEMover, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        lbE5.setText("X");
        plElipse.add(lbE5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 20, 20));

        lbE6.setText("Y");
        plElipse.add(lbE6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        tfExm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfExmActionPerformed(evt);
            }
        });
        plElipse.add(tfExm, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 50, -1));

        tfEym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEymActionPerformed(evt);
            }
        });
        plElipse.add(tfEym, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 50, -1));

        btEm.setText("Mover");
        btEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmActionPerformed(evt);
            }
        });
        plElipse.add(btEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        getContentPane().add(plElipse, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 470, 250));

        plRectangulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbRcx.setText("X");
        plRectangulo.add(lbRcx, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 20, -1));

        lbRcY.setText("Y");
        plRectangulo.add(lbRcY, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 10, -1));
        plRectangulo.add(tfRcx, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 50, -1));
        plRectangulo.add(tfRcy, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 50, -1));

        lbRcl1.setText("Lado 1");
        plRectangulo.add(lbRcl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        lbRcl2.setText("Lado 2");
        plRectangulo.add(lbRcl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        tfRcl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRcl1ActionPerformed(evt);
            }
        });
        plRectangulo.add(tfRcl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 50, -1));

        tfRcl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRcl2ActionPerformed(evt);
            }
        });
        plRectangulo.add(tfRcl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 50, -1));

        btRcAsignar.setText("Asignar");
        btRcAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRcAsignarActionPerformed(evt);
            }
        });
        plRectangulo.add(btRcAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 80, 30));

        lbRcArea.setText("Área");
        plRectangulo.add(lbRcArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 40, 30));
        plRectangulo.add(lbRcRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 100, 30));

        lbRcPerimetro.setText("Perímetro");
        plRectangulo.add(lbRcPerimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));
        plRectangulo.add(lbRcRp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 90, 30));

        lbRcMover.setText("Mover");
        plRectangulo.add(lbRcMover, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 194, -1, 20));

        lbRcx1.setText("X");
        plRectangulo.add(lbRcx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        lbRcY1.setText("Y");
        plRectangulo.add(lbRcY1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 10, -1));
        plRectangulo.add(tfRcMx, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 50, -1));

        tfRcMy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRcMyActionPerformed(evt);
            }
        });
        plRectangulo.add(tfRcMy, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 50, -1));

        btMoverRc.setText("Mover");
        btMoverRc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMoverRcActionPerformed(evt);
            }
        });
        plRectangulo.add(btMoverRc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        getContentPane().add(plRectangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 520, 230));

        plTriangulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTp1.setText("Punto 1");
        plTriangulo.add(lbTp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lbTp2.setText("Punto 2");
        plTriangulo.add(lbTp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        lbTp3.setText("Punto 3");
        plTriangulo.add(lbTp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        lbT1.setText("X");
        plTriangulo.add(lbT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 20, -1));

        lbT2.setText("Y");
        plTriangulo.add(lbT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 20, -1));

        tfP1.setText("1");
        plTriangulo.add(tfP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 50, -1));

        tfP2.setText("1");
        plTriangulo.add(tfP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 50, -1));

        tfP3.setText("8");
        plTriangulo.add(tfP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 50, -1));

        tfP4.setText("1");
        plTriangulo.add(tfP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 50, -1));

        tfP5.setText("4");
        tfP5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfP5ActionPerformed(evt);
            }
        });
        plTriangulo.add(tfP5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 50, -1));

        tfP6.setText("5");
        plTriangulo.add(tfP6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 50, -1));

        btTAsignar.setText("Asignar");
        btTAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTAsignarActionPerformed(evt);
            }
        });
        plTriangulo.add(btTAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        lbTArea.setText("Área");
        plTriangulo.add(lbTArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));
        plTriangulo.add(lbTRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 80, 30));

        lbTp.setText("Perímetro");
        plTriangulo.add(lbTp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));
        plTriangulo.add(lbTRp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 80, 30));

        lbMT.setText("Mover");
        plTriangulo.add(lbMT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        lbT3.setText("X");
        plTriangulo.add(lbT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 20, -1));

        lbT4.setText("Y");
        plTriangulo.add(lbT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 20, -1));
        plTriangulo.add(tfP7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 50, -1));
        plTriangulo.add(tfP8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 50, -1));

        btTAsignar1.setText("Mover");
        btTAsignar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTAsignar1ActionPerformed(evt);
            }
        });
        plTriangulo.add(btTAsignar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        getContentPane().add(plTriangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 500, 260));

        btSalir.setText("SALIR");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCircunferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCircunferenciaActionPerformed
        plRecta.setVisible(false);
        plRectangulo.setVisible(false);
        plCuadrado.setVisible(false);
        plCircunferencia.setVisible(true);
        plTriangulo.setVisible(false);
        plElipse.setVisible(false);
    }//GEN-LAST:event_btCircunferenciaActionPerformed

    private void btRecta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRecta1ActionPerformed
        plRecta.setVisible(true);
        plRectangulo.setVisible(false);
        plCuadrado.setVisible(false);
        plCircunferencia.setVisible(false);
        plTriangulo.setVisible(false);
        plElipse.setVisible(false);
    }//GEN-LAST:event_btRecta1ActionPerformed

    private void btCuadrado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCuadrado1ActionPerformed
        plRecta.setVisible(false);
        plRectangulo.setVisible(false);
        plCuadrado.setVisible(true);
        plCircunferencia.setVisible(false);
        plTriangulo.setVisible(false);
        plElipse.setVisible(false);


    }//GEN-LAST:event_btCuadrado1ActionPerformed

    private void btRectangulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRectangulo1ActionPerformed
        plRecta.setVisible(false);
        plRectangulo.setVisible(true);
        plCuadrado.setVisible(false);
        plCircunferencia.setVisible(false);
        plTriangulo.setVisible(false);
        plElipse.setVisible(false);
    }//GEN-LAST:event_btRectangulo1ActionPerformed

    private void btElipse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btElipse1ActionPerformed
        plRecta.setVisible(false);
        plRectangulo.setVisible(false);
        plCuadrado.setVisible(false);
        plCircunferencia.setVisible(false);
        plTriangulo.setVisible(false);
        plElipse.setVisible(true);
    }//GEN-LAST:event_btElipse1ActionPerformed

    private void btTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTrianguloActionPerformed
        plRecta.setVisible(false);
        plRectangulo.setVisible(false);
        plCuadrado.setVisible(false);
        plCircunferencia.setVisible(false);
        plTriangulo.setVisible(true);
        plElipse.setVisible(false);
    }//GEN-LAST:event_btTrianguloActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        JOptionPane.showMessageDialog(null, "Hasta la proxima");
        System.exit(0);
    }//GEN-LAST:event_btSalirActionPerformed

    private void tfX1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfX1ActionPerformed

    }//GEN-LAST:event_tfX1ActionPerformed

    private void btAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAsignarActionPerformed
        int x1, y1, x2, y2;
        double longitud;

        //Obtenemos los puntos para la recta
        if (tfX1.getText().equals("") || tfY1.getText().equals("") || tfX2.getText().equals("") || tfY2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        } else {
            x1 = Integer.parseInt(tfX1.getText());
            y1 = Integer.parseInt(tfY1.getText());
            x2 = Integer.parseInt(tfX2.getText());
            y2 = Integer.parseInt(tfY2.getText());

            if (r1 != null) {
                r1.setPunto1(x1, y1);
                r1.setPunto2(x2, y2);
            } else {
                Punto punto1 = new Punto(x1, y1);
                Punto punto2 = new Punto(x2, y2);
                r1 = new Recta(punto1, punto2);
            }
            JOptionPane.showMessageDialog(null, "Datos asignados");

            longitud = r1.calcularLongitud();
            lbResultado.setText(String.valueOf(longitud) + " metros");
        }
    }//GEN-LAST:event_btAsignarActionPerformed

    private void btAsignar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAsignar1ActionPerformed
        if (tfX1.getText().equals("") || tfY1.getText().equals("") || tfX2.getText().equals("") || tfY2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        } else {
            r1.moverFigura(Integer.parseInt(tfXmover.getText()), Integer.parseInt(tfYmover.getText()));

            tfX1.setText(String.valueOf(r1.getPunto1().getX()));
            tfY1.setText(String.valueOf(r1.getPunto1().getY()));
            tfX2.setText(String.valueOf(r1.getPunto2().getX()));
            tfY2.setText(String.valueOf(r1.getPunto2().getY()));
        }
    }//GEN-LAST:event_btAsignar1ActionPerformed

    private void btAsignar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAsignar3ActionPerformed
        int x, y;
        double radio;

        if ("".equals(tfCentro1.getText()) || "".equals(tfCentro2.getText()) || "".equals(tfRadio.getText())) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        } else {
            x = Integer.parseInt(tfCentro1.getText());
            y = Integer.parseInt(tfCentro2.getText());
            radio = Integer.parseInt(tfRadio.getText());

            if (radio > 0) {
                if (c1 != null) {
                    c1.setCentro(x, y);
                    c1.setRadio(radio);
                } else {
                    Punto centro = new Punto(x, y);
                    c1 = new Circunferencia(radio, centro);
                }
                JOptionPane.showMessageDialog(null, "Datos asignados");

                lbArea1.setText(String.valueOf(c1.calcularArea()));
                lbPerimetro1.setText(String.valueOf(c1.calcularPerimetro() * 1.000));
            } else {
                JOptionPane.showMessageDialog(null, "El radio debe ser mayor a 0");
            }
        }
    }//GEN-LAST:event_btAsignar3ActionPerformed

    private void btAsignar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAsignar4ActionPerformed
        if ("".equals(tfCentro1.getText()) || "".equals(tfCentro2.getText()) || "".equals(tfRadio.getText())) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        } else {
            c1.moverFigura(Integer.parseInt(tfCMoverX.getText()), Integer.parseInt(tfCMoverY.getText()));

            tfCentro1.setText(String.valueOf(c1.getCentro().getX()));
            tfCentro2.setText(String.valueOf(c1.getCentro().getY()));
            tfRadio.setText(String.valueOf(c1.getRadio()));
        }
    }//GEN-LAST:event_btAsignar4ActionPerformed

    private void tfCdXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCdXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCdXActionPerformed

    private void tfCdYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCdYActionPerformed

    }//GEN-LAST:event_tfCdYActionPerformed

    private void tfCdLadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCdLadoActionPerformed

    }//GEN-LAST:event_tfCdLadoActionPerformed

    private void btAsignarCdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAsignarCdActionPerformed
        int x, y;
        double lado;

        if (tfCdX.getText().equals("") || tfCdY.getText().equals("") || tfCdLado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete los recuadros vacios");
        } else {
            x = Integer.parseInt(tfCdX.getText());
            y = Integer.parseInt(tfCdY.getText());
            lado = Double.parseDouble(tfCdLado.getText());

            if (lado > 0) {
                if (cd != null) {
                    cd.setCentro(x, y);
                    cd.setLado(lado);
                } else {
                    Punto centro = new Punto(x, y);
                    cd = new Cuadrado(lado, centro);
                }

                JOptionPane.showMessageDialog(null, "Datos asignados");

                lbRcd1.setText(String.valueOf(cd.calcularArea()));
                lbRcd2.setText(String.valueOf(cd.calcularPerimetro()));
            } else {
                JOptionPane.showMessageDialog(null, "El lado debe se mayor a 0");
            }
        }
    }//GEN-LAST:event_btAsignarCdActionPerformed

    private void tfMCdxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMCdxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMCdxActionPerformed

    private void tfMCdyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMCdyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMCdyActionPerformed

    private void btMoverCdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMoverCdActionPerformed
        if (tfMCdx.getText().equals("") || tfMCdy.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Asigne un valor en los recuadros vacios");
        } else {

            cd.moverFigura(Integer.parseInt(tfMCdx.getText()), Integer.parseInt(tfMCdy.getText()));

            tfCdX.setText(String.valueOf(cd.getCentro().getX()));
            tfCdY.setText(String.valueOf(cd.getCentro().getY()));
        }
    }//GEN-LAST:event_btMoverCdActionPerformed

    private void tfRcl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRcl1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRcl1ActionPerformed

    private void tfRcl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRcl2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRcl2ActionPerformed

    private void btRcAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRcAsignarActionPerformed
        int x, y;
        double lado1, lado2;

        if (tfRcx.getText().equals("") || tfRcy.getText().equals("") || tfRcl1.getText().equals("")
                || tfRcl2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete los recuadros vacios");
        } else {
            x = Integer.parseInt(tfRcx.getText());
            y = Integer.parseInt(tfRcy.getText());

            lado1 = Double.parseDouble(tfRcl1.getText());
            lado2 = Double.parseDouble(tfRcl2.getText());

            if (lado1 > 0 && lado2 > 0) {
                if (rt == null) {
                    Punto centro = new Punto(x, y);

                    rt = new Rectangulo(lado1, lado2, centro);
                } else {
                    rt.setCentro(x, y);
                    rt.setLado1(lado1);
                    rt.setLado2(lado2);
                }

                JOptionPane.showMessageDialog(null, "Datos asignados");

                lbRcRa.setText(String.valueOf(rt.calcularArea()));
                lbRcRp.setText(String.valueOf(rt.calcularPerimetro()));
            } else {
                JOptionPane.showMessageDialog(null, "El valor de cada lado debe mayor a 0");
            }
        }

    }//GEN-LAST:event_btRcAsignarActionPerformed

    private void tfRcMyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRcMyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRcMyActionPerformed

    private void btMoverRcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMoverRcActionPerformed
        if (tfRcMx.getText().equals("") || tfRcMy.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete los recuadros vacios");
        } else {
            rt.moverFigura(Integer.parseInt(tfRcMx.getText()), Integer.parseInt(tfRcMy.getText()));

            tfRcx.setText(String.valueOf(rt.getCentro().getX()));
            tfRcy.setText(String.valueOf(rt.getCentro().getY()));

        }
    }//GEN-LAST:event_btMoverRcActionPerformed

    private void btTAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTAsignarActionPerformed
        int x1, x2, x3, y1, y2, y3;

        if (tfP1.getText().equals("") || tfP2.getText().equals("") || tfP3.getText().equals("")
                || tfP4.getText().equals("") || tfP5.getText().equals("") || tfP6.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete los recuadros vacios");
        } else {
            x1 = Integer.parseInt(tfP1.getText());
            x2 = Integer.parseInt(tfP3.getText());
            x3 = Integer.parseInt(tfP5.getText());

            y1 = Integer.parseInt(tfP2.getText());
            y2 = Integer.parseInt(tfP4.getText());
            y3 = Integer.parseInt(tfP6.getText());

            if (tr == null) {
                Punto punto1 = new Punto(x1, y1);
                Punto punto2 = new Punto(x2, y2);
                Punto punto3 = new Punto(x3, y3);

                tr = new Triangulo(punto1, punto2, punto3);
            } else {
                tr.setPunto1(x1, y1);
                tr.setPunto2(x2, y2);
                tr.setPunto3(x3, y3);
            }

            JOptionPane.showMessageDialog(null, "Datos asignados");

            lbTRa.setText(String.valueOf(tr.calcularArea()));
            lbTRp.setText(String.valueOf(tr.calcularPerimetro()));
        }
    }//GEN-LAST:event_btTAsignarActionPerformed

    private void tfP5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfP5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfP5ActionPerformed

    private void btTAsignar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTAsignar1ActionPerformed
        if (tfP7.getText().equals("") || tfP8.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete los recuadros vacios");
        } else {
            tr.moverFigura(Integer.parseInt(tfP7.getText()), Integer.parseInt(tfP8.getText()));

            tfP1.setText(String.valueOf(tr.getPunto1().getX()));
            tfP3.setText(String.valueOf(tr.getPunto2().getX()));
            tfP5.setText(String.valueOf(tr.getPunto3().getX()));

            tfP2.setText(String.valueOf(tr.getPunto1().getY()));
            tfP4.setText(String.valueOf(tr.getPunto2().getY()));
            tfP6.setText(String.valueOf(tr.getPunto3().getY()));
        }
    }//GEN-LAST:event_btTAsignar1ActionPerformed

    private void tfejeMyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfejeMyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfejeMyActionPerformed

    private void tfejeMnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfejeMnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfejeMnActionPerformed

    private void tfExmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfExmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfExmActionPerformed

    private void tfEymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEymActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEymActionPerformed

    private void btEasignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEasignarActionPerformed
        int x, y;
        double ejeMayor, ejeMenor;

        if (tfEx.getText().equals("") || tfEy.getText().equals("") || tfejeMy.getText().equals("") || tfejeMn.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete los recuadros vacios");
        } else {
            ejeMayor = Double.parseDouble(tfejeMy.getText());
            ejeMenor = Double.parseDouble(tfejeMn.getText());

            x = Integer.parseInt(tfEx.getText());
            y = Integer.parseInt(tfEx.getText());

            if (ejeMayor > 0 && ejeMenor > 0) {
                if (el == null) {
                    Punto centro = new Punto(x, y);
                    el = new Elipse(ejeMayor, ejeMenor, centro);
                } else {
                    el.setEjeMayor(ejeMayor);
                    el.setCentro(x, y);
                    el.setEjeMenor(ejeMenor);
                }

                JOptionPane.showMessageDialog(null, "Datos asignados");

                lbEa.setText(String.valueOf(el.calcularArea()));
                lbEp.setText(String.valueOf(el.calcularPerimetro()));
            } else {
                JOptionPane.showMessageDialog(null, "El valor del eje mayor y eje menor tiene que ser mayor a 0");
            }
        }
    }//GEN-LAST:event_btEasignarActionPerformed

    private void btEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmActionPerformed
        if (tfExm.getText().equals("") || tfEym.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete los recuadros vacios");
        } else {
            el.moverFigura(Integer.parseInt(tfExm.getText()), Integer.parseInt(tfEym.getText()));

            tfEx.setText(String.valueOf(el.getCentro().getX()));
            tfEy.setText(String.valueOf(el.getCentro().getY()));
        }
    }//GEN-LAST:event_btEmActionPerformed

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
            java.util.logging.Logger.getLogger(FigurasApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FigurasApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FigurasApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FigurasApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FigurasApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAsignar;
    private javax.swing.JButton btAsignar1;
    private javax.swing.JButton btAsignar3;
    private javax.swing.JButton btAsignar4;
    private javax.swing.JButton btAsignarCd;
    private javax.swing.JButton btCircunferencia;
    private javax.swing.JButton btCuadrado1;
    private javax.swing.JButton btEasignar;
    private javax.swing.JButton btElipse1;
    private javax.swing.JButton btEm;
    private javax.swing.JButton btMoverCd;
    private javax.swing.JButton btMoverRc;
    private javax.swing.JButton btRcAsignar;
    private javax.swing.JButton btRecta1;
    private javax.swing.JButton btRectangulo1;
    private javax.swing.JButton btSalir;
    private javax.swing.JButton btTAsignar;
    private javax.swing.JButton btTAsignar1;
    private javax.swing.JButton btTriangulo;
    private javax.swing.JLabel lbArea;
    private javax.swing.JLabel lbArea1;
    private javax.swing.JLabel lbAreaCd;
    private javax.swing.JLabel lbCCentro;
    private javax.swing.JLabel lbCLado;
    private javax.swing.JLabel lbCMover;
    private javax.swing.JLabel lbCX;
    private javax.swing.JLabel lbCY;
    private javax.swing.JLabel lbCentro;
    private javax.swing.JLabel lbE;
    private javax.swing.JLabel lbE1;
    private javax.swing.JLabel lbE2;
    private javax.swing.JLabel lbE3;
    private javax.swing.JLabel lbE4;
    private javax.swing.JLabel lbE5;
    private javax.swing.JLabel lbE6;
    private javax.swing.JLabel lbEMover;
    private javax.swing.JLabel lbEa;
    private javax.swing.JLabel lbEarea;
    private javax.swing.JLabel lbEarea1;
    private javax.swing.JLabel lbEp;
    private javax.swing.JLabel lbLongitud;
    private javax.swing.JLabel lbMT;
    private javax.swing.JLabel lbMcdx;
    private javax.swing.JLabel lbMcdy;
    private javax.swing.JLabel lbMover;
    private javax.swing.JLabel lbMoverCd;
    private javax.swing.JLabel lbPerimetro;
    private javax.swing.JLabel lbPerimetro1;
    private javax.swing.JLabel lbPerimetroCd;
    private javax.swing.JLabel lbPunto1;
    private javax.swing.JLabel lbPunto2;
    private javax.swing.JLabel lbRadio;
    private javax.swing.JLabel lbRcArea;
    private javax.swing.JLabel lbRcMover;
    private javax.swing.JLabel lbRcPerimetro;
    private javax.swing.JLabel lbRcRa;
    private javax.swing.JLabel lbRcRp;
    private javax.swing.JLabel lbRcY;
    private javax.swing.JLabel lbRcY1;
    private javax.swing.JLabel lbRcd1;
    private javax.swing.JLabel lbRcd2;
    private javax.swing.JLabel lbRcl1;
    private javax.swing.JLabel lbRcl2;
    private javax.swing.JLabel lbRcx;
    private javax.swing.JLabel lbRcx1;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JLabel lbT1;
    private javax.swing.JLabel lbT2;
    private javax.swing.JLabel lbT3;
    private javax.swing.JLabel lbT4;
    private javax.swing.JLabel lbTArea;
    private javax.swing.JLabel lbTRa;
    private javax.swing.JLabel lbTRp;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTp;
    private javax.swing.JLabel lbTp1;
    private javax.swing.JLabel lbTp2;
    private javax.swing.JLabel lbTp3;
    private javax.swing.JLabel lbX1;
    private javax.swing.JLabel lbX11;
    private javax.swing.JLabel lbX12;
    private javax.swing.JLabel lbX2;
    private javax.swing.JLabel lbX3;
    private javax.swing.JLabel lbY1;
    private javax.swing.JLabel lbY11;
    private javax.swing.JLabel lbY12;
    private javax.swing.JLabel lbY2;
    private javax.swing.JLabel lbY3;
    private javax.swing.JPanel plCircunferencia;
    private javax.swing.JPanel plCuadrado;
    private javax.swing.JPanel plElipse;
    private javax.swing.JPanel plRecta;
    private javax.swing.JPanel plRectangulo;
    private javax.swing.JPanel plTriangulo;
    private javax.swing.JTextField tfCMoverX;
    private javax.swing.JTextField tfCMoverY;
    private javax.swing.JTextField tfCdLado;
    private javax.swing.JTextField tfCdX;
    private javax.swing.JTextField tfCdY;
    private javax.swing.JTextField tfCentro1;
    private javax.swing.JTextField tfCentro2;
    private javax.swing.JTextField tfEx;
    private javax.swing.JTextField tfExm;
    private javax.swing.JTextField tfEy;
    private javax.swing.JTextField tfEym;
    private javax.swing.JTextField tfMCdx;
    private javax.swing.JTextField tfMCdy;
    private javax.swing.JTextField tfP1;
    private javax.swing.JTextField tfP2;
    private javax.swing.JTextField tfP3;
    private javax.swing.JTextField tfP4;
    private javax.swing.JTextField tfP5;
    private javax.swing.JTextField tfP6;
    private javax.swing.JTextField tfP7;
    private javax.swing.JTextField tfP8;
    private javax.swing.JTextField tfRadio;
    private javax.swing.JTextField tfRcMx;
    private javax.swing.JTextField tfRcMy;
    private javax.swing.JTextField tfRcl1;
    private javax.swing.JTextField tfRcl2;
    private javax.swing.JTextField tfRcx;
    private javax.swing.JTextField tfRcy;
    private javax.swing.JTextField tfX1;
    private javax.swing.JTextField tfX2;
    private javax.swing.JTextField tfXmover;
    private javax.swing.JTextField tfY1;
    private javax.swing.JTextField tfY2;
    private javax.swing.JTextField tfYmover;
    private javax.swing.JTextField tfejeMn;
    private javax.swing.JTextField tfejeMy;
    // End of variables declaration//GEN-END:variables
}
