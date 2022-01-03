package Bloque1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int salario = 1000;
        double numCarros, valorCarro, salarioTotal;

        System.out.println("Ingrese los autos vendidos");
        numCarros = sc.nextDouble();
        System.out.println("Ingrese el valor del auto");
        valorCarro = sc.nextDouble();

        salarioTotal = salario + (numCarros * 150) + (valorCarro * numCarros * 0.05);
        System.out.println("\nEl salario del vendedor es: " + salarioTotal);
    }
}
