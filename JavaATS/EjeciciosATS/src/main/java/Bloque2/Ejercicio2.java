package Bloque2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num2;

        System.out.println("Ingrese el primer valor");
        num = sc.nextInt();
        System.out.println("Ingrese el segundo valor");
        num2 = sc.nextInt();

        if (num == num2) {
            System.out.println("Ambos numeros son iguales");
        } else if (num >= num2) {
            System.out.println("El valor mayor es " + num);
        } else {
            System.out.println("El valor mayor es " + num2);
        }
    }
}
