package Bloque2;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        System.out.println("Porfavor digite la nota entre 0-10");
        nota = sc.nextDouble();

        if (nota >= 0 && nota <= 4) {
            System.out.println("Su nota es insuficiente");
        } else if (nota == 5) {
            System.out.println("Su nota es suficiente");
        } else if (nota == 6) {
            System.out.println("Su nota es buena");
        } else if (nota >= 7 && nota <= 8) {
            System.out.println("Su nota es notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Su nota es sobresaliente");
        } else {
            System.out.println("Error, ingrese un valor dentro del rango 0-10");
        }
    }
}
