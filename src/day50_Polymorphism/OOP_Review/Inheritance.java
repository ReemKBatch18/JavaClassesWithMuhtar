package day50_Polymorphism.OOP_Review;
    /*
    Inheritance:
            - build super class and sub class
            - easy way to get rich by inheriting from super class
            - super class:  Only gives. Can not inherit anything from child class.
            - sub class: can inherit visible variables and methods from super class (visible according to am) except cnstructor
            - sub class uses "extends" keyword to inherit from super class: class A extends B{ }
            - sub class uses "implements" keyword to inherit from interface/interfaces: class A extends B implements C,D{  }
            - Inheritance is pre-condition for polymorphism and for overriding methods
            - method overriding must happen in sub class
            - advantages of inheritance:
                    - less codes
                    - reusable
                    - easy to maintain
            - PUBLIC or PROTECTED access modifier are visible anywhere in sub classes
            - DEFAULT access modifier is only visible in the same package sub classes
            - Instance & Static variables can be inherited

     */
public class Inheritance {
    public    int publicInt = 100;         // can be inherited to any sub class
    protected int protectedInt = 200;     // can be inherited to any sub class
              int defaultInt = 300;       // can be inherited to same package sub classes
    private   int privateInt = 400;       // can NOT be inherited to any subclass

}

class Data extends Inheritance{
    public static void main(String[] args) {

        // 3 instance variables are inherited
        // from class's object we should be able to call these inherited instance variables
        Data obj = new Data();
        System.out.println(obj.publicInt);
        System.out.println(obj.protectedInt);
        System.out.println(obj.defaultInt);
     // System.out.println(obj.privateInt);
    }
}
