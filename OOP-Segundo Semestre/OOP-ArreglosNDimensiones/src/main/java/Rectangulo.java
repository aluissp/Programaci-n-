
public class Rectangulo {

    private Punto vertice;
    private double base;
    private double altura;
    public static int cont=0;

    public Rectangulo() {
        this.base = 2;
        this.altura = 1;
        this.vertice = new Punto(0, 0);
        cont++;
        System.out.println("Rectangulo: "+cont);
    }

    public Rectangulo(int x, int y, double base, double altura) {
        if (base > 0 && altura > 0 && base != altura) {
            this.base = base;
            this.altura = altura;
        } else {
            this.base = 2;
            this.altura = 1;
        }
        this.vertice = new Punto(x, y);
        cont++;
        System.out.println("Rectangulo: "+cont);
    }

    public void setBase(double base) {
        if (base > 0 && base != this.altura) {
            this.base = base;
        }
    }

    public double getBase() {
        return this.base;
    }

    public void setAltura(double altura) {
        if (altura > 0 && altura != this.base) {
            this.altura = altura;
        }
    }

    public double getAltura() {
        return this.altura;
    }

    public double CalcularArea() {
        return Math.round(this.base * this.altura * 100.0) / 100.0;
    }

    public double CalcularPerimetro() {
        return (2 * this.base) + (2 * this.altura);
    }

    public void Mover(int dx, int dy) {
        this.vertice.Mover(dx, dy);
    }

    public Punto getVertice() {
        return this.vertice;
    }

    public String Imprimir() {
        return "base : " + this.base + " altura: " + this.altura + " Vértice Inferior Izquierdo: " + this.vertice.Imprimir();
    }
    public void SetX(int x) {
        this.vertice.setX(x);
    }

    public int GetX() {
        return this.vertice.getX();
    }

    public void SetY(int y) {
        this.vertice.setY(y);
    }

    public int GetY() {
        return this.vertice.getY();
    }
    public void SetVertice(int x, int y){
        this.vertice.setX(x);
        this.vertice.setY(y);
    }
}
