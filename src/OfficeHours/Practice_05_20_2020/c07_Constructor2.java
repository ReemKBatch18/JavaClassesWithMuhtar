package OfficeHours.Practice_05_20_2020;
/*
        super:
                super()     is used to call super class constructor into sub class constructor manually
                            whatever datatype is passed (String, int, double,...) system will execute matching one
                super.      is used to call super class methods and variables into sub class (if the names match)
 */

class test{         //  super class

    // constructors     :
    // because we created constructors with parameters ==> no default without parameter is here ==> MUST CALL AT LEAST ONE CONST MANUALLY IN SUB
    // constructor with string
    public test(String string){
        System.out.println("string");
    }
    // constructor with int
    public test(int a){
        System.out.println("int");
    }
    // constructor with double
    public test(double a){
        System.out.println("double");
    }
}


public class c07_Constructor2 extends test {        // sub class
    // I need a constructor to call a constructor from parent class:
    // this is my sub class constructor
    // in this constructor I will call a constructor from super class : I can choose with string, with int , or with double
    // to call constructor I need to use super() keyword. Whatever datatype I pass in it ==> system will call the matching one from super class
    public c07_Constructor2(){
        super("hello"); // when executed it will print the word "string" (from the constructor we called form super class)
        System.out.println("cat"); // then it will print "cat"
    }
    public static void main(String[] args) {

        c07_Constructor2 obj = new c07_Constructor2(); // string cat

    }
}
