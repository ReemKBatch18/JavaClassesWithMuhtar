package day35_Static;

public class class05_staticMethods {

    int a = 100; // instance variable
    static int b = 200;

    public static void main(String[] args) {

        // this main method is static
        // I can not call the instance variable a directly here
     //   System.out.println(a); // static only accepts static

        // I can call it only by creating the object in this class like this:

        class05_staticMethods obj = new class05_staticMethods();
        // now I can call it through the object like this:
        System.out.println(obj.a);

        // can I call the static variable b ? yes
        System.out.println(b);

        // can I call b through the class name? yes
        System.out.println(class05_staticMethods.b);

        // can call b through the object? yes
        System.out.println(obj.b); // but it's not preferred

    }

    // what if I have an instance method? instance method belongs to the object just like instance variable
    public void method(){
        System.out.println(a);// I am able to call "a" now because they both (variable and method)belong to object

        // I can also call the "b" because it is static and it belongs to the class so I can call it anywhere in the class
        // "b" can be called in any method whether static or not static
        System.out.println(b);
        // that's why static variable is called "global variable"
    }
}
