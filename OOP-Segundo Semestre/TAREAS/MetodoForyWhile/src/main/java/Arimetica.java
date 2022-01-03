
import java.util.Scanner;

public class Arimetica {

    public double potencia(double a, double b) {

        double contador;
        double resultado = 1;

        for (contador = 1; contador <= b; contador++) {
            resultado = resultado * a;
        }
        return resultado;

    }

    public double factorial(double a) {
        double numFactorial = a;
        double num = 2;
        double numMax = numFactorial;

        while (num < numMax) {
            numFactorial = numFactorial * num;
            num++;
        }
        return numFactorial;
    }

    public double sumar(double a, double b) {
        double resultado = a + b;
        return resultado;
    }

    public double multiplicar(double a, double b) {
        double resultado = a * b;
        return resultado;
    }

    public double restar(double a, double b) {
        double resultado = a - b;
        return resultado;
    }

    public double dividir(double a, double b) {
        double resultado = a / b;
        return resultado;

  
    }
}
