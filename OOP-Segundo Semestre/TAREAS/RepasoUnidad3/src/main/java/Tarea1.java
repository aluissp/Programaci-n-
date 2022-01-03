
import java.util.Scanner;

public class Tarea1 {

    public static void main(String[] args) {

        Arimetica arimetica = new Arimetica();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el valor de inicio");
        int inicio = scanner.nextInt();
        System.out.println("Ingresa el valor final");
        int fin = scanner.nextInt();

        int sumaTotal = arimetica.sumaRango(inicio, fin);

        System.out.println("La suma total es: " + sumaTotal);
    }

}
