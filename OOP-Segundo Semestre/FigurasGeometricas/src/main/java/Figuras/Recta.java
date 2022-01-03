package Figuras;

public class Recta {

    private Punto punto1;
    private Punto punto2;

    public Recta(Punto punto1) {
        this.punto1 = punto1;

        //Valores por defecto del segundo punto
        punto2 = new Punto(0, 0);
    }

    public Recta(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public double calcularLongitud() {
        return Math.sqrt((Math.pow(punto2.getX() - punto1.getX(), 2)) + (Math.pow(punto2.getY() - punto1.getY(), 2)));
    }

    public void moverFigura(int x, int y) {
        punto1.moverPunto(x, y);
        punto2.moverPunto(x, y);
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(int x, int y) {
        punto1.setX(x);
        punto1.setY(y);
    }

    public Punto getPunto2() {
        return punto1;
    }

    public void setPunto2(int x, int y) {
        punto2.setX(x);
        punto2.setY(y);
    }

    public String imprimirDatos() {
        return "Coordenadas: \n" + punto1.imprimirPunto()
                + "\n" + punto2.imprimirPunto();
    }
}
