package Bloque1;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double guillermo, luis, juan, total;
        System.out.println("Ingrese el valor que tiene guillermo en dolares");
        guillermo = sc.nextDouble();
        luis = guillermo / 2;
        juan = (luis + guillermo) / 2;
        total = guillermo + luis + juan;
        
        System.out.println("\nLa cantidad total es: " + total);

    }
}
