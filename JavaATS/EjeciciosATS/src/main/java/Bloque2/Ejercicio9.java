package Bloque2;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año;

        System.out.println("Proporcione el dia");
        dia = sc.nextInt();
        System.out.println("Proporcione el mes");
        mes = sc.nextInt();
        System.out.println("Proporcione el año");
        año = sc.nextInt();

        if (dia > 0 && dia < 31) {
            if (mes > 0 && mes < 13) {
                if (año != 0) {
                    System.out.println("Fecha correcta");
                } else {
                    System.out.println("Fecha incorrecta, año fuera de rango");
                }
            } else {
                System.out.println("La fecha es incorrecta,mes fuera de rango");
            }
        } else {
            System.out.println("La fecha es incorrecta, dia fuera de rango");
        }
    }
}
