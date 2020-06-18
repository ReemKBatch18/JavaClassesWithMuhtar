package day51_Recap.day51_WarmUpTask;
/*
5. create a final class named Cylinder that can inherit from Shape, Volume, and PI
                variables: radius, Height
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius and height
 */
public final class Cylinder extends Shape implements Volume, PI {// 3 variables inherited, 3 methods inherited
    // by giving final keyword here ==> Circle class can NOT be inherited

   public double radius;
   public double height;
    // must be created as instance variables so that different Cylinder objects can have different copies of these two variable



    // we need to create constructor to initialize radius and height of each Cylinder object we will create using this constructor
    // also to initialize our instance variable name as Cylinder for all objects
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        name = "Cylinder";
    }

    @Override
    public double calculateVolume(){
        return PI*radius*radius*height;
    }


    @Override
    public double calculateArea() {
        return (2*PI*radius*height)+(2*PI*radius*radius);
    }

    @Override
    public double calculatePerimeter() {
       // return (radius*2*PI*2)+(height*2);
        return 2*((radius*2*PI)+height);
    }
}
