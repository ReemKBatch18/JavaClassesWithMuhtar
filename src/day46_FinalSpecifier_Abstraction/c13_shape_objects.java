package day46_FinalSpecifier_Abstraction;

public class c13_shape_objects {

    public static void main(String[] args) {

        c12_circle cir1 = new c12_circle(3.5);
        cir1.area();        //      Area of circle is: 38.465

       c14_square sq1 = new c14_square(2.5);
       sq1.area();          //      Area of square is: 6.25

       c15_rectangle rec1 = new c15_rectangle(2,5);
        rec1.area();        //      Area of rectangle is: 10.0

       c16_Triangle tri1 = new c16_Triangle(3,4);
        tri1.area();        //      Area of Triangle is: 6.0


        // by using one abstract method we implemented 4 different implementation
        // is it better to create 4 methods with 4 different implementation or 1 method with 4 diff implementation?
        // it is better to create 1 method with different implementations... inheritance ! ...  it saves memory


    }

}
