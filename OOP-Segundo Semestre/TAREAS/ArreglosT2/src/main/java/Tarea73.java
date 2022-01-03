
import java.util.Scanner;


public class Tarea73 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño del arreglo");
        int tam = sc.nextInt();

        int[] numero = new int[tam];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 20 + 1);
           
        }
        
        System.out.println("Deficientes 0-5");
        for (int i = 0; i < tam; i++) {
            if (numero[i]>=0&&numero[i]<=5) {
                System.out.println(numero[i]);
            }
        }
        System.out.println("Regulares 6-10");
        for (int i = 0; i < tam; i++) {
            if (numero[i]>=6&&numero[i]<=10) {
                System.out.println(numero[i]);
            }
        }
        System.out.println("Buenos 11-15");
        for (int i = 0; i < tam; i++) {
            if(numero[i]>=11&&numero[i]<=15){
                System.out.println(numero[i]);
            }
        }
        System.out.println("Excelentes 16-20");
        for (int i = 0; i < tam; i++) {
            if(numero[i]>=16&&numero[i]<=20){
                System.out.println(numero[i]);
            }
        }
    }
}
