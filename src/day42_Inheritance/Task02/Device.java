package day42_Inheritance.Task02;

/*
creata a class called device:
				attributes: brand, model, price, country, type, devie
				methods: toString, setDevice()
*/

public class Device {
    // public variables
    public String brand;
    public String model;
    public double price;
    public static String country = "China";
    public String type;
    public String size;

    // toString() method to print all info of device
    public String toString(){
        return "Brand: "+brand+", Model: "+model+", Type: "+type+", Size: "+size+
                ", Price: $"+price+", Made in: "+country;
    }

    // we will create method to set all info about a device that we can call in the sub classes TV and phone
    public void setDevice(String brand, String model, double price, String type, String size){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.type = type;
        this.size = size;
    }

}
