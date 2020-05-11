package day37_Constructors;

public class c11_Student {
    //name, age, gender(M/F), and university
// 4 instance variables
    String name;
    int age;
    char gender;
    String university;
// now I have the default constructor

    // this is an instance method
    public void setInfo(String name, int age, char gender, String university){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university = university;

    }
    public String toString(){
        return "Name: "+name+" Age: "+age+" Gender: "+gender+" University: "+university;
    }

    // here I am going to create a constructor where I can pass the 4 parameters every time I create an object like this:
    public c11_Student(String name, int age, char gender, String university){
        // whatever parameters are passed here from user ==> will get assigned to object
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university = university;
        // execution of constructor depends on creating the object ==> which means:
        // as soon as I create an object ==> I will be able to execute the constructor and assign values immediately
    }



}
