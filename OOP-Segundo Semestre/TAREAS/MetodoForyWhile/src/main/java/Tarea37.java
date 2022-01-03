
import java.util.Scanner;

public class Tarea37 {

    public static void main(String[] args) {

        //POTENCIA CON METODO
        Scanner scanner = new Scanner(System.in);
        Arimetica arimetica = new Arimetica();

        System.out.println("Ingresa la base");
        int base = scanner.nextInt();
        System.out.println("Ingresa el exponente");
        int exponente = scanner.nextInt();

        double resultado = arimetica.potencia(base, exponente);

        System.out.println("La potencia de " + base + " elevado a " + exponente + " es " + resultado);

        /*String cadena = "hoy es viernes";

        System.out.println(cadena.charAt(0));

        System.out.println(cadena.charAt(11));

        System.out.println(cadena.endsWith("n"));

        System.out.println(cadena.startsWith("E"));

        System.out.println(cadena.equals("hoy es viernes"));

        System.out.println(cadena.length());

        System.out.println(cadena.replace('o', 'e'));

        System.out.println(cadena.toLowerCase());

        System.out.println(cadena.toUpperCase());*/
    }
}
