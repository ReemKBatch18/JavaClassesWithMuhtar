package day35_Static;

public class class04_staticVariables_2 {


    int insVariable; // instance variable
    static int staticVariable; // static variable

    // every single object has its own copy of instance variable because instance variable belongs to the OBJECT
    //all objects we create share the same static variable because static variable belongs to the CLASS

    public static void main(String[] args) {


        class04_staticVariables_2 ob1 = new class04_staticVariables_2();
        ob1.insVariable = 300; // 1 copy is created for each object
        ob1.staticVariable = 400; // 1 copy is created for all objects in one class

        class04_staticVariables_2 ob2 = new class04_staticVariables_2();


        System.out.println(ob1.insVariable);//300 because we initialized it already
        System.out.println(ob2.insVariable);// 0 default value not initialized yet
        System.out.println(); // to print empty line
        System.out.println(ob1.staticVariable); // 400 because it's declared already
        System.out.println(ob2.staticVariable);// 400 because it is declared already once

        // I can call my static variable through the class name like this because it belongs to the class:
        System.out.println(class04_staticVariables_2.staticVariable);

        // I can call my instance variable through the object only because it belongs to the object but
        // ==> but I can NOT call instance variable through the class name because it does not belong to class
        // we can call static variables through the object's name (because objects are contained in the class
        // But preferred way to call static variables is through class name


    }
}