package Figuras;

public class Main {

    public static void main(String[] args) {

        System.out.println("Punto:");
        Punto p1 = new Punto(5, 2);
        System.out.println(p1.Imprimir());;
        System.out.println("\n\n");

        System.out.println("Circunferencia:");
        Circunferencia c1 = new Circunferencia(8, new Punto(4, 4));
        System.out.println("Area: " + c1.Area());
        System.out.println("Perimetro: " + c1.Perimetro());
        System.out.println(c1.Imprimir());
        System.out.println("\n\n");

        System.out.println("Rectangulo:");
        Rectangulo r1 = new Rectangulo(21, 36, new Punto(8, 8));
        System.out.println("Area: " + r1.Area());
        System.out.println("Perimetro: " + r1.Perimetro());
        System.out.println(r1.Imprimir());
    }
}
