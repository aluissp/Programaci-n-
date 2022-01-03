package ui;

import Model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {

    public static void showPatientMenu(){
        int opcion=0;
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("\n\n");
            System.out.println("Paciente");
            System.out.println("Welcome: "+UIMenu.patientLogged.getName());
            System.out.println("1. Reservar una cita");
            System.out.println("2. Mis citas");
            System.out.println("0. Regresar");

            opcion=Integer.valueOf(sc.nextLine());

            switch (opcion){
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyAppointment();
                    break;
                case 0:
                    UIMenu.showMenu();;
            }

        }while(opcion!=0);
    }

    private static void showPatientMyAppointment(){
        int opcion=0;

        do {
            System.out.println(":: Mis citas");
            if(UIMenu.patientLogged.getAppointmentDoctors().size()==0){
                System.out.println("No tienes citas disponibles");
                break;
            }else{
                for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
                    System.out.println((i+1)+". "+"Fecha: "+UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate()
                    +"Hora: "+UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime()
                    +"\nDoctor: "+UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName());
                }
            }

            System.out.println("0. Salir");
        }while(opcion!=0);
    }

    private static void showBookAppointmentMenu(){
        int opcion=0;
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("::Reservar una cita");
            System.out.println("::Selecciona una fecha");

            //Numeracion de la lista de las fechas //Primer Integer del map
            //Indice de la fecha selecionada       //Segundo Integer del map
            //[Doctors]
            //1.(Primer integer) doctor 1
                   //- 1(Segundo integer) fecha1
                   //- 2(Segundo integer) fecha2
            //2.(Primer integer) doctor 2
            //3.(Primer integer) doctor 3
            Map<Integer,Map<Integer, Doctor>> doctors=new TreeMap<>();
            int aux=0;    //Variable para llenar el primer integer de Map
            for (int i = 0; i < UIDoctorMenu.doctorsAvailabeAppointments.size(); i++) {
                ArrayList<Doctor.AvailbleAppointment> availbleAppointments;
                availbleAppointments=UIDoctorMenu.doctorsAvailabeAppointments.get(i).getAvailbleAppointment();

                Map<Integer,Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availbleAppointments.size(); j++) {
                    aux++;
                    System.out.println(aux+". "+availbleAppointments.get(i).getDate());
                    //Capturamos la primera parte = Map<Integer, Doctor>
                    doctorAppointments.put(Integer.valueOf(j),UIDoctorMenu.doctorsAvailabeAppointments.get(i));
                    //Capturamos la segunda parte = Map<Integer,Map<Integer, Doctor>>
                    doctors.put(Integer.valueOf(aux),doctorAppointments);
                }
            }

            int opcionFechaSeleccionada=Integer.valueOf(sc.nextLine());

            //Me encuentro en la segunda parte = Map<Integer,Map<Integer, Doctor>>
            Map<Integer, Doctor> doctorAvailableSelected=doctors.get(opcionFechaSeleccionada);
            Integer indexDate=0;
            Doctor doctorSelected=new Doctor("","","");

            //Me encuentro en la primera parte = Map<Integer, Doctor>
            for (Map.Entry<Integer,Doctor> doc:doctorAvailableSelected.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected=doc.getValue();
            }

            System.out.println(doctorSelected.getName()+
                    ". Hora: "+ doctorSelected.getAvailbleAppointment().get(indexDate).getTime()+
                    ". Fecha: "+doctorSelected.getAvailbleAppointment().get(indexDate).getDate());

            System.out.println("Confirma tu cita medica: \n1. Si \n2. Cambiar citar");
            opcion=Integer.valueOf(sc.nextLine());

            if(opcion==1){
                UIMenu.patientLogged.addAppointmentDoctors(doctorSelected,
                        doctorSelected.getAvailbleAppointment().get(indexDate).getDate(null),
                        doctorSelected.getAvailbleAppointment().get(indexDate).getTime());

                showPatientMenu();
            }

        }while(opcion!=0);

    }

}
