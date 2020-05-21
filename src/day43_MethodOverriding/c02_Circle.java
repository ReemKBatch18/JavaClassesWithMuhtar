package day43_MethodOverriding;
/*
2. create sub classes of Shape:
                Circle
                rectangle
                square
     give the instance variables that are needed to calculate the Area, perimeter, of those shapes
 */
public class c02_Circle extends c01_Shape {
    // 2 variables and 2 methods are inherited from shape
    // circle variables
    public double radius;
    public static double PI = 3.14;
    // we need a constructor to initiate the radius as soon as we create object of Circle
    public c02_Circle(double radius){
        this.radius = radius;

    }

    // Here I will override the calculateArea() method
    public void calculateArea(){
        area = radius*radius*PI;
        System.out.println("Area of the circle: "+area);
    }

    // override calculatePerimeter()
    public void calculatePerimeter(){
        perimeter = 2 * radius * PI;
        System.out.println("Perimeter of the Circle is: "+perimeter);
    }
}
