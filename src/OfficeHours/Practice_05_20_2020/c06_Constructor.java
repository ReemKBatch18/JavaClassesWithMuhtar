package OfficeHours.Practice_05_20_2020;
/*
    * super :
            super() is used for calling constructor from super class into sub class
            super.  is used for calling super class instance methods and variables
    * DEFAULT CONSTRUCTOR of super class is called AUTOMATICALLY in sub class if there is NOT ANOTHER constructor created in super class
    * parent class constructor WITH ARG MUST BE CALLED MANUALLY into sub class
    * At least ONE constructor MUST be called
    *
    *
    * */
// Test class:  Super class
class Test{

    // Constructor for Test class:
    public Test(){
        System.out.println("A");
    }
}

public class c06_Constructor extends Test{
    // ONLY a constructor can call another constructor ==> if you want to call a constructor you MUST have another constructor to call it from
    // here we will create our constructor for this class Constructor:
    public c06_Constructor(){
        // super() is used to call constructor form super class:
      // super(); // we do NOT need to call it manually. DEFAULT CONSTRUCTOR of super class is called AUTOMATICALLY in sub class
        System.out.println("B");
    }
    // another constructor in this class:
    public c06_Constructor(int a){

    }

    // to execute the constructor ==> create an object==> constructor executes:
    public static void main(String[] args) {
        c06_Constructor obj = new c06_Constructor(); // once executed ==> A then B prints
    }



}
