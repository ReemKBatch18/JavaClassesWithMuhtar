package day04_JavaRecap;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

public class ArithmaticOperators {

    public static void main(String[] args) {
        System.out.println(10/4); //2
        double d = 10/4; // double d = 2
        //d==2.0
        System.out.println(d);//2.0
        System.out.println(10.0/4);//2.5
        System.out.println(10 / 4.0); //2.5
        System.out.println(10.0 / 4.0); //2.5
        float f1 = 10/4;
        //float f1=2;
        System.out.println(f1); //2.0
        boolean evenNumber = 25 % 2 == 0;
               // if 25/2 has a reminder of zero, then it's even number
        System.out.println(evenNumber); // false
        System.out.println(25%2); // = 1 doesn't equal to 0
        boolean oddNumber = 22 % 2 != 0; // odd number
                       //        0 != 0 ==> false
        System.out.println(oddNumber); //false
        System.out.println(10 % 2 == 0); // true 10 is even number
        System.out.println(11 % 2 != 0); // true 11 is odd number

        System.out.println("10 is even number: " + (10 % 2 == 0)); //will print true
        System.out.println("11 is even number:" +(11 % 2 != 0)); //will print false at end
        System.out.println("25 is odd number: "+ (25 % 2 ==0));
        System.out.println("25 is even number: "+ !(25 % 2 !=0));






    }



}
