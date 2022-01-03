
import java.util.Scanner;

 
public class Tarea38 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Arimetica arimetica = new Arimetica();
        
        System.out.println("Proporciona el numero para calcular el factorial");
        double numFactorial= scanner.nextInt();
        double resultado=arimetica.factorial(numFactorial);
        
        System.out.println("El factorial de "+numFactorial+" es "+resultado);
    }
    
}
