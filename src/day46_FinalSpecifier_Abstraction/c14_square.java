package day46_FinalSpecifier_Abstraction;

public class c14_square extends c11_shape { // square is sub class , shape is super class (and abstract)

    // variable needed in square class to calculate area:
    public double side;

    // should I create new method to calculate area or should I use the same method created in shape class?
    // first we must extend shape class ==> we will get compiler error because non-abstract class can not inherit abstract method without overriding it
    // we MUST override area() method immediately
@Override // this proves that our method here is inherited from shape and is overridden here
    public void area(){
    double area = side*side;
    System.out.println("Area of square is: "+area);

    }


    // constructor to initialize the side of square once we create square object:
    public c14_square(double side){
    this.side = side;
    }

}
