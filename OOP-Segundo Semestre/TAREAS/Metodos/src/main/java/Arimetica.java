
public class Arimetica {

    public int sumar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public double pesoColombiano(double a) {
        double resultado = a * 3657.07;
        return resultado;
    }

    public double euro(double a) {
        double resultado = a * 0.85;
        return resultado;
    }

    public void bisiesto(int a) {
        int residuo4 = a % 4;
        int residuo100 = a % 100;
        int residuo400 = a % 400;

        boolean resultado = residuo4 == 0 || residuo100 == 0 || residuo400 == 0;

        if (resultado) {
            System.out.println("El año " + a + " es bisiesto");
        } else {
            System.out.println("El año " + a + " no es bisiesto");
        }
    }
    
    public static int diasDelMes(int mes, int año) {
        switch (mes) {
            case 0:  
            case 2:  
            case 4:  
            case 6:  
            case 7:  
            case 9: 
            case 11: 
                return 31;
            case 3:  
            case 5:  
            case 8:  
            case 10: 
                return 30;
            case 1:  // Febrero
                if (((año % 100 == 0) && (año % 400 == 0))
                        || ((año % 100 != 0) && (año % 4 == 0))) {
                    return 29;  
                } else {
                    return 28;
                }
            default:
                throw new java.lang.IllegalArgumentException("El mes debe estar entre 0 y 11");

        }
    }
}
