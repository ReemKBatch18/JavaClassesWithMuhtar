package day37_Constructors;

public class c04_StaticsReview {
    //Instance variables (Fields)  belong to the object. each object has its own copies of instance variables.
    //Any feature that has a static keyword belongs to the class members. Class members are shared by the class and objects.
    //STATIC : methods, variables, block and nested classes can be static.
    // only one copy of static variable is shared by all objects
    // each object has its own copy of instance variable
    // if we have multiple objects ==> they will share same STATIC variable but different INSTANCE variable
    //

    static int a; // 1 copy
            int b; // 2 copies: each object has its own copy of instance variable

    public static void main(String[] args) {
        c04_StaticsReview obj1 = new c04_StaticsReview(); // created obj1
        obj1.a = 20;
        // static variable : only one copy for all objects

        obj1.b = 10;
        // instance variable b : each object has its own copy

        c04_StaticsReview obj2 = new c04_StaticsReview(); // create obj2
        obj2.a = 30;
        // static variable : only one copy for all objects

        System.out.println(obj1.a); //30 : because second time we initialized a as 30
        System.out.println(obj2.a); // 30 : same as above because once static variable is given a value ==> it is the same for all objects
        // since we gave it a value 20 first then we changed it to 30 ==> static variable a value = 30

        System.out.println(obj1.b); //  10: was initialized above
        System.out.println(obj2.b); // 0 : it was not initialized at all ==> default value
        // each object has its own value of instance variable

        // but:
        obj2.b = 5;
        System.out.println(obj2.b); // 5 : because we initialized it as 5.
        // each object has its own value of instance variable
    }
}
