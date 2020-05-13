package OfficeHours.Practice_05_13_2020;



/*
create class called Student:
        ins variables: name, id
        ins method: toString()
 */
public class Student {
    String name; // ins variable (each object gets a copy of ins var)
    long id;    // ins variable (each obj gets a copy of ins var)
static String schoolName = "Cybertek"; // static variable (ONE copy only for all objects). This is a member of class ==> can be shared by objects

    // here is our toString() method:
    public String toString(){
        return "Name: "+ name+", id: "+id+", School: "+schoolName;
        // instance method can call instance variables, instance methods, static variables
    }

    //Here I will create a STATIC method that will only need a static variable to print school name:
    public static void printSchoolName() {
        System.out.println(schoolName + " School");
    // static method can only call or use static.
    }// this method can be called using the class name (class Student here ). I do not need to create an object to call this method.

}

// Here I will create another class for my objects: ( Class must not have public - only one class can have it)
class StudentObjects{
    // here is main method:
    public static void main(String[] args) {
        Student st1 = new Student();
            st1.name = "madina"; // each object has its own ins variable name = madina
            st1.id = 123;       // each object has its own ins variable id = 123
        // we don't have to initialize school name for each object because all objects share ONE copy of static variable schoolName = Cybertek

        Student st2 = new Student(); //each object has its own ins variable name = Emrah
            st2.name = "Emrah";     // each object has its own ins variable id = 456
            st2.id = 456;

        System.out.println(st1);
        System.out.println(st2);
        /*
        Name: madina, id: 123, School: Cybertek
        Name: Emrah, id: 456, School: Cybertek
         */
    }
}
