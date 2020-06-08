package day48_Abstraction_Interface;

interface P{
    void method1();
}

interface Q{
    int method2();
}

abstract class R {
    abstract void method3();
}

// to inherit from class we use extends keyword
// to inherit from interfaces we use implements
// to use both: we use extends keyword FIRST and implements NEXT

public class c08_extends_implements_2 extends R implements P,Q {
    // must implement (override) abstract methods from P, Q, R
    // relation between c08_extends_implements_2 and R class        : is a
    // relation between c08_extends_implements_2 and P interface    : is a
    // relation between c08_extends_implements_2 and Q interface    : is a

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    void method3() {

    }


}
