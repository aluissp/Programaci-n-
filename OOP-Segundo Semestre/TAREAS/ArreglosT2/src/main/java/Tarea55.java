
import java.util.Scanner;

public class Tarea55 {

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
        System.out.println();
        System.out.println("El mayor numero es: " +mayor );
        System.out.println("El menor numero es: " + menor);
        
        
        
        /*System.out.println("Tamaño del arreglo");
        int tam = sc.nextInt();
        int[] num = new int[tam];
        System.out.println("Ingrese los " + tam + " numeros");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        int mayor = num[0];
        int menor = num[0];
        int num1 = 0;
        for (int i = 0; i < num.length; i++) {
            num1 = num[i];
            if (num1 > mayor) {
                mayor = num1;
            }
            if (num1 < menor) {
                menor = num1;
            }
        }

        System.out.println();
        System.out.println("El mayor numero es: " + mayor);
        System.out.println("El menor numero es: " + menor);*/
    }
}
