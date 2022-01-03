package Bloque5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int[][] matriz;
        int suma, fila, col, aux = 0;
        System.out.println("Digite el numero de filas");
        fila = sc.nextInt();
        System.out.println("\nDigite el numero de columnas");
        col = sc.nextInt();

        matriz = new int[fila][col];

        System.out.println("Matriz\n");
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = rd.nextInt(8) + 1;
                System.out.print(matriz[x][y] + "   ");
            }
            System.out.println();
        }

        System.out.println("\nSuma de filas\n");
        for (int x = 0; x < matriz.length; x++) {
            suma = 0;
            for (int y = 0; y < matriz[x].length; y++) {
                suma += matriz[x][y];
                aux = matriz[x].length;
            }
            System.out.println("Fila " + (x + 1) + " : " + suma);
        }

        System.out.println("\nSuma de columnas\n");
        for (int x = 0; x < aux; x++) {
            suma = 0;
            for (int y = 0; y < matriz.length; y++) {
                suma += matriz[y][x];
            }
            System.out.println("Columna " + (x + 1) + " : " + suma);
        }
    }
}
