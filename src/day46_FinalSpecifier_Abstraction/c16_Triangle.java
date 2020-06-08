package day46_FinalSpecifier_Abstraction;

public class c16_Triangle extends c11_shape{

    // variables
    double height;
    double base;

    //constructor to assign values to variables height and base as soon as we create objects
    public c16_Triangle(double height, double base){
        this.base = base;
        this.height = height;
    }

    // overriding area method from super class
    public void area(){
        double area = base*height*1/2;
        System.out.println("Area of Triangle is: "+area);
    }

}
