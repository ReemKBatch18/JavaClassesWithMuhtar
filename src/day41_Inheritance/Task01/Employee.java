package day41_Inheritance.Task01;

public class Employee {
    /*
    creata  class called Employee:
			variables: salary, name, id, jobTitle, gender
			Actions: toString

     */
    public String name;
    public long id;
    public String jobTitle;
    public double salary;
    public char gender;

    public String toString(){
        return "Name: "+name+
                "\nID: "+id+
                "\nJob Title: "+jobTitle+
                "\nSalary: $"+salary+
                "\n Gender: "+gender;
    }
}
