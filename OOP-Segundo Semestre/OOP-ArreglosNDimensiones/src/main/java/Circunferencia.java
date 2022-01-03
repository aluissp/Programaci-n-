
public class Circunferencia {

    private Punto centro;
    private double radio;
    public static int cont = 0;

    public Circunferencia(double radio, Punto centro) {
        this.radio = radio;
        this.centro = centro;
        cont++;
        System.out.println("Circunferencia: "+cont);
    }

    public Circunferencia() {
        this.radio = 1;
        this.centro = new Punto(0, 0);
        cont++;
        System.out.println("Circunferencia: "+cont);
    }

    public Circunferencia(double radio, int x, int y) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            this.radio = 1;
        }
        this.centro = new Punto(x, y);
        cont++;
        System.out.println("Circunferencia: "+cont);
    }

    public void setRadio(double radio) {
        if (radio > 0) {
            this.radio = radio;
        }
    }

    public double getRadio() {
        return this.radio;
    }

    public Punto getCentro() {
        return this.centro;
    }

    public double CalcularArea() {
        return Math.round(Math.PI * this.radio * this.radio * 100.0) / 100.0;
    }

    public double CalcularPerimetro() {
        return Math.round(2 * Math.PI * this.radio * 100.0) / 100.0;
    }

    public void Mover(int dx, int dy) {
        this.centro.Mover(dx, dy);
    }

    public String Imprimir() {
        return "radio : " + this.radio + " centro: " + this.centro.Imprimir();
    }

    public void SetX(int x) {
        this.centro.setX(x);
    }

    public int GetX() {
        return this.centro.getX();
    }

    public void SetY(int y) {
        this.centro.setY(y);
    }

    public int GetY() {
        return this.centro.getY();
    }
    public void SetCentro(int x, int y){
        this.centro.setX(x);
        this.centro.setY(y);
    }
    public Punto GetCentro(){
        return this.centro;
    }
//    public void Mover(int dx, int dy) {
//        this.x += dx;
//        this.y += dy;
//    }
}
