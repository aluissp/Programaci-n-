package Bloque5;

public class Ejercicio7 {

    public static void main(String[] args) {
        int[][] matriz = new int[6][6];
        int[][] matriz2 = new int[9][9];

        //Matriz 1
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (x == 0 && y < matriz.length) {//Arriba
                    matriz[x][y] = 1;
                } else if (x < matriz.length - 1) {//Medio
                    if (x < matriz.length - 1 && y == 0) {
                        matriz[x][y] = 1;
                    } else if (y < matriz.length - 1) {
                        matriz[x][y] = 0;
                    } else {
                        matriz[x][y] = 1;
                    }
                } else {//Bajo
                    matriz[x][y] = 1;
                }
            }
        }

        //Matriz 2
        for (int x = 0; x < matriz2.length; x++) {
            for (int y = 0; y < matriz2[x].length; y++) {
                if (x == 0 || x == matriz2.length - 1) {//Delimita filas borde
                    matriz2[x][y] = 1;
                } else if (y == 0 || y == matriz2.length - 1) {//Delimita columna borde
                    matriz2[x][y] = 1;
                } else {//Conjunto de a dentro
                    matriz2[x][y] = 0;
                }
            }
        }
        System.out.println("Marco 1\n");
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + "   ");
            }
            System.out.println();
        }
        
        System.out.println("\nMarco 2\n");
        for (int x = 0; x < matriz2.length; x++) {
            for (int y = 0; y < matriz2[x].length; y++) {
                System.out.print(matriz2[x][y] + "   ");
            }
            System.out.println();
        }
    }
}
