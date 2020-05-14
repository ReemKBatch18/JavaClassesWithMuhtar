package day39_AccessModifiers;

public class c05_PersonalInfo {

    // public instance variables
    public static String name = "Zuura"; // public: accessible everywhere, static: can be called using class name
    public static char gender = 'F';    // public: accessible everywhere, static: can be called using class name

    // default instance variables:
    static char grade = 'A'; // default: accessible only in package, static: can be called using class name
    static int age = 18;// default: accessible only in package, static: can be called using class name

    // private instance variables
    private static long SSN = 901234;// private: accessible only in this class, static: can be called using class name
    private static long ID = 9876543;// private: accessible only in this class, static: can be called using class name




}
