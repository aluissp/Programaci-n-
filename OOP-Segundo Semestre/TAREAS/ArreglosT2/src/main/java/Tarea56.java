
import java.util.Scanner;

public class Tarea56 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArreglosDeber arr= new ArreglosDeber();
        System.out.println("Tamaño del arreglo");
        int tam = sc.nextInt();
        int[] num = new int[tam];
        System.out.println("Ingrese los " + tam + " numeros");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        int mayor=arr.numMayor(num);
        int menor= arr.numMenor(num);
        int contMayor=arr.contMayor(mayor, num);
        int contMenor= arr.contMenor(menor, num);
        
        System.out.println();
        System.out.println("El mayor numero es: " + mayor + " y se repite  " + contMayor + " veces");
        System.out.println("El menor numero es: " + menor + " y se repite  " + contMenor + " veces");
    }
}
