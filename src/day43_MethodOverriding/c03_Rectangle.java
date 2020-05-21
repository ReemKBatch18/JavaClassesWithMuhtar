package day43_MethodOverriding;
/*
2. create sub classes of Shape:
                Circle
                rectangle
                square
     give the instance variables that are needed to calculate the Area, perimeter, of those shapes
 */
public class c03_Rectangle extends c01_Shape {
    // 2 variables and 2 methods are inherited
    // rectangle variables
    public double length;
    public double width;

    // rectangle constructor to assign width and length once we create rectangle object
    public c03_Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    // override calculateArea()
    public void calculateArea(){
        area = width * length;
        System.out.println("Area of the rectangle is: "+area);
    }

    // override calculatePerimeter()
    public void calculatePerimeter(){
        perimeter = 2 * (width + length);
        System.out.println("Perimeter of the rectangle is: "+perimeter);
    }

}
