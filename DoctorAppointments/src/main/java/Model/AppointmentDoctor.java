
package Model;

import java.util.Date;

public class AppointmentDoctor implements ISchedulable{
    private int id;
    private Patient patient;
    private Doctor doctor;
    private Date date;
    private String time;

    public AppointmentDoctor(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    public void setId(int id){
        this.id=id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setPatient(Patient patient){
        this.patient=patient;
    }
    
    public Patient getPatient(){
        return patient;
    }
    
    public void setDoctor(Doctor doctor){
        this.doctor=doctor;
    }
    
    public Doctor getDoctor(){
        return doctor;
    }
    
    public void setdDate(Date date){
        this.date=date;
    }
    public Date getDate(){
        return date;
    }
    
    public void setTime(String time){
        this.time=time;
    }
    
    public String getTime(){
        return time+" hrs.";
    }
        
    @Override
    public void schedulable(Date date, String time) {
        this.date=date;
        this.time=time;
    }

}
