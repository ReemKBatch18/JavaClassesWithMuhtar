package day41_Inheritance;
/*
Inheritance : easiest way to get rich
            builds relationship between classes
            super(parent) & sub (child) relationships
     •The keyword used for inheritance is extends
     Dog : child class         Animal : parent class        public class Dog extends Animal{ }
     •Super Class:  The class whose features are inherited is known as super class(or a base class or a parent class)
     •Sub Class:  The class that inherits the other class is known as sub class(derived class, or child class).
                  The subclass can add its own fields and methods in addition to the superclass fields and methods.

Super (Parent) class Animal: Name Body Size Weight Eat Move
    sub (Child) class Dog : Name Body Size Weight Eat Move Legs
    sub (Child) class Fish: Name Body Size Weight Eat Move Gills Swim
    sub (Child) class Bird: Name Body Size Weight Eat Move Sing Fly

•In OOP, inheritance is used to create an “is-a” relationship among classes: Dog is a Animal   Bird is a Animal    Fish is a Animal
•Inheritance is an OOP concept in Java which allows one class to inherit the features(fields and methods) of an another class.

Types of Inheritance:
    1• Single Inheritance : Subclasses inherit the features of one superclass:
    public class A { }   ===>     public class B extends A{  }
                "is a" relationship:         B is a A

    2• Multi Level Inheritance : A Subclass will be inheriting a Super Class. The subclass also acts SuperClass to another subclass.
    public class A { }   ===>     public class B extends A{  }
                         ===>     public class C extends B{  }
             "is a" relationship:         B is a A
                                          C is a B

    3• Hierarchical Inheritance : Once class serves as superclass for more than one sub class.
    public class A { }   ===>     public class B extends A{  }
                                 public class C extends A{  }
                                 public class D extends A{  }
              "is a" relationship:         B is a A
                                           C is a A
                                           D is a A

    4•Multiple Inheritance : Java DOES NOT support multiple inheritance with classes.
    One class can not have more than one superclass and inherit features from all parent class.

 Advantage of inheritance: improves re-usability
                            easy to maintain
 we can only inherit VISIBLE variables and methods from the super (parent)
 we do not have to repeat initializing same variables and methods


 */
public class c03_InheritanceIntro {
    //
}
