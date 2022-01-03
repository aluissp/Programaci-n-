
import java.util.Scanner;

public class TareasUni2 {

    public static void main(String[] args) {
        //Ejemplo 2

        //Realizar un programa halle el triple de un numero ingresado por teclado, pero finaliza al ingresar el numero cero
        int numero, numtriple;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un valor");
        numero = scanner.nextInt();
        numtriple = numero * 3;

        System.out.println("El triple es: " + numtriple);

        while (numero != 0) {
            System.out.println("Ingrese un valor");
            numero = scanner.nextInt();
            numtriple = numero * 3;

            System.out.println("El triple es: " + numtriple);

        }

        System.out.println("Finalizado");

        /*//Ejemplo 1
        //Realizar un programa halle la suma de 5 números ingresados por teclado
        int dato = 1;
        String valorcad;
        int num, suma = 0;
        Scanner scanner = new Scanner(System.in);

        while (dato <= 5) {
            System.out.println("Ingrese el valor: " + dato);
            valorcad = scanner.nextLine();
            num = Integer.parseInt(valorcad
            );

            suma += num;
            dato++;

        }

        System.out.println("La suma es  : " + suma);*/
    }

}
