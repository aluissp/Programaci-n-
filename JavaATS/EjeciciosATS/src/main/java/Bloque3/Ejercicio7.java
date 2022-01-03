package Bloque3;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num, contador = 0, suma = 0;

        System.out.println("Digite un valor entero");
        num = sc.nextDouble();

        while (num >= 0) {
            suma += num;
            System.out.println("Digite un numero entero");
            num = sc.nextInt();
            contador++;

        }
        System.out.println();

        if (contador == 0) {
            System.out.println("La divicion entre 0 no esta definido");
        } else {
            System.out.println("La media aritmetica es: " + (suma / contador));
        }
    }
}
