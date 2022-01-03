package Recursividad;

public class BusquedaBinaria {

    public static int Buscar(int[] A,int inf,int sup,int valor){

        if (sup >= 0 && A[inf]<=valor&&A[sup]>=valor) {
            int mitad=Mitad(inf,sup);
            if(A[mitad]==valor){
                return mitad;
            }else if (A[mitad] > valor)
            {
                return Buscar(A,inf,mitad-1,valor);
            }
            else
            {
                return Buscar(A,mitad+1,sup,valor);
            }
        }
        return -1;
    }

    public static int Mitad(int inf,int sup){
        return (inf+sup)/2;
    }
}
