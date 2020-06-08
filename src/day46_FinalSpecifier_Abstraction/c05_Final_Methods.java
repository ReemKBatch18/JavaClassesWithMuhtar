package day46_FinalSpecifier_Abstraction;

/*
    2. Methods: Final Methods = implementation of methods can NEVER be changed
                final methods can not be overridden (can not have different implementation)
                final methods can be overloaded
                Constructors can NOT BE final
 */

public class c05_Final_Methods {

    // this is a final instance method
    public final void method1() {

    }

    // overload method1 with different parameter
    // change the return type of method
    // and make it final
    public final int method1(int a){
        return 100;
    }

    // here I will make main method as final
    public final static void main(String[] args) {

    }

    // constructor
    public c05_Final_Methods(){

    }

}
