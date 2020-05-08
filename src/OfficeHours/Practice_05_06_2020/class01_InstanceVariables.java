package OfficeHours.Practice_05_06_2020;

public class class01_InstanceVariables {
    // instance variables are declared in the class outside methods block
    // those instance variables belong to the class
    int a = 100; // instance variables
    //  each object will have its own copy.
    // if I create two objects from a class ==> I will have two copies of each instance variable

    public static void main(String[] args) {

        // int a = 100; // local variable

        // if I call two objects from the  class:
        class01_InstanceVariables obj1 = new class01_InstanceVariables();
        obj1.a = 300;

        System.out.println(300);

        class01_InstanceVariables obj2 = new class01_InstanceVariables();
        System.out.println(obj2.a);

        // instance variable: belongs to object and each object has its own copy


    }

}
