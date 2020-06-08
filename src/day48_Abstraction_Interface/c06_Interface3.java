package day48_Abstraction_Interface;

public interface c06_Interface3 {

    // abstract methods meant to be overridden
    public void method1();
    public abstract void method2();


    // only variables that can be declared in interface are static final
    // I can call them in the main method using the variable name because it is static
    static final int num = 100;  // by default: public
    int num2 = 300;             // by default : public static final

    public static void main(String[] args) {
        c06_Interface3.method3();
        System.out.println(num);

    }

    // if I have static method in this interface, I can still call it into main method using interface name
    // this is a static method not an abstract method (abstract can't be static)==> MUST have body (implementation)
    static void method3(){

    }
}
