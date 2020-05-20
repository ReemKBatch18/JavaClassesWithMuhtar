package OfficeHours.Practice_05_20_2020;
/*
* super :
            super() is used for calling constructor from super class into sub class
            super.  is used for calling super class instance methods and variables
 */
class TestData{     // super class
    int num = 100;  // variable in super class
    String name = "super str";   // variable in super class

   // instance method in super class
    public void method(){    // method in super class
        System.out.println("super method");
    }
}
public class c09_SuperKeyword2 extends TestData{    // sub class

    int num = 200;     // variable in sub class , int num = 100 is already inherited here
    String name = "sub str"; // variable in sub class, String name = "Reem" is already inherited here

    // instance method in subclass : overriding method() in super class
    public void method(){
        System.out.println("sub method");
    }

    // creating constructor in sub class
    public c09_SuperKeyword2(){
        // once constructor executes (as soon as we create an object) following will be PRINTED in the same order here:
        // call methods:
        method();           // prints: sub method   (calling local method from sub class (local method))
        super.method();     // prints: super method (calling method inherited from super class using super. keyword)
        // call variables:
        System.out.println(num);        // prints: 200      (calling int variable from sub class (local variable))
        System.out.println(name);      // prints : sub str  (calling String variable from sub class (local variable))
        System.out.println(super.num); // prints : 100      (calling int variable inherited from super class using super. keyword)
        System.out.println(super.name);// prints : super str (calling String variable inherited from super class using super. keyword)
    }

    // to run constructor (to execute ) in sub class ==> MUST create object
    public static void main(String[] args) {
        c09_SuperKeyword2 obj = new c09_SuperKeyword2();
        // this is how it looks in console once executed:
        /*
        sub method
        super method
        200
        sub str
        100
        super str
         */
    }

}
