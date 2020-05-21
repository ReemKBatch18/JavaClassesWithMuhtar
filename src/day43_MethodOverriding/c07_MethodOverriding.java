package day43_MethodOverriding;
/*
    to override method:
                        * can be done ONLY in SUB class (==> or it will get compile error)
                        * MUST BE SAME method name, SAME parameter, SAME returnType
                        * CAN NOT have private access modifier ( it will not be inherited)
                        * Access modifier MUST be same or more accessible than the original one
                            default ==> protected ==> public
                        * STATIC can NOT be overridden == only ONE copy for all objects
                        * CONSTRUCTORS can NOT be overridden == it can NOT be inherited
                        * Only INSTANCE methods can be overridden
   @Override : identifies if method is overridden or not. Must be applicable.
   Only ONE method is created in memory (The one created in Super class).
   One method with different functions when we override.

 */

class Test {            // SUPER CLASS
    public void method(){
        System.out.println(" Method from Super");
    }
}


public class c07_MethodOverriding extends Test {        //  SUB CLASS
    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.method();  // prints: Method from Super

        // this method is also inherited in this class methodoverriding
        // if we create an object here in methodoverriding class we should be able to call this mehtod through the object
        c07_MethodOverriding obj2 = new c07_MethodOverriding();
        obj2.method();  // prints: Method from Super before overriding
                        // prints: Method from Sub after overriding
        // If I want the outcome to be different when I call this method in the subclass ==> MUST apply method overriding
        // to over ride the method ==> create same method name && same parameter in SUB class
        // I will create it outside main method of course:

    }
    // function of overridden method depends on where we call it from ..> sub class objects vs super class objects
    public void method(){
        System.out.println("Method from Sub");
    }
}
