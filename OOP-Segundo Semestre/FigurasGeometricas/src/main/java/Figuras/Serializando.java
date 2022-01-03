package Figuras;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

public class Serializando implements Serializable {

    public static void main(String[] args) throws ClassNotFoundException {
        Cuadrado[] figuras = new Cuadrado[4];

        figuras[0] = new Cuadrado(5);
        figuras[1] = new Cuadrado(7);
        figuras[2] = new Cuadrado(4);
        figuras[3] = new Cuadrado(9);
        Cuadrado[] recuperado=null;

        try {
            ObjectOutputStream guardarObjetos = new ObjectOutputStream(new FileOutputStream("C:/Users/Armando Perugachi/Downloads/Objetos.mn"));
            guardarObjetos.writeObject(figuras);
            guardarObjetos.close();

            ObjectInputStream recuperarObjetos = new ObjectInputStream(new FileInputStream("C:/Users/Armando Perugachi/Downloads/Objetos.mn"));
            recuperado = (Cuadrado[]) recuperarObjetos.readObject();
            recuperarObjetos.close();

            
        } catch (IOException e) {

        }

        for (int i = 0; i < recuperado.length; i++) {
                System.out.println("Elemento " + (i + 1) + " " + recuperado[i]);

            }
    }
}
