package Bloque3;

import java.util.Scanner;

public class Ejercicio_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo, litros, cantLitrosArticulo1 = 0, facturaMas600 = 0;
        double precioLitro, factura, facturaTotal = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println("Articulo " + i + ", dijite su codigo");
            codigo = sc.nextInt();
            System.out.println("Digite la cantidad vendida en litros");
            litros = sc.nextInt();
            System.out.println("Digite el precio por litro");
            precioLitro = sc.nextDouble();

            factura = litros * precioLitro;
            facturaTotal += factura;

            if (codigo == 1) {
                cantLitrosArticulo1 += litros;
            }
            if (factura > 600) {
                facturaMas600++;
            }
        }
        System.out.println();

        System.out.println("Resumen de ventas");
        System.out.println("La facturacion total es: " + facturaTotal);
        System.out.println("La cantidad en litros vendidos del articulo 1 es: " + cantLitrosArticulo1);
        System.out.println("Las facturas con mas de 600 son: " + facturaMas600);
    }
}
