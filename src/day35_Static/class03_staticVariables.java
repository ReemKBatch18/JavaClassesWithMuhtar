package day35_Static;

public class class03_staticVariables {
    int a2 = 100; // instance variable

    static int a3 = 300; // static variable

    public static void main(String[] args) {
        int a1 = 10; // local variable
        class03_staticVariables obj1 = new class03_staticVariables();
        obj1.a2 = 1000; // copy in obj1 is different
        class03_staticVariables obj2 = new class03_staticVariables();
        obj2.a2 = 2000; // copy in obj2 is diferent

        // instance means each object has its own copy
        // whereas static variable = one copy shared by all the objects
        // so:
        obj1.a3 = 4000;

        System.out.println(obj1.a2);// 1000
        System.out.println(obj2.a2);//2000
        // since a3 is static ==> all objects shar the same copy of a3
        System.out.println(obj1.a3);//4000
        System.out.println(obj2.a3);//4000

        //so once we declare that static copy ==> this is the value of our variable
        }
}
