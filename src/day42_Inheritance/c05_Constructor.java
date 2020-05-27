package day42_Inheritance;


class Test{     //  SUPER CLASS
    // to create SUPER CLASS constructor here:
    public Test(){
        System.out.println("super class's default constructor");
    }
}

public class c05_Constructor extends Test {     // SUB CLASS
    // to create SUB CLASS constructor here:
    public c05_Constructor(){
        System.out.println("sub class's default constructor");
    }
    // at least one of the parent class constructor MUST be called in sub class
    // we don't have a compiler error because parent class's default constructor is already being called by default

    public static void main(String[] args) {
        // so if we create an object==> first the constructor in super class will be executed then constructor in sub class executes
       // object from sub class
        c05_Constructor obj = new c05_Constructor();
        // SUPER class's default constructor  ==> prints first  : "super class's default constructor"
        // SUB class's default constructor  ==> prints next     : "sub class's default constructor"
        /// DEFAULT CONSTRUCTOR OF PARENT CLASS IS AUTOMATICALLY CALLED (by default) INTO THE SUB CLASS

        System.out.println("************************************");

        // if we create an object from the super class ==> only the constructor in super class will print
        Test obj2 = new Test();
        // super class's default constructor ==> ONLY this will print: "super class's default constructor"
        // SUPER CLASS CAN NOT CALL FROM SUB CLASS

           }

}
