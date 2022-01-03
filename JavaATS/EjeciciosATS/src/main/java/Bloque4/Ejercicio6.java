package Bloque4;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[12];
        int[] b = new int[12];
        int[] c = new int[(a.length + b.length)];
        int cont = 2, j = 0, k = 0, i = 0;

        System.out.println("Digite los valores del arreglo A");
        for (int i1 = 0; i1 < a.length; i1++) {
            System.out.println("Valor " + (i1 + 1));
            a[i1] = sc.nextInt();
        }
        System.out.println();

        System.out.println("Digite los valores del arreglo B");
        for (int i2 = 0; i2 < b.length; i2++) {
            System.out.println("Valor " + (i2 + 1));
            b[i2] = sc.nextInt();
        }
        System.out.println();

        while (i < c.length) {
            while (i <= cont) {
                c[i] = a[j];
                i++;
                j++;
            }
            cont += 3;
            while (i <= cont) {

                c[i] = b[k];
                i++;
                k++;
            }
            cont += 3;
        }

        System.out.println("La mezcla de A y B es: ");
        for (int i3 = 0; i3 < c.length; i3++) {
            System.out.print(c[i3] + "  ");
        }
    }
}
