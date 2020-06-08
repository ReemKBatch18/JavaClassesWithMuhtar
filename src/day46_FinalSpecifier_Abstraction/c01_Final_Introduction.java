package day46_FinalSpecifier_Abstraction;
/*
    Final keyword:
        * Constant. Can NOT be changed
        * Can only be applied to 3 features: Variable  Method  Class
        * Can NOT be applied to static block or instance block

            1. Variables: Final variable can NEVER BE RE-ASSIGNED
                 final local variables can be declared before initializing (but can't be used till it is initialized)
                 final instance variables MUST be initialized immediately.
                 final static variable MUSt be initialized immediately .
                 Can NEVER generate Setter for final private variables to re-assign its data,
                 but you can generate getter for final private variables to get the data.

           2. Methods: Final Methods = implementation of methods can NEVER be changed
                final methods can NOT be overridden (can not have different implementation)
                final methods CAN be overloaded
                Constructors can NOT BE final

          3. Classes: Final Classes = Immutable class can NOT be inherited
                final class can NOT be super class = compiler error
                Sub class CAN be final





 */
public class c01_Final_Introduction {

}
