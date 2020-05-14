package day38_Constructors;

/*
static block vs instance block vs Constructor
1. static block gets executed first as soon as class runs (even before print anything in main method
2. static block gets executed once (for all objects)
3. instance block depends on object: NO OBJECT = NO execution of instance block. It runs before Constructor
4. constructor: depends on the object: NO OBJECT = NO execution: Executes once we create object ==> runs after instance block


 */
public class c09_StaticB_InstanceB_Constructor {

   // here is our Constructor:
    public c09_StaticB_InstanceB_Constructor(){ // Constructor executes once we create an object BUT AFTER instance block
        System.out.println("constructor"); // a copy of constructor will print for each object we create
        //(if we create 2 objects==> "constructor" will print two times)
    }

    { // here is our instance block:
        System.out.println("instance block"); // instance block executes once we create an object BEFORE Constructor
        // a copy of instance block will print for each object (if we create 2 objects==> "instance block" will print two times)
    }

   // here is our main method to create objects ==> instance block runs ==> Constructor runs
    public static void main(String[] args) {

        System.out.println("main method"); // this will print first before executing instance block and Constructor for our objects
        System.out.println("*****************************");
        new c09_StaticB_InstanceB_Constructor(); // first object: once created ==> instance block executes ==> then Constructor executes
        System.out.println("*****************************");
        new c09_StaticB_InstanceB_Constructor(); // second object: once created ==> instance block executes ==> then Constructor executes
        System.out.println("*****************************");
        System.out.println("main method after objects"); // this will print after our objects are created and instance block and constructor executed
    }

   // here is our static block:
    static{     //  THIS GETS PRINTED FIRST BEFORE ANYTHING ELSE even though we placed it at the end
        // but it runs only ONE TIME for all objects
        System.out.println("static block");
        // EVEN IF we create multiple objects ==> "static block" prints only one time
       System.out.println("******************************");
    }

    // This is how this will read on the console after creating two objects:
        /*
 static block
******************************
main method
*****************************
instance block
constructor
*****************************
instance block
constructor
*****************************
main method after objects

     */
}
