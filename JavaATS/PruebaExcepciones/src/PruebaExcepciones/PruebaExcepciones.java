/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaExcepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Armando Perugachi
 */
public class PruebaExcepciones {

    private int numero;
    private Scanner sc;

    public static void main(String[] args)  {
        PruebaExcepciones p = new PruebaExcepciones();
//        p.operaciones2();
        try {
            p.introducirNumeros();
        } catch (ExcepcionPersonalizada ex) {
            System.out.println("Has digitado el numero cero");
        }
    }

    public void introducirNumeros() throws ExcepcionPersonalizada {
        sc = new Scanner(System.in);

        do {
            System.out.println("Digite un numero");
            numero = sc.nextInt();

            if (numero == 0) {
                throw new ExcepcionPersonalizada();
            }
        } while (numero != 0);

    }

    public void leerArchivo() throws FileNotFoundException {
        File archivo = new File("D:\\users\\prueba.txt");
        FileReader fr = new FileReader(archivo);
    }

    public void leerArchivo2() {
        try {
            leerArchivo();
        } catch (FileNotFoundException ex) {
            System.out.println("No se ha encontrado el archivo, por favor verifique la ruta");
        } catch (IOException e) {
            System.out.println("Se ha encontrado una excepcion verificada");
        }
    }

    public void operaciones() {
        int n1 = 4;
        int n2 = 0;

        System.out.println("El resultado es: " + n1 / n2);
    }

    public void operaciones2() {
        try {
            operaciones();
        } catch (ArithmeticException e) {
            System.out.println("Ha ocurrido un error, se ha intentado dividir entre cero");
        }

        System.out.println("Programa terminado");
    }
}
