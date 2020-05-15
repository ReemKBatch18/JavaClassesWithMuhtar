package RESOURCES;
import day40_Encapsulation.c01_EncapsulationIntro;
public class Encapsulations_Test {

    public static void main(String[] args) {
        // first I import c01_EncapsulationIntro class from package day40_Encapsulations
        // Now I can create a new object from that class here:

        c01_EncapsulationIntro obj = new c01_EncapsulationIntro();

    //    System.out.println(obj.SSN); //private : accessible only in its class

        System.out.println(obj.getSSN());  //0 default value

        obj.setSSN(123); // (even though we give 123 which is int by default = still accepted because long can contain int

        System.out.println(obj.getSSN()); // 123 because we set it in the previous step



    }

}
