package day43_MethodOverriding;

public class c10_CarShop {
    public static void main(String[] args) {


        // Tesla object
        c09_Tesla tesla = new c09_Tesla();
        tesla.start();
        System.out.println("******************");

        // Honda object
        c11_Honda honda = new c11_Honda();
        honda.start();
        System.out.println("******************");

        // Jeep object
        c12_Jeep jeep = new c12_Jeep();
        jeep.start();
        System.out.println("******************");

        //BMW object
        c13_BMW bmw = new c13_BMW();
        bmw.start();
    }
}
