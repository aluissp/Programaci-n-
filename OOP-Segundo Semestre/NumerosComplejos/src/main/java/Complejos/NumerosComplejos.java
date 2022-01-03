package Complejos;

public class NumerosComplejos {

    private double a;
    private double bImaginario;

    public NumerosComplejos(double a, double bImaginario) {
        this.a = a;
        this.bImaginario = bImaginario;
    }

    //Este constructor solo necesita un valor imaginario
    public NumerosComplejos(double bImaginario) {
        new NumerosComplejos(1,bImaginario);
        this.bImaginario = bImaginario;
    }

    public NumerosComplejos Sumar(double c, double dImaginario) {
        return new NumerosComplejos((this.a + c), (this.bImaginario + dImaginario));
    }

    public NumerosComplejos Sumar(int dImaginario) {
        return Sumar(1, dImaginario);
    }

    public NumerosComplejos Restar(int c, int dImaginario) {
        return new NumerosComplejos((this.a - c), (this.bImaginario - dImaginario));
    }

    public NumerosComplejos Restar(int dImaginario) {
        return Restar(1, dImaginario);
    }

    public NumerosComplejos Multiplicar(int c, int dImaginario) {
        return new NumerosComplejos(((this.a * c) - (this.bImaginario * dImaginario)), (this.a * dImaginario) + (this.bImaginario * c));
    }

    public NumerosComplejos Multiplicar(int dImaginario) {
        return Multiplicar(1, dImaginario);
    }

    public NumerosComplejos Dividir(int c, int dImaginario) {
        double entero, imaginario;
        entero = ((this.a * c) + (this.bImaginario * dImaginario)) / (c * c + dImaginario * dImaginario);
        imaginario = ( (this.a * dImaginario) -(this.bImaginario * c)) / (c * c + dImaginario * dImaginario);

        return new NumerosComplejos(entero, imaginario);
    }

    public NumerosComplejos Dividir(int dImaginario) {
        return Dividir(1, dImaginario);
    }

    public String imprimirImaginario() {
        return "(" + this.a + ", " + this.bImaginario + "i)";
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getA() {
        return this.a;
    }

    public void setBImaginario(int bImaginario) {
        this.bImaginario = bImaginario;
    }

    public double getBImaginario() {
        return this.bImaginario;
    }
}
