package day48_Abstraction_Interface.WarmUpTask;

public class iPhone extends Phone {

    // 4 variables, 2 abstract methods, 1 instance non-abstract method are inherited here .
    // we must implement the 2 abstract methods by overriding them

    //static block to initialize static variable brand
    static {        // better to initialize here because we only need one copy of this variable for all objects
        brand = "iPhone";
        // we can still initialize it in the constructor but that means it will get executed every time we create an object
        // which is extra step we're doing. To save this step we initialize here
    }

    //overriding abstract methods
    public void calling(long phoneNumber){
        System.out.println("iPhone "+model+" is calling "+ phoneNumber);
    }
    public void texting(long phoneNumber){
        System.out.println("iPhone "+model+" is texting "+phoneNumber);
    }

    // constructor
    // since we initialized brand to iPhone we can pass 3 parameters in this constructor
    public iPhone(String model, double price, String size){
        this.model=model;
        this.price=price;
        this.size=size;
    }

    // facetiming is unique in iphones so we create a method here for it:
    public void faceTiming(long phoneNumber){
        System.out.println("iPhone is facetiming with "+phoneNumber);
    }
}
