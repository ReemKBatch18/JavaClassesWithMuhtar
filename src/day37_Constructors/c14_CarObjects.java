package day37_Constructors;

public class c14_CarObjects {

    public static void main(String[] args) {

        // in order to create my objects: I need to give className, objectName, 'new' keyword, Constructor (which is here accepting the 4 parameters)
        c13_Car car1 = new c13_Car("Toyota", "Corolla", 2020, 32000);
        // now the values I provided here will be initialized to the instance variables immediately
        // to print each one separately:
        System.out.println(car1.brand); // Toyota
        System.out.println(car1.model); // Corolla
        System.out.println(car1.year);  // 2020
        System.out.println(car1.price); // 32000
        // as soon as object is created: brand, model, year, and price were initialized immediately
        System.out.println(car1); // 2020 Toyota Corolla $32000.0

        c13_Car car2 = new c13_Car("Mercedes", "C300", 2018, 4500);
        System.out.println(car2); // 2018 Mercedes C300 $45000.0





    }
}
