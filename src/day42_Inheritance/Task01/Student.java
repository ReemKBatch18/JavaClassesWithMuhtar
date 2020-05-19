package day42_Inheritance.Task01;
/*
create a subclass of Person called Student
				attributes: name, age, gender, studentID, clazz
				methods: attendClass, code, setStudentInfo, toString
 */
public class Student extends Person {   // Relationship: Student IS A Person
    /*
     name        (inherited)     also setPersonInfo(), eat(), sleep(), walk(), drink()   are inherited
    age         (inherited)
    gender      (inherited)
    studentID
    clazz
    schoolName = Cybertek  (static ==> one copy for all students)

    attendClass()
    code()
    setStudentInfo()
    toString()
     */

    // public instance variables
    public long studentID;
    public String clazz; // we mean class but can not use this word class it will mean regular class in Java (class is Java reserved word)
    public static String schoolName = "Cybertek"; // we only need one copy of this variable for all the objects = static

    // methods
    // setStudentInfo() : public void not returning anything but passing  5 arguments = we can use setPersonInfo() here
    public void setStudentInfo(String name, int age, char gender, long studentID, String clazz){
        setPersonInfo(name, age,gender);// this method will initialize those variables to the instance variables
        this.studentID = studentID;
        this.clazz = clazz;
    }

    // attendClass()
    public void attendClass(){
        // here I will use clazz variable too
        System.out.println(name+" is attending "+clazz);
    }

    // code()
    public void code(){
        System.out.println(name+" is coding");
    }

    public String toString(){
         return "Name: "+name+", ID: "+studentID+",  Age: "+age+
                 ", Gender: "+gender+", Class: "+clazz+ ", School: ";
    }

}
