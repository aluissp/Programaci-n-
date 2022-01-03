
public class Tarea70 {

    public static void main(String[] args) {

        int[] aNum;
        int cant;
        int num;

        cant = 10;

        aNum = new int[cant];

        for (int i = 0; i < aNum.length; i++) {
            aNum[i] = (int) (Math.random() * 50 + 1);;
        }

        aNum[0] = 10;
        aNum[1] = 9;
        aNum[2] = 10;
        aNum[3] = 10;
        aNum[4] = 25;
        aNum[5] = 19;
        aNum[6] = 12;
        aNum[7] = 46;
        aNum[8] = 54;
        aNum[9] = 10;

        System.out.println("\nArreglo de numeros ");
        for (int i = 0; i < aNum.length; i++) {
            System.out.println(i + 1 + ".- " + aNum[i]);
        }

        num = 10;

        for (int i = 0; i < aNum.length; i++) {
            while (num == aNum[i]) {
                //Console.WriteLine(" Ciclo de reemplazo " );

                for (int j = i; j < aNum.length - 1; j++) {
                    aNum[j] = aNum[j + 1];
                    //Console.WriteLine(i + " - " + j);
                    //Console.ReadKey();
                }
                aNum[aNum.length - 1] = 0; // Asignando cero a la ultima posicion

                //Console.WriteLine(" FIN Ciclo de reemplazo\n\n ");
                // i--;
            }
        }

        System.out.println("\nArreglo de numeros ");
        for (int i = 0; i < aNum.length; i++) {
            System.out.println(i + 1 + ".- " + aNum[i]);
        }
    }
}
