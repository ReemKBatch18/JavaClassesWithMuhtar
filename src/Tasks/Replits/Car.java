package Tasks.Replits;

public class Car {

    // Variables
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    int price;

    // Constructors
    public Car(String make, String model, int numberOfDoors, int topSpeed, int price){
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car(String make, String model, int topSpeed, int price){
        this.make = make;
        this.model = model;
        this.numberOfDoors = 4;
        this.topSpeed = topSpeed;
        this.price = price;
    }
    public Car(int numberOfDoors, int topSpeed, int price){
        this.make = "unknown";
        this.model = "unknown";
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }
    public Car(String make, String model, int numberOfDoors){
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = 90;
        this.price = 0;
    }


}
