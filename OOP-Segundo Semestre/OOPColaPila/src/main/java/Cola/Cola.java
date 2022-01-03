 package Cola;

import javax.swing.JOptionPane;

public class Cola {
    private Nodo inicioCola, finalCola;
    String Cola = "";
    
    public Cola(){
        this.inicioCola = null;
        this.finalCola = null;
    }
    
    //Método para saber si la cola esta vacia
    public boolean ColaVacia(){
        return this.inicioCola == null;
    }
    
    //Método para insertar a la cola
    public void Insertar(int info){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.info = info;
        nuevoNodo.siguiente = null;
        
        if (ColaVacia()==true) {
            this.inicioCola = nuevoNodo;
            this.finalCola = nuevoNodo;
        } else {
            this.finalCola.siguiente = nuevoNodo;
            this.finalCola = nuevoNodo;
        }
    }
    
    //Método para extraer de la cola
    public int Extraer(){
        if (ColaVacia()==false) {
            int info = inicioCola.info;
            
            if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;
            } else {
                inicioCola = inicioCola.siguiente;
            }
            return info;
        } else {
            return Integer.MAX_VALUE;
        }
    }
    
    //Método para mostrar el contenido de la cola
    public void MostrarContenido(){
        Nodo recorrido = inicioCola;
        String ColaInvertida = "";
        
        while(recorrido != null){
            Cola += recorrido.info + " ";
            recorrido = recorrido.siguiente;
        }
        
        String cadena [] = Cola.split(" "); //Separar cadenas de caracteres
        
        
        for (int i = cadena.length - 1; i >= 0; i--) {
            ColaInvertida += " " +cadena[i];                    
        }
        
        JOptionPane.showMessageDialog(null, ColaInvertida);
        Cola = "";
    }
}
