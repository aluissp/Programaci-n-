
import java.util.Scanner;

public class Tarea4 {

    public static void main(String[] args) {

        Arimetica arimetica = new Arimetica();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el multiplo");
        int num = scanner.nextInt();
        System.out.println("Ingresa el valor de inicio");
        int inicio = scanner.nextInt();
        System.out.println("Ingresa el valor final");
        int fin = scanner.nextInt();

        int sumaTotal = arimetica.sumaMultiplo(inicio, fin, num);

        System.out.println("La suma total de los multiplos de " + num + " es " + sumaTotal);
    }
}
