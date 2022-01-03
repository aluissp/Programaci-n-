
import java.util.Scanner;


public class Tarea8 {
 
    public static void main(String[] args) {
        
        Arimetica arimetica = new Arimetica();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese los valores, pulse 0 para finalizar");
        
        double promedio=arimetica.promedio0(scanner.nextInt());
        
        System.out.println("El promedio es: "+promedio);
    }
}
