
import java.util.Scanner;

public class OpArimeticos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float num1, num2, suma, resta, multi, resto, div, residuo;

        System.out.println("Ingresa 2 numeros");
        num1 = scanner.nextFloat();
        num2 = scanner.nextFloat();

        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        div = num1 / num2;
        residuo = num1 % num2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multi);
        System.out.println(" a divicion es: " + div);
        System.out.println("El residuo es: " + residuo);
    }

}
