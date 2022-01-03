
import java.util.Scanner;

public class Tarea32 {

    public static void main(String[] args) {

        // PARES IMPARES CON WHILE
        Scanner scanner = new Scanner(System.in);
        int varMinimo;
        int varMaximo;

        System.out.println("Ingrese el valor minimo ");
        varMinimo = scanner.nextInt();

        System.out.println("Ingrese el valor maximo ");
        varMaximo = scanner.nextInt();
        
        int salvar1=varMinimo;
        int salvar2=varMaximo;

        System.out.println("Los numeros pares son: ");

        while (varMinimo <= varMaximo) {

            if (varMinimo % 2 == 0) {
                System.out.println(varMinimo);
            }
            varMinimo++;

        }
        System.out.println("Los numeros impares son: ");
        
        while (salvar1 <= salvar2) {

            if (salvar1 % 2 != 0) {
                System.out.println(salvar1);
            }
            salvar1++;

        }
    }

}
