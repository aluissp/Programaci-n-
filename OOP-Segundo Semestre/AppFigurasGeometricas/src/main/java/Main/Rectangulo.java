package Main;

public class Rectangulo {

    private Punto centro;
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        if (lado1 > 0 && lado2 > 0) {
            this.lado1 = lado1;
            this.lado2 = lado2;
        } 

        //Valores por defecto del punto centro
        centro = new Punto(0, 0);
    }

    public Rectangulo(double lado1, double lado2, Punto centro) {
        if (lado1 > 0 && lado2 > 0) {
            this.lado1 = lado1;
            this.lado2 = lado2;
        } else {
            System.out.println("No se admite valores negativos o cero");
        }

        this.centro = centro;
    }

    public double calcularArea() {
        return lado1 * lado2;
    }

    public double calcularPerimetro() {
        return (2 * lado1) + (2 * lado2);
    }

    public void moverFigura(int x, int y) {
        centro.moverPunto(x, y);
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(int x, int y) {
        centro.setX(x);
        centro.setY(y);
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        if (lado1 > 0 && lado2 > 0) {
            this.lado1 = lado1;
        } else {
            System.out.println("No se admite valores negativos o cero");
        }
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        if (lado1 > 0 && lado2 > 0) {
            this.lado2 = lado2;
        } else {
            System.out.println("No se admite valores negativos o cero");
        }
    }

    public String imprimirDatos() {
        return "Centro: " + centro.imprimirPunto()
                + "\nLado 1: " + lado1
                + "\nLado 2: " + lado2;
    }
}
