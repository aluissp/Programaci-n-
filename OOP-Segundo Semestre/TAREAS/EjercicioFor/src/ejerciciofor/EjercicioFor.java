package ejerciciofor;

import java.util.Scanner;

public class EjercicioFor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        // Ejercicio 27
        /*int valorNum;
        int numResiduo = 0;
        int suma = 0;
        System.out.println("Ingrese un numero");
        valorNum = scanner.nextInt();

        for (int contador = 1; contador < 20; contador++) {

            if (valorNum % contador == 0) {
                 suma=numResiduo+1;
                 numResiduo++;

            }

        }
        
        if (suma<=2) {
            System.out.println("Es Primo");
        } else {
            System.out.println("No es primo");
        }*/
        // Ejercicio 26
        /*int num1 = 1;
        int num2 = 1;
        int numMaximo = 20;

        System.out.println("La serie de fibonacci hasta el rango 20 son:");

        System.out.println("0");
        System.out.println(num1);

        for (int contador = 2; contador <= numMaximo; contador++) {
            System.out.println(num2);
            num2 = num1 + num2;
            num1 = num2 - num1;
        }*/
        // Ejercicio 25
        /*int varMinimo;
        int varMaximo;
        int contador;

        System.out.println("Ingrese el valor minimo ");
        varMinimo = scanner.nextInt();

        System.out.println("Ingrese el valor maximo ");
        varMaximo = scanner.nextInt();

        System.out.println("Los numeros pares son: ");
        for (contador = varMinimo; contador <= varMaximo; contador++) {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }

        }
        System.out.println("Los numeros impares son: ");
        for (contador = varMinimo; contador <= varMaximo; contador++) {
            if (contador % 2 != 0) {
                System.out.println(contador);
            }
        }*/
    }
}
