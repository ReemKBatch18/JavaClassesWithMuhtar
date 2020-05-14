package day39_AccessModifiers;
/*
Warmup tasks:
	1. create a class called Car:
				instance variable:
						brand, model, year, price
				add a constructor that can initialize brand of car
				add a constructor that can initialize brand and model of the car
								(apply constructor call to initalize the brand)
				add a constructor that can initialize the brand, model, year of the car
								(apply constructor call to initialize brand, model)
				add a constructor that can initialize brand, model, year and price of the car
								(apply constructor call to initialize brand, model, year)
				add toString method
 */
public class Car {

    // Ins variables
    String brand;
    String model;
    int year;
    double price;

    // 1st Constructor to initialize the instance variable : brand of car:
    public Car(String brand){
        this.brand = brand;
    }

    // 2nd Constructor to initiate 2 instance variables: brand and mode
    // we will call 1st constructor to initialize brand
    public Car(String brand, String model){
      // Constructor MUST be called at first step
        this(brand);
        //  this.brand = brand; // instead of doing this step we are calling the constructor
        // here we will initialize model:
        this.model = model;
    }

    // 3rd Constructor to initialize brand, model, year
    // we will call 2nd constructor for brand and model, then assign year like this:
    public Car(String brand, String model, int year){
        this(brand, model); // this() is calling 2nd constructor with 2 parameters inside
        // here we will initialize year:
        this.year = year;
    }

    //4th Constructor to initialize brand , model, year, and price
    // we will call 3rd Constructor here for brand, model, an year
    // Then we will initialize price like we used to do:
    public Car(String brand, String model, int year, double price){
        this(brand, model, year); // this.brand = brand & this.model = model & this.year = year;
        // here we will initialize price:
        this.price = price;

    }

    // here is our toString() method:
    public String toString(){
        return year+" " +brand+" "+model+" $"+price;
    }
}
