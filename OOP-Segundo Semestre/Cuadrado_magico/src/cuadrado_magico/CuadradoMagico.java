/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado_magico;

import javax.swing.JTextField;

/**
 *
 * @author Kevin
 */
public class CuadradoMagico {

    private int tamaño;
    private int[][] arre;

    public CuadradoMagico(int tamaño) {
        this.tamaño = tamaño;

        arre = new int[tamaño][];
        for (int i = 0; i < arre.length; i++) {
            arre[i] = new int[tamaño];
        }
        arre[0][tamaño / 2] = 1;
        int fi = 0;
        int col = tamaño / 2;
        for (int i = 2; i < tamaño * tamaño + 1; i++) {
            fi--;
            col++;
            if (fi == -1) {
                fi = tamaño - 1;
            }
            if (col == tamaño) {
                col = 0;
            }
            arre[fi][col] = i;
            if (i % tamaño == 0) {
                fi += 2;
                col--;
            }
        }

    }

    public int getTamaño() {
        return this.tamaño;
    }

    public int getValor(int filas, int columnas) {
        return arre[filas][columnas];
    }

    public void Crear_Cuadrado(JTextField[][] matriz) {

        matriz[0][tamaño / 2].setText(getValor(0, tamaño / 2) + " ");
        matriz[0][tamaño / 2].update(matriz[0][tamaño / 2].getGraphics());
        try {
            Thread.sleep(500);

        } catch (InterruptedException e) {
        }
        int fi = 0;
        int col = tamaño / 2;
        for (int i = 2; i < tamaño * tamaño + 1; i++) {
            fi--;
            col++;
            if (fi == -1) {
                fi = tamaño - 1;
            }
            if (col == tamaño) {
                col = 0;
            }

            matriz[fi][col].setText(getValor(fi, col) + " ");
            matriz[fi][col].update(matriz[fi][col].getGraphics());

            if (i % tamaño == 0) {
                fi += 2;
                col--;
            }
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
            }

        }

    }

    public void Imprimir() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(arre[i][j] + "\t");
            }
            System.out.println("");
        }

    }

}
