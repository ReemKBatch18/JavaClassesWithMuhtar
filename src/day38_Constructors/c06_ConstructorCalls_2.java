package day38_Constructors;
/*
   Rules:
   1. only constructor can call another constructor
   2. In order to call a constructor in another constructor ==> MUST use this() keyword (this() is used to call constructors)
       this(): can only be used in a constructor calling another constructor (DO NOT USE NAME OF CONSTRUCTOR)
   3. Constructor call MUST be at FIRST step. If we call at later step ==> Compiler error
   4. A Constructor can call ONLY ONE Constructor. If we call twice ==> Compiler error
    */
public class c06_ConstructorCalls_2 {

    // 1st constructor: default
    public c06_ConstructorCalls_2(){
        System.out.println("Default constructor");
    }

    // 2nd constructor: with int
    public c06_ConstructorCalls_2(int a){
        this(); // this will call default constructor
        System.out.println("Constructor with int argument");
    }

    // 3rd constructor: with String
    public c06_ConstructorCalls_2(String str){
        this(10); // using this(10):  will call 2nd constructor (the one with int because we passed an int here )
        System.out.println("Constructor with String argument");

    }

    // in our main method we will try executing constructors when we create objects:
    public static void main(String[] args) {

        // here I will create my 1st object ==> Constructor will be executed (depending on what we pass or don't pass in the parameter)
        c06_ConstructorCalls_2 obj = new c06_ConstructorCalls_2(10); // we passed an int in the parameter
        // since we create our object using the 2nd Constructor (passing int) ==>
        //==> first it will print default constructor (because we called it using this();
        //==> next it will print what's in the print statement of 2nd constructor
        // these two lines will show on console:
                                            //1st line: Default constructor
                                            //2nd line: Constructor with int argument



        // here I will create my 2nd object ==> Constructor will be executed (depending on what we pass or don't pass in the parameter)
        c06_ConstructorCalls_2 obj2 = new c06_ConstructorCalls_2("Hello"); // we passed a String in the parameter
        // since we create our object using the 3nd Constructor (passing String) ==>
        //==> first it will print 2nd constructor (because we called it in the constructor using this(10); ==> it will print two statements
        //==> next it will print what's in the print statement of 3nd constructor
        // these three lines will show on console:
                                //1st line: Default constructor
                                //2nd line: Constructor with int argument
                                //3rd line: Constructor with String argument
    }
}
