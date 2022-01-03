
public class Elipse {

    private Punto centro;
    private double semiejeMayor;
    private double semiejeMenor;
    public static int cont=0;

    public Elipse() {
        this.semiejeMayor = 2;
        this.semiejeMenor = 1;
        this.centro = new Punto(0, 0);
        cont++;
        System.out.println("Elipse: "+cont);
    }

    public Elipse(int x, int y, double semiejeMayor, double semiejeMenor) {
        if (semiejeMayor > 0 && semiejeMenor > 0 && semiejeMayor != semiejeMenor) {
            this.semiejeMayor = semiejeMayor;
            this.semiejeMenor = semiejeMenor;
        } else {
            this.semiejeMayor = 2;
            this.semiejeMenor = 1;
        }
        this.centro = new Punto(x, y);
        cont++;
        System.out.println("Elipse: "+cont);
    }

    public void setSemiejeMayor(double semiejeMayor) {
        if (semiejeMayor > 0 && semiejeMayor != this.semiejeMenor) {
            this.semiejeMayor = semiejeMayor;
        }
    }

    public double getSemiejeMayor() {
        return this.semiejeMayor;
    }

    public void setSemiejeMenor(double semiejeMenor) {
        if (semiejeMenor > 0 && semiejeMenor != this.semiejeMayor) {
            this.semiejeMenor = semiejeMenor;
        }
    }

    public double getSemiejeMenor() {
        return this.semiejeMenor;
    }

    public double CalcularArea() {
        return Math.round(Math.PI * this.semiejeMayor * this.semiejeMenor * 100.0) / 100.0;
    }

    public double CalcularPerimetro() {
        return Math.round(2 * Math.PI * Math.sqrt((Math.pow(this.semiejeMayor, 2) + Math.pow(this.semiejeMenor, 2)) / 2) * 100.0) / 100.0;
    }

    public void Mover(int dx, int dy) {
        this.centro.Mover(dx, dy);
    }

    public Punto getCentro() {
        return this.centro;
    }

    public String Imprimir() {
        return "semieje mayor: " + this.semiejeMayor + " semieje menor: " + this.semiejeMenor + " Centro: " + this.centro.Imprimir();
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
//
//    public void Mover(int dx, int dy) {
//        this.x += dx;
//        this.y += dy;
//    }
}
