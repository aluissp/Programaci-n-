package Principal;

public class Fracciones {

    private int a;
    private int b;

    public Fracciones(int a) {
        this.a = a;
        this.b = 1;

    }

    public Fracciones(int a, int b) {
        this.a = a;
        if (b == 0) {
            this.b = 1;
        } else {
            this.b = b;
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if (b != 0) {
            this.b = b;
        }
    }

    /**
     * Descripcion: Suma una fraccion pasada como parametro
     *
     * @param a Valor del numerador tipo double
     * @param b Valor del denominador tipo double, no se admite cero como
     * parametro
     * @return Retorna la direccion de memoria del objeto que contiene la
     * fraccion sumada
     *
     */
    public void sumar(int a, int b) {
        int auxA, auxB;

        if (b == 0) {
            b = 1;
        }
        //Suma cuando denominador es igual
        if (this.b == b) {
            auxB = b;
            auxA = this.a + a;
        } else {
            auxB = this.b * b;
            auxA = (this.a * b) + (a * this.b);
        }
        this.a = auxA;
        this.b = auxB;
    }

    public void sumar(int a) {
        sumar(a, 1);
    }

    public void sumar(Fracciones f1) {
        sumar(f1.a, f1.b);
    }

    /**
     * Descripcion: Suma una unidad a la fraccion
     *
     * @return Retorna la direccion de memoria del objeto que contiene la
     * fraccion sumada
     *
     */
    public void sumar() {
        sumar(1, 1);
    }

    //RESTAR
    public void restar(int a, int b) {

        int auxA, auxB;

        if (b == 0) {
            b = 1;
        }
        //Resta cuando denominador es igual
        if (this.b == b) {
            auxB = b;
            auxA = this.a - a;
        } else {
            auxB = this.b * b;
            auxA = (this.a * b) - (a * this.b);
        }
        this.a = auxA;
        this.b = auxB;
    }

    public void restar(int a) {
        restar(a, 1);
    }

    public void resta(Fracciones f1) {
        restar(f1.a, f1.b);
    }

    public void resta() {
        restar(1, 1);
    }

    //MULTIPLICACION
    public void multiplicacion(int a, int b) {

        if (b == 0) {
            b = 1;
        }
        int auxA = this.a * a;
        int auxB = this.b * b;
        this.a = auxA;
        this.b = auxB;
    }

    public void multiplicacion(int a) {
        multiplicacion(a, 1);
    }

    public void multliplicacion(Fracciones f2) {
        multiplicacion(f2.a, f2.b);
    }

    //DIVISION
    public void division(int a, int b) {
        if (b == 0) {
            b = 1;
        }

        int auxA = this.a * b;
        int auxB = this.b * a;
        this.a = auxA;
        this.b = auxB;
    }

    public void division(int a) {
        division(a, 1);
    }

    public void division(Fracciones f1) {
        division(f1.a, f1.b);
    }

    public void simplificarFraccion() {
        int[] nPrimo = {2, 3, 5, 7, 11, 13, 17, 19};

        while ((this.a % 2 == 0 && this.b % 2 == 0) || (this.a % 3 == 0 && this.b % 3 == 0) || (this.a % 5 == 0 && this.b % 5 == 0)
                || (this.a % 7 == 0 && this.b % 7 == 0) || (this.a % 11 == 0 && this.b % 11 == 0) || (this.a % 13 == 0 && this.b % 13 == 0)
                || (this.a % 17 == 0 && this.b % 17 == 0) || (this.a % 19 == 0 && this.b % 19 == 0)) {

            for (int i = 0; i < nPrimo.length; i++) {
                if (this.a % nPrimo[i] == 0 && this.b % nPrimo[i] == 0) {
                    this.a /= nPrimo[i];
                    this.b /= nPrimo[i];
                }
            }
        }
    }

    public String imprimirFraccion() {
        return "" + this.a + "/" + this.b;
    }
}
