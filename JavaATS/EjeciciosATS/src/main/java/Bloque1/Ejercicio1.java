package Bloque1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, resultado;

        System.out.println("Digite las 3 notas");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();

        resultado = nota1 + nota2 + nota3;
        System.out.println("La suma de los valores son: " + resultado);

    }
}
