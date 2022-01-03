
import java.util.Scanner;


public class Tarea5 {

    public static void main(String[] args) {
        
        Arimetica arimetica = new Arimetica();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el multiplo");
        int num = scanner.nextInt();
        System.out.println("Ingresa el valor de inicio");
        int inicio = scanner.nextInt();
        System.out.println("Ingresa el valor final");
        int fin = scanner.nextInt();

        int sumaTotal = arimetica.sumaCantMultiplo(inicio, fin, num);

        System.out.println("La cantidad de multiplos de " + num + " son " + sumaTotal);
    }
    
}
