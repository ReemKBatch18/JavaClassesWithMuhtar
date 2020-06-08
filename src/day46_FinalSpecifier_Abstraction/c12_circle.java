package day46_FinalSpecifier_Abstraction;

// I can declare my sub class circle as final because I do not want it to be inherited anywhere else
public final class c12_circle extends c11_shape{      // circle class is sub class. shape class is super class

    // variables of class circle
    public double radius;
     public final static double PI = 3.14;
     // this variable PI can be declared as final because it will never be reassigned another value
    // it is declared static because it is only one copy for all objects created


    // we must override the abstract method from shape class immediately = compiler error
    // because regular class (non-abstract) can not inherit abstract method ==> must override immediately
    // we can declare access modifier same as super class (default in our case) or more visible (protected or public)
    // we declare same return type and same name
    @Override  // this compiled ==> it is overriding area() method from super class
    void area(){
        double area = radius*radius*PI;
        System.out.println("Area of circle is: "+area);
    }

    //here I will create a constructor with a parameter to assign the radius of circle every time I create a circle object
    public c12_circle(double radius){
        this.radius = radius;
    }


}
