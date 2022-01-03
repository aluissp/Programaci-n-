package Uber;

import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car {

    //Map<String, ArrayList<String, Integer>> typeCarAcepted;  //Atributo de tipo de carro aceptado
    ArrayList<String> seatsMaterial;

    public UberBlack(String license, Account driver, ArrayList<String> seatsMaterial/*,Map<String, ArrayList<String, Integer>> typeCarAcepted*/) {
        super(license, driver);
        //this.typeCarAcepted = typeCarAceptedl;
        this.seatsMaterial = seatsMaterial;

    }
}
