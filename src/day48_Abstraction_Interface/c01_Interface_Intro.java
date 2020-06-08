package day48_Abstraction_Interface;
        /*
    Abstraction:
           hiding the implementation details
           two ways to achieve abstraction:
                    1. abstract class
                    2. interface

    interface:
           is blue print of class
           it is not the class
           it is used to specify the behaviors that a class should implement
           it is the 2nd way to achieve abstraction
           it is 100% abstraction. PURE ABSTRACTION. ONLY for abstraction
           No need to add abstract keyword to interface we create. It is already abstract.
           No need to add abstract keyword to methods created in interface
           ACCESS MODIFIER IS ALWAYS PUBLIC by default
           No need to add public keyword as access modifier: IT IS DEFINITELY PUBLIC IN INTERFACE
           ALL METHODS in INTERFACE are PUBLIC ABSTRACT by default
           PUBLIC is the only access modifier permitted in interface.
           interface can be super type to a class using "implements" keyword
           interface can NOT be super class to a class using "extends" keyword
           Once we implement super type interface we MUST override all the methods in the non-abstract class
           if our class is abstract we don't have to override our abstract methods
           Access modifiers of all overridden methods MUST be public too, of course
           in interface, you can have Only one kind of variable: static final ( by default - no need for final static keywords)
           can NOT be final
           if an abstract class is inheriting from interface, overriding methods is optional
           if a non-abstract class is inheriting from interface, overriding is a MUST

IMPORTANT 3 QUESTIONS:
    1. WHY do we need interface?
                * A class can inherit from one class only (extends)
                * A class can inherit multiple interfaces (implements)

    2. WHAT can we HAVE in interface?
                * variables: static final variables only by default
                * methods: abstract methods, static methods, default method

    3. WHAT CANNOT we have in interface?
                * constructor
                * instance variable
                * instance methods
                * blocks



    creating class:
                public class className{ }

    creating interface:
                public interface interfaceName{ }

                to create it in our package:
                            1. we right click on our package
                            2. we select new --> java class
                            3. from drop menu we select interface (instead of class)
                            4. we type in the name
                            5. hit enter

     a class vs an interface:
                * class can INHERIT FROM ONE CLASS ONLY ==> EXTENDS keyword
                * class can INHERIT FROM MULTIPLE INTERFACES ==> IMPLEMENTS key word
                * to create class we have to give access-modifier, give abstract keyword
                * to create interface, access-modifier OR abstract keyword are not needed
                * Both abstract class and interface are meant to be inherited
                * both abstract class and interface can NOT be final
                * both abstract class and interface can NOT create object
                * you can create object from non-abstract class
                * you can not create object from interface ( PURE ABSTRACTION + NO CONSTRUCTOR)
                * in class,  you can have many variables and methods
                * in interface, you can have Only one kind of variable: static final variable
                            can be called from interface name (static) & must be initialized immediately (final)

                * interface can NOT HAVE:
                     instance variables: instance variable belong to object that came from class by using a constructor
                     constructor: ==> can not create object
                     instance methods
                     instance block
                     static block : is used to initialize static variable. Can not here re-initialize final static variable

                * interface can HAVE:
                     static final variable by default
                     abstract method
                     static method
                     default method (can only exist in interface)


       RemoteWebDriver   implements WebDriver, TakeScreenShot, JavaScriptExecuter
         /    |      \
       /      |       \
    Chrome   fireFox   opera

    sub classes : chrome, firefox, opera
    interfaces  : WebDriver, TakeScreenShot, JavaScriptExecuter
    class       : RemoteWebDriver
    chrome       extends RemoteWebDriver (extends one class)
    firefox      extends RemoteWebDriver (extends one class)
    opera        extends RemoteWebDriver (extends one class)
    RemoteWebDriver implements WebDriver, TakeScreenShot, JavaScriptExecuter (implements multiple interfaces)

    * both keywords extends and implements are used for inheriting
    * both keywords can be used together in same class in the following order:
           we use extends keyword FIRST and implements NEXT
           syntax: class extends class implements interface1, interface 2{ }
    extends:
            class           extends     abstract class
            class           extends     class
            abstract class  extends     abstract class
            interface       extends     interface
   implements:
            class           implements  interface1, interface2, interface3.....


 similarities between abstract class and interface
          * Both abstract class and interface are meant to be inherited
          * both abstract class and interface can NOT be final
          * both abstract class and interface can NOT create object

 differences between abstract class and interface
          * abstract class can have constructor
          * abstract class can have instance methods
          * abstract class can have blocks
          * abstract class can have instance variables
          * abstract class can have all access modifiers

          * interface can have default method
          * access modifier is always PUBLIC by default
          * variables are always STATIC FINAL by default

DEFAULT METHOD:
    // default method is only created in interface
    // it is used to express lambda expression
    // if you try to create default method anywhere else it will give compiler error
    // we can't call default method here into main method because it is not static

    // even if we try to create an object to call it through the object == compiler error
    // interface can not create objects
    // the only way is to inherit it into another class using implements keyword
    // We can only execute default method after we inherit it into a class from the interface
    // we create object in the sub class then call method through the object


     */

public interface c01_Interface_Intro {

    public abstract void method1(); // public and abstract keywords are grey because we don't need them.
                                    // They'll be there by default
    public void method2();          // abstract method by default
    void method3();                 // public abstract method by default
}
