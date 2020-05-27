package OfficeHours.Practice_05_27_2020;
/*
OverLoading:
    * happens in SAME class
    * same method name
    * different parameter
    * Return type does NOT matter
    * Access modifier does NOT matter

OverRiding:
    * ONLY happens in SUB class (INHERITANCE relationship MUST exist)
    * SAME method name
    * SAME parameter
    * SAME return-type
    * DIFFERENT implementation
    * SAME, or more visible, access modifier :PUBLIC > PROTECTED > DEFAULT > PRIVATE

Inheritance:    makes sub class richer by inheriting all visible variables and methods
@Override:      next to a method = checks if method is overridden. If it compiles = method overridden. If it doesn't compile = not overriden
Advantage of overriding: To implement different functions/implementation to the method
Overriding method = less memory used : only ONE method is created then overridden in all different sub classes

(From google)
6 Difference between Method Overloading and Method Overriding in java

1. Purpose :
        * To increase the readability of the program, Method Overloading is used.
        * Method overriding is used to provide the specific implementation of the method.
          Child class overrides the super class method.

2. Number of Classes Involved :
        * Method overloading is performed with in class.So only one class is involved.
        * Method overriding involves two classes that have IS-A relationship (inheritance).
          In other words, parent class with child class is required for method overriding.

3. Parameters :
        * In method overloading , parameters must be different.
        * In method overriding , parameters must be same i.e method signatures
         (although parameters can be different for covariant return type).

4. Polymorphism type :
        * Method overloading is an example of compile-type polymorphism.
        * Method overriding is an example of run-type polymorphism.

5. Return type :
        * Method overloading does not depend upon the return type of the method.
        * Return type can be same or different in method overloading.
        * Parameter must be different.
        * Method overriding must have same return type or covariant return type.

6. Private, static or final method :
        * You can NOT override private, static or final method in java.
        * You CAN overload  private, static or final methods in java.

 */
public class c01_methodOverriding {

    public void method1(){
        System.out.println("Super class");
    }
}

// here I will create another class within the methodOverriding class
// this class must have default access modifier. It cannot be public.
// we can only have one public class if created multiple classes together.

class Test extends c01_methodOverriding{

    // here we will override method1 from first class
    @Override // this is to check if this method is overridden
    public void  method1(){
        System.out.println("Sub class");
    }

    // OUR MAIN METHOD TO CREATE OBJECTS:
    public static void main(String[] args) {

        Test obj  = new Test();
        obj.method1();      //  prints: Sub class


    }
}