package Arreglos;

import java.util.Scanner;

public class LlenarArreglo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nElementos;

        System.out.println("Digite la cantidad de elementos");
        nElementos = sc.nextInt();

        char[] letras = new char[nElementos];

        for (int i = 0; i < letras.length; i++) {
            System.out.println((i + 1) + ". Digite un caracter");
            letras[i] = sc.next().charAt(0);
        }
        System.out.println();

        System.out.println("Los caracteres del arreglo");

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }
    }
}
