package day46_FinalSpecifier_Abstraction;
/*
    How many kinds of variables do we have? Local, Instance, Static
    If I want to have any value for a variable as constant (never changing) I can make it final
    It can NOT be re-assigned

    1. Variables: Final variable can NEVER BE RE-ASSIGNED
                 final local variables can be declared before initializing (but can't be used till it is initialized)
                 final instance variables MUST be initialized immediately.
                 final static variable MUSt be initialized immediately .
                 Can NEVER generate Setter for final private variables to re-assign its data,
                 but you can generate getter for final private variables to get the data.


 */
public class c02_Final_Variables {
    // here is my final instance variable:
    final int instanceVariable = 200; // final instance variables need to be initialized immediately
    // instance variable is created through an object.
    // I will create an object and call it in the main method
    // main method is static that's why I can't call instance variable into it without an object
    // I can use "this" keyword to call my variable but only in instance methods and blocks


    // here is my final static variable:
    final static int staticVariable = 300; // final static variable must be initialized immediately

    public static void main(String[] args) {


        // I can declare PI as final variable - it's a local variable
        final double PI = 3.14; // can not be re-assigned another value

        final String gender = "Male";
        // local variable : you don't have to initialize it immediately when you create it.
        final int score;
        // I cannot print it until I assign a value
       // System.out.println(score);
       score = 100;
        System.out.println(score);  // 100
        System.out.println("*****************************************");

        c02_Final_Variables obj = new c02_Final_Variables();
        System.out.println( obj.instanceVariable); // 200
        System.out.println(obj.staticVariable); // 300

    }
}
