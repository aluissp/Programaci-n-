package Bloque2;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char letra;
        System.out.println("Digite la letra");
        letra = sc.next().charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("Es una letra mayuscula");
        } else {
            System.out.println("Es un letra minuscula");
        }
    }
}
