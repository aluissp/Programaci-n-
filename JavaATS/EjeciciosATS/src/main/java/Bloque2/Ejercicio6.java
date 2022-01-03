package Bloque2;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Proporcione los dos valores");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println();

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Los numeros " + num1 + " y " + num2 + " son pares");
        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            System.out.println("Los numeros " + num1 + " y " + num2 + " son impares");
        } else {
            System.out.println("Un numero es par y el otro es impar");
        }
    }
}
