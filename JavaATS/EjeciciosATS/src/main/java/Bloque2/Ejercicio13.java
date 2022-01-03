package Bloque2;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000, opcion, saldoAd;

        System.out.println("Bienvenido porfavor seleccione una opcion");
        System.out.println("\n1. Ingresar dinero a la cuenta \n2. Retirar dinero de la cuenta \n3. Salir");
        opcion = sc.nextDouble();

        if (opcion == 1) {

            System.out.println("Digite el valor que desea abonar");
            saldoAd = sc.nextInt();
            saldo += saldoAd;
            System.out.println("Udste ha abonado " + saldoAd + " y en total tiene " + saldo + " dolares en su cuenta");
        } else if (opcion == 2) {

            System.out.println("Digite el valor que desea retirar");
            saldoAd = sc.nextInt();

            if (saldoAd <= saldo) {
                saldo -= saldoAd;
                System.out.println("Udste ha retirado " + saldoAd + " y en total tiene " + saldo + " dolares en su cuenta");
            } else {
                System.out.println("Error, no cuenta con el saldo suficiente para su retiro ");
            }

        } else if (opcion == 3) {
            System.out.println("Gracias por preferirnos");
        } else {
            System.out.println("Error, digite una opcion disponible");
        }

    }
}
