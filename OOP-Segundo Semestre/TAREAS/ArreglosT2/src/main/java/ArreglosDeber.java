
public class ArreglosDeber {

    public int numMayor(int[] a) {
        int mayor = a[0];

        int num1 = 0;
        for (int i = 0; i < a.length; i++) {
            num1 = a[i];
            if (num1 > mayor) {
                mayor = num1;
            }

        }
        return mayor;
    }

    public int numMenor(int[] a) {
        int menor = a[0];
        int num1 = 0;
        for (int i = 0; i < a.length; i++) {
            num1 = a[i];

            if (num1 < menor) {
                menor = num1;
            }
        }
        return menor;
    }

    public int contMayor(int mayor, int[] a) {
        int cantMayor = 0;

        int num1 = 0;
        for (int j = 0; j < a.length; j++) {
            num1 = a[j];
            if (num1 == mayor) {
                cantMayor++;
            }

        }
        return cantMayor;
    }

    public int contMenor(int menor, int[] a) {

        int cantMenor = 0;
        int num1 = 0;
        for (int j = 0; j < a.length; j++) {
            num1 = a[j];
            if (num1 == menor) {
                cantMenor++;
            }

        }
        return cantMenor;
    }
    
    public int[] orAscendente(int[] a){
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            if (i != min) {

                int aux = a[i];
                a[i] = a[min];
                a[min] = aux;
            }
        }
        return a;
    }
}
