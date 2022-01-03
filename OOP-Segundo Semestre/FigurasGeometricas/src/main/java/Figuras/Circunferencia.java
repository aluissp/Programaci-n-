package Figuras;

import Figuras.Punto;

public class Circunferencia {

    private Punto centro;
    private double radio;

    public Circunferencia(double radio) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            this.radio = 1;
        }
        //Valores del punto centro por defecto
        this.centro = new Punto(0, 0);
    }

    public Circunferencia(double radio, Punto centro) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            this.radio = 1;
        }
        this.centro = centro;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
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

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            System.out.println("Radio invalido");
        }
    }

    public String imprimirDatos() {
        return "Centro: " + centro.imprimirPunto()
                + "\nRadio: " + this.radio;
    }

}
