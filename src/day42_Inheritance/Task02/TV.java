package day42_Inheritance.Task02;
/*
create a sub class called TV:
				attributes: brand, model, price, country, type
				methods: watch, toString
 */
public class TV extends Device {        //  Relationship: TV IS A Device
    /*
    brand,      (inherited)
    model,      (inherited)
    price,      (inherited)
    country,    (inherited)
    type        (inherited)
    size        (inherited)

	watch()
	toString()  (inherited)
     */

    // we need to make sure that variables can be initialized as soon as we create the object==>
    // ==> we create a constructor to initialize them
    // Constructor
    public TV(String brand, String model, double price, String size){
        // I don't need to pass argument: String type here because it is always TV in this TV class
        // this constructor allows us to initialize brand, model, price, and size. Type will be initialized to TV
        // I can put it directly in setDevice() method when I call it here:
        setDevice(brand,model,price,"TV",size);
    }

    // watch() method
    public void watch(){
        System.out.println("I am watching "+brand+" "+model+" "
                +type+" that cost me $"+price+" from "+country );
    }
}
