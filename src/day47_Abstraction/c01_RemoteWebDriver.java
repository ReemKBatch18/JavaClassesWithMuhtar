package day47_Abstraction;
    /*
    OOP Abstraction     : means hiding the implementation details
                          means you can not have body of the method
   Abstract method : method without body
                     MUST be overridden
                     ABSTRACT CAN NOT BE PRIVATE, STATIC, FINAL
                        PRIVATE ( can not be overridden)
                        STATIC (can not be overridden)
                        FINAL  (implementation of method can not be changed )

        There are two ways to have abstract method (to achieve abstraction):
                   1. Abstract class
                   2. Interface

                     non-abstract method : access-modifier return-type methodName(){ }
                     abstract method     : access-modifier abstract-keyword return-type methodName();
                        EX : get() method in super class RemoteWebDriver in selenium
                             quit() method in super class RemoteWebDriver in selenium
                        RemoteWebDriver:    super
                            get(URL); // abstract method to be overridden in sub classes to provide different implementations
                            quit();  //  abstract method to be overridden in sub classes to provide different implementations

                        Chrome extends RemoteWebDriver:
                            get(URL):   opens chrome
                            quit():     quits chrome

                        fireFox extends RemoteWebDriver:
                             get(URL):   opens fireFox
                            quit():     quits fireFox

                        Opera extends RemoteWebDriver:
                            get(URL):   opens Opera
                            quit():     quits Opera
                  In the future if I have 50 browser, I don't need to create methods for each
                  I can apply the inheritance from RemoteWebDriver (super class of all browsers)

    Abstract class:
                    MUST be inherited at some point
                    ABSTRACT CAN NOT BE FINAL
                    Can NOT create objects ==> means we can not get access to the instance methods of the class (because instance methods are called from object)
                    Abstract is not concrete (Object must be concrete ==> abstract class can not create objects)
                    When abstract class is extended by regular class ==> we MUST override the abstract methods of super class
                    When abstract class is extended by an abstract class ==> No Need to override abstract methods

   Interface:

To override:
    windows: right click ==> generate ==> it will give the options
     */


public abstract class c01_RemoteWebDriver {


    public abstract void get (String url);
    // abstract method = no body. Will have different implementations in sub classes when overridden
    // we can have access modifier as protected (or public)

    public abstract void quit();

}
