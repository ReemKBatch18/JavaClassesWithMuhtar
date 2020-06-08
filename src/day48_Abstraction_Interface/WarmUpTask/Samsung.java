package day48_Abstraction_Interface.WarmUpTask;

public class Samsung extends Phone {

    // 4 variables, 2 abstract methods, 1 instance non-abstract method are inherited here .
    // we must implement the 2 abstract methods by overriding them

    //static block to initialize our static variable brand
    static {    // better to initialize here because we only need one copy of this variable for all objects
        brand= "Samsung";
        // we can still initialize it in the constructor but that means it will get executed every time we create an object
        // which is extra step we're doing for every object. To save this step we initialize here once and for all objects
    }

    // overriding abstracts
    public void calling(long phoneNumber){
        System.out.println("Samsung "+ model+" is calling "+ phoneNumber);
    }
    public void texting(long phoneNumber){
        System.out.println("Samsung "+model+" is texting "+phoneNumber);
    }

    public void freezing(){
        System.out.println("Samsung is freezing when using ");
    }

    // constructor
    // since we initialized brand to Samsung we can pass 3 parameters in this constructor
    public Samsung(String model, double price, String size){
        this.model=model;
        this.price=price;
        this.size=size;
    }
}
