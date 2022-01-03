package Bloque2;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año;

        System.out.println("Proporcione el dia");
        dia = sc.nextInt();
        System.out.println("Proporcione el mes");
        mes = sc.nextInt();
        System.out.println("Proporcione el año");
        año = sc.nextInt();
        System.out.println();

        if (año != 0) {
            if (mes == 2) {
                if (dia > 0 && dia < 29) {
                    System.out.println("Fecha ingresada correcta");
                } else {
                    System.out.println("Datos inorrectos, dia fuera de rango");
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia > 0 && dia < 31) {
                    System.out.println("Fecha ingresada correcta");
                } else {
                     System.out.println("Datos inorrectos, dia fuera de rango");
                }
            } else if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
               if (dia > 0 && dia < 32) {
                    System.out.println("Fecha ingresada correcta");
                } else{
                    System.out.println("Datos inorrectos, dia fuera de rango");
               }
            }
            else {
                System.out.println("Datos incorerctos, mes fuera de rango");
            }
        } else {
            System.out.println("Datos incorrectos, año fuera de rango");
        }
    }
}
