package Bloque2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digte el valor entero");
        num = sc.nextInt();

        if (num % 10 == 0) {
            System.out.println("El valor " + num + " es multiplo de 10");
        } else {
            System.out.println(num + " no es multiplo de 10");
        }
    }

}
