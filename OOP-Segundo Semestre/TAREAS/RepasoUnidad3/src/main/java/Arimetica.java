
import java.util.Scanner;

public class Arimetica {

    public int sumaRango(int a, int b) {

        int suma = 0;
        for (int contador = a; contador <= b; contador++) {

            while (a <= b) {
                suma = suma + a;
                a++;
            }
        }
        return suma;
    }

    public int sumaPares(int a, int b) {

        int suma = 0;
        for (int contador = a; contador <= b; contador++) {

            while (a <= b) {

                if (a % 2 == 0) {
                    suma = suma + a;

                }
                a++;
            }

        }
        return suma;

    }

    public int sumaImpares(int a, int b) {

        int suma = 0;
        for (int contador = a; contador <= b; contador++) {

            while (a <= b) {

                if (a % 2 != 0) {
                    suma = suma + a;

                }
                a++;
            }

        }
        return suma;

    }

    public int sumaMultiplo(int a, int b, int c) {

        int suma = 0;
        for (int contador = a; contador <= b; contador++) {

            while (a <= b) {

                if (a % c == 0) {
                    suma = suma + a;

                }
                a++;
            }

        }
        return suma;

    }

    public int sumaCantMultiplo(int a, int b, int c) {

        int suma = 0;
        for (int contador = a; contador <= b; contador++) {

            while (a <= b) {

                if (a % c == 0) {
                    suma++;

                }
                a++;
            }

        }
        return suma;

    }

    public int sumaPromMultiplo(int a, int b, int c) {

        int suma = 0;
        int cont = 0;
        int promedio = 0;
        for (int contador = a; contador <= b; contador++) {

            while (a <= b) {

                if (a % c == 0) {
                    suma = suma + a;
                    cont++;
                    promedio = suma / cont;

                }
                a++;
            }

        }
        return promedio;

    }

    public void tabPitagoras(int a, int b) {
        int ini = a;
        int fin = b;
        int salvar = ini;
        int salvar1 = fin;

        System.out.print("X\t");

        for (ini = 1; ini <= fin; ini++) {
            System.out.print(ini + "\t");
            if (ini == fin) {
                System.out.println();
            }
        }

        for (salvar = 1; salvar <= salvar1; salvar++) {

            System.out.print(salvar + "\t");

            for (fin = 1; fin <= salvar1; fin++) {
                System.out.print((salvar * fin) + "\t");

            }
            System.out.println();
        }
    }

    public double promedio0(double a) {

        double suma = 0;
        double cont = 0;
        double promedio = 0;

        Scanner scanner = new Scanner(System.in);

        while (a != 0) {

            suma = suma + a;
            cont++;
            promedio = suma / cont;

            a = scanner.nextInt();
        }
        return promedio;

    }
    public int potencia(int a, int b) {

        int contador;
        int resultado = 1;

        for (contador = 1; contador <= b; contador++) {
            resultado = resultado * a;
        }
        return resultado;

    }
    public int binario(int a){
        
        Arimetica arimetica = new Arimetica();
        int residuo = 0;
        int bin=0;
        int exp=0;

        while (a != 0) {
            residuo = a % 2;
            bin = bin + residuo * arimetica.potencia(10, exp);
            exp++;
            a/= 2;

        }
        return bin;
    }
        public int intbABinario(int a){
        
        Arimetica arimetica = new Arimetica();
        int residuo = 0;
        int entero=0;
        int exp=0;

        while (a != 0) {
            residuo = a % 10;
            entero = entero + residuo * arimetica.potencia(2, exp);
            exp++;
            a/= 10;

        }
        return entero;
    }
            

}
