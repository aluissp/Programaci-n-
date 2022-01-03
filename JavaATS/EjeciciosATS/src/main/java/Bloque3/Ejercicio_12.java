package Bloque3;

import java.util.Scanner;

public class Ejercicio_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, resultado = 1;

        System.out.println("Digite un numero");
        numero = sc.nextInt();

        if (numero > 0) {
            for (int i = 1; i <= numero; i++) {
                resultado *= i;
            }
        } else {
            System.out.println("Error debe ingresar un numero mayor a 0");
        }
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}
