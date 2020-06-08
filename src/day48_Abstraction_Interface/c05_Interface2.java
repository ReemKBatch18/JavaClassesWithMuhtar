package day48_Abstraction_Interface;

public interface c05_Interface2 {

    // public c05_Interface(){ } // can not have constructor
    // public void method1(){ } // can not have instance method
    // { }                      // can not have instance block
    // static {}                // can not have static block ( you will not be able re-initialize your final static variable)

    int a = 100;                // by default: public static final variable

    public static void main(String[] args) {
        System.out.println(a);
        // a = 200; //by default it is final

        // can call final static variable from interface name
        System.out.println(c05_Interface2.a);

        // calling static method
        c05_Interface2.method4();
    }


    // static method
    public static void method4(){ }

    // abstract method
    void method5();

    // default method
    // only in interface
    // allows interface to have lambda expression
    public default void method6(){
        System.out.println("default method");
    }

}
