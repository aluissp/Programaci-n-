
public class OpIncrementoDecremento {

    public static void main(String[] args) {

        int num1 = 5, num2;

        // SUFIJO
        num1++;
        System.out.println(num1);
        num1--;
        System.out.println(num1);

        num2 = num1++;
        System.out.println(num2);

        // PREFIJO
        ++num1;
        System.out.println(num1);
        --num1;
        System.out.println(num1);

        num2 = ++num1;
        System.out.println(num2);
    }
}
