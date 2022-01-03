package Bloque3;

import java.util.Scanner;

public class Ejercicio_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo, litros, cantLitros1 = 0, facturaMayor600 = 0;
        double factura = 0, facturaTotal = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println("Factura " + i);

            do {
                System.out.println("Digite el codigo del articulo entre 1-3");
                codigo = sc.nextInt();
            } while (codigo < 1 || codigo > 3);

            System.out.println("Digite los litros vendidos");
            litros = sc.nextInt();

            if (codigo == 1) {
                factura = litros * 0.6;
            } else if (codigo == 2) {
                factura = litros * 3;
            } else if (codigo == 3) {
                factura = litros * 1.25;
            }

            facturaTotal += factura;

            if (codigo == 1) {
                cantLitros1 += litros;
            }
            if (factura > 600) {
                facturaMayor600++;
            }
        }
        System.out.println();

        System.out.println("Resumen de ventas");
        System.out.println("La factura total es: " + facturaTotal);
        System.out.println("La cantidad de litros del articulo 1 es: " + cantLitros1);
        System.out.println("Las facturas mayores a 600 son: " + facturaMayor600);
    }
}
