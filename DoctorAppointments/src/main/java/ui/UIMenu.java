package ui;

import Model.Doctor;
import Model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void showMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a mi cita");
        System.out.println("Porfavor seleccione una opcion");

        int opcion;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Paciente");
            System.out.println("0. Salir");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Doctor");
                authUser(1);
                opcion=0;
            } else if (opcion == 2) {
                opcion = 0;
                authUser(2);
            } else if (opcion == 0) {
                System.out.println("Gracias por su visita");
            } else {
                System.out.println("Porfavor seleccione una opcion correcta");
            }
        } while (opcion != 0);
    }

    private static void authUser(int userType){
        //UserType = 1 Doctor
        //UserType = 2 Patient

        String email;
        Scanner sc =new Scanner(System.in);


        ArrayList<Doctor> doctors=new ArrayList<>();
        doctors.add(new Doctor("Armando Perugachi","armando@mail.com","Dentista"));
        doctors.add(new Doctor("Alejandro Martinez","alejandro@mail.com","Medicina General"));
        doctors.add(new Doctor("Karen Sosa","karen@mail.com","Nutriologia"));

        ArrayList<Patient> patients=new ArrayList<>();
        patients.add(new Patient("Anahi Salgado","anahi@mail.com"));
        patients.add(new Patient("Jason Vargas","jaison69@mail.com"));
        patients.add(new Patient("Carlos Sanchez","carlos@mail.com"));


        boolean emailCorrect=false;
        do {
            System.out.println("Insert your email: [a@a.com]");
            email=sc.nextLine();

            if(userType==1){
                for (Doctor d: doctors) {
                   if(d.getEmail().equals(email)){
                       emailCorrect=true;
                       //Obtener el usuario logeado
                       doctorLogged=d;
                       UIDoctorMenu.showDoctorMenu();
                       //ShowDoctorMenu
                   }
                }
                 
            }else if(userType==2){
                for (Patient p: patients) {
                    if(p.getEmail().equals(email)){
                        emailCorrect=true;
                        //Obtener el usuario logeado
                        patientLogged=p;
                        UIPatientMenu.showPatientMenu();
                        //ShowPatientMenu
                    }
                }
            }

        }while (!emailCorrect);
    }

    static void showMenuPatient() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n\nPaciente");
            System.out.println("1. Reservar una cita");
            System.out.println("2. Mi cita");
            System.out.println("0. Regresar");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println(": : Reservar una cita");
                for (int i = 0; i < 3; i++) {
                    System.out.println((i + 1) + ". " + MONTHS[i]);
                }
            } else if (opcion == 2) {
                System.out.println(": : Mi cita");
            } else if (opcion == 0) {
                System.out.println("\n\n");
                showMenu();
            }
        } while (opcion != 0);
    }
}
