package day03_Variablescontinue;

public class ArithmaticOperators {

    public static void main(String[] args) {

        System.out.println(5+3); //8
        System.out.println(10-2);//8
        System.out.println(10*3);//30
        System.out.println(10/2);//5

        //System.out.println(30/0); // in mathematics, denominator cannot be 0

        int result1 = 10%3;
        int result2 = 11%3;
        System.out.println(result1);
        System.out.println(result2);

        System.out.println(10/4);//2
        System.out.println(10.0 /4);//2.5
        System.out.println(10/4.0);//2.5

        double d1 = 10/4; // system takes by default as int
        //d1=2;
        //d1=2.0;
        System.out.println(d1);//2.0

        double d2 = 10/4.0f;
        System.out.println(d2);


    }

}
