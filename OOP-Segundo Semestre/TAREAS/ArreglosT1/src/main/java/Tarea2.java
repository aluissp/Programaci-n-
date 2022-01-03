
public class Tarea2 {
    
    public static void main(String[] args) {
        
        int[] numRandom = new int[10];
        
        numRandom[0] = 32;
        numRandom[1] = 23;
        numRandom[2] = 54;
        numRandom[3] = 90;
        numRandom[4] = 98;
        numRandom[5] = 55;
        numRandom[6] = 8;
        numRandom[7] = 22;
        numRandom[8] = 57;
        numRandom[9] = 66;
        
        System.out.println("Pocicion par");
        for (int i = 0; i < 10; i++) {
            if(i%2==0){
            System.out.println(numRandom[i]);
            }
        }
        System.out.println("Pocicion impar");
        for (int i = 0; i < 10; i++) {
            if(i%2!=0){
            System.out.println(numRandom[i]);
            }
        }
    }
}
