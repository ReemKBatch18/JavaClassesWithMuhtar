package OfficeHours.Practice_05_13_2020;

public class c02_InstanceTest {

    public static void main(String[] args) {

        c01_Instances obj1 = new c01_Instances();
        obj1.name = "Muhtar";

        c01_Instances obj2 = new c01_Instances();
        obj2.name = "Kuzzat";

        System.out.println(obj1.name); // Muhtar  (this is the copy of instance variable for this object 1)
        System.out.println(obj2.name);// Kuzzat (this is the copy of instance variable for this object 2)

        // now we will call the instance method like this:
        // each object will have its own instance method like this:
        obj1.printName();   // Name is: Muhtar
        obj2.printName();   //  Name is: Kuzzat
    }
}

// Here I will create my 2nd class and use methods in it :
// All I have to do is not put public.
// We can only have one PUBLIC CLASS
class InstanceBlock{
    public static void main(String[] args) {

        c01_Instances obj = new c01_Instances();

        System.out.println(obj.name); // will print Zuura

        // we will use constructor mostly to initialize instance variables



    }

}
