package day39_AccessModifiers;

public class c04_Test {
    // this class is in the same PACKAGE like c03_AccessModifiers
    // ==> I can use defaultAccess variable and of course any publicAccess varible

    public static void main(String[] args) {


        c03_AccessModifiers obj = new c03_AccessModifiers();
        System.out.println(obj.defaultAccess); // default: can be called within same package
        System.out.println(obj.publicAccess);// public: can be called everywhere
    //  System.out.println(obj.SSN);        // private: only accessible within its class.
    }
}
