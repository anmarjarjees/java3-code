package p1interface_inner_class;
public class Car extends Vehicle {
    private String fuelType;
    private int purchaseYear;
    
    public Car() {
        super();
    }

    public Car(String brand, String type, String wheels, int year, String fuelType, int purchaseYear) {

        super(brand, type, wheels, year); // calling parent class constructor
        this.fuelType = fuelType;
        this.purchaseYear = purchaseYear;
    }
}