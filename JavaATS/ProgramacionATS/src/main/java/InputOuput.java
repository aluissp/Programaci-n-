
import java.util.Scanner;

public class InputOuput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        float numero2;
        double numero3;

        System.out.println("Ingrese un numero: ");
        numero1 = scanner.nextInt();

        System.out.println("El valor es: " + numero1);
        System.out.println();

        System.out.println("Ingrese un numero: ");
        numero2 = scanner.nextFloat();

        System.out.println("El valor es: " + numero2);
        System.out.println();

        System.out.println("Ingrese un numero: ");
        numero3 = scanner.nextDouble();

        System.out.println("El valor es: " + numero3);
        System.out.println();

        //Guardando cadenas
        String cadena;
        System.out.println("Digite una cadena");
        cadena = scanner.nextLine();

        System.out.println("La cadena es: " + cadena);
        System.out.println();

        //Guardando caracteres
        char letra;

        System.out.println("Digite una letra");
        letra = scanner.next().charAt(0);

        System.out.println("La cadena es: " + letra);

    }
}
