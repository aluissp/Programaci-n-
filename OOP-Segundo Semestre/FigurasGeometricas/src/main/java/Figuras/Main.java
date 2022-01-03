package Figuras;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Circunferencia c1, c2;
        c1 = new Circunferencia(5.1);
        c2 = new Circunferencia(10.5, new Punto(1, 2));
        c2.moverFigura(1, 1);
        c2.setRadio(9.5);
        c1.setCentro(3, 2);
        System.out.println("Circunferencia 1\n" + c1.imprimirDatos() + "\n");

        System.out.println("Circunferencia 2\n" + c2.imprimirDatos());
        System.out.println("Perimetro: " + c2.calcularPerimetro() + "\nArea: " + c2.calcularArea() + "\n");

        Cuadrado cd1, cd2;
        cd1 = new Cuadrado(4.4);
        cd2 = new Cuadrado(6.1, new Punto(5, 8));
        cd2.moverFigura(1, 1);
        cd2.setLado(7);

        cd1.setCentro(2, 1);
        System.out.println("Cuadrado 1\n" + cd1.imprimirDatos() + "\n");

        System.out.println("Cuadrado 2\n" + cd2.imprimirDatos());
        System.out.println("Perimetro: " + cd2.calcularPerimetro() + "\nArea: " + cd2.calcularArea() + "\n");

        Rectangulo r1, r2;
        r1 = new Rectangulo(8.2, 5.03);
        r2 = new Rectangulo(2.2, 1.03, new Punto(9, 6));
        r2.moverFigura(1, 1);
        r2.setLado1(3.2);
        r2.setLado2(4.01);

        r1.setCentro(1, 1);
        System.out.println("Rectangulo 1\n" + r1.imprimirDatos() + "\n");

        System.out.println("Rectangulo 2\n" + r2.imprimirDatos());
        System.out.println("Perimetro: " + r2.calcularPerimetro() + "\nArea: " + r2.calcularArea() + "\n");

        Elipse e1 = new Elipse(6.4, 3.3);
        Elipse e2 = new Elipse(12.12, 21.02, new Punto(8, 3));

        e1.setCentro(5, 3);
        System.out.println("Elipse 1\n" + e1.imprimirDatos() + "\n");

        System.out.println("Elipse 2\n" + e2.imprimirDatos() + "\n");

        Triangulo t1 = new Triangulo(new Punto(1, 4), new Punto(3, 4));
        Triangulo t2 = new Triangulo(new Punto(10, 1), new Punto(15, 8), new Punto(13, 8));

        t1.setPunto3(2, 3);
        System.out.println("Triangulo 1\n" + t1.imprimirDatos() + "\n");

        System.out.println("Triangulo 2\n" + t2.imprimirDatos() + "\n");

        Recta rt1 = new Recta(new Punto(4, 9));
        Recta rt2 = new Recta(new Punto(2, 3), new Punto(4, 5));

        rt1.setPunto2(7, 11);
        System.out.println("Recta 1\n" + rt1.imprimirDatos() + "\n");

        System.out.println("Recta 2\n" + rt2.imprimirDatos() + "\n");

        ArrayList figuras = new ArrayList();
        figuras.add(c1);
        figuras.add(e1);
        figuras.add(rt1);
        figuras.add("hola");
        figuras.add(343);

        System.out.println(figuras.get(4));

        ArrayList<Cuadrado> cuadrados = new ArrayList<>();
        cuadrados.add(cd2);
        cuadrados.add(cd1);

        System.out.println("");
        for (int i = 0; i < cuadrados.size(); i++) {
            System.out.println(i + 1+".- " + cuadrados.get(i).imprimirDatos());
        }
    }
}
