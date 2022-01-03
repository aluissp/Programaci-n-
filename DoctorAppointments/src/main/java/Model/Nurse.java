
package Model;

public class Nurse extends User{
    private String speciality;
    
    public Nurse(String name,String email){
        super(name,email);
    }
    
    public void setSpeciality(String speciality){
        this.speciality=speciality;
    }
    
    public String getSpeciality(){
        return speciality;
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Verde");
        System.out.println("Departamento: Nutriologia, Pediatria");
    }
}
