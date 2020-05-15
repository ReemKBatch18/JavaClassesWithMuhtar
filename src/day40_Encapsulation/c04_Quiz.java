package day40_Encapsulation;
/*
please check package: day38_Constructor
            class   : c09_StaticB_InstanceB_Constructor
for rules related to execution of this task
 */
public class c04_Quiz { // question 12

    public static String name = "Osman"; // public static variable

    public c04_Quiz(){  // Constructor
        name = "Hilal";
    }

    {                   // instance block
        name = "Marionella";
    }

    static {            // static block
        name = "Madina";
    }

    public static void main(String[] args) {

        System.out.println(name ); // Madina : static block gets executed first
        // there is nothing else to execute
        // and we haven't created an object
        // No object = No execution of instance block or Constructor


        // BUT ONCE WE CREATE THE OBJECT:
        c04_Quiz obj = new c04_Quiz();
        // when we create object:
        // 1st execution = static block = Madina
        // then
        // 2nd execution = instance block = Marionella (instance block runs first then Constructor)
        // next
        // 3rd execution = Constructor = Hilal

        System.out.println(name); // Hilal
    }

}
