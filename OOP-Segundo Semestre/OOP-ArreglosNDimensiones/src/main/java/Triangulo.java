
public class Triangulo {

    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;
    public static int cont = 0;

    public Triangulo() {
        this.vertice1 = new Punto(0, 0);
        this.vertice2 = new Punto(4, 0);
        this.vertice3 = new Punto(2, 2);
        cont++;
        System.out.println("Triangulo: " + cont);
    }

    public Triangulo(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.vertice1 = new Punto(x1, y1);
        this.vertice2 = new Punto(x2, y2);
        this.vertice3 = new Punto(x3, y3);
        cont++;
        System.out.println("Triangulo: " + cont);
    }

    public double CalcularArea() {
        double a;
        double b;
        double c;
        double s;
        a = Distancia2Puntos(vertice1.getX(), vertice1.getY(), vertice2.getX(), vertice2.getY());
        b = Distancia2Puntos(vertice3.getX(), vertice3.getY(), vertice2.getX(), vertice2.getY());
        c = Distancia2Puntos(vertice1.getX(), vertice1.getY(), vertice3.getX(), vertice3.getY());
        s = (a + b + c) / 2;
        return Math.round(Math.sqrt(s * (s - a) * (s - b) * (s - c)) * 100.0) / 100.0;
    }

    private double Distancia2Puntos(int xa, int ya, int xb, int yb) {
        return Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));
    }

    public void Mover(int dx, int dy) {
        this.vertice1.Mover(dx, dy);
        this.vertice2.Mover(dx, dy);
        this.vertice3.Mover(dx, dy);
    }

    public Punto getVertice1() {
        return this.vertice1;
    }

    public Punto getVertice2() {
        return this.vertice2;
    }

    public Punto getVertice3() {
        return this.vertice3;
    }

    public double CalcularPerimetro() {
        return Math.round((Distancia2Puntos(vertice1.getX(), vertice1.getY(), vertice2.getX(), vertice2.getY()) + Distancia2Puntos(vertice3.getX(), vertice3.getY(), vertice2.getX(), vertice2.getY()) + Distancia2Puntos(vertice1.getX(), vertice1.getY(), vertice3.getX(), vertice3.getY())) * 100.0) / 100.0;
    }

    public String Imprimir() {
        return "vértice 1: " + this.vertice1.Imprimir() + " vértice 2: " + this.vertice2.Imprimir() + " vértice 3: " + this.vertice3.Imprimir();
    }

    public void SetX1(int x1) {
        this.vertice1.setX(x1);
    }

    public int GetX1() {
        return this.vertice1.getX();
    }

    public void SetY1(int y1) {
        this.vertice1.setY(y1);
    }

    public int GetY1() {
        return this.vertice1.getY();
    }

    public void SetX2(int x2) {
        this.vertice2.setX(x2);
    }

    public int GetX2() {
        return this.vertice2.getX();
    }

    public void SetY2(int y2) {
        this.vertice2.setY(y2);
    }

    public int GetY2() {
        return this.vertice2.getY();
    }

    public void SetX3(int x3) {
        this.vertice3.setX(x3);
    }

    public int GetX3() {
        return this.vertice3.getX();
    }

    public void SetY3(int y3) {
        this.vertice3.setY(y3);
    }

    public int GetY3() {
        return this.vertice3.getY();
    }

    public void SetVertice1(int x1, int y1) {
        this.vertice1.setX(x1);
        this.vertice1.setY(y1);
    }

    public void SetVertice2(int x2, int y2) {
        this.vertice2.setX(x2);
        this.vertice2.setY(y2);
    }

    public void SetVertice3(int x3, int y3) {
        this.vertice3.setX(x3);
        this.vertice3.setY(y3);
    }
//    public void Mover(int dx, int dy) {
//        this.x1 += dx;
//        this.y1 += dy;
//        this.x2 += dx;
//        this.y2 += dy;
//        this.x3 += dx;
//        this.y3 += dy;
//    }
}
