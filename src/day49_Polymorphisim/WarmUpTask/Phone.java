package day49_Polymorphisim.WarmUpTask;
    /*
       1. create an interface named downloadable:
            variable: boolean downloadable
            abstract method: download();
    1. create an interface named AndroidApps that can inherit from downloadable interface
            variable: AppStoreName

    2. create an interface named AppleApps that can inherit from downloadable interface
            variable: AppStoreName
    3. create an abstract class named Phone
            variables: brand, model, price, size
            abstract methods: texting(), calling()
    4. create a class named iPhone that can inherit from AppleApps interface
            actions that every iphone can do: texting(), calling(), faceTiming(), selfie()
    5. create a class named Nokia that can inherit from AndroidApps interface
            actions that Nokia can do: texting(), calling(), freezing(), breakTheFloor()
    in each sub classes of phone, create a constructor to initialize the instances
     */

// here we will create our interface downloadable
interface downloadable{
    // must initialize variable immediately because it is final
    // our variable is final static by default
    boolean downloadable = true;
    void download();    // public abstract method (Of course it is not final because we have to override it)
}

// here we will create our 2nd interface inheriting form downloadable
interface AndroidApps extends downloadable{
    // now this interface inherited a variable and an abstract method from downloadable
    String AppStoreName = "Android"; // public static final variable by default
    // now thi interface has 2 variables and one method
}

// interface AppleApps
interface AppleApps extends downloadable{
    // now this interface inherited a variable and an abstract method from downloadable
    String AppStoreName = "Apple"; // public static final variable by default
    // now this interface has 2 variables and one method
}

// here is our abstract class phone
    public abstract class Phone {
    // here we will declare our instance variables
    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void texting(long phoneNumber);
    public abstract void calling(long phoneNumber);

    public String toString(){
        return "Brand: "+brand+", Model: "+model+", Size: "+size+", Price: "+price;
    }

}




