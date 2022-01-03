
import java.util.Scanner;

public class Tarea50 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int edad;
        int contador = 0;
        int promedio;
        int sumar = 0;
        do {
            System.out.println("Proporcioe la edad");
            edad = scanner.nextInt();
            sumar = sumar + edad;
            contador++;
            promedio = sumar / contador;
            if (promedio > 25) {
                break;
            }
        } while (edad >= 0);
        System.out.println("El numero de personas es " + contador);
        System.out.println("El promedio es: " + promedio + "\n El programa finalizo porque sobrepaso la edad establecida");

    }
}
