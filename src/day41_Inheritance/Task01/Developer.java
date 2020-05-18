package day41_Inheritance.Task01;
/*
create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding, toString
	     create a constructor that can initialize all the attributes of developer
 */
public class Developer extends Employee { // " is a " relationship: Developer is a Employee
     /*
    name       (inherited)
    salary      (inherited)
    id          (inherited)
    jobTitle    (inherited)
    gender      (inherited)
    fixingBug()
    coding()
    toString() (inherited)
      */

    // we don't need to reinitialize the variables above: they are inherited from Employee class
    // Also toString() method is inherited
    // we will just create methods requested and related to this class
    public void fixingBug(){
        System.out.println(name+ " is fixing bugs");
    }

    public void coding(){
        System.out.println(name+" is coding");
    }

    //Constructor
    public Developer(double salary, String name, long id, String jobTitle, char gender){
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
