
import java.util.Scanner;


public class Tarea72 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño del arreglo");
        int tam = sc.nextInt();

        int[] numero = new int[tam];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 10 + 1);
            System.out.println(numero[i]);
        }
        
        System.out.println("APROBADOS");
        for (int i = 0; i < tam; i++) {
            if (numero[i]>=7) {
                System.out.println(numero[i]);
            }
        }
        System.out.println("DESAPROBADOS");
        for (int i = 0; i < tam; i++) {
            if (numero[i]<7) {
                System.out.println(numero[i]);
            }
        }
    }
}
