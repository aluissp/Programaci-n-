package Principal;

public class Main {

    public static void main(String[] args) {
        CuentaBancaria.saldoMinimo=50;

        CuentaBancaria c1=new CuentaBancaria(new Usuario("Maite Perugachi",new Fecha(8,23,2009)),"hola",320);
        c1.depositar(30);

        System.out.println(c1.imprimirDatos());

        c1.retirar(300);
        c1.depositar(300);
        System.out.println(c1.imprimirDatos());
    }
}
