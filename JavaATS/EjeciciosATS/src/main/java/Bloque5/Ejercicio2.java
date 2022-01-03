package Bloque5;

import java.util.Random;

public class Ejercicio2 {

    public static void main(String[] args) {
        Random rd = new Random();
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] suma = new int[3][3];

        System.out.println("Matriz 1\n");
        for (int x = 0; x < matriz1.length; x++) {
            for (int y = 0; y < matriz1[x].length; y++) {
                matriz1[x][y] = rd.nextInt(25) + 10;
                System.out.print(matriz1[x][y] + "      ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz 2\n");
        for (int x = 0; x < matriz2.length; x++) {
            for (int y = 0; y < matriz2[x].length; y++) {
                matriz2[x][y] = rd.nextInt(25) + 10;
                System.out.print(matriz2[x][y] + "      ");
            }
            System.out.println();
        }

        System.out.println("\nSuma de las 2 matrices\n");
        for (int x = 0; x < matriz1.length; x++) {
            for (int y = 0; y < matriz1[x].length; y++) {
                suma[x][y] = matriz1[x][y] + matriz2[x][y];
                System.out.print(suma[x][y] + "     ");
            }
            System.out.println();
        }
    }
}
