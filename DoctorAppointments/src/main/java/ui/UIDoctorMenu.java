package ui;

import Model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorsAvailabeAppointments=new ArrayList<>();

    public static void showDoctorMenu(){
        int opcion=0;
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("\n\nDoctor \nWelcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");//Define las fechas en la que el doctor esta disponible
            System.out.println("2. My Schuledable Appointments");
            System.out.println("0. Logout");

            opcion=Integer.valueOf(sc.nextLine());
            switch (opcion){
                case 1:
                    showAddAvailabeAppointmentsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while(opcion!=0);
    }

    private static void showAddAvailabeAppointmentsMenu(){
        int opcion=0;
        Scanner sc=new Scanner(System.in);

        do{
            System.out.println("::Add Available Appointment ");
            System.out.println("::Select a Month ");

            for (int i = 0; i < 3; i++) {
                System.out.println((i+1+". "+UIMenu.MONTHS[i]));
            }

            System.out.println("0. Return");
            opcion=Integer.valueOf(sc.nextLine());

            if(opcion>0&&opcion<4){
                int monthSelected=opcion;
                System.out.println(monthSelected+". "+UIMenu.MONTHS[monthSelected-1]);
                System.out.println("Insert the date availabe:  [dd/mm/yyyy]");
                String date=sc.nextLine();

                System.out.println("Your assigned date is: "+date+"\n1. Correct \n2. Change date");
                int responseDate=Integer.valueOf(sc.nextLine());
                if(responseDate==2)continue;//No se sale del ciclo solo vuelve a iniciar el bucle desde 0

                int responseTime=0;
                String time="";
                do {
                    System.out.println("Insert the time for date: "+date+"[16:00]");
                    time=sc.nextLine();
                    System.out.println("Your time is: "+time+"\n1. Correct\n2. Change time");
                    time=sc.nextLine();
                }while (responseTime==2);

                UIMenu.doctorLogged.addAvailbleAppointment(date,time);
                checkDoctorAvailableAppointment(UIMenu.doctorLogged);

            }else if(opcion==0){

            }

        }while(opcion!=0);
    }

    private static void checkDoctorAvailableAppointment(Doctor doctor){
        if(doctor.getAvailbleAppointment().size()>0&&!doctorsAvailabeAppointments.contains(doctor)){
            doctorsAvailabeAppointments.add(doctor);
        }
    }
}
