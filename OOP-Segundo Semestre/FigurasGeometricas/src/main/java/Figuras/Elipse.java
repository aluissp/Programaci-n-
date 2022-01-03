package Figuras;

public class Elipse {

    private Punto centro;
    private double ejeMayor;
    private double ejeMenor;

    public Elipse(double ejeMayor, double ejeMenor) {
        if (ejeMayor > 0 && ejeMenor > 0) {
            this.ejeMayor = ejeMayor;
            this.ejeMenor = ejeMenor;
        } else {
            System.out.println("No se admite valores negativos");
        }

        //Valores por defecto del punto centro
        centro = new Punto(0, 0);
    }

    public Elipse(double ejeMayor, double ejeMenor, Punto centro) {
        if (ejeMayor > 0 && ejeMenor > 0) {
            this.ejeMayor = ejeMayor;
            this.ejeMenor = ejeMenor;
        } else {
            System.out.println("No se admite valores negativos");
        }
        this.centro = centro;
    }

    public double calcularArea() {
        return (ejeMayor / 2) * (ejeMenor / 2) * Math.PI;
    }

    public double calcularPerimetro() {
        return ((ejeMayor / 2) + (ejeMenor / 2)) * Math.PI;
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

    public double getEjeMayor() {
        return ejeMayor;
    }

    public void setEjeMayor(double ejeMayor) {
        if (ejeMayor > 0 && ejeMenor > 0) {
            this.ejeMayor = ejeMayor;
        } else {
            System.out.println("No se admite valores negativos");
        }
    }

    public double getEjeMenor() {
        return ejeMenor;
    }

    public void setEjeMenor(double ejeMenor) {
        if (ejeMayor > 0 && ejeMenor > 0) {
            this.ejeMenor = ejeMenor;
        } else {
            System.out.println("No se admite valores negativos");
        }
    }

    public String imprimirDatos() {
        return "Centro: " + centro.imprimirPunto()
                + "\nEje Mayor: " + ejeMayor
                + "\nEje Menor: " + ejeMenor;
    }
}
