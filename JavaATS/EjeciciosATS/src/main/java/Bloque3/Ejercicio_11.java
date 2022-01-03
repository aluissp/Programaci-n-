package Bloque3;

public class Ejercicio_11 {

    public static void main(String[] args) {
        int resultado = 1;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                resultado *= i;
            }
        }
        System.out.println("El producto de los 10 primeros numeros impares son: " + resultado);
    }
}
