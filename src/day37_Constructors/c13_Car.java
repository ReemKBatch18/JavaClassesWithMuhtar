package day37_Constructors;

public class c13_Car {

    // INSTANCE VARIABLES:
    String brand;
    String model;
    int year;
    double price;

    // what do I have to do to be able to give values to the instance variables above as soon as I create the object?
    // I have to create the Constructor and pass parameters (No specifier, no returnType, just AM, and  name = class name, and parameters)
    public c13_Car(String brand, String model, int year, double price){
        // after Constructor executes (once I create objects) those values I pass in parameters will be assigned to instance variables
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    // Now I have this constructor ==> means once I create my object : those variables will be assigned immediately to the instance variables
        // I will create my objects in a new class now
    }


    // To specify how we want to print out the car: We need to use the toString() method like this:
    public String toString(){
        return year +" "+ brand+" "+model+" $"+price;
    }




}
