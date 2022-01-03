
public class Arreglo {

    public static void main(String[] args) {

        int[] notas;
        double[] promedio;
        String[] mes;
        int[] dias;

        notas = new int[5];
        mes = new String[12];
        dias = new int[12];
        
        notas[0] = 8;
        notas[1] = 8;
        notas[2] = 9;
        notas[3] = 7;
        notas[4] = 6;

        mes[0] = "Ene";
        mes[1] = "Feb";
        mes[2] = "Mar";
        mes[3] = "Abr";
        mes[4] = "May";

        for (int i = 0; i <= 4; i++) {
            System.out.println(notas[i]);
        }
        for (int i = 0; i <= 4; i++) {
            System.out.println("El mes es: " + mes[i]);
        }

    }
}
