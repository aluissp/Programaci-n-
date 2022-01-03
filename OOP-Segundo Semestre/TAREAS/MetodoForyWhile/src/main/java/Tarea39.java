
import java.util.Scanner;

public class Tarea39 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arimetica arimetica = new Arimetica();

        /*System.out.println("SUMA           RESTA");
        System.out.println(" 1                2 ");
        System.out.println("MULTIPLICACION  DIVICION");
        System.out.println(" 3                4 ");
        System.out.println("POTENCIA        FACTORIAL");
        System.out.println(" 5                6 ");

        System.out.println("\n" + "Selecciona una operacion a realizar");
        int numOp = scanner.nextInt();

        int continuar = 1;

        for (int i = 1; i == continuar;) {

            for (int j = 1; j == numOp; j++) {

                System.out.println("Ingrese 2 valores para sumar");
                double num1 = scanner.nextInt();
                double num2 = scanner.nextInt();
                double resultado = arimetica.sumar(num1, num2);
                System.out.println("La suma es " + resultado);

            }
            for (int k = 2; k == numOp; k++) {

            }
            System.out.println("Ingrese 2 valores para restar");
            double num1 = scanner.nextInt();
            double num2 = scanner.nextInt();
            double resultado = arimetica.restar(num1, num2);
            System.out.println("La resta es " + resultado);

        }
        for (int l = 3; l == numOp; l++) {

            System.out.println("Ingrese 2 valores para multiplicar");
            double num1 = scanner.nextInt();
            double num2 = scanner.nextInt();
            double resultado = arimetica.multiplicar(num1, num2);
            System.out.println("La multiplicacion es " + resultado);
            numOp--;
        }
        for (int m = 4; m == numOp; m++) {
            System.out.println("Ingrese 2 valores para divicion");
            double num1 = scanner.nextInt();
            double num2 = scanner.nextInt();
            double resultado = arimetica.dividir(num1, num2);
            System.out.println("La divicion es " + resultado);
            numOp--;
        }
        for (int n = 5; n == numOp; n++) {
            System.out.println("Ingrese primero la base y luego el exponente");
            double num1 = scanner.nextInt();
            double num2 = scanner.nextInt();
            double resultado = arimetica.potencia(num1, num2);
            System.out.println("La potencia es " + resultado);
            numOp--;
        }
        for (int b = 6; b == numOp; b++) {
            System.out.println("Ingrese un numero mayor a 1");
            double num1 = scanner.nextInt();
            double resultado = arimetica.factorial(num1);
            System.out.println("El factorial es " + resultado);
            numOp--;
        }

        System.out.println("Si desea cotinuar pulse 1, para finalizar 0");
        continuar = scanner.nextInt();
        if (continuar == 1) {
            System.out.println("Selecciona una operacion a realizar");
            numOp = scanner.nextInt();
        } else if (continuar >= 0) {
            System.out.println("Gracias por usar la app, que tenga un buen dia ");
        }*/
        // CALCULADORA CON WHILE
        System.out.println("SUMA           RESTA");
        System.out.println(" 1                2 ");
        System.out.println("MULTIPLICACION  DIVICION");
        System.out.println(" 3                4 ");
        System.out.println("POTENCIA        FACTORIAL");
        System.out.println(" 5                6 ");

        System.out.println("\n" + "Selecciona una operacion a realizar");
        int numOp = scanner.nextInt();

        int continuar = 1;

        while (continuar == 1) {

            while (numOp == 1) {
                System.out.println("Ingrese 2 valores para sumar");
                double num1 = scanner.nextInt();
                double num2 = scanner.nextInt();
                double resultado = arimetica.sumar(num1, num2);
                System.out.println("La suma es " + resultado);
                numOp--;
            }
            while (numOp == 2) {
                System.out.println("Ingrese 2 valores para restar");
                double num1 = scanner.nextInt();
                double num2 = scanner.nextInt();
                double resultado = arimetica.restar(num1, num2);
                System.out.println("La resta es " + resultado);
                numOp--;
            }
            while (numOp == 3) {
                System.out.println("Ingrese 2 valores para multiplicar");
                double num1 = scanner.nextInt();
                double num2 = scanner.nextInt();
                double resultado = arimetica.multiplicar(num1, num2);
                System.out.println("La multiplicacion es " + resultado);
                numOp--;
            }
            while (numOp == 4) {
                System.out.println("Ingrese 2 valores para divicion");
                double num1 = scanner.nextInt();
                double num2 = scanner.nextInt();
                double resultado = arimetica.dividir(num1, num2);
                System.out.println("La divicion es " + resultado);
                numOp--;
            }
            while (numOp == 5) {
                System.out.println("Ingrese primero la base y luego el exponente");
                double num1 = scanner.nextInt();
                double num2 = scanner.nextInt();
                double resultado = arimetica.potencia(num1, num2);
                System.out.println("La potencia es " + resultado);
                numOp--;
            }
            while (numOp == 6) {
                System.out.println("Ingrese un numero mayor a 1");
                double num1 = scanner.nextInt();
                double resultado = arimetica.factorial(num1);
                System.out.println("El factorial es " + resultado);
                numOp--;
            }

            System.out.println("Si desea cotinuar pulse 1, para finalizar 0");
            continuar = scanner.nextInt();
            if (continuar == 1) {
                System.out.println("Selecciona una operacion a realizar");
                numOp = scanner.nextInt();
            } else if (continuar >= 0) {
                System.out.println("Gracias por usar la app, que tenga un buen dia ");
            }
        }
    }
}
