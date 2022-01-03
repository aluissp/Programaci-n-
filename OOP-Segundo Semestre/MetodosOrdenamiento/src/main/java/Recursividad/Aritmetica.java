package Recursividad;

public class Aritmetica {

    public static int Factorial(int valor) {
        if (valor <= 1) {
            return 1;
        }

        return (valor * (Factorial(valor - 1)));
    }

    public static int Potencia(int base, int exponente) {
        if (exponente == 1) {
            return base;
        } else if (exponente > 1) {
            return base * Potencia(base, exponente - 1);
        } else {
            return 1;
        }
    }

    public static boolean numeroPrimo(int num) {
        return numeroPrimo(num, 2);
    }

    private static boolean numeroPrimo(int num, int divisor) {
        if (num == 1) {
            return true;
        }
        if (num == divisor) {
            return true;
        } else {
            if (num % divisor == 0) {
                return false;
            } else {
                return numeroPrimo(num, divisor + 1);
            }
        }
    }
}
