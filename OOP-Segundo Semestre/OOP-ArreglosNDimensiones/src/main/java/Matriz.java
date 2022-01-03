
public class Matriz {

    private int[][] A;

    public Matriz(int fil, int col) {
        A = new int[fil][col];
    }

    public void setValor(int fil, int col, int valor) {
        A[fil][col] = valor;
    }

    public int getValor(int fil, int col) {
        return A[fil][col];
    }

    public void Unos() {
        for (int fil = 0; fil < this.A.length; fil++) {
            for (int col = 0; col < this.A[fil].length; col++) {
                this.A[fil][col] = 1;
            }
        }
    }

    public boolean Identidad() {
        if (A.length == A[0].length) {
            for (int fil = 0; fil < this.A.length; fil++) {
                for (int col = 0; col < this.A[fil].length; col++) {
                    if (fil == col) {
                        this.A[fil][col] = 1;
                    } else {
                        this.A[fil][col] = 0;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
    
    public Matriz Transpuesta()
    {
        Matriz mr;
        
        mr = new Matriz(A[0].length, A.length);
        
          for (int fil = 0; fil < this.A.length; fil++) {
            for (int col = 0; col < this.A[fil].length; col++) {
             mr.setValor(col, fil, A[fil][col]);
             //mr.A[col][fil] = A[fil][col];
            }
        }
        return mr;
    }

    public void LlenarRandom()
    {
          for (int fil = 0; fil < this.A.length; fil++) {
            for (int col = 0; col < this.A[fil].length; col++) {
             
             A[fil][col]=(int)(Math.random()*100);
            }
        }
    }
    public void Imprimir() {

        for (int fil = 0; fil < this.A.length; fil++) {
            for (int col = 0; col < this.A[fil].length; col++) {
                System.out.print(this.A[fil][col] + "  ");

            }
            System.out.println("");

        }
    }

}
