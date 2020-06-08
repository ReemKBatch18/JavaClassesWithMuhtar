package day46_FinalSpecifier_Abstraction;
/*
    Abstraction:
                Hiding implementation details
                concentrating on essentials things without worrying about details
                abstraction does NOT exist without inheritance: first comes inheritance , next abstraction is possible

                 // in Super class like shape, when we had to calculate area, we had to override it in the sub classes
                 // we can do the following:
                 // create method without body, without implementation.
                 // implementation of method will be different in each sub class
                 // method created in super class is called abstract method = method without body/implementation
                 // a method that is meant to be overridden (opposite of final)
                 // we add the key word abstract in the method signature: public abstract void method(){ }
                 // Only instance methods can be declared ABSTRACT (because they can be overridden)
                 // Abstract method CAN NOT BE : FINAL , STATIC , OR PRIVATE
                 // To ignore the implementation details (because they are different in each class) we declare method as abstract
                 // once method is declared abstract in super class ==>
                 // ==>  it is MANDATORY to override method in sub class immediately and provide necessary implementation
                 // sub class MUST override abstract method first thing

         Example:
                shape:
                    area();  // can be declared as abstract

                triangle:
                    area(): b*h*1/2
                circle:
                    area():r*r*pi
                square:
                    area(): s*s

   2 ways of achieving abstraction:
            1. By ABSTRACT CLASS :
                    we add key word abstract to our class = abstract class
                    abstract class is a class meant to be inherited ( opposite of final)
                    abstract class CAN NOT BE FINAL


            2. By interface

    From Omer Demirtas - from internet:
            Abstraction vs Overriding:
            An abstract method is a contract which forces its immediate subclass to implement the behaviour of all abstract methods.
            Where as overriding is optional and is not always a necessity for the subclasses.
            Efficiency of abstract method lies in the fact that they force the immediate subclass to provide implementation.

  Interview Questions (in summary) : - from Sukriye Isiyok
    Can we declare abstract method as static?
        No, We can't use static keyword with abstract method.
    Can we declare abstract method as final?
        No, We cannot use final keyword with abstract class.
    Can we declare abstract method as private?
        No, We cannot declare abstract method as private.
    Can we use public, protected and default modifiers with abstract method?
        Yes, We can use public, protected and default modifiers with abstract method
 */
public class c10_Abstraction_Introduction {


}
