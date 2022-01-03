
import java.util.Scanner;

public class Tarea35 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Arimetica arimetica = new Arimetica();

        int varMinimo = 1;
        int varMaximo = 30;

        System.out.println("Los numeros primos son: ");

        for (int contador = varMinimo; contador <= varMaximo; contador++) {

            if(arimetica.esPrimo(varMinimo++)){
                System.out.println(varMinimo);
                
            }  
        }

    }

}
