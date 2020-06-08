package day48_Abstraction_Interface;
/*
    In interface:
                everything CAN BE inherited because all variables and methods are public
 */
interface I1{
    void method1();
}

interface I2 extends I1{                // interface can inherit from interface using keyword extends
    void method2();
    //now I have 2 methods in interface I2
}

abstract class AC implements I2{            // class inherits from interface using keyword implements
    abstract void method3();
    // now I have 3 total methods in class AC
}

public abstract class c07_extends_implements extends AC{     // class inherits from class using keyword extends

    // Optional to override all inherited methods (total 3)
    // if class was not abstract ==> MUST override all methods

    @Override
    public void method1() {

    }

}

class TestRun extends c07_extends_implements{               // class inherits from class using keyword extends
    // MUST override abstract methods from c07_extends_implements (only abstract are needed to be overridden)
    // we have only two left that need to be overridden because we have already overridden method1() before
    // method1() is inherited automatically here as it was overridden already (non-abstract any more)
    // method2() and method3() MUST be overridden here

    @Override
    public void method2() {

    }

    @Override
    void method3() {

    }




}
