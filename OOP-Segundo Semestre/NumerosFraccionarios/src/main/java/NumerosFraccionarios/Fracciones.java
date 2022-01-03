package NumerosFraccionarios;

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
    public Fracciones sumar(int a, int b) {
        Fracciones sumaFracciones;
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
        sumaFracciones = new Fracciones(auxA, auxB);
        return sumaFracciones;
    }

    public Fracciones sumar(int a) {
        return sumar(a, 1);
    }

    public Fracciones sumar(Fracciones f1) {
        return sumar(f1.a, f1.b);
    }

    /**
     * Descripcion: Suma una unidad a la fraccion
     *
     * @return Retorna la direccion de memoria del objeto que contiene la
     * fraccion sumada
     *
     */
    public Fracciones sumar() {
        return sumar(1, 1);
    }

    //RESTAR
    public Fracciones restar(int a, int b) {
        Fracciones restaFracciones;
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
        restaFracciones = new Fracciones(auxA, auxB);
        return restaFracciones;
    }

    public Fracciones restar(int a) {
        return restar(a, 1);
    }

    public Fracciones resta(Fracciones f1) {
        return restar(f1.a, f1.b);
    }

    public Fracciones resta() {
        return restar(1, 1);
    }

    //MULTIPLICACION
    public Fracciones multiplicacion(int a, int b) {
        Fracciones productoFracciones;
        if (b == 0) {
            b = 1;
        }
        productoFracciones = new Fracciones((this.a * a), (this.b * b));
        return productoFracciones;
    }

    public Fracciones multiplicacion(int a) {
        return multiplicacion(a, 1);
    }

    public Fracciones multliplicacion(Fracciones f1) {
        return multiplicacion(f1.a, f1.b);
    }

    //DIVISION
    public Fracciones division(int a, int b) {
        Fracciones cocienteFracciones;
        if (b == 0) {
            b = 1;
        }
        cocienteFracciones = new Fracciones((this.a * b), (this.b * a));
        return cocienteFracciones;
    }

    public Fracciones division(int a) {
        return division(a, 1);
    }

    public Fracciones division(Fracciones f1) {
        return division(f1.a, f1.b);
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
