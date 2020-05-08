package day29_Wrapper_ArrayList;

public class class_03_ParseMethods {
/*
Methods to convert String to primitive or String to wrapper class:
            1. parse methods: converts string of text to the primitives.
                "123" is a string not a number, it is matching with byte, short, long, int
                class dedicated to int is Integer.
                From this class we can call parse method like this: Integer.parseInt(str)
            2. valueOf methods: converts string to wrapper class value (not to the primitive)
                every time it will return me wrapper class
 */
    public static void main(String[] args) {

        String str = "123"; // this is matching with byte, short, long, int but needs to be converted
        // class dedicated to int is Integer. From this class we can call parse method like this: Integer.parseInt(str)
        // it takes the string and converts it to an int.
        // if it returns me an int, can I assign it to int? Yes I can

        int a1 = Integer.parseInt(str);

        System.out.println(str);   // 123 but it is a text
        System.out.println(a1);     // 123 but it is a number
        // how can I find out whether it is a text or number ? we try the + ==> either addition or concatenation
        System.out.println(str +1);   // "123" +1 ==> 1231 concatenation
        System.out.println(a1 +1);      // 123 + 1 ==> 124 addition


        // to convert same text str to byte we call the method parse from the class Byte like this:
        // if it returns me a byte, can I assign it to byte? Yes I can

        byte b1 = Byte.parseByte(str); // byte = 123
        System.out.println(b1 + 5 );

        // if this is a byte can I assign it to Integer wrapper class?? No I cannot
        // Wrapper class Integer is only dedicated to int primitive.
        // Unless we convert to int primitive it will not accept it ==> We do  (int) casting!!
        //We do (int) casting!! ==> returns int==> assign to Integer class
        Integer I1 = (int) Byte.parseByte(str); // Autoboxing: because we are assigning primitive to class
        //Integer = (int)byte;


        // if the string has characters, not only numbers, we can not use parse method to convert.
        // if a string has a decimal :
        String str2 = "10.5";
        //we call the parse method from the Float class to return me float primitive
        Float.parseFloat(str2);
        // if it returns me float primitive, can I assign it to float?? Yes I can
        float f1 = Float.parseFloat(str2); // float 10.5
        System.out.println(f1);
        // to know if it is a number==>
        System.out.println(f1+1); // 10.5 +1 = 11.5
        // From Double wrapper class we can call the parse method to convert the text we have to double
        Double.parseDouble(str2); //double 10.5
        // if this is a double primitive can we assign it to float? no we cannot
        // can we assign it to double ? Yes we can
        double f2 = Double.parseDouble(str2); // double 10.5
        System.out.println(f2 +1); //11.5
        // data types of f1 and f2 are different one is double and one is float.

        String str3 = "3147483647"; //  the maximum number that int can have is 2147483647==> we have to convert this to long
        // we have to convert this string to long primitive,
        // to convert it we need to call parse method from the Long wrapper class and assign to long primitive
        long num1 = Long.parseLong(str3);
        System.out.println(num1);   // 3147483647
        // I can also assign it to double primitive:
        double num2 = Long.parseLong(str3);

        // can I assign num1 which is long to a Long wrapper class? yes I can
        Long num3 = Long.parseLong(str3); // This is called autoboxing which is assigning wrapper class to a primitive

        // if we have a string that has the word true or false ==> we can use parse method to convert to boolean primitive :
        // from Boolean class we call the parse method Boolean.parseBoolean(result1);
        String result1 = "TrUe";
        boolean r1 = Boolean.parseBoolean(result1); // boolean
        System.out.println(r1); // true
        // to confirm that r1 is now a boolean primitive we can try to put ! before it, if it returns false ==> boolean primitive
        System.out.println(!r1); // ==> false

        // if the text is not true or false ==> will return false
        // like if it is "Today is Monday" or "10>9" and we call parse method ==> it will return us false
        String result2 = "Today is Monday";
        boolean r2 = Boolean.parseBoolean(result2);
        System.out.println(r2); // false
        // Any string that does not match "true"  will be returned false if we call the parse method from Boolean class
        // Any string that matches "true", "TRUE", "TrUe", "truE", "tRue", etc.. ==>
        // ==> will be returned true if we call the parse method from Boolean class. Not case sensitive.








    }
}
