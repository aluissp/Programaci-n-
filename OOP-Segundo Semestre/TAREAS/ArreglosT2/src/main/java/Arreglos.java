
public class Arreglos {

    public int numAl(int ini, int fin) {
        int n;

        n = (int) (Math.random() * (fin - ini + 1) - ini);

        ini = 0;
        fin = 1;
        return n;
    }

    public void llenaArreglo(int[] A) {

        Arreglos arr = new Arreglos();
        for (int i = 0; i < A.length; i++) {
            A[i] = arr.numAl(20, 30);
        }
    }

    public void impriArr(int A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }

    public void arrParametro(int ini, int fin, int[] A) {

        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * (fin - ini + 1) - ini);
            System.out.println(A[i]);
        }
    }

    public int[] arrDelvdireccion(int ini, int fin, int[] A) {
        int[] C = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            C[i] = (int) (Math.random() * (fin - ini + 1) - ini);
        }
        return C;
    }

    public int[] SumaArreglo(int[] A, int[] B) {
        int[] C = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }
        return C;
    }

}
