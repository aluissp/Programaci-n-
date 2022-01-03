package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    private String speciality;
    ArrayList<AvailbleAppointment> availbleAppointment = new ArrayList<>(); //Este es un atributo de la clase principal 

    public Doctor(String name, String email, String speciality) {
        super(name, email);
        this.speciality = speciality;
    }

    /*//Comportamientos
    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID doctor: " + id);
    }*/
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    //Metodo para añadir citas medicas mediante un array de coleccion de datos
    public void addAvailbleAppointment(String date, String time) {
        availbleAppointment.add(new Doctor.AvailbleAppointment(date, time));
    }

    //Ayuda a devolver la lista completa de citas
    public ArrayList<AvailbleAppointment> getAvailbleAppointment() {
        return availbleAppointment;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailble" +availbleAppointment.toString() ;
    }



    //availbleAppointment.toString()//Aux xdxd
    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Roja");
        System.out.println("Departamento: Cancerologia");
    }



    //Citas disponibles
    public static class AvailbleAppointment {

        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");

        public AvailbleAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public Date getDate(String Date) {
            return date;
        }

        public String getDate() {
            return format.format(date);
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTime() {
            return time;
        }

        @Override
        public String toString() {
            return "Aviable Appointment \nDate: " + date + "\nTime: " + time;
        }
    }
}
