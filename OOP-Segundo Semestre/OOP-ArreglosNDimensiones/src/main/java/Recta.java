
public class Recta {

    private Punto punto1;
    private Punto punto2;
    public static int cont=0;

    public Recta() {
        this.punto1 = new Punto(0, 0);
        this.punto2 = new Punto(1, 1);
        cont++;
        System.out.println("Recta: "+cont);
    }

    public Recta(int x1, int y1, int x2, int y2) {
        if (x1 != x2 || y1 != y2) {
            this.punto1 = new Punto(x1, y1);
            this.punto2 = new Punto(x2, y2);
        } else {
            this.punto1 = new Punto(0, 0);
            this.punto2 = new Punto(1, 1);
        }
        cont++;
        System.out.println("Recta: "+cont);
    }

    public void Mover(int dx, int dy) {
        this.punto1.Mover(dx, dy);
        this.punto2.Mover(dx, dy);
    }

    public Punto getExtremo1() {
        return this.punto1;
    }

    public Punto getExtremo2() {
        return this.punto2;
    }

    public double Longitud() {
        return Math.round((Math.sqrt((Math.pow(punto2.getX() - punto1.getX(), 2) + Math.pow(punto2.getY() - punto1.getY(), 2)))) * 100.0) / 100.0;
    }

    public String Imprimir() {
        return " Extremo 1: " + this.punto1.Imprimir() + " Extremo 2: " + this.punto2.Imprimir();
    }

    public void SetX1(int x1) {
        this.punto1.setX(x1);
    }

    public int GetX1() {
        return this.punto1.getX();
    }

    public void SetY1(int y1) {
        this.punto1.setY(y1);
    }

    public int GetY1() {
        return this.punto1.getY();
    }

    public void SetX2(int x2) {
        this.punto2.setX(x2);
    }

    public int GetX2() {
        return this.punto2.getX();
    }

    public void SetY2(int y2) {
        this.punto2.setY(y2);
    }

    public int GetY2() {
        return this.punto2.getY();
    }
    public void SetExtremo1(int x1, int y1){
        this.punto1.setX(x1);
        this.punto1.setY(y1);
    }
    public void SetExtremo2(int x2, int y2){
        this.punto2.setX(x2);
        this.punto2.setY(y2);
    }
}
