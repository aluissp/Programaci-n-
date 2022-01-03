
public class Tarea68 {

    public static void main(String[] args) {

        int[] numeros = {73, 50, 9, 18, 10, 42, 65, 27, 39, 59};

        ArreglosDeber arr = new ArreglosDeber();
        arr.orAscendente(numeros);

        for (int num : numeros) {
            System.out.println(num);
        }

        /* System.out.println("Orden ascendente:");

        for (int i = 0; i < numeros.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[min]) {
                    min = j;
                }
            }

            if (i != min) {

                int aux = numeros[i];
                numeros[i] = numeros[min];
                numeros[min] = aux;
            }
        }
        for (int num : numeros) {
            System.out.println(num);
        }*/
    }
}
