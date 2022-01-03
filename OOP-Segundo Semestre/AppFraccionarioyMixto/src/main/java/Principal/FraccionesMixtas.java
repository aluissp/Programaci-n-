package Principal;

public class FraccionesMixtas {

    private int entero;
    private Fracciones f1;

    private int auxEntero, auxA, auxB;

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

    private void MixtoAFraccion() {
        int numerador, denominador;

        numerador = (this.entero * this.f1.getB()) + this.f1.getA();
        denominador = this.f1.getB();
        this.entero = 0;
        this.f1.setA(numerador);
        this.f1.setB(denominador);
    }

    private void MixtoAFraccion(int entero, int a, int b) {
        int numerador, denominador;

        numerador = (entero * b) + a;
        denominador = b;
        this.auxEntero = 0;
        this.auxA = numerador;
        this.auxB = denominador;
    }

    private void FraccionAMixto() {
        int entero1, num, den;
        entero1 = this.f1.getA() / this.f1.getB();
        num = this.f1.getA() % this.f1.getB();
        den = this.f1.getB();

        this.entero = entero1;
        this.f1.setA(num);
        this.f1.setB(den);
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

    public void Sumar(int entero, int a, int b) {

        if (b == 0) {
            b = 1;
        }
        MixtoAFraccion(entero, a, b);
        int auxA, auxB;

        MixtoAFraccion();
        //Suma cuando denominador es igual
        if (this.f1.getB() == this.auxB) {
            auxB = this.auxB;
            auxA = this.f1.getA() + this.auxA;
        } else {
            auxB = this.f1.getB() * this.auxB;
            auxA = (this.f1.getA() * this.auxB) + (this.auxA * this.f1.getB());
        }
        this.f1.setA(auxA);
        this.f1.setB(auxB);

        FraccionAMixto();
    }

    public void Sumar(int a, int b) {
        Sumar(0, a, b);
    }

    public void Sumar(int entero) {
        Sumar(entero, 0, 1);
    }

    public String imprimirMixto() {
        return +this.entero + " (" + this.f1.getA() + "/" + this.f1.getB() + ")";
    }

    public void Restar(int entero, int a, int b) {

        if (b == 0) {
            b = 1;
        }
        MixtoAFraccion(entero, a, b);
        int auxA, auxB;

        MixtoAFraccion();
        //Resta cuando denominador es igual
        if (this.f1.getB() == this.auxB) {
            auxB = this.auxB;
            auxA = this.f1.getA() - this.auxA;
        } else {
            auxB = this.f1.getB() * this.auxB;
            auxA = (this.f1.getA() * this.auxB) - (this.auxA * this.f1.getB());
        }
        this.f1.setA(auxA);
        this.f1.setB(auxB);

        FraccionAMixto();
    }

    public void Restar(int a, int b) {
        Restar(0, a, b);
    }

    public void Restar(int entero) {
        Restar(entero, 0, 1);
    }

    public void Multiplicar(int entero, int a, int b) {
        if (b == 0) {
            b = 1;
        }
        MixtoAFraccion(entero, a, b);
        int auxA, auxB;

        MixtoAFraccion();
        auxA = this.f1.getA() * this.auxA;
        auxB = this.f1.getB() * this.auxB;
        this.f1.setA(auxA);
        this.f1.setB(auxB);

        FraccionAMixto();
    }

    public void Multiplicar(int a, int b) {
        Multiplicar(0, a, b);
    }

    public void Multiplicar(int entero) {
        Multiplicar(entero, 0, 1);
    }

    public void Dividir(int entero, int a, int b) {
        if (b == 0) {
            b = 1;
        }
        MixtoAFraccion(entero, a, b);
        int auxA, auxB;

        MixtoAFraccion();
        auxA = this.f1.getA() * this.auxB;
        auxB = this.f1.getB() * this.auxA;
        this.f1.setA(auxA);
        this.f1.setB(auxB);

        FraccionAMixto();
    }

    public void Dividir(int a, int b) {
        Dividir(0, a, b);
    }

    public void Dividir(int entero) {
        Dividir(entero, 0, 1);
    }

    public static void main(String[] args) {
        FraccionesMixtas fm1 = new FraccionesMixtas(1, 2, 3);
        fm1.Dividir(2, 3, 4);
        System.out.println("respuesta: " + fm1.imprimirMixto());
    }
}
