package day43_MethodOverriding;
/*
Task:
1. create a class called ShapeActions:
                variables: area, perimeter
                methods: calculateArea(), calculatePerimeter()
 */
public class c01_Shape {
    // we must declare our variables as instance variables
    public double area; // depends on shape: by default it is set to 0
    public double perimeter;
    // calculateArea()
    public void calculateArea(){
        area =0;
        System.out.println("Area of the shape: "+0);
    }
    public void calculatePerimeter(){
        perimeter=0;
        System.out.println("Perimeter of the shape: "+0);
    }



}
