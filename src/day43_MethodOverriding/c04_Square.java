package day43_MethodOverriding;
/*
2. create sub classes of Shape:
                Circle
                rectangle
                square
     give the instance variables that are needed to calculate the Area, perimeter, of those shapes
 */
public class c04_Square extends c01_Shape {
    // 2 variables and 2 methods are inherited
    // square variables
    public double side;

    // square constructor
    public c04_Square(double side){
        this.side = side;
    }

    @Override // override calculateArea()
    public void calculateArea(){
        area = side * side;
        System.out.println("Area of the square is: "+area);
    }

   @Override // override calculatePerimeter()
    public void calculatePerimeter(){
        perimeter = 4 * side;
        System.out.println("Perimeter of the square is: "+perimeter);
    }


}
