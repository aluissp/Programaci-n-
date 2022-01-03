package Main;

public class CoordenadasPolares {

    private double angulo, r;

    public CoordenadasPolares(double angulo, double r) {

        if (angulo >= 0) {
            this.angulo = angulo;
        }

        if (r >= 0) {
            this.r = r;
        }
    }

    public CoordenadasPolares(double r) {

        this.angulo = 0;

        if (r >= 0) {
            this.r = r;
        }
    }

    public void setAngulo(double angulo) {
        if (angulo >= 0) {
            this.angulo = angulo;
        }
    }

    public double getAngulo() {
        return this.angulo;
    }

    public void setR(double r) {
        if (r >= 0) {
            this.r = r;
        }
    }

    public double getR() {
        return this.r;
    }

    public double senoX() {
        double sen = 0;

        for (int i = 0; i < 1000; i++) {

            sen += (Potencia(-1, i) * Potencia(Radian(), (2 * i + 1))) / Factorial(2 * i + 1);
        }

        return sen;
    }

    private double senoX(double angulo) {
        double sen = 0;

        for (int i = 0; i < 1000; i++) {

            sen += (Potencia(-1, i) * Potencia(angulo*Math.PI/180, (2 * i + 1))) / Factorial(2 * i + 1);
        }

        return sen;
    }

    public double cosX() {
        double sen = 0;

        for (int i = 1; i < 1000; i++) {

            sen += (Potencia(-1, i) * Potencia(Radian(), (2 * i))) / Factorial(2 * i);
        }

        return sen;
    }

    private double cosX(double angulo) {
        double sen = 0;

        for (int i = 1; i < 1000; i++) {

            sen += (Potencia(-1, i) * Potencia(angulo, (2 * i))) / Factorial(2 * i);
        }

        return sen;
    }

    private double Potencia(double base, int exponente) {

        int r = 1;
        for (int i = 0; i < exponente; i++) {
            r *= base;
        }

        return r;
    }

    private double Factorial(int valor) {
        int r = 1;

        for (int i = valor; i > 1; i--) {
            r *= i ;
        }

        return r;
    }

    public CoordenadaRectangular Transformar() {
        CoordenadaRectangular cRectangular;

        cRectangular = new CoordenadaRectangular((this.r * cosX(this.angulo)), (this.r * senoX(this.angulo)));

        return cRectangular;
    }

    public double Radian() {
        return (this.angulo * Math.PI) / 180;
    }

    public String Imprimir() {
        return +this.angulo + "°, " + this.r;
    }

//    public static void main(String[] args) {
//
//        CoordenadasPolares f1 = new CoordenadasPolares(45, 9);
//
//        double a=f1.senoX();
//        System.out.println(a);
//    }
}
