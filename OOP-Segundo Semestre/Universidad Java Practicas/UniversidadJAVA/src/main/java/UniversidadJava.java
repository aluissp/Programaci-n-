import java.util.Scanner;

public class UniversidadJava {

    public static void main(String[] args) {
        
        System.out.println("Hola mundo JAVA");
        
        /* Ciclo For
        for (int i = 0; i <= 3; i++) {
            System.out.println("i= " + i);
        }*/
        // Ejercicio de estacion con SWITCH
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporcionar el valor del mes");
        int mes = scanner.nextInt();
        String estacion = null;

        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes incorrecto";
        }

        System.out.println("estacion: " + estacion + " para el mes:" + mes);
          /* // Analizar numero con switch
        int numero = 1;
        String numeroTexto = "numero desconocido";

        switch (numero) {
            case 1:
                numeroTexto = "numero uno";
                break;
            case 2:
                numeroTexto = "numero dos";
                break;
            case 3:
                numeroTexto = "numero tres";
                break;
            default:
                numeroTexto = "numero desconocido";
        }

        System.out.println("numero texto:" + numeroTexto + " para el numero proporcionado:");
         */ /* // ESTACION SEGUN EL MES
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el mes del año:");
        int mes = scanner.nextInt();//mes del año

        String estacion = null;

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        }
        else if( mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        }
        else if( mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        }
        else if( mes == 9 || mes == 10 || mes == 11){
            estacion = "Otoño";
        }
        else{
            estacion = "Mes incorrecto";
        }
       
        System.out.println("estacion:" + estacion + " para el mes: " + mes);
        
        
        
        
        
        /* //Ejercico If-else
        int numero = 1;
        String numeroTexto = "Numero desconocido";

        if (numero == 1) {
            numeroTexto = "Numero 1";
        } else if (numero == 2) {
            numeroTexto = "Numero 2";
        } else {
            numeroTexto = "Numero Desconocido";
        }
        System.out.println(numeroTexto);
         */ /* //Ejercicio Cual es el mayor?
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Proporciona el numero1:");
        int numero1 = Integer.parseInt (scanner.nextLine ());
        System.out.println ("Proporciona el numero2:");
        int numero2 = Integer.parseInt (scanner.nextLine ());
        System.out.println ("El número mayor es:");
        System.out.println (numero1> numero2? numero1: numero2);
         */ /* //Operadores condicionales
        int a = 10;
        int valorminimo = 0, valormaximo = 10;

        boolean resultado = a >= 0 && a <= valormaximo;
        System.out.println("Resultado: " + resultado);
        
        boolean vacaciones=false;
        boolean descanso=false;
        
        if(vacaciones||descanso)
            System.out.println("Puede asistir al juego con su hijo");
        else
            System.out.println("Esta ocupado");
         */ /* // Operadores de Igualdad y relacionales
        int a = 2, b = 3;
        boolean c = a == b;
        System.out.println("c= " + c);

        c = a != b;
        System.out.println("c: " + c);

        String cadena = "hola";
        String cadena2 = "adios";
        System.out.println("cadena.equals(cadena2)");

        boolean d = a <= b;
        System.out.println("d: "+d);
         */ /*
        int a=3;
        int b=-a;
        
        System.out.println("b: "+b);
        
        boolean c=true;
        boolean d=!c;
        
        System.out.println("d: "+d);
        
        // Incremento
        // Preincremento
        
        int e=3;
        int f=++e;
        
        System.out.println("f: "+f);
        
        // Postincremento
        
        int g=5;
        int h=g++;
        System.out.println("g: "+g);
        System.out.println("h: "+h);
        
        // Decremento
        // Predecremendto
        int j=22;
        int i=--j;
        System.out.println("i: "+i);
        
        
        
        // Postdrecremento
        int k=4;
        int l=k--;
        System.out.println("k: "+k);
        System.out.println("l: "+l);
         */ /* // Operadores De Asignacion
        int a=3;
        int b=5;
        int c=a-2+b;
        System.out.println("C: "+c);
        
        a+=1; // a=a+1
        System.out.println("a: "+a);
        
        a+=3; // a=a+3
        System.out.println("a: "+a);
        
        b-=1; // b=b-1
        System.out.println("b: "+b);
        //*=,/=,%=
         */ /* //Operadores Arimeticos
        int a = 4, b = 3;

        int resultado = a + b;
        System.out.println("El resultado es " + resultado);

        System.out.println("La resta es: " + (a - b));

        resultado = a * b;
        System.out.println("La multiplicacion es: " + resultado);

        double resultado1 = a*1.0 / b;
        System.out.println("La divicion es: " + resultado1);
        
        resultado =a%b;
        System.out.println("El residuo es: "+resultado);
         */ /* // Conversion de Entero a Cadena
        double numcaracter = 25;
        boolean valor = true;
        String num;
        String num2;

        num = String.valueOf(numcaracter);
        num2 = String.valueOf(valor);
        
        System.out.println("Numero 1: " + num);
        System.out.println("Numero 2: " + num2);
         */ /*// Convercion de Cadena  e Entero
        int num1;
        double num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un valor");
        num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese otro valor");
        String numcaracter = scanner.nextLine();
        num2 = Double.parseDouble(numcaracter);
         
        System.out.println("Numero: " + num1 + " " + num2);
         */ /* // Convercion de tipos primitivos String a entero o numero
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un valor");
        String valorCaracter = scanner.nextLine();
        int valorNum = Integer.parseInt(valorCaracter);

        System.out.println("El numero es: " + valorNum);

        System.out.println("Ingrese otro numero ");
        int valorNum2 = Integer.parseInt(scanner.nextLine());
        
        System.out.println("El numero es: "+valorNum2);
         */ /* //Tipos de variables primitivos
        int edad=20;
        boolean esAdulto=edad>=18;
        System.out.println("Es adulto: "+esAdulto);
        boolean booleanVar=true;
        char valor='a';
        float floatVar=1000.10f;
        double doubleVar=100.32;
         */ /*//Tipos Primitivos
        byte byteVar=12;
        short shortVar=12;
        int var=5000;
        long longVar=100L;
         */ /* // Clase Scanner
        Scanner pideinfo = new Scanner(System.in);
        
        System.out.println("Proporciona el valor del usuario");
        
        String valor = pideinfo.nextLine();
        System.out.println("Usuario: " + valor);
         */ /// Cacarteres especiales
        /*String nombre = "Carla ";
        String apellido = "Esparza";
        System.out.println(nombre + " " + apellido);
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador:\t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Retorno de carro:\r" + nombre);
        System.out.println("Comlla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");*/
          /* //Definir variable
        String saludosDesdeJava="Hola desde java";
        System.out.println(saludosDesdeJava);
         */ /* // Concatenacion de variables
        String usuario = "Juan";
        String saludar = "Hola";

        System.out.println(saludar + " " + usuario);

        int i = 3;
        int j = 4;
        System.out.println(i + j);
        System.out.println(saludar + i + j);
        System.out.println(i + j + saludar);
         */ /* // Variable tipo cadena
        String saludar="Saludos!!";
        System.out.println(saludar);
        
        String despedirse="Hasta luego";
        System.out.println(despedirse);
         */


    }

}
