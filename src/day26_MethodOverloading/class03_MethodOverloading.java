package day26_MethodOverloading;

public class class03_MethodOverloading {
    // method overloading: multiple methods sharing the same name BUT parameters MUST be different
                      //  Either data type or number of parameters must be different.

    public static void main(String[] args) {
        method(10); // takes first Original method, because 10 is an int==> Java applies the int method
        method(10.0); // takes the Second overloaded method ==> double ==> becuase it has 10.0 double number
    }
    //====================================================

    public static void method(int a){
        System.out.println("Original method");
    }
    //=====================================================
    public static void method(int a, int b){ // this method has different number of parameters
        System.out.println("Overloaded method");
    }
    //=====================================================
    public static void method(double a){ // this method is overloaded ==> has a different type parameter
        System.out.println("Second overloaded method");
    }
    //=====================================================



}
