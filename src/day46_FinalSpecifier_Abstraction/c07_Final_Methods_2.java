package day46_FinalSpecifier_Abstraction;

class Test {

    // instance method in super class
    public void method1(){
        System.out.println("A");
    }

    public final void method2(){        // final : Can not be overridden = compiler error
        System.out.println("A");
    }
}


public class c07_Final_Methods_2 extends Test{
    // Only instance methods (not private) can be overridden into sub class - Only inherited ones
    // can not override methods that are final: can not change implementation of final methods
    @Override // @override compiles = method1 is overridden
    public void method1(){
        System.out.println("B");
    }

    /*
    public void method2(){
        System.out.println("B");
    }

     */
}
