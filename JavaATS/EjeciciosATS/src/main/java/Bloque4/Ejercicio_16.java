package Bloque4;

import java.util.Scanner;

public class Ejercicio_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] primer = new double[5];
        double[] segundo = new double[5];
        double[] tercer = new double[5];

        double suma1 = 0, suma2 = 0, suma3 = 0, sumaAlumno = 0;
        double promedio1, promedio2, promedio3, promedioAlumno;
        int posicion;

        System.out.println("Digite las notas del primer trimestre");
        for (int i = 0; i < primer.length; i++) {
            System.out.println("Alumno " + (i + 1));
            primer[i] = sc.nextDouble();

            suma1 += primer[i];
        }

        System.out.println("\nDigite las notas del segundo trimestre");
        for (int i = 0; i < segundo.length; i++) {
            System.out.println("Alumno " + (i + 1));
            segundo[i] = sc.nextDouble();

            suma2 += segundo[i];
        }

        System.out.println("\nDigite las notas del tercer trimestre");
        for (int i = 0; i < tercer.length; i++) {
            System.out.println("Alumno " + (i + 1));
            tercer[i] = sc.nextDouble();

            suma3 += tercer[i];
        }

        promedio1 = suma1 / primer.length;
        promedio2 = suma2 / segundo.length;
        promedio3 = suma3 / tercer.length;

        do {
            System.out.println("\nDigite la posicion del alumno entre 1-5");
            posicion = sc.nextInt();
        } while (posicion < 1 || posicion > 5);

        //Sacamos la notas del alumno y sacamos el promedio
        sumaAlumno = primer[posicion - 1] + segundo[posicion - 1] + tercer[posicion - 1];
        promedioAlumno = sumaAlumno / 3;

        System.out.println("\nMostrando los datos requeridos");
        System.out.println("El promedio del primer trimestre es: " + promedio1);
        System.out.println("El promedio del segundo trimestre es: " + promedio2);
        System.out.println("El promedio del tercer trimestre es: " + promedio3);
        System.out.println("\nPromedio del alumno " + posicion + " es: " + promedioAlumno);
    }
}
