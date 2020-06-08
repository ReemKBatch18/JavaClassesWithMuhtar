package day46_FinalSpecifier_Abstraction;

public class c15_rectangle extends c11_shape {

    double l;
    double w;

    // this our constructor to assign length and width when we create objects
    public c15_rectangle(double l, double w){
        this.l = l;
        this.w = w;
    }

    // override our area method
    public void area(){
        double area = l*w;
        System.out.println("Area of rectangle is: "+area);
    }
}
