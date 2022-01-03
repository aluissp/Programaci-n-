package NumerosFraccionarios;

public class FraccionesMixtas {

    private int entero;
    private Fracciones f1;

    public FraccionesMixtas(int entero, Fracciones f1) {
        this.entero = entero;
        this.f1 = f1;
        //Corrige la fraccion Mixta
        if (this.f1.getA() >= this.f1.getB() && this.f1.getA() > 0 && this.f1.getB() > 0) {
            CorregirMixto();
        }
    }

    public FraccionesMixtas(int entero, int a, int b) {
        this.entero = entero;
        f1 = new Fracciones(a, b);
        //Corrige la fraccion Mixta
        if (this.f1.getA() >= this.f1.getB() && this.f1.getA() > 0 && this.f1.getB() > 0) {
            CorregirMixto();
        }
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public Fracciones getF1() {
        return f1;
    }

    public void setF1(int a, int b) {
        this.f1.setA(a);
        if (b != 0) {
            this.f1.setB(b);
        }
    }

    private Fracciones MixtoAFraccion() {
        int numerador, denominador;

        numerador = (this.entero * this.f1.getB()) + this.f1.getA();
        denominador = this.f1.getB();
        return new Fracciones(numerador, denominador);
    }

    private FraccionesMixtas FraccionAMixto(Fracciones a) {
        int entero1, num, den;
        entero1 = a.getA() / a.getB();
        num = a.getA() % a.getB();
        den = a.getB();

        return new FraccionesMixtas(entero1, num, den);
    }

    private void CorregirMixto() {
        if (this.f1.getA() >= this.f1.getB() && this.f1.getA() > 0 && this.f1.getB() > 0) {
            int auxEntero, auxA, auxB;
            auxEntero = this.entero;
            auxA = this.f1.getA();
            auxB = this.f1.getB();

            setF1(auxA % auxB, auxB);
            setEntero((auxA / auxB) + auxEntero);
        }
    }

    public String imprimirMixto() {
        return +this.entero + " (" + this.f1.getA() + "/" + this.f1.getB() + ")";
    }
}
