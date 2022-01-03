package Main;

public class Triangulo {

    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    public Triangulo(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;

        //Punto por defecto del tercer punto
        punto3 = new Punto(0, 0);
    }

    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    public double calcularArea() {
        return (((punto1.getX() * punto2.getY()) + (punto2.getX() * punto3.getY()) 
                + (punto3.getX() * punto1.getY())) - ((punto1.getX() * punto3.getY()) 
                + (punto3.getX() * punto2.getY()) + (punto2.getX() * punto1.getY()))) / 2;
    }

    public double calcularPerimetro() {
        return Math.sqrt((Math.pow(punto2.getX() - punto1.getX(), 2)) + (Math.pow(punto2.getY() - punto1.getY(), 2))) 
                + Math.sqrt((Math.pow(punto3.getX() - punto2.getX(), 2)) + (Math.pow(punto3.getY() - punto2.getY(), 2)))
                + Math.sqrt((Math.pow(punto3.getX() - punto1.getX(), 2)) + (Math.pow(punto3.getY() - punto1.getY(), 2)));
    }

    public void moverFigura(int x, int y) {
        punto1.moverPunto(x, y);
        punto2.moverPunto(x, y);
        punto3.moverPunto(x, y);
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(int x, int y) {
        punto1.setX(x);
        punto1.setY(y);
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(int x, int y) {
        punto2.setX(x);
        punto2.setY(y);
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(int x, int y) {
        punto3.setX(x);
        punto3.setY(y);
    }

    public String imprimirDatos() {
        return "Coordenadas: \n" + punto1.imprimirPunto()
                + "\n" + punto2.imprimirPunto()
                + "\n" + punto3.imprimirPunto();
    }
}
