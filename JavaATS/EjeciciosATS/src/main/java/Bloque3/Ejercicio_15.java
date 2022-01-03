package Bloque3;

import java.util.Scanner;

public class Ejercicio_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double estatura, sumaEstatura = 0, mediaEdad, mediaEstatura;
        int edad, sumaEdad = 0, cantMayores = 0, cantEstatura = 0, x = 0;

        //Analizando edades y estatura
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite la edad " + i);
            edad = sc.nextInt();
            System.out.println("Digite la estatura " + i);
            estatura = sc.nextDouble();

            sumaEdad += edad;
            sumaEstatura += estatura;
            if (estatura > 1.75) {
                cantEstatura++;
            }
            if (edad > 18) {
                cantMayores++;
            }
            x++;
        }
        System.out.println();

        mediaEdad = (sumaEdad * 1.000 / x);
        mediaEstatura = sumaEstatura / x;
        System.out.println("La edad media es: " + mediaEdad);
        System.out.println("La estatura media es: " + mediaEstatura);
        System.out.println("La cantidad de alumnos mayores de 18 años es: " + cantMayores);
        System.out.println("La cantidad de alumnos que miden mas de 1,75 es: " + cantEstatura);
    }
}
