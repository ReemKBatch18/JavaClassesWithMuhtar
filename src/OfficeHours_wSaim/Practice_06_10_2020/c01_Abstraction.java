package OfficeHours_wSaim.Practice_06_10_2020;
    /*

    Abstraction:
        A concept that focuses only on the feature / idea of something and not how it is done (implementation)
        cannot exist without inheritance
        achieved by :
            1. Abstract class
            2. Interface

    Abstract class:
            1. to create it: we use abstract keyword before class declaration
            2. cannot be instantiated
            3. can not create object from abstract class
            4. allows creating abstract methods (methods without implementation or body) to be overridden
            5. can extend an abstract class --> implementing abstract methods is not necessary
            6. when non-abstract class extends abstract class --> MUST override (implement) all abstract methods
            7. variables act following regular inheritance rules
            8. Can have abstract and non- abstract methods
            9. can NOT be final or private
            10. when abstract class inherit abstract class--> it inherits all abstract methods
            11. when concrete class extends abstract class --> all abstract methods must be implemented (overridden)

   Interface
            1. to create it we use interface key word
            2. not a class but acts similar
            3. allows creation of abstract methods
            4. main purpose: to provide additional information and behaviors to any class that need them
            5. By default: any method is public abstract
            6. By default: any variable is public final static --> must be initialized immediately
            7. can have default method: use default keyword --> allows method to be created with implementation
            8. after Java 8: can have static method
            9. to inherit from interface: use implements keyword
            10. allows you to inherit from multiple interfaces
            11. an interface can inherit from other interfaces using the keyword extend
            12. interface can NOT inherit from a class

   ex:
    public class Student extends Person implement Teachable, Dreamer{ }
    is a :  Student is a Person
            Student is a Teachable
            Student is a Dreamer

    Interface can HAVE:
            constant variables
            abstract methods
            default methods
            static methods
   Interface CAN NOT HAVE:
            constructor
            blocks
            instance variables or methods

            can only be definined in ab class or interface
     */
public class c01_Abstraction {

}
