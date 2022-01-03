package Bloque1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        double horasSemanal, salarioHora, resultado;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite las horas semanales trabajadas");
        horasSemanal = sc.nextDouble();
        System.out.println("Digite el salario ganado por hora");
        salarioHora = sc.nextDouble();

        resultado = (horasSemanal * salarioHora);
        System.out.println("\nSu salario a cobrar es: " + resultado);
    }
}
