package day35_Static;

public class Student {// for CybertekSchool

    String name;
    int id;
    double gpa;
    static String school = "Cybertek";


    // static method doesn't accept anything from object
    // we can not use static method here because this method we're using involves instance variables
    public void setInfo(String name, int id, double gpa){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    // since we are not using any instance variable to print the school name ==> we can create STATIC method called printSchoolName()
    // we can call this method later through the class name (preferably)
    // we are using our static variable school in this method:
    public static void printSchoolName(){
        System.out.println("School name is "+school);
    }

    // here we will create our toString() method
    public String toString(){
        return "Name: " +name+", School Name: "+school;
    }
}
