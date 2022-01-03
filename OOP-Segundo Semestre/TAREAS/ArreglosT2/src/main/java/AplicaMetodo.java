
public class AplicaMetodo {

    public static void main(String[] args) {

        Arreglos arr = new Arreglos();
        int tam = 10;
        int[] a = new int[tam];

        System.out.println("Imprime");
        
        arr.llenaArreglo(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("--------------");
        arr.arrParametro(1, 31, a);
       
    }
    
}
