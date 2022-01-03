package Bloque3;

import java.util.Scanner;

public class Ejercicio_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;
        int contAprobado = 0, contCondicionado = 0, contSuspenso = 0;

        for (int i = 1; i <= 6; i++) {
            do {
                System.out.println("Digite la nota entre 0-10 del alumno ");
                nota = sc.nextDouble();
            } while (nota < 0 || nota >= 10);

            if (nota > 4) {
                contAprobado++;
            } else if (nota == 4) {
                contCondicionado++;
            } else {
                contSuspenso++;
            }
        }
        System.out.println();

        System.out.println("Los alumnos aprobados son: " + contAprobado);
        System.out.println("Los alumnos condicionados son: " + contCondicionado);
        System.out.println("Los alumnos en suspenson: " + contSuspenso);
    }
}
