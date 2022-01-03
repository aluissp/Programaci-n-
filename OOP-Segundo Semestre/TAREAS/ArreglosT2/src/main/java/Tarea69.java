
import java.util.Random;
import java.util.Scanner;

public class Tarea69 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ini = 1;
        int fin = 100;
        int num;
        System.out.println("Tamaño del arreglo");
        int tam = sc.nextInt();

        int[] numeros = new int[tam];
        
        Random rand = new Random();
        int n;
        for (int i = 0; i < numeros.length; i++) {
            do {
                n = rand.nextInt(fin - ini + 1) + ini;
            } while (i == n);
            numeros[i] = n;
        }
        System.out.println("Introduzca numero a buscar: ");
        num = sc.nextInt();
        int j = 0;
        while (j < tam && numeros[j] < num) {
            j++;
            System.out.println(j);
        }

        if (j == numeros[j]) {
            System.out.println("No encontrado");
        } else {

            if (numeros[j] == num) {
                System.out.println("Encontrado en la posición " + j);
            } else {
                System.out.println("No encontrado");
            }
        }
    }
    
}
