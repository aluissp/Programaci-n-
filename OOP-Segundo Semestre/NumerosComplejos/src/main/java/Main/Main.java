package Main;

import Complejos.NumerosComplejos;

public class Main {
    public static void main(String[] args) {

        NumerosComplejos z1=new NumerosComplejos(3,2);
        NumerosComplejos z3;

        z3=z1.Multiplicar(-1,2);

        System.out.println(z3.imprimirImaginario());
    }
}
