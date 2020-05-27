package OfficeHours.Practice_05_27_2020;
/*
OverLoading:
    * happens in SAME class
    * SAME method name
    * DIFFERENT parameter
    * Return type does NOT matter
    * Access modifier does NOT matter
    * Instance method CAN be overloaded
    * STATIC methods CAN be overloaded
    * Constructor CAN be overloaded
    * ALL METHODS CAN BE OVERLOADED

 */
public class c02_methodOverloading {
     // here is my instance method:
    public void method(){

    }

    // To overload instance method:
    // SAME class,
    // SAME name,
    // DIFFERENT parameter
    // Return type does NOT matter
    // Access modifier does NOT matter
    private String method(int a){
        return "123";
    }
 // here is my static method
    public static void method2(){

    }
    //to overload static method:
    public static int method2(int a){
        return 123;
    }

    // constructor
    public c02_methodOverloading(){

    }

    // to overload constructor: different parameter
    public c02_methodOverloading(int a){

    }

    // to overload constructor again:
    public c02_methodOverloading(int a, int b){

    }

    // MAIN method:
    public static void main(String[] args) {
        System.out.println("String");
    }

    // to overload MAIN method:
    public static void main(int a) {
        System.out.println("int");
    } // when we run system recognizes the original main method.
        // MAIN method runs first


}
