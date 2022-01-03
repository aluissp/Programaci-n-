package Bloque5;

import java.util.Random;

public class Ejercicio6 {

    public static void main(String[] args) {
        Random rd = new Random();
        int[][] matriz = new int[5][9];
        int[][] tMatriz = new int[9][5];

        System.out.println("Matriz\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rd.nextInt(8) + 1;
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz Traspuesta\n");
        for (int i = 0; i < tMatriz.length; i++) {
            for (int j = 0; j < tMatriz[i].length; j++) {
                tMatriz[i][j] = matriz[j][i];
                System.out.print(tMatriz[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
