package Uber;

import java.util.ArrayList;

class UberVan extends Car {

    //Map<String, ArrayList<String, Integer>> typeCarAcepted;  //Atributo de tipo de carro aceptado
    ArrayList<String> seatsMaterial;
    private Integer passenger;

    public UberVan(String license, Account driver, ArrayList<String> seatsMaterial/*,Map<String, ArrayList<String, Integer>> typeCarAcepted*/) {
        super(license, driver);
        //this.typeCarAcepted = typeCarAceptedl;
        this.seatsMaterial = seatsMaterial;

    }

    //Otro Constructor
    public UberVan(String license, Account driver) {
        super(license, driver);
    }

    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6) {
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }
}
