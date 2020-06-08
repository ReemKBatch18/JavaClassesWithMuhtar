package day46_FinalSpecifier_Abstraction;

public class c09_Final_Practices {

    //instance variable - final
    final int a = 10;

    //static variable - final
    final static int b = 20;

    // instance block - can not be final
    {
        System.out.println(a);
        // I can call ins variable here but can not reassign it
    }

    // static block - can not be final
    static {
        System.out.println(b);
        // I can call static variable here but can not reassign it
    }

    // constructor - can not be final
    public c09_Final_Practices(){

    }

    // instance method - final
    public final void method1(){

    }

    // static method - final
    public final static void method2(){

    }

    // Can I overload final instance method? yes
    // Can I change AM ?  yes
    // can I change return type? yes
    // Can I change specifier ? yes
    // can I have same parameter? No
    private final int method1(int a){
        return 12;
    }

    // Can I overload final static method? yes
    public final static void method2(int a){

    }


    }

    // sub class - can be final
final class test extends c09_Final_Practices{

    // here we will try to override method1
    //    protected void method1(){ }           // compiler error can not be overridden because method is FINAL

    }

    // sub class - can be final
final class test2 extends c09_Final_Practices{

}

