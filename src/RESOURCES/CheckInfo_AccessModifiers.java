package RESOURCES;
import day39_AccessModifiers.c05_PersonalInfo;
public class CheckInfo_AccessModifiers {
    // here we will try to call instance variables from package day39_AccessModifiers
    // and from class c05_PersonalInfo
    // I need to import first

    public static void main(String[] args) {

        System.out.println(c05_PersonalInfo.name);
        System.out.println(c05_PersonalInfo.gender);

    //    System.out.println(c05_PersonalInfo.grade); // default: only accessible in same package
    //    System.out.println(c05_PersonalInfo.age);   // default: only accessible in same package

    //    System.out.println(c05_PersonalInfo.SSN);   // private: only accessible in same class
    //    System.out.println(c05_PersonalInfo.ID);    // private: only accessible in same class

   // we will create objects here then try to call the STATIC variable through the object vs through the class

        c05_PersonalInfo obj = new c05_PersonalInfo();
        System.out.println(obj.name); // public
        System.out.println(obj.gender); // public

    //    System.out.println(obj.grade); // default
    //    System.out.println(obj.age);    // default

    //    System.out.println(obj. SSN);   // private
    //    System.out.println(obj.ID);     // private



    }
}
