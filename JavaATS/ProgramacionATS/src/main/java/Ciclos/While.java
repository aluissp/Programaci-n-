package Ciclos;

public class While {

    public static void main(String[] args) {
        int i = 1, j = 10, z = 1;

        //Ascendente
        System.out.println("Ascendente");
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println();

        //Descendente
        System.out.println("Descendente");
        while (j > 0) {
            System.out.println(j);
            j--;
        }
        System.out.println();

        //Alternado
        System.out.println("Alternado");
        while (z <= 50) {
            System.out.println(z);
            z *= 3;
        }
    }
}
