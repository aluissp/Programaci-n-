package Bloque2;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float horas, pagar;
        System.out.println("Cuantas horas trabajo?");
        horas = sc.nextFloat();
        System.out.println();

        if (horas <= 40) {
            pagar = horas * 16f;
        } else {
            pagar = (40f * 16f) + ((horas - 40f) * 20f);
        }
        System.out.println("Su salario semanal es: " + pagar);
    }
}
