package RESOURCES;

import day42_Inheritance.c03_AccessModifier;

public class Inheritance2 extends c03_AccessModifier{

    // what variables will be inherited into this class? PUBLIC and PROTECTED
    // what methods will be inherited into this class?  PUBLIC and PROTECTED
    /*
    publicVariable
    protectedVariable

    publicMethod
    protectedMethod
     */

    // if they are inherited I should be able to call them and get access to them through this class name:
    public static void main(String[] args) {
        System.out.println(Inheritance2.publicVariable);
        System.out.println(Inheritance2.protectedVariable);
        // we can NOT call default (=different package) or private (can never ) here

        Inheritance2.publicMethod();
        Inheritance2.protectedMethod();
        // we can NOT call default (=different package) or private (can never) here
        //to call protected in different package you need to inherit first
        //whereas public can be called anywhere in all different packages..
    }
}
