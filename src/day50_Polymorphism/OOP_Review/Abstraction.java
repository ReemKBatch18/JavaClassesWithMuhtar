package day50_Polymorphism.OOP_Review;
/*
Abstraction:
          - hiding the implementation details
          - concentrating on essentials/ important, without worrying about details
          - ChromeDriver, FireFoxDriver, OperaDriver are all classes
          - all these classes can do a common action: get() and quit() .
          - WebDriver:
                - get();    // abstract method to be overridden to give different implementation
                - quit();   // abstract method to be overridden to give different implementation
            - ChromeDrive implements WebDriver:
                - get(): opens chrome
                - quit(): closes chrome only
            - FireFoxDriver implements WebDriver:
                 - get(): opens firefox
                - quit(): closes firefox only
            - OperaDriver implements WebDriver:
                - get(): opens opera
                - quit(): closes opera only

          - Abstract method:
                - method without body/implementation
                - meant to be overridden
                - abstract method can not be final
                - abstract method can not be static
                - abstract method can not be private
                - abstract method can be overloaded
          - To achieve abstraction : you can use two ways: Abstract class OR Interface
                - Abstract class:
                    - not concrete
                    - can not create object
                    - meant to be inherited
                    - abstract class can NOT be final
                    - use "extends" keyword to inherit
                    - sub class can extend one abstract class (one class in general)
                    - abstract class can have all methods and all variables
                - Interface:
                    - Sub class can implement multiple interfaces
                    - can NOT create object
                    - meant to be inherited
                    - interface can NOT be final
                    - use "implements" keyword to inherit from interface into a class
                    - "extends" keyword must be used before "implements" keyword when inheriting from class and interface
                    - use "extends" keyword to inherit form interface to interface
                    - Everything has public access modifier
                    - can only have :
                                static final variables (by default)
                                abstract or static or default methods
                    - can NOT have:
                                constructor
                                instance variables
                                instance methods
                                blocks
 */
// interface
interface I {
    void method2(); // public abstract by default
    abstract int method3();
  //  public I() {}
  //  public void m(){ }
  //  { }
  //  static{ }

    int a = 10;     // by default it is public static final
    // can I prove that variable "a" is static? yes I can try to call in the static method
    public static void main(String[] args) {
        System.out.println(a); // we can call it
    }

}


// abstract class
abstract class A{

    //instance block
    {

    }

    //static block
    static {

    }

    //abstract method
    protected abstract void method1();

    // instance method
     void method4(){

     }

    //constructor
    public A(){

    }
}
// interface
interface I2{

}


      public class Abstraction extends A implements I, I2{
    // must override abstract method from abstract class immediately after inheriting because sub class is not abstract
    // if sub class is abstract we do NOT have to override method. we can override them if we want to.
    // it's mandatory to have everything the same when overriding except for implementation
    @Override
          protected void method1(){

    }

          @Override
          public void method2() {

          }

          @Override
          public int method3() {
              return 0;
          }
      }
