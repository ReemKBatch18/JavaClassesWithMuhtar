package day48_Abstraction_Interface;

interface A1{
    void method1();                 // public abstract method, must be implemented in that class that's implementing this interface
}

interface B1{
   abstract int method2();         // public abstract method, must be implemented in that class that's implementing this interface
}

interface C1{
    public abstract void method3(); // public abstract method, must be implemented in that class that's implementing this interface
}


public class c04_Abstraction02 implements A1, B1, C1 {  // class can implement multiple interfaces with their methods
    // all abstract methods must be overridden

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 10;
    }

    @Override
    public void method3() {

    }
}
