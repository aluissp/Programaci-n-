package Bloque1;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int horasIngresado, semana, dias, horas;

        System.out.println("Ingrese las horas ");
        horasIngresado = sc.nextInt();

        semana = horasIngresado / 168;
        dias = horasIngresado % 168 / 24; //(horasIngresado / 24) - (semana * 7);
        horas = horasIngresado - (semana * 168) - (dias * 24); //horasIngresado%24;

        System.out.println("Las semanas son: " + semana);
        System.out.println("Los dias son: " + dias);
        System.out.println("Las horas son: " + horas);
    }
}
