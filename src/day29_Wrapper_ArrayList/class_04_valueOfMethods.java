package day29_Wrapper_ArrayList;

public class class_04_valueOfMethods {

    public static void main(String[] args) {

        /*
        2. valueOf methods: converts string to wrapper class value (not to the primitive)
           every time it will return me wrapper class
                Integer.valueOf(str); ==> returns me Integer wrapper class
                Double.valueOf(str2); ==> returns me Double wrapper class
                Long.valueOf(str) ==> returns me Long wrapper class
                Short.valueOf(str) ==> returns me Short wrapper class
                Byte.valueOf(str); ==> returns me Byte wrapper class
                Boolean.valueOf(str); ==> returns me Boolean wrapper class
                valueOf method for Boolean: any string other than true will return us false

         */

        String str = "123";
        // we use valueOf method when we want to return wrapper class, not primitive, from a string
        Integer.valueOf(str);
        // if it returns us Integer ==> we can assign it to Integer wrapper class
        Integer a = Integer.valueOf(str); // Integer, 123
        System.out.println(a); // 123
        // This Integer only accept its only primitive ==> int

        // Primitives are not dedicated to their wrapper classes.. they accept different wrapper classes:
        double b = Integer.valueOf(str); // This is unboxing
        // double = Integer  // because double primitive can take Integer wrapper class
        System.out.println(b); //==> 123.0

        String str2 = "15.5";
        // can I convert this to double primitive using parse method? Yes I can
        // since it return me a double  ==> I can assign it to double primitive:
        double d1 =  Double.parseDouble(str2);
        // double = double // no boxing type

        // can I convert this to Double wrapper class using valueOf method? Yes I can
        // since it return me a Double wrapper class  ==> I can assign it to double primitive ==>Unboxing
        double d2 = Double.valueOf(str2); // 15.5
        // double = Double  ==> unboxing


        System.out.println(d1); // double 15.5
        System.out.println(d2); // double 15.5

        System.out.println(d1==d2); // true

        Double d3 = Double.valueOf(str2);   // Double wrapper class
        System.out.println(d3);     // Double 15.5
        System.out.println(d1 == d3); // ==> returns true

        System.out.println("=================================================================");

        // NOW LET'S APPLY THIS VALUEOF() METHOD TO BOOLEAN:
        String r1 = "true";
        Boolean t1 = Boolean.valueOf(r1); // Boolean , true
        // Boolean = Boolean ==> no boxing
        // if t1 returns me wrapper class, can I assign to boolean primitive? Yes I can
        boolean t2 = Boolean.valueOf(r1); // Boolean , true
        // boolean = Boolean    //unboxing

        System.out.println(t1);
        System.out.println(t2);
        // Any string that does not match "true"  will be returned false if we call the parse method from Boolean class
        // Any string that matches "true", "TRUE", "TrUe", "truE", "tRue", etc..==>
        // ==> will be returned true if we call the valueOf method from Boolean class. Not case sensitive.

        System.out.println("===============================================================");

        // in wrapper class we have minimum and maximum numbers
        // if we have to find max value of int ==> we can call the max function from the Integer wrapper class:
        // Integer.MAx_VALUE;
        // Min_Value : returns the minimum
        // Max_Value : returns the maximum

        int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum); //2147483647  max number that int can have

        double maxNum2 = Double.MAX_VALUE;
        System.out.println(maxNum2); // 1.7976931348623157E308

        int minNum = Integer.MIN_VALUE;
        System.out.println(minNum); // -2147483648  min number that int can have

        byte maxNum3 = Byte.MAX_VALUE;
        System.out.println(maxNum3); //127

        byte minNum2 = Byte.MIN_VALUE;
        System.out.println(minNum2); // -128


    }
}
