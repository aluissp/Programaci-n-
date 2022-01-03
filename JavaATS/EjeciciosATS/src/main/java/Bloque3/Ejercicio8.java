package Bloque3;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite un numero");
        numero = sc.nextInt();
        System.out.println();

        if (numero <= 0) {
            for (int i = 1; i >= numero; i--) {
                System.out.println(i);
            }
        } else if (numero > 0) {
            for (int i = 1; i <= numero; i++) {
                System.out.println(i);
            }
        }

    }
}
