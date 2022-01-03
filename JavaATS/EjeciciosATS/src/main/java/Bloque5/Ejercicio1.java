package Bloque5;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][];
        int fila, columna;
        boolean simetrica = true;

        System.out.println("Digite el numero de filas");
        fila = sc.nextInt();
        System.out.println("\nDigite el numero de columnas");
        columna = sc.nextInt();
        matriz = new int[fila][columna];

        System.out.println("\nLlene una matriz");
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.println("Valor [" + x + "] [" + y + "]");
                matriz[x][y] = sc.nextInt();
            }
        }

        if (fila == columna) {
            int x, y;
            x = 0;
            while (x < fila && simetrica == true) {
                y = 0;
                while (y < columna && simetrica == true) {
                    if (matriz[x][y] != matriz[y][x]) {
                        simetrica = false;
                    }
                    y++;
                }
                x++;
            }

            if (simetrica == true) {
                System.out.println("\nLa matriz es simetrica");
            } else {
                System.out.println("\nLa matriz no es simetrica");
            }

        } else {
            System.out.println("\nLa matriz no es simetrica");
        }
    }
}
