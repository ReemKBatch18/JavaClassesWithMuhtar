package day50_Polymorphism;

/*
    Type Castings:
    Casting means: converting one type to another
                    two types of casting are: primitive type & reference type

            - Primitive Type Casting: used when initializing primitives
              byte < short < int < long < float < double
              two types of primitive casting: implicit & explicit
                 - implicit casting: casting (assigning) smaller type to larger type  - done automatically
                        int a = 100;
                        double b = a; // b = 100.0
                 - explicit casting: casting (assigning) larger type to smaller type - MUST BE DONE MANUALLY
                        int a = 200;
                        short s = (short) a ;

           - Reference Type Casting : MUST occur in IS A relation. casting reference
              two types of reference casting: upcasting & downcasting
                 - Upcasting: casting from subclass type to superclass type (child to parent) like upgrade
                        ex1:
                        Dog dog = new Dog ("a", "f", 1);
                        Animal animal1 = dog; // upcasting, done implicitly automatically
                        // reference type of dog is now Animal (super class reference type). It was Dog before.
                        it is like:
                        Animal animal1 = (Animal) dog; // but we don't have to add (Animal). compiler adds it automatically
                        ex2:
                        Cat cat = new Cat("b","F",2);
                        Animal animal2 = cat;
                 - downcasting: casting from a superclass type to subclass type
                        ex:
                        Animal animal3 = new Dog ("r","f",2);
                        Dog dog3 = (Dog)animal3 ; // down casting. MUST be done MANUALLY
                        Animal animal4 = new Cat ("c","f",3);
                        Cat cat4 = (Cat) animal4; // down casting MUST be done MANUALLY
                        ex2:
                        Animal animal5 = new Dog("l","m",2);
                        // animal5.bark(); // compiler error
                        Dog dog2 = (Dog) animal5; // l is barking
                        dog2.bark(); // this method only belongs to Dog class
                        but we can do this to call it through the object animal5:
                        ( (Dog) animal5 ).bark(); // l is barking
                        // ( (Dog) animal5 ) returns us reference type Dog ==> we can call the method that belongs to Dog class

 */
public class Reference_Type_Casting {
    public static void main(String[] args) {


        int a = 100;
        double b = (double)a;  // implicitly done

        Dog dog = new Dog("a", "f",1 );
        Animal animal1 = (Animal)dog; // upcasting, done implicitly

        Cat cat = new Cat("r", "female", 4);
        // Dog dog2 = (Dog)cat;
        Animal animal2 = cat; // upcasting, done implicitly

        System.out.println("==============================================");

        double c = 10;
        int d = (int)c; // explicitly done

        Animal animal3 = new Dog("A", "F", 12);

        Dog dog3 =  (Dog)animal3;  // down casting , MUST be done manually

        Animal animal4 = new Cat("C", "female", 7);

        Cat cat2 = (Cat)animal4;

        System.out.println("===============================================");

        Animal animal5 = new Dog("Lucy", "Female", 3);
        //  animal5.bark();

        Dog dog2 =  (Dog)animal5;
        dog2.bark();

        // second way:
        ( (Dog)animal5 ).bark();



    }
}
