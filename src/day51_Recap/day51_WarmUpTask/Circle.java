package day51_Recap.day51_WarmUpTask;
/*
4. create a final class named circle that can inherit from Shape and PI
                variable: radius
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius

 */
public final class Circle extends Shape implements PI { // 2 variables inherited, 2 methods inherited
    // by giving final keyword here ==> Circle class can NOT be inherited


    // radius must be created as instance variable so that different Circle objects can have different copies of this variable
    public double radius;


    // we need to create constructor to initialize our radius when we create a Circle object using this constructor
    // also to initialize our instance variable name as Circle for all objects
    public Circle(double radius){
        this.radius = radius;
        name = "Circle";
    }

    @Override
    public double calculateArea() {
        return PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*PI*radius;
    }
}
