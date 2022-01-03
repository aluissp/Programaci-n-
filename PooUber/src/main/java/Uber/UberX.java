package Uber;

class UberX extends Car {

    //Atributos 
    String brand;
    String model;

    //Metodo Constructor asociado o extendido de una clase padre llamado car
    public UberX(String license, Account driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Modelo: " + model + " Marca: " + brand);

    }
}
