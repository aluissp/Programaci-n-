package Main;

public class CoordenadaRectangular {

    private double x, y;

    public CoordenadaRectangular(double x, double y) {
        this.x = x;
        this.y = y;
    } 
    
    public String Imprimir() {
        return +this.x + ", " + this.y;
    }
}
