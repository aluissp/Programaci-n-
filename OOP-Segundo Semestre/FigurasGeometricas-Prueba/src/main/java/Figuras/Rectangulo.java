package Figuras;

public class Rectangulo extends FigurasGeometricas implements Imprimible {

    private int base, altura;

    public Rectangulo(int base, int altura, Punto punto) {
        super(punto);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int Area() {
        return this.base * this.altura;
    }

    @Override
    public int Perimetro() {
        return (2 * this.base) + (2 * this.altura);
    }

    @Override
    public String Imprimir() {
        return "Base: " + this.base
                + "\nAltura: " + this.altura
                + "\nPunto: " + super.getPunto().Imprimir();
    }

}
