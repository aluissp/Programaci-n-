package Bloque5;

import java.util.Random;

public class Ejercicio3 {

    public static void main(String[] args) {
        Random rd = new Random();
        int[][] matriz = new int[3][3];
        int aux;

        System.out.println("Matriz\n");
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = rd.nextInt(100 - 10) + 10;
                System.out.print(matriz[x][y] + "   ");
            }
            System.out.println();
        }

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < x; y++) {
                aux = matriz[x][y];
                matriz[x][y] = matriz[y][x];
                matriz[y][x] = aux;
            }
        }

        System.out.println("\nMatriz Traspuesta\n");
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + "   ");
            }
            System.out.println();
        }
    }
}
