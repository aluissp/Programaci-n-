
import java.util.Scanner;


public class Tarea6 {

    public static void main(String[] args) {
        
        Arimetica arimetica = new Arimetica();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el multiplo");
        int num = scanner.nextInt();
        System.out.println("Ingresa el valor de inicio");
        int inicio = scanner.nextInt();
        System.out.println("Ingresa el valor final");
        int fin = scanner.nextInt();

        int prom = arimetica.sumaPromMultiplo(inicio, fin, num);

        System.out.println("El promedio de todos los multiplos de " + num + " es " + prom);
    }
    
}
