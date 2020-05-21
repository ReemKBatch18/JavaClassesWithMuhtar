package day43_MethodOverriding;

public class c05_ShapeObjects {
    // to create objects of shapes

    public static void main(String[] args) {

        c02_Circle cir1 = new c02_Circle(3);
        // the radius was declared as public, from this object can I have access to the radius? yes I can:
        System.out.println(cir1.radius); // 3
        // calling methods
        cir1.calculateArea();       // Area of the circle: 28.26
        cir1.calculatePerimeter();  // Perimeter of the Circle is: 18.84
        // because our methods are inherited as they are ==> outcome is 0.0 first for both
        // to fix bug we MUST OVERRIDE methods to calculate area and parameter for circle
        // in other words: To change functionality of a method ==> override in sub class

        System.out.println("****************************");

        // rectangle object
        c03_Rectangle rec1 = new c03_Rectangle(3,2);
        // can I call the length and width using this object? yes I can
        System.out.println(rec1.length);
        System.out.println(rec1.width);
        // calling methods
        rec1.calculateArea();     // Area of the rectangle is: 6.0
        rec1.calculatePerimeter();// Perimeter of the rectangle is: 10.0
        // because our methods are inherited as they are ==> outcome is 0.0 first for both
        // to fix bug we MUST OVERRIDE methods to calculate area and parameter for rectangle
        // in other words: To change functionality of a method ==> override in sub class

        System.out.println("***************************");

        // square object
        c04_Square sq1 = new c04_Square(3);
        // can I call the side of square from the object sq1? yes I can
        System.out.println(sq1.side); //3.0
        // calling methods: area should be 9 and perimeter should be 12

        sq1.calculateArea(); // Area of the square is: 9.0
        sq1.calculatePerimeter(); // Perimeter of the square is: 12.0
        // because our methods are inherited as they are ==> outcome is 0.0 first for both
        // to fix bug we MUST OVERRIDE methods to calculate area and parameter for square
        // in other words: To change functionality of a method ==> override in sub class




    }



}
