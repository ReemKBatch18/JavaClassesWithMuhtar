package day41_Inheritance.Task01;
/*
 create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequirements, gathering, toString
     		create a constructor that can initialize all the attributes of businessAnalyst
 */
public class BusinessAnalyst extends Employee { // " is a " relationship: BusinessAnalyst is a Employee
    /*
     name       (inherited)
    salary      (inherited)
    id          (inherited)
    jobTitle    (inherited)
    gender      (inherited)
    gathering   ()
    writingReq()
    toString()  (inherited)
     */

    // we don't need to reinitialize the variables above: they are inherited from Employee class
    // Also toString() method is inherited
    // we will just create methods requested and related to this class

    public void gathering(){
        System.out.println(name+" is gathering requirements");
    }
    public void writingReq(){
        System.out.println(name+" is writing requirements");
    }

    // Constructor
    public BusinessAnalyst(double salary, String name, long id, char gender){
        this.gender = gender;
        jobTitle = "Business Analyst"; // we can do this because we only have one title for business analysts which is Business Analyst
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
