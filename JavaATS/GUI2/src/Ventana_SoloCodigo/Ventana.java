package Ventana_SoloCodigo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Ventana extends JFrame {

    JPanel panel;
    JPanel panel2;
    JLabel saludo;
    JButton boton;
    JTextField cajaTexto;

    public Ventana() {
        this.setSize(500, 500); //Asignamos el tamaño de la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Cierra la ventana
        this.setTitle("GUI 1 :v"); //Establecemos un titulo

        //this.setLocation(450, 180); //Establecemos la posicion de la ventana
        //this.setBounds(450, 180, 500, 500); //Establecemos la posicion y tamaño de la ventana
        this.setLocationRelativeTo(null); //Establecemos la ventana en el centro
        //this.setResizable(false); //Metodo que hace si la ventana pueda cambiar de tamaño o no
        this.setMinimumSize(new Dimension(300, 300));//Método que asigna el minimo tamaño que puede tener la ventana

        //COLOR
        //this.getContentPane().setBackground(Color.lightGray); //Asignamos un color a la ventana
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        colocarPaneles();
        //colocarEtiquetas();
        //colocarBotones();
        //colocarRadioBotones();
        //colocarBotonesActivacion();
        //colocarCajaDeTexto();
        //colocarAreaDeTexto();
        //colocarCasillaVerificacion();
        //colocarListaDesplegable();
        //colocarCampoContraseña();
        //colocarTabla();
        //colocarLista();
        auxEtiquetas();
        auxBotones();
        //colocarPaneles2();
    }

    private void colocarPaneles() {
        panel = new JPanel();//Creamos un panel
        panel.setLayout(null);//Desactivamos el diseño o layout
        panel.setBackground(Color.lightGray);//Asignamos un color 
        this.getContentPane().add(panel);//Añadimos el panel a la ventana

        //Añadimos al panel un evento de movimiento
        //eventoDeMovimientoRaton();
        //Evento del la rueda del raton
        eventoRuedaRaton();
    }
    
    
    
    //----------------------------
    private void colocarPaneles2() {
        panel2 = new JPanel();//Creamos un panel
        panel2.setLayout(null);//Desactivamos el diseño o layout
        panel2.setBackground(Color.lightGray);//Asignamos un color 
        this.getContentPane().add(panel2);//Añadimos el panel a la ventana
        auxEtiquetas12();
    }
    private void auxEtiquetas12(){
        JLabel etiquetaInicio1 = new JLabel();
        etiquetaInicio1.setBounds(10, 10, 300, 35);
        etiquetaInicio1.setText("Bienvenido, digite su nombre");
        etiquetaInicio1.setFont(new Font("arial", 1, 15));
        panel2.add(etiquetaInicio1);
    }
    
////----------------------
    
    private void colocarEtiquetas() {
        //Creación de etiquetas o label, se pueden agregar texto o imagen
        JLabel etiqueta = new JLabel("Hola", SwingConstants.CENTER);// Nuevo label
        etiqueta.setOpaque(true);//Habilitamos pintar el fondo de la etiqueta

        etiqueta.setText("Hola mundo con GUI");//Añadimos texto 
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);// Establecemos la alinieacion horizontal del texto
        etiqueta.setBounds(10, 10, 150, 20);//Damos tamaño y ubicación 
        etiqueta.setForeground(Color.WHITE);//Establecemos el color de la letra 
        etiqueta.setBackground(Color.darkGray);//Establecemos el color del fondo de la etiqueta
        etiqueta.setFont(new Font("arial", Font.PLAIN, 12)); //Establecemos el tipo de letra
        panel.add(etiqueta);//Añadimos al panel

        //Agregar imagen en Jlabel
        ImageIcon imagen = new ImageIcon("meme.jpg");// Objeto tipo imagen
        JLabel etiqueta2;
        //etiqueta2 = new JLabel(new ImageIcon("meme.jpg")); //Agregamos directamente en el constructor 
        etiqueta2 = new JLabel(imagen);
        //etiqueta2.setIcon(imagen); //Agregamos la imagen por medio del metodo
        etiqueta2.setBounds(80, 80, 300, 300); //Especificamos el tamaño

        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);  //Añadimos al panel

    }

    private void colocarBotones() {
        //Boton 1 que contiene texto
        JButton boton1 = new JButton("click");//Creamos un boton
        boton1.setText("Click bro");//Establecemos un texto dentro del boton
        boton1.setBounds(100, 100, 100, 40);
        boton1.setEnabled(true);//Hablitita y deshabilita el boton                            
        boton1.setMnemonic('a');//Habilitamos  alt + letra
        boton1.setForeground(Color.BLUE);//Establecemos el color a la letra
        boton1.setFont(new Font("arial", 3, 12));//Establecemos la fuente de la letra del boton
        panel.add(boton1);

        //Boton de imagen
        ImageIcon dog = new ImageIcon("dospuntosuve.jpg");
        JButton boton2 = new JButton();
        boton2.setBounds(100, 200, 100, 40);
        boton2.setIcon(new ImageIcon(dog.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        boton2.setBackground(Color.cyan);
        panel.add(boton2);

        //Boton con borde
        JButton boton3 = new JButton();
        boton3.setBounds(100, 300, 100, 40);
        boton3.setBorder(BorderFactory.createLineBorder(Color.cyan, 3, true));
        panel.add(boton3);

    }

    private void colocarRadioBotones() {
        JRadioButton radioBoton = new JRadioButton("Opcion 1", true);
        radioBoton.setBounds(50, 100, 100, 20);
        radioBoton.setEnabled(true);
        radioBoton.setText("fackiu");
        radioBoton.setFont(new Font("arial", 0, 13));
        radioBoton.setBackground(Color.white);
        panel.add(radioBoton);

        JRadioButton radioBoton2 = new JRadioButton("Opcion 2", true);
        radioBoton2.setBounds(50, 125, 100, 20);
        panel.add(radioBoton2);

        JRadioButton radioBoton3 = new JRadioButton("Opcion 3", true);
        radioBoton3.setBounds(50, 150, 100, 20);
        panel.add(radioBoton3);

        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioBoton);
        radioGroup.add(radioBoton2);
        radioGroup.add(radioBoton3);
    }

    private void colocarBotonesActivacion() {
        JToggleButton botonesActivacion = new JToggleButton("Opcion1", true);
        botonesActivacion.setBounds(100, 100, 100, 45);
        panel.add(botonesActivacion);

        JToggleButton botonesActivacion2 = new JToggleButton("Opcion1", false);
        botonesActivacion2.setBounds(100, 150, 100, 45);
        panel.add(botonesActivacion2);

        JToggleButton botonesActivacion3 = new JToggleButton("Opcion1", false);
        botonesActivacion3.setBounds(100, 200, 100, 45);
        panel.add(botonesActivacion3);

        ButtonGroup grupoBotonesActivados = new ButtonGroup();
        grupoBotonesActivados.add(botonesActivacion);
        grupoBotonesActivados.add(botonesActivacion2);
        grupoBotonesActivados.add(botonesActivacion3);
    }

    private void colocarCajaDeTexto() {
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(70, 30, 200, 45);
        cajaTexto.setText("Unas bielas?");

        System.out.println("El texto es: " + cajaTexto.getText());
        panel.add(cajaTexto);
    }

    private void colocarAreaDeTexto() {
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20, 20, 300, 200);
        areaTexto.setText("Escriba el texto aqui...\nhola");
        areaTexto.append("\n\nmas texto amigo");
        areaTexto.setEditable(true);

        System.out.println("obtenido :v\n\n" + areaTexto.getText());
        panel.add(areaTexto);

        //Barra de desplazamiento
        JScrollPane barraDesplazamiento = new JScrollPane(areaTexto);//Pasamos como parametro a area del texto
        barraDesplazamiento.setBounds(20, 20, 300, 200);//Agregamos el scroll al area texto
        barraDesplazamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);//Establecemos la barra vertical
        barraDesplazamiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);//Establecemos la barra horizontal
        panel.add(barraDesplazamiento);
    }

    private void colocarCasillaVerificacion() {
        JCheckBox casillaVerificacion = new JCheckBox("Leche 1");
        casillaVerificacion.setBounds(20, 20, 100, 40);
        panel.add(casillaVerificacion);

        JCheckBox casillaVerificacion2 = new JCheckBox("Galleta 1", true);
        casillaVerificacion2.setBounds(20, 60, 100, 40);
        panel.add(casillaVerificacion2);

        JCheckBox casillaVerificacion3 = new JCheckBox("Yogurth 1");
        casillaVerificacion3.setBounds(20, 100, 100, 40);
        panel.add(casillaVerificacion3);

        JCheckBox casillaVerificacion4 = new JCheckBox("Cereal 1");
        casillaVerificacion4.setBounds(20, 140, 100, 40);
        panel.add(casillaVerificacion4);
    }

    private void colocarListaDesplegable() {
        /*
        String[] paices = {"Peru", "Ecuador", "Colombia", "Mexico"};
        JComboBox listaDesplegable = new JComboBox(paices);
        listaDesplegable.setBounds(20, 20, 90, 35);
        listaDesplegable.addItem("Chile");
        listaDesplegable.setSelectedItem(paices[1]);

        panel.add(listaDesplegable);*/

        Fecha f1 = new Fecha();
        Fecha f2 = new Fecha(5, 1, 2002);
        Fecha f3 = new Fecha(12, 12, 2012);
        DefaultComboBoxModel model = new DefaultComboBoxModel();//Nos ayuda a agrupar objetos
        JComboBox listaObjetos = new JComboBox(model);//Añadimos por el constructor al modelo de los objetos

        model.addElement(f1);//Añadimos los objetos al modelo
        model.addElement(f2);
        model.addElement(f3);
        listaObjetos.setBounds(20, 20, 199, 25);
        panel.add(listaObjetos);

    }

    private void colocarCampoContraseña() {
        JPasswordField campoContraseña = new JPasswordField();
        campoContraseña.setBounds(20, 20, 70, 35);
        campoContraseña.setText("hola");
        String contraseña = "";
        panel.add(campoContraseña);

        for (int i = 0; i < campoContraseña.getPassword().length; i++) {
            contraseña += campoContraseña.getPassword()[i];
        }
        System.out.println("La contrase;a es: " + contraseña);

    }

    private void colocarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Ecuador");//Agregando Columnas
        modelo.addColumn("Queso");
        modelo.addColumn("cereza");
        //Crearemos un arreglo de String para añadirlo como filas

        String[] cosas = {"arroz", "Leche", "patatas"};
        modelo.addRow(cosas);//Añadimos el arreglo para tener una fila mas 
        JTable tabla = new JTable(modelo);//Agregamos modelos a la tabla
        tabla.setBounds(20, 30, 270, 270);
        panel.add(tabla);

        JScrollPane barra = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barra.setBounds(20, 30, 270, 270);//Agregamos una barra de deslizamiento para que se visualice las filas y comlumnas en la tabl

        panel.add(barra);
    }

    private void colocarLista() {
        DefaultListModel modelo = new DefaultListModel();
        modelo.addElement(new Fecha());
        modelo.addElement(new Fecha());
        modelo.addElement(new Fecha());

        JList lista = new JList(modelo);
        lista.setBounds(20, 20, 300, 290);
        panel.add(lista);

        JScrollPane scroll = new JScrollPane(lista, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 399, 290);
        panel.add(scroll);
    }

    private void auxEtiquetas() {
        JLabel etiquetaInicio = new JLabel();
        etiquetaInicio.setBounds(10, 10, 300, 35);
        etiquetaInicio.setText("Bienvenido, digite su nombre");
        etiquetaInicio.setFont(new Font("arial", 1, 15));
        panel.add(etiquetaInicio);

        boton = new JButton();
        boton.setText("Pulsa aqui xd");
        boton.setBounds(80, 100, 150, 35);
        boton.setFont(new Font("arial", 1, 15));
        panel.add(boton);

        saludo = new JLabel();
        saludo.setBounds(200, 150, 400, 35);
        saludo.setFont(new Font("arial", 1, 15));
        panel.add(saludo);

        cajaTexto = new JTextField();
        cajaTexto.setBounds(45, 45, 100, 35);
        panel.add(cajaTexto);

        //Metodo de teclado en caja de texto
        eventoDeTeclado();
    }

    private void auxBotones() {

        //oyenteAccion();
        //oyenteRaton();
    }

    private void oyenteAccion() {
        //Estableciendo evento de tipo action listener
        ActionListener oyenteAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {//No es un evento de click
                saludo.setText("Hola " + cajaTexto.getText() + " :3");
            }
        };
        //Pasamos el evento al metodo
        boton.addActionListener(oyenteAccion);

    }

    private void oyenteRaton() {

        //Agregandp oyente de Raton
        MouseListener oyenteRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {//Presionar y soltar dentro del boton si sueltas a fuera no ocurre el evento
                //saludo.setText("Hola " + cajaTexto.getText() + ", estas haciendo presionar y soltar dentro del boton");

                if (arg0.isAltDown()) {
                    saludo.setText("Hola " + cajaTexto.getText() + ", Alt");
                } else if (arg0.isControlDown()) {
                    saludo.setText("Hola " + cajaTexto.getText() + ", ctrl");
                } else if (arg0.isShiftDown()) {
                    saludo.setText("Hola " + cajaTexto.getText() + ", shifth");
                } else if (arg0.isMetaDown()) {
                    saludo.setText("Hola " + cajaTexto.getText() + ", Click derecho");
                } else {
                    saludo.setText("Hola " + cajaTexto.getText() + ", click izquierdo");
                }

                if (arg0.getClickCount() == 2) {
                    saludo.setText("Doble click");
                }
            }

            @Override
            public void mousePressed(MouseEvent arg0) {//Solo presionas el boton y se ejecuta el metodo
                //saludo.setText("Hola " + cajaTexto.getText() + ", estas haciendo presionar");
            }

            @Override
            public void mouseReleased(MouseEvent arg0) {//Es presionar y soltar fuera o dentro
                //saludo.setText("Hola " + cajaTexto.getText() + ", estas haciendo presionar y soltar fuera o dentro");
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {//Se ejecuta con simplemente con entrar al boton
                //saludo.setText("Hola " + cajaTexto.getText() + ", estas haciendo solo entrando con el cursor");
            }

            @Override
            public void mouseExited(MouseEvent arg0) {//Se ejecuta con entar y salir del boton
                //saludo.setText("Hola " + cajaTexto.getText() + ", estas haciendo solo entrando y salir con el cursor");
            }
        };

        //agregamos el evento
        boton.addMouseListener(oyenteRaton);
    }

    private void eventoDeMovimientoRaton() {
        MouseMotionListener oyenteMovimientoRaton = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent arg0) {//Cuando damos Click y movemos el raton
                saludo.setText("MouseDraged");
            }

            @Override
            public void mouseMoved(MouseEvent arg0) {//Cuando solo movemos el mouse
                saludo.setText("MouseMoved");
            }
        };

        panel.addMouseMotionListener(oyenteMovimientoRaton);

    }

    private void eventoRuedaRaton() {

        MouseWheelListener oyenteRuedaRaton = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent me) {
                if (me.getPreciseWheelRotation() == -1) {
                    saludo.setText("Rueda hacia arriba :v");
                } else if (me.getPreciseWheelRotation() == 1) {
                    saludo.setText("Rueda hacia abajo xd");
                }
            }
        };

        panel.addMouseWheelListener(oyenteRuedaRaton);

    }

    private void eventoDeTeclado() {
        KeyListener oyenteTeclado = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent arg0) {//Ejecuta simplemente al presionar una tecla del A a la Z
                //saludo.setText("Evento key typed");
            }

            @Override
            public void keyPressed(KeyEvent arg0) {//Ejecuta cuando damos click con cualquier texto
                //saludo.setText("Evento key pressed");
            }

            @Override
            public void keyReleased(KeyEvent k) {//Ejecuta con cualquier boton del boton
                //saludo.setText("Evento key realeased");
                if (k.getKeyChar() == 't') {
                    saludo.setText("Tecla T");
                } else if (k.getKeyChar() == ' ') {
                    saludo.setText("Espacio");
                }
            }
        };

        cajaTexto.addKeyListener(oyenteTeclado);
    }
}
