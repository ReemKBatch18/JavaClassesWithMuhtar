package day48_Abstraction_Interface.WarmUpTask;
    /*
    1. create an abstract class called Phone
			attributes: brand, model, price, size
			abstract methods: calling(), texting()
			instance method: toString()
	2. create the following subclasses of phone:
						1. iPhone
						2. Samsung
			create constructors in each sub class that can initialize the instance variables
     */
public abstract class Phone {
    // our variables. we declare them as public so that they can be accessed in any sub class
    public static String brand;
    public String model;
    public double price;
    public String size;

    // 2 abstract methods (no body)
    // abstract method can not be final, or static, or private)
    // abstract method must be overridden
    public abstract void calling(long phoneNumber);
    public abstract void texting(long phoneNumber);

    // toString() instance method
    public String toString(){
        return "Brand: " + brand + ", Model: " + model + ", Size " + size + ", Price: $" + price;
    }
}
