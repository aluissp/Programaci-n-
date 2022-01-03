package Figuras;

public class Cuadrado {

    private Punto centro;
    private double lado;

    public Cuadrado(double lado) {
        if (lado > 0) {
            this.lado = lado;
        } else {
            System.out.println("No se admite valores negativos");
        }
        //Valores por defecto del punto centro
        centro = new Punto(0, 0);
    }

    public Cuadrado(double lado, Punto centro) {
        if (lado > 0) {
            this.lado = lado;
        } else {
            System.out.println("No se admite valores negativos");
        }

        this.centro = centro;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
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

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado > 0) {
            this.lado = lado;
        } else {
            System.out.println("No se admite valores negativos");
        }
    }

    @Override
    public String toString() {
        return "Centro: " + centro.imprimirPunto()
                + "\nLado: " + lado;
    }

    public String imprimirDatos() {
        return "Centro: " + centro.imprimirPunto()
                + "\nLado: " + lado;
    }
}
