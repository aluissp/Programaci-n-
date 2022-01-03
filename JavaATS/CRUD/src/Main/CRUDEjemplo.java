package Main;

import Controlador.ControladorPersona;
import Modelo.Persona;
import Modelo.ConsultaPersonas;
import Vista.vista;
import java.sql.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CRUDEjemplo {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("digito un valor doble: " + sc);
        double d = Double.parseDouble(sc.nextLine());
        System.out.println("d: " + d);*/
        
        
        vista vista = new vista();
        Persona persona = new Persona();
        ConsultaPersonas modelo = new ConsultaPersonas();
        ControladorPersona controlador = new ControladorPersona(vista, persona, modelo);

        controlador.Iniciar();
        vista.setVisible(true);

        System.out.println(JOptionPane.showConfirmDialog(null, "Esta deacuerdo con la venta?"));
        Date fecha = Date.valueOf(JOptionPane.showInputDialog("Digite la fecha actual","0000-00-00"));
//        System.out.println("fecha: " + fecha);
        //System.out.println(JOptionPane.showInputDialog("Digite la fecha actual", JOptionPane.QUESTION_MESSAGE));
        //System.out.println("redondeado: " + (Math.round(10.56 * 100.0) / 100.0));
    }

}
