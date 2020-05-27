package day42_Inheritance;

class Test2{        //  SUPER CLASS = PARENT CLASS
    public Test2(int a){
        // here we will call the constructor with double parameter
        // we must do call constructor at first step
        // to call constructor into another one we use this()
        this(2.5); // once this is executed (when we create an object) it will execute constructor with double
        System.out.println("Super - constructor w int");
    }

    public Test2(double a){
        System.out.println("Super - constructor w double");
    }
}
public class c06_Constructor2 extends Test2{        //  SUB CLASS = CHILD CLASS

    // we will create a constructor here:
    public c06_Constructor2(){
        super(15); // super() is used to call constructor from super class
        System.out.println("Sub - constructor with no arg");
    }

    // to create objects:
    public static void main(String[] args) {

        // here we will create object from Constructor2 : OUR SUB CLASS
        c06_Constructor2 obj2 = new c06_Constructor2();
        // when we create this object ==> sub class constructor will execute ==>
        // ==> we called super class constructor with int in sub class constructor ==> this will execute first
        // when it executes it will first call the constructor with double and print its statement then it will print its int statement
        // first this prints: "Super - constructor w double" , then this prints: "Super - constructor w int"
        // ==> then we asked to print a statement in our sub class constructor
        // ==> this will print last :"Sub - constructor with no arg"
        //this is how this will print on console when object is created and constructor is executed
       /*
          Super - constructor w double
          Super - constructor w int
          Sub - constructor with no arg
         */
        System.out.println("***********************************");
        // here we will create object of Test class OUR SUPER CLASS:
        Test2 obj = new Test2(10);
        // we have to pass a parameter here (either double or int) because constructors we have in Test class are both with parameters
        // when we create our object==> the constructor we use will get executed
        // here we created our object using constructor with int parameter ==>
        // this will print on console when executed:
        /*
           Super - constructor w double
           Super - constructor w int
         */

        // super class can NOT call any constructor from sub class


    }
    /*
    Summary of Access Modifiers: public > protected > default > private
    • we can call public variables and methods any where in any class in one whole project.
    • we can call protected variables and methods in any class in one package.
    • we can call protected variables and methods in any sub class in one whole project.
    • we can call default variables and methods in any class in one package ONLY.
    • we can call private variables and methods inside one class ONLY.
     */

}
