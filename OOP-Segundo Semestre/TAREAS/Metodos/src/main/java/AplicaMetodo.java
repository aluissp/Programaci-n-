
import java.util.Scanner;


public class AplicaMetodo {

    public static void main(String[] args) {
        // Realizar un método que me retorne la suma de dos números

        Arimetica arimetica = new Arimetica();
        Scanner scanner=new Scanner(System.in);
        
        int num1;
        int num2;
        System.out.println("Ingrese un valor");
        num1=scanner.nextInt();
        System.out.println("Ingrese el valor 2");
        num2=scanner.nextInt();
        
        int resultado = arimetica.sumar(num1, num2);

        System.out.println("la suma es: " + resultado);
    }

}
