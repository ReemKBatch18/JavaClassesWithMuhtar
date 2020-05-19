package day42_Inheritance;
/*
1. default constructor from super class is automatically called into sub class
2. if we create a constructor in super class with parameter we MUST call it in sub class using the keyword super()
3. if we create multiple constructors in a super class, only ONE need to be called into sub class
4. to call constructor from super class into sub class, we MUST call it in a constructor ==>
    ==>we must create a constructor in sub class then call from super class
    ( cannot call constructor in main method or in static or instance block)
 */
class B{         ///////  SUPER CLASS  ///////
    public B(int a){        // super class constructor with int
        System.out.println("int");
    }
    public B(double a){    // super class constructor with double
        System.out.println("double");
    }
    public B(long a){     // super class constructor with long
        this(10); // call constructor with int variable ==> will print "int" first once executed
        System.out.println("long"); // will print "long" next once executed
    }
}

public class c08_InheritanceReview extends B {      ///////  SUB CLASS  ///////
    // once we extend B here ==> we MUST call a constructor here
    // we MUST call the constructor from super class in a CONSTRUCTOR HERE
    // ( WE can not call constructor in main method, nor in instance nor in static block)
    // the constructor we create here DOES NOT have to pass same data-type parameter like the constructor we're calling
    // it can be any kind of constructor as long as it calls a constructor from super class using super()
    public c08_InheritanceReview(String a){     //// sub class constructor ////
        super(19L); // constructor with long ==> will print "int" first, then "long"
        // here we called the constructor with long variable from super class
        // ==> will print "int" first then "long" when we create an object here
        System.out.println("String"); // this will print last once we create the object here
    }

    public static void main(String[] args) {
        // now we will create object from c08_InheritanceReview class
        // to create my object==> I need to use the constructor I created in this class with a STRING argument
        c08_InheritanceReview obj= new c08_InheritanceReview("Hi");
        // once I create my object ==> constructor will execute ==> print "int" ==> "long" => "String"

        /*
        this is how it will print on console:
        int
        long
        String
         */
    }

}
