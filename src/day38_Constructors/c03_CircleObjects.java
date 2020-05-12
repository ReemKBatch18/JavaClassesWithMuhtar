package day38_Constructors;
import java.util.Scanner;
public class c03_CircleObjects {

    public static void main(String[] args) {
        /*
        double r = 5.5;
        Circle circle1 = new Circle(r);
        double areaOfCircle = circle1.areaOfCircle();
        System.out.println(areaOfCircle); // 94.985

        // if we change the r (which is our radius) we will get a different result of course
        */


        // we will use the scanner:
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r = scan.nextDouble();

        Circle circle1 = new Circle(r);
        double areaOfCircle = circle1.areaOfCircle();
        System.out.println("Diameter is: "+circle1.diameter);
        System.out.println("Perimeter is: "+circle1.perimeterOfCircle());
        System.out.println("Area is: "+areaOfCircle);

    }
}
