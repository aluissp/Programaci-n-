package Bloque3;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, contador = 0;

        System.out.println("Digite un numero");
        num = sc.nextInt();
        System.out.println();

        while (num >= 0) {
            contador++;
            System.out.println("Digite otro numero");
            num = sc.nextInt();
            System.out.println();

        }
        System.out.println("Ustded a introducido " + contador + " valores positivos");
    }
}
