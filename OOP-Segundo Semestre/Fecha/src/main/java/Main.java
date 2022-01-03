
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Fecha fechaActual = new Fecha();
        Fecha fecha3 = new Fecha(31, 12, 2020);
        System.out.println(fechaActual.imprimirDatos() + "\n");

        Fecha fecha2 = new Fecha(30, 12, 2020);
        System.out.println("Año bisiesto: " + fecha2.añoBisiesto());
        System.out.println("Los dias de este mes son: " + fecha2.diasMes());

        //cambio el valor del dia, mes y año
        fecha2.setDia(1);
        fecha2.setMes(1);
        fecha2.setAño(2020);
        System.out.println(fecha2.imprimirDatos(false));
        fecha2.incrementaDia(366);
        System.out.println(fecha2.imprimirDatos());

        fecha2.decrementaDia(32);
        System.out.println(fecha2.imprimirDatos(false));
        fecha2.setDia(1);
        fecha2.setMes(12);
        fecha2.setAño(2021);

        System.out.println("El valor es: " + fecha3.compararFecha() + "\n");
        System.out.println("El valor es: " + fecha2.compararFecha(fechaActual));

        Fecha date = new Fecha(5, 1, 2021);
        Fecha fNacimiento = new Fecha(5, 1, 2002);
        System.out.println("\n\nEdad del usuario: \n" + fNacimiento.Edad().imprimirDatos());
        System.out.println("Edad del usuario: \n" + fNacimiento.Edad(date).imprimirDatos());

        //Arreglo de objetos
        Fecha[] fechasA;
        fechasA = new Fecha[5];
        fechasA[0] = new Fecha();
        fechasA[1] = new Fecha(5, 1, 2002);
        fechasA[2] = new Fecha(4, 1, 2021);

        for (int i = 0; i < fechasA.length; i++) {
            if(fechasA[i]!=null)
                System.out.println((i + 1) + ".- " + fechasA[i].imprimirDatos(true));
        }
        
        System.out.println("\n\n "+fechasA);
    }
}
