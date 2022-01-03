package Bloque2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double costo, desc, costoPagar;

        System.out.println("Digite el costo de su compra");
        costo = sc.nextDouble();
        System.out.println();

        if (costo > 300) {
            desc = costo * 0.2;
            costoPagar = costo - desc;
            System.out.println("Su descuento es: " + desc + " y el valor a pagar es " + costoPagar);
        } else {
            System.out.println("Usted no tiene descuento, su valor a pagar es: " + costo);
        }
    }
}
