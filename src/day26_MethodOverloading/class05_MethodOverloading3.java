package day26_MethodOverloading;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class class05_MethodOverloading3 {

    public static void main(String[] args) {
        // 10, 20
        sum (10,20);    // method with int parameters will be executed
       //1.5, 3.5
        double num1 = sum(1.5,3.5);   // method with double parameters will be executed
        //10, 5.5
        double num2 = sum(10,5.5);    // method with double parameters will be executed
        //25L, 30L
        double num3 = sum(25L, 30L);
        // 5 , 4
        // double num4 = sum(5,4); void doesn't return value
        //40L, 50L
        sum((int)40L , (int)50L);




    }

    public static void sum (int a , int b){
        System.out.println(a+b);
    }

    public static double sum (double a , double b){
       return a+b;
    }


}
