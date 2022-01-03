package Model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {

    //Atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    ArrayList<AppointmentDoctor> appointmentDoctors=new ArrayList<>();
    ArrayList<AppointmentNurse> appointmentNurses=new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor=new AppointmentDoctor(this,doctor);
        appointmentDoctor.schedulable(date,time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }




    public Patient(String name, String email) {
        super(name, email);
    }

    //56.8
    public void setWeight(double weight) {
        this.weight = weight;
    }

    //weight + Kg.
    public String getWeight() {
        return weight + " Kg.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getBlood() {
        return blood;
    }

    //Sobreescribiendo un metodo de la clase padre
    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday + "\nWeight: " + getWeight() + "\nHeight: " + getHeight() + "\nBlood: " + blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde nacimiento");
    }
}
