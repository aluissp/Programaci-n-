package Bloque3;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite un numero");
        num = sc.nextInt();
        System.out.println();

        while (num != 0) {
            if (num > 0) {
                System.out.println("El valor ingresado es positivo\n");
            } else {
                System.out.println("El valor ingresado es negativo\n");
            }

            System.out.println("Digite un numero");
            num = sc.nextInt();
        }

    }
}
