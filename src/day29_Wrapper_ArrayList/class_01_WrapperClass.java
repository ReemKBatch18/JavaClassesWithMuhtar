package day29_Wrapper_ArrayList;

public class class_01_WrapperClass {

    public static void main(String[] args) {

        /*
        Data Structure:
            1. Array
            2. Collections          ==> only accept objects, cannot use primitives with them
            3. Maps                 ==> only accept objects, cannot use primitives with them
            2,3 are only designed for object....
            those primitives are not objects.. objects have to come from class
            We can apply the wrapper class of primitive to be able to use it
        Primitives: byte, short, int, long, float, double, char, boolean
        Wrapper Classes: each classes is dedicated to its specific primitive, doesn't accept any other primitive
        W C: Byte, Short, Integer, Long, Float, Double, Character, Boolean

        all w c are all presented in java.lang package. Every class in this package is automatically imported


         */

        int a = 100; // primitive
        // if Integer is dedicated to int we can declare wrapper class
        Integer b = a; // wrapper class
        // Can I assign int primitive to this wrapper class Integer? yes I can

        // Can it accept any other int primitive like short primitive? No it cannot. Compiler error

        short s1 = 200; // wrapper class Integer cannot be assigned to s1
        int n1 = s1;  // now int n1 can be assigned to Integer

        Integer n2 = n1;

        //===================================================

        int a1 = 20;
        float f1 = a1;
       // Float f2 = a1; // NO

       // Let's see now if primitives are dedicated to wrapper classes:
       Integer I1 = 200;
       int a2 = I1;

       // primitives are not only dedicated for their wrapper classes,
        // so we can assign a wrapper class to any primitive, no restriction
       Byte B1= 126;
       int a3 = B1; // we can assign wrapper class Byte to the primitive int
        System.out.println(a3);  // 126 same value but data structure is different: one is wrapper class and one is primitive.

    }
}
