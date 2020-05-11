package day37_Constructors;

public class c03_Data {

    // here we will declare static/ instance variables and methods

    static int staticVariable = 300;
    int instanceVariable = 400;
    public static void staticMethod (){
        System.out.println("static method");
    }

    public void instanceMethod(){
        System.out.println("instance method");
    }
    // if I only want to use the static variable and the static method from this class into another class ==>
    // I can apply the static import ==> imports static features
    // I will call them in c02_ImportStatement class:
}
