package Uber;

public class Account {

    //Atributos 
    Integer id;
    String name;
    String document;
    String password;
    String email;

    //Metodo Constructor
    public Account(String name, String document) {
        this.name = name;
        this.document = document;
    }
}
