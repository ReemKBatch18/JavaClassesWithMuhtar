package OfficeHours.Practice_05_13_2020;
/*
instance method:
    Do not use static when creating method: public void methodName(){}
    can call ALL static variables and methods
    can call ALL instance variables and other methods
static method:
    must use STATIC word when creating method: public static void methodName(){}
    can call ONLY static variables and methods
    can NOT call instance variables or methods
    main method = static : can call statics - variables and methods
                            can NOT call instance variables and methods directly
                            must create objects to call instance variables/methods through objects

 */
public class c03_Statics {
    int instanceVariable = 100;
    static int staticVariable = 200;

    // my static method:
    public static void staticMethod(){
        // instanceMethod(); // cannot be called here
       // System.out.println(instanceVariable); cannot be called here
        System.out.println(staticVariable);
    }

    // my instance method:
    public void instanceMethod(){
        // I can call static method here:
        staticMethod();
        // I can call static variable here:
        System.out.println(staticVariable);
        // I can call instance variable here :
        System.out.println(instanceVariable);
    }

    // How about my main method? IT IS STATIC ==> ONLY ACCEPTS STATICS
    public static void main(String[] args) {
      //  System.out.println(instanceVariable); // compiler error : cannot call instance variable here
        System.out.println(staticVariable);
        staticMethod();
     //   instanceMethod(); // compiler error: cannot call instance method here
    }
}
