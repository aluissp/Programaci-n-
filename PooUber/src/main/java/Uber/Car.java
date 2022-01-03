package Uber;

public class Car {

    //Atributos
    private Integer id;
    private String license;
    private Account driver;
    private Integer passenger;

    //Metodo Constructor
    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    //Metodo imprimir datos del carro
    void printDataCar() {
        if (passenger != null && license != null) {
            System.out.println("Licencia: " + license + " Driver: " + driver.name + " Passengers: " + passenger);
        }
    }

    //Metodos para modificar los atributos mediante el encapsulamiento
    public Integer getPassenger() {
        return passenger;
    }

    public void setPassenger(Integer passenger) {
        if (passenger == 4) {
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }

    //Aplicamos polimorfismo y creamos varios metodos para modificar los atributos
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }
}
