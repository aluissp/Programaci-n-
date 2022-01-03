package Bloque2;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        char letra;

        System.out.println("Bienvenido porfavor seleccione un ejercicio a realizar");
        System.out.println();

        System.out.println("SUMA    pulse S");
        System.out.println("RESTA   pulse R");
        System.out.println("MULTIPLICACION  pulse M");
        System.out.println("DIVICION    pulse D");
        letra = sc.nextLine().charAt(0);
        System.out.println();

        if (letra == 'S' || letra == 's') {
            System.out.println("Ingrese dos valores para sumar");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("\nLa suma es: " + (num1 + num2));
        } else if (letra == 'R' || letra == 'r') {
            System.out.println("Ingrese dos valores para restar");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("\nLa resta es: " + (num1 - num2));
        } else if (letra == 'M' || letra == 'm') {
            System.out.println("Ingrese dos valores para multiplicar");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("\nLa multiplicacion es: " + (num1 * num2));
        } else if (letra == 'D' || letra == 'd') {
            System.out.println("Ingrese dos valores para dividir");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("\nLa divicion es: " + (num1 / num2));
        }else{
            System.out.println("Error, operacion incorrecta");
        }
    }
}
