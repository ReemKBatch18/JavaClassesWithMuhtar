package day51_Recap.day51_WarmUpTask;
/*
6. create a class named ShapeObjects
                1. create two circle and two Cylinder' objects
                2. create an ArrayList that can contain  all those objects
 */
import java.util.ArrayList;
import java.util.Arrays;

public class ShapeObjects {
    public static void main(String[] args) {

        // to create objects: must use constructors created in Circle and Cylinder classes
        Circle cir1 = new Circle(1.5);
        Circle cir2= new Circle(2.5);
        Cylinder cyl1= new Cylinder(1.5,2);
        Cylinder cyl2 = new Cylinder(2.5,2);
        // does array support objects? yes it does. It can store objects and primitives.
        // does arrayList support objects? yes. It is only designed to store objects
        // in polymorphism: Super class can be reference to sub class objects
        // what casting is that? == upcasting
        // I can do this: Shape shape1 = cir1; // casting is done automatically (implicitly done)

     //  ArrayList<Shape> listOfShapes = new ArrayList<>(Arrays.asList(cir1,cir2,cyl1,cyl2));
        ArrayList<Shape> list = new ArrayList<>();
        list.addAll(Arrays.asList(cir1,cir2, cyl1, cyl2));
        Shape shape2 = new Cylinder(3,6);
        // I must do this : ((Cylinder)shape2) to be able to call methods and variables that belong only to Cylinder class
        // this is called downcasting
      //  ((Cylinder)shape2).calculateVolume();
       //  shape2.calculateArea();
         for (Shape eachShape: list){
             System.out.println(eachShape.name+" : " +eachShape.calculateArea());
         }

        System.out.println("***************************");

         // this  listOfShapes.get(2) is going to return me reference type of Shape
        // I need to downcast it to Cylinder to be able to call calculateVolume() method
        // calculateVolume() method belongs to Cylinder class ==> to Cylinder reference type
        // if we downcast eachShape object to Cylinder ==> I can call methods that only belong to Cylinder
         double d = ((Cylinder) list.get(2)).calculateVolume();
        System.out.println(d);

        Shape s1 = new Circle(6);
       // System.out.println(s1.radius); // I can't call radius using reference type Shape. radius belongs to Circle class
        // I need to downcast s1 to a Circle reference type
        System.out.println(((Circle)s1).radius);    // will print 6.0







    }
}
