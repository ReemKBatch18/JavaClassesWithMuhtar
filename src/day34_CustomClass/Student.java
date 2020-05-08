package day34_CustomClass;

public class Student {
    // six attributes:
    String name;
    String nationality;
    int age;
    double gpa;
    char gender;
    boolean married;

    // every time I create a Student object I should be able to assign those info to my object

    //let's create a method called setStudentInfo()
    public void setStudentInfo(String name, String nationality, int age, double gpa, char gender, boolean married){
        //to make sure I assign my instance variable to the parameters I need to use "this" keyword
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.gpa = gpa;
        this.gender = gender;
        this.married = married;
    }

    // here we will create the toString() method to be called automatically when we pass our object into the print statement
    public String toString(){
        return "Name: "+name+", gender: " +gender+", nationality: "+nationality
                +", age: "+age+", married: " +married;
    }
}
