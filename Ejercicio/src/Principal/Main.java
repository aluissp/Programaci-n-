/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Scanner;

/**
 *
 * @author Luis Perugachi
 */
public class Main {

    public static void main(String[] args) {
        //Ejercicio 12
        System.out.println("Ejercio 12\n");
        Scanner sc = new Scanner(System.in);
        String nombre;
        int aServicio;
        double sueldo;
        double aumento;
        double sueldoPagar;

        System.out.println("Por favor ingrese su nombre:");
        nombre = sc.nextLine();
        System.out.println("Por favor ingrese los años de servicio:");
        aServicio = sc.nextInt();
        System.out.println("Por favor ingrese su sueldo anual:");
        sueldo = sc.nextDouble();

        if (aServicio > 10) {
            aumento = sueldo * 0.10;
            sueldoPagar = aumento + sueldo;
            System.out.println("Estimado " + nombre + "\n" + "Su sueldo a cobrar es de: " + sueldoPagar);

        } else if (aServicio < 10 && aServicio > 5) {
            aumento = sueldo * 0.07;
            sueldoPagar = aumento + sueldo;
            System.out.println("Estimado " + nombre + "\n" + "Su sueldo a cobrar es de: " + sueldoPagar);

        } else if (aServicio < 5 && aServicio > 3) {
            aumento = sueldo * 0.05;
            sueldoPagar = aumento + sueldo;
            System.out.println("Estimado " + nombre + "\n" + "Su sueldo a cobrar es de: " + sueldoPagar);

        } else if (aServicio <= 3) {
            aumento = sueldo * 0.03;
            sueldoPagar = aumento + sueldo;
            System.out.println("Estimado " + nombre + "\n" + "Su sueldo a cobrar es de: " + sueldoPagar);
        }

        //Ejercicio 13
        System.out.println("\n\nEjercicio 13\n");
        double numa;
        double numb;
        double numc;
        double numd;
        System.out.println("Ingrese el primer número:");
        numa = sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        numb = sc.nextDouble();
        System.out.println("Ingrese el tercer número:");
        numc = sc.nextDouble();
        System.out.println("Ingrese el cuarto número:");
        numd = sc.nextDouble();

        System.out.println("\nEl la suma del primer y tercer número: " + (numa + numc));
        if ((numa + numc) == numb && (numa + numc) == numd) {
            System.out.println("Es igual al segundo: " + numb + " y cuarto número: " + numd);
        } else {
            System.out.println("No coincide con el segundo: " + numb + " y cuarto número: " + numd);
        }

        //Ejercicio 14
        System.out.println("\n\nEjercicio 14\n");
        //Tomar encuenta que estoy reutilizando las variables declaradas anteriormente
        numa = numb = numc = numd = 0;
        System.out.println("Ingrese el primer número:");
        numa = sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        numb = sc.nextDouble();
        System.out.println("Ingrese el tercer número:");
        numc = sc.nextDouble();
        System.out.println("Ingrese el cuarto número:");
        numd = sc.nextDouble();

        double sumbcd = numb + numc + numd;

        System.out.println("\nEl la suma del segundo, tercer y cuarto número: " + (numa + numc));
        if (sumbcd == numa) {
            System.out.println("Es igual al primer número: " + numa);
        } else {
            System.out.println("No coincide con primer número: " + numa);
        }

        //Ejercicio 15
        System.out.println("\n\nEjercicio 15\n");
        double peso;
        double estatura;
        double imc;
        System.out.println("Ingrese su peso corporal en Kg.: ");
        peso = sc.nextDouble();
        System.out.println("Ingrese su estatura en cm: ");
        estatura = sc.nextDouble();

        imc = peso / Math.pow(estatura, 2);
        System.out.println("\n Su índice de masa corporal es: " + imc);

    }
}
