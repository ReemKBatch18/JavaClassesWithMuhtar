package day41_Inheritance.Task01;
/*
create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender  (we will inherit them from Employee class)
			actions: reportingBug, testing , toString
 */
public class Tester extends Employee {  // " is a " relationship: Tester is a Employee
     /*
    name        (inherited)
    salary      (inherited)
    id          (inherited)
    jobTitle    (inherited)
    gender      (inherited)
    reporting()
    testing()
    toString()  (Inherited)
     */

    // we don't need to create the variables above: they are inherited from Employee class
    // Also toString() method is inherited
    // we will just create methods requested and related to this class

    public void reporting(){
        System.out.println(name+" is reporting");
    }

    public void testing(){
        System.out.println(name+ " is testing");
    }

    // Constructor
    public Tester(double salary, String name, long id, String jobTitle, char gender){
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
