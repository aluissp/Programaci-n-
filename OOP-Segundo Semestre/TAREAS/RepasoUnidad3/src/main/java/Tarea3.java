
import java.util.Scanner;

public class Tarea3 {

    public static void main(String[] args) {

        Arimetica arimetica = new Arimetica();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el valor de inicio");
        int inicio = scanner.nextInt();
        System.out.println("Ingresa el valor final");
        int fin = scanner.nextInt();

        int sumaTotal = arimetica.sumaImpares(inicio, fin);

        System.out.println("La suma total de los numeros impares es: " + sumaTotal);

    }

}
