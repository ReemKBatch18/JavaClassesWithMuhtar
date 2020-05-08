package day14_StringClass;

public class StringManipulations2 {

    public static void main(String[] args) {

        String str = "";
        boolean bool1 = str.isEmpty();// the string is empty == true
        System.out.println(bool1);// true

        str = " "; // not empty any more
        bool1 = str.isEmpty();
        System.out.println(bool1);// false

        String username = "";
        if (username.isEmpty()){
            System.out.println("please provide the user name first");
        }
        String s1 = "Cat"; // string literal
        String s2 = new String("Cat");
        System.out.println(s1 == s2);// false, different memory locations. differnt objects
        // whereas:
        System.out.println(s1.equals(s2)); // true. Because it compares the text

        String z1= "Reem";
        String z2 = new String("Reem");
        String z3 = "Reem";
        //==
        System.out.println(z1 == z2); //false, different objects
        System.out.println(z2 == z3); // false
        System.out.println(z1 ==  z3);// true, same object
        //equals():
        System.out.println(z1.equals(z2)); // true. It becomes false if we have two different texts
        System.out.println(z2.equals(z3)); // true
        System.out.println(z1.equals(z3));// true

        /*
        userName: cybertek
        passWord:cybertekschool
         */





    }

}
