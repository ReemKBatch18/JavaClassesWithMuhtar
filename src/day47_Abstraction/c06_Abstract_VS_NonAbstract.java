package day47_Abstraction;

// class Test1: regular (non abstract class):
        // can have: all blocks,variables, constructor, methods except for ABSTRACT method
class Test1{
    // can you have methods, blocks, variables, constructor?

    public Test1(){ }                   // constructor

    public void method1(){ }            // instance method

    public static void method2(){ }     // static method

  //  public abstract void method3();   // can NOT have ABSTRACT method

    int a = 100;                        //instance variable

    static int b = 200;                  // static variable

    {                                    // instance block
    }

    static {                            // static block
            }

}

// class Test2 : Abstract class
abstract class Test2{

    public Test2(){ }                   // constructor

    public void method1(){ }            // instance method

    public static void method2(){ }     // static method

    public abstract void method3();     // ABSTRACT method

    int a = 100;                        //instance variable

    static int b = 200;                  // static variable

    {                                    // instance block
    }

    static {                            // static block
    }


}

public class c06_Abstract_VS_NonAbstract {

    /*
    abstract class vs non-abstract class:
    non-abstract class:
            can not have:
                    abstract methods
            can have:
                    constructor, instance method, static method, instance block, static block, instance variable, static variable...
    abstract class:
            can have:
                    constructor, instance method, static method, instance block, static block, instance variable, static variable... AND ASBTRACT METHOD
            can not:
                    cannot create object
                    cannot be final

     */

}
