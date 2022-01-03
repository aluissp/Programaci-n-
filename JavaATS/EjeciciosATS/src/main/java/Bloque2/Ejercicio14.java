package Bloque2;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double masa, masaTransformado;
        int opcion;

        System.out.println("Bienvenido digite una masa en Kilogrammos");
        masa = sc.nextDouble();
        System.out.println("Seleccione una la unidad que desea transformar");
        System.out.println("\n1. Libras \n2. Gramos \n3. Onza \n4. Tonelada");
        opcion = sc.nextInt();

        if (opcion == 1) {
            masaTransformado = masa / 0.45359;
            System.out.println("La masa es " + masaTransformado + " libras");
        } else if (opcion == 2) {
            masaTransformado = (masa * 453.59) / 0.45359;
            System.out.println("La masa es " + masaTransformado + " gramos");
        } else if (opcion == 3) {
            masaTransformado = (masa * 16) / 0.45359;
            System.out.println("La masa es " + masaTransformado + " onzas");
        } else if (opcion == 4) {
            masaTransformado = masa / 907.2 ;
            System.out.println("La masa es " + masaTransformado + " toneladas");
        }else{
            System.out.println("Opcion incorrecta");
        }
    }
}
