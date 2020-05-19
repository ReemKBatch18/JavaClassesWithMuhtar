package day42_Inheritance;

class A{  // is parent class
    int a = 100;
    public A(double b){
        System.out.println(this.a);  // will print 100 when executed when we create object
        // this. is used to call the instance variable a
    }
    // once I create a constructor in parent class ==> we MUST call it in sub class
    // if it was default constructor with no parameter it will be called automatically
    // but once we create one with parameter (different from default) we MUST CREATE a constructor in subclass
    // and call the constructor (with parameter) from super class using super() keyword
    // The constructor we create in subclass does NOT have to pass a parameter like the one in super class
    // even if it passes a parameter ==> it does NOT have to match the parameter in the constructor from super class
}

public class c07_SuperKeyword extends A{ // is subclass

    int a =200;
    public c07_SuperKeyword(){
         // use super() to call constructor from super class to sub class
        super(3.0); // once this executed ==> will print 100 (because that's the constructor from super class)
        System.out.println(super.a); // once executed ==> will print 100
    }

    public static void main(String[] args) {
        // now I will create my object from superKeyword class
        // once object is created ==> Constructor in superKeyword will execute ==>
        // since constructor in SuperKeyword called constructor from super class ==> both will execute
        // first super class constructor will execute and print 100 and next sub class constructor will execute and print 100 again
        c07_SuperKeyword obj = new c07_SuperKeyword();
        // Constructor we pass here is the one we created earlier on line 20 without parameter

        // now I will create an object from A class (parent class)
        // only its constructor will be called then
        A obj2 = new A(3.0);
        // Constructor we pass here is the one we created earlier on line 20 with double parameter in class A
        // this means only 100 will be printed because that's what the constructor in class A called for
        // we must pass a parameter with double when we create our object because that's how we created our constructor
    }
}
