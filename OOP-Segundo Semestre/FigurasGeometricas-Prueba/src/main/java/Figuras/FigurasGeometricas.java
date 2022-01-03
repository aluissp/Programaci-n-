
package Figuras;

public abstract class FigurasGeometricas {
    private Punto punto;

    public FigurasGeometricas(Punto punto) {
        this.punto = punto;
    }
    
    public abstract int Area();
    
    public abstract int Perimetro();

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }
     
}
