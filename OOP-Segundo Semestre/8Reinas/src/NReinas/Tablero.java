package NReinas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Armando Perugachi
 */
public final class Tablero implements ActionListener {

    private int[] solucionUsuario;
    private JButton[][] cuadro;
    private JComboBox jc;
    private JTextArea txtArea;
    NReinas reinas = new NReinas(8);

    public Tablero(JPanel j1, JComboBox jc, JTextArea txtArea) {
        this.jc = jc;
        this.txtArea = txtArea;
        cuadro = new JButton[8][8];
        solucionUsuario = new int[8];
        reinas.buscarSoluciones();
        CrearTablero(j1);
        ColorearCuadro();
        AgregarEvento();
        activarTablero(false);
        CargarSoluciones();
    }

    private void CrearTablero(JPanel j1) {
        int x = 5;
        int y = 5;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cuadro[i][j] = new JButton();
                cuadro[i][j].setBounds(x, y, 50, 50);
                cuadro[i][j].setVisible(true);
                x += 50;
                j1.add(cuadro[i][j]);
            }
            x = 5;
            y += 50;
        }
    }

    private void ColorearCuadro() {
        boolean aux = true;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (aux) {
                    cuadro[i][j].setBackground(Color.WHITE);
                } else {
                    cuadro[i][j].setBackground(Color.BLACK);
                }
                aux = !aux;
            }
            solucionUsuario[i] = -1;// Reinicia las solucion de usuario
            aux = !aux;
        }
    }

    private void MarcarReina(int x, int y) {
        cuadro[x][y].setBackground(Color.PINK);

        solucionUsuario[y] = x;
        System.out.println("x: " + y + " y: " + x);
    }

    private void AgregarEvento() {
//        Recorre todo el array de botones para agregarle un evento
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                this.cuadro[i][j].addActionListener(this);
            }
        }

        jc.addActionListener(this); // Añadimos el evento al combo box
    }

    private void CargarSoluciones() {
        ArrayList s = (ArrayList) reinas.getSoluciones();
        for (int i = 0; i < s.size(); i++) {
            int[] aux = (int[]) s.get(i);
            jc.addItem(new SolucionNReinas(aux, (i + 1)));
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jc && !jc.getSelectedItem().toString().equals("Soluciones")) {
            ColorearCuadro();//Refresca el tablero
            this.solucionUsuario = ((SolucionNReinas) jc.getSelectedItem()).getSolucion().clone();
            for (int i = 0; i < solucionUsuario.length; i++) {
                cuadro[solucionUsuario[i]][i].setBackground(Color.PINK);
            }
            this.txtArea.setText("La solucion es:\n" + ((SolucionNReinas) jc.getSelectedItem()).mostrarSolucion());

        } else {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {

                    if (e.getSource() == cuadro[i][j]) {
                        for (int k = 0; k < 8; k++) {
                            if (cuadro[k][j].getBackground() == Color.PINK) {
                                int posicion = k - 1;
                                if (posicion < 0) {
                                    posicion = 7;
                                }
                                if (cuadro[posicion][j].getBackground() == Color.BLACK) {
                                    cuadro[k][j].setBackground(Color.WHITE);
                                } else {
                                    cuadro[k][j].setBackground(Color.BLACK);
                                }
                            }
                        }
                        MarcarReina(i, j);
                        i = 8;
                        j = 8;

                    }
                }
            }
        }
    }

    public boolean comprobarSolucion() {
        boolean valido = false;
        int[] aux;
        ArrayList soluciones = (ArrayList) reinas.getSoluciones();
        for (int i = 0; i < soluciones.size(); i++) {
            aux = (int[]) soluciones.get(i);
//            for (int j = 0; j < aux.length; j++) {
//                System.out.println(aux[j]);
//            }
            valido = sonIguales(this.solucionUsuario, aux);
            if (valido) {
                return valido;
            }
        }
        return valido;
    }

    public void Reiniciar() {
        ColorearCuadro();
    }

    public boolean sonIguales(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        boolean flag = true;
        while ((i < a.length) && (j < b.length)) {
            if (a[i] != b[j]) {
                return false;
            }
            i++;
            j++;
        }
        return flag;
    }

    public void activarTablero(boolean a) {
        for (int i = 0; i < cuadro.length; i++) {
            for (int j = 0; j < cuadro[i].length; j++) {
                cuadro[i][j].setEnabled(a);
            }
        }
    }

    public int[] getSolucionUsuario() {
        return solucionUsuario;
    }

}
