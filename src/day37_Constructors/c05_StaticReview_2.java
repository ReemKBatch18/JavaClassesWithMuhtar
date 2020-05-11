package day37_Constructors;

public class c05_StaticReview_2 {
    static String name = "John"; //STATIC VARIABLE
            String id = "123";// INSTANCE VARIABLE

    public static void main(String[] args) {

        System.out.println(name); // main method is STATIC Method ==> we can call static variable name
     //   System.out.println(id); // instance variable can only be called through an object in the static main method.
      // in main method (because it is static) I can call STATIC variable immediately..
        // no need to initialize the static variable again in main method since it's already initialized as static variable in the class


    }
}
