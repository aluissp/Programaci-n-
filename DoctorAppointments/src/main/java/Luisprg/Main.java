package Luisprg;

import Model.Patient;
import Model.Doctor;
import Model.User;
import java.util.Date;
import static ui.UIMenu.*;

public class Main {

    public static void main(String[] args) {
        showMenu();
        Doctor myDoctor = new Doctor("Brayancito", "bry69@mail.com", "Odontologia");

        Patient patientJason = new Patient("Jason Vargas", "jaison69@email.com");
        patientJason.setWeight(55.2);
        patientJason.setPhoneNumber("0978123351");
/*
        myDoctor.addAvailbleAppointment(new Date(), "4pm");
        myDoctor.addAvailbleAppointment(new Date(), "12am");
        myDoctor.addAvailbleAppointment(new Date(), "2pm");

        patientJason.showDataUser();
        myDoctor.showDataUser();
        System.out.println("\n\n");


 */
        
        /*
        System.out.println("Direccion de los objetos creados citas: " + myDoctor.getAvailbleAppointment());
        System.out.println("\n\n");*/
        
        

        /*
        for (Doctor.AvailbleAppointment i : myDoctor.getAvailbleAppointment()) {
            System.out.println(i.getDate() + " " + i.getTime());
        }*/
        System.out.println("\n" + patientJason);
        System.out.println("\n" + myDoctor);

        /*System.out.println(Day.MONDAY);
        System.out.println(Day.TUESDAY.getSpanish());*/

        //Clases anonimas xdxd
        User user1=new User("Armando","luis@mail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor \nHospital: Cruz Verde \nDepartamento: Geriatria");
            }
        };
        System.out.println();


        user1.showDataUser();
    }

    //Declarando colecciones de constantes
    /*public enum Numero{
            UNO("One"),
            DOS("Two"),
            TRES("Three"),
            CUATRO("Four"),
            CINCO("Five"),
            SEIS("Six"),
            SIETE("Seven"),
            OCHO("Eight"),
            NUEVE("Nine"),
            DIEZ("Ten");

            private String english;

            private Numero(String e){
                english = e;
            }

            public String getEnglish() {
                return english;
            }
    }*/
    public static enum Day {
        MONDAY("Lunes"),
        TUESDAY("Martes");
        private final String spanish;

        private Day(String s) {
            spanish = s;
        }

        public String getSpanish() {
            return spanish;
        }
    }
}
