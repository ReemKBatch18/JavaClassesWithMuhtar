package OfficeHours.Practice_05_27_2020;
/*
OverRiding:
    * ONLY happens in SUB class (INHERITANCE relationship MUST exist)
    * SAME method name
    * SAME parameter
    * SAME return-type
    * DIFFERENT implementation
    * SAME, or more visible, access modifier :PUBLIC > PROTECTED > DEFAULT > PRIVATE
    * Instance method CAN always be overridden (except private ones)
    * STATIC methods can NOT be overridden
    * Constructor CAN NOT be overridden
    * ONLY INSTANCE METHODS (NOT WITH PRIVATE ACCESS MODIFIER) CAN BE OVERRIDDEN
 */
public class c03_methodOverriding2 {

    protected void method1(){

    }

    // here is a static method in super class
    public static void method2(){

    }

    //here is a constructor in super class
    public c03_methodOverriding2(){

    }
}


// here is my SUB class
class TestClass extends c03_methodOverriding2 {

    // to override method1 from super class
    protected void method1(){

    }

    // let's try to override static method
    // @Override // compiler error = method2 is not overridden from super to sub class
   // public static void method2(){}

    // let's try to override constructor:
   // public c03_methodOverriding2(){ } // compiler error
}