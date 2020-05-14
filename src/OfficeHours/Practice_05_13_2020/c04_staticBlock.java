package OfficeHours.Practice_05_13_2020;

public class c04_staticBlock {
    // static variable:
    static String str;

    // static block:
    static { // If we initialize the static var here then we can use it in this class and in other classes too
        str = "Cybertek";
    }

    // here is our main method for c04_staticBlock class
    public static void main(String[] args) {
        // if we initialize our static variable here ==> we can only use it in this current class - c04_staticBlock
        str = "Cybertek";
        // but if we want to use it in other classes like in class staticBlockTest ==>
        // then we better initialize in static block==> then call using class name

    }
}


// Here is my second class:
class staticBlockTest{

    public static void main(String[] args) {

        // because I initialized my static var in static block ==> I can call it here throug the class name where static block is
        System.out.println(c04_staticBlock.str); // it will print "Cybertek"
    }
}
