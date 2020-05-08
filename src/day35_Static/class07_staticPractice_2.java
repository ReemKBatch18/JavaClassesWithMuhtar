package day35_Static;

public class class07_staticPractice_2 {
    // If method is going to use an instance variable ==> Do not use static method ==> you may use instance method
    // If method is not going to use instance variables ==> you may use static method

    String brand;
    String Model;
    // I want to create a method that will print me the brand of the car
    // if I create a static method, I will not be able to use my instance variable brand in the print method
    // But if I create an instance method ==> I can pass model in the print method

    // I will declare this boolean variable hasWheels as static:
    static boolean hasWheels = true;

   // this method is using instance variable brand ==> instance method not static method
    public void printBrand(){
        System.out.println(brand);
    }

    // this method is using instance variable brand ==> instance method not static method
    public void printModel(){
        System.out.println(Model);
    }

    // this method is not using instance variable brand ==> I can use static
    public static void main(String[] args) {
        System.out.println(hasWheels);
    }

}
