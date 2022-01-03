
import java.util.Scanner;

public class Pruebas {

    public static void main(String[] args) {

        Arimetica arimetica = new Arimetica();
        Scanner scanner = new Scanner(System.in);

        System.out.println("OPERACIONES                 OPCION\n");
        System.out.println("SUMA DE TODOS LOS NUMEROS   1");
        System.out.println("SUMA DE NUMEROS PARES       2");
        System.out.println("SUMA DE NUMEROS IMPARES     3");
        System.out.println("SUMA DE MULTIPLOS           4");
        System.out.println("CONTADOR DE MULTIPLOS       5");
        System.out.println("PROMEDIO DE MULTIPOS        6");
        System.out.println("TABLA DE PITAGORAS          7");
        System.out.println("PROMEDIO DE NUMEROS         8");
        System.out.println("ENTERO A BINARIO            9");
        System.out.println("BINARIO A ENTERO            10");

        System.out.println("\n" + "Selecciona una operacion a realizar");
        int numOp = scanner.nextInt();

        int continuar = 1;

        while (continuar == 1) {

            while (numOp == 1) {
                System.out.println("Ingresa el valor de inicio");
                int inicio = scanner.nextInt();
                System.out.println("Ingresa el valor final");
                int fin = scanner.nextInt();

                int sumaTotal = arimetica.sumaRango(inicio, fin);

                System.out.println("La suma total es: " + sumaTotal);
                numOp--;
            }
            while (numOp == 2) {
                System.out.println("Ingresa el valor de inicio");
                int inicio = scanner.nextInt();
                System.out.println("Ingresa el valor final");
                int fin = scanner.nextInt();

                int sumaTotal = arimetica.sumaPares(inicio, fin);

                System.out.println("La suma total es: " + sumaTotal);
                numOp--;
            }
            while (numOp == 3) {
                System.out.println("Ingresa el valor de inicio");
                int inicio = scanner.nextInt();
                System.out.println("Ingresa el valor final");
                int fin = scanner.nextInt();

                int sumaTotal = arimetica.sumaImpares(inicio, fin);

                System.out.println("La suma total de los numeros impares es: " + sumaTotal);
                numOp--;
            }
            while (numOp == 4) {
                System.out.println("Ingresa el multiplo");
                int num = scanner.nextInt();
                System.out.println("Ingresa el valor de inicio");
                int inicio = scanner.nextInt();
                System.out.println("Ingresa el valor final");
                int fin = scanner.nextInt();

                int sumaTotal = arimetica.sumaMultiplo(inicio, fin, num);

                System.out.println("La suma total de los multiplos de " + num + " es " + sumaTotal);
                numOp--;
            }
            while (numOp == 5) {
                System.out.println("Ingresa el multiplo");
                int num = scanner.nextInt();
                System.out.println("Ingresa el valor de inicio");
                int inicio = scanner.nextInt();
                System.out.println("Ingresa el valor final");
                int fin = scanner.nextInt();

                int sumaTotal = arimetica.sumaCantMultiplo(inicio, fin, num);

                System.out.println("La cantidad de multiplos de " + num + " son " + sumaTotal);
                numOp--;
            }
            while (numOp == 6) {
                System.out.println("Ingresa el multiplo");
                int num = scanner.nextInt();
                System.out.println("Ingresa el valor de inicio");
                int inicio = scanner.nextInt();
                System.out.println("Ingresa el valor final");
                int fin = scanner.nextInt();

                int prom = arimetica.sumaPromMultiplo(inicio, fin, num);

                System.out.println("El promedio de todos los multiplos de " + num + " es " + prom);
                numOp--;
            }
            while (numOp == 7) {
                System.out.println("Define la fila");
                int fila = scanner.nextInt();
                System.out.println("Define la columna");
                int columna = scanner.nextInt();

                arimetica.tabPitagoras(fila, columna);
                numOp--;
            }
            while (numOp == 8) {
                System.out.println("Ingrese los valores, pulse 0 para finalizar");

                double promedio = arimetica.promedio0(scanner.nextInt());

                System.out.println("El promedio es: " + promedio);
                numOp--;
            }
            while (numOp == 9) {
                System.out.println("Introduce un numero entero mayor o igual a 0 ");
                int num = scanner.nextInt();

                int bin = arimetica.binario(num);
                System.out.println("El valor " + num + " en binario es");
                System.out.println(bin);
                numOp--;
            }
            while (numOp == 10) {
                System.out.println("Introduce un numero en binario ");
                int num = scanner.nextInt();

                int entero = arimetica.intbABinario(num);
                System.out.println("El valor " + num + " en entero es");
                System.out.println(entero);
                numOp--;
            }

            System.out.println("Si desea salir pulse S, para cotinuar N");
            System.out.println("RECUERDE \n S=0         N=1");
            continuar = scanner.nextInt();

            if (continuar == 1) {
                System.out.println("Selecciona una operacion a realizar");
                numOp = scanner.nextInt();
            } else if (continuar == 0) {
                System.out.println("Gracias por usar la app, que tenga un buen dia ");
            }
        }
    }
}
