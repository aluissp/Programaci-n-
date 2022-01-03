package Bloque1;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double participacion, pExamen, sExamen, examenFinal, calfFinal;

        System.out.println("Ingrese la nota de participacion academica");
        participacion = sc.nextDouble();
        System.out.println("Ingrese la nota del primer examen parcial");
        pExamen = sc.nextDouble();
        System.out.println("Ingrese la nota del segundo examen parcial");
        sExamen = sc.nextDouble();
        System.out.println("Ingrese la nota del examen final");
        examenFinal = sc.nextDouble();

        calfFinal = (participacion * 0.1) + (pExamen * 0.25) + (sExamen * 0.25) + (examenFinal * 0.4);
        System.out.println("\nLa calificacion final del estudiante es: " + calfFinal);
    }
}
