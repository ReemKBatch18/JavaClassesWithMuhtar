package day45_Exceptions;




class A{        // super class for class B
    public A(){
        System.out.println("a ");
    }
}

class B extends A{  // B is sub class for A and B is super class for Test
    public B(){
        //  class A default constructor is called automatically because it is a default constructor
        System.out.println("b ");
    }
}

public class c06_Test extends B{

    public c06_Test(){
        // class B default constructor is called automatically.
        System.out.println("c ");
    }
}
