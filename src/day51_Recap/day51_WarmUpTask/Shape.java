package day51_Recap.day51_WarmUpTask;
/*
1. create an abstract class named Shape
            variables: name(static)
            abstract methods: calculateArea(), calculatePerimeter();
                    both methods return double
 */
public abstract class Shape {


  public  String name;  // will be inherited then initialized in sub classes


    public abstract double calculateArea();     // must be implemented as soon as we extend this class
    public abstract double calculatePerimeter(); // must be implemented as soon as we extend this class

}

interface Volume {

    boolean hasVolume= true; // final static variable by default
    double calculateVolume(); // public abstract method by default
}


interface PI {
    double PI = 3.14;
    // final static variable by default because we only need one copy for all object where value can be
            // initialized once and never changes
}
