
import java.util.Scanner;

public class Tarea71 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño del arreglo");
        int tam = sc.nextInt();

        int[] numero = new int[tam];

        for (int i = 0; i < tam; i++) {
            numero[i] = (int) (Math.random() * tam + 1);
            System.out.println(numero[i]);
        }
        System.out.println("valor que se encuentra en medio");
        int posicion = tam / 2;

        System.out.println(numero[posicion]);

        System.out.println("La tabla queda: ");
        for (int i = 0; i < tam; i++) {
            System.out.println(numero[i]);
        }
    }
}
