package Bloque5;

public class Ejercicio4 {

    public static void main(String[] args) {
        int[][] matrizIdentidad = new int[7][7];

        System.out.println("Matriz Identidad\n");
        for (int x = 0; x < matrizIdentidad.length; x++) {
            for (int y = 0; y < matrizIdentidad[x].length; y++) {
                if (x == y) {
                    matrizIdentidad[x][y] = 1;
                } else {
                    matrizIdentidad[x][y] = 0;
                }
                System.out.print(matrizIdentidad[x][y] + "   ");
            }
            System.out.println();
        }
    }
}
