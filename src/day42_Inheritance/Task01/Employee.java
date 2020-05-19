package day42_Inheritance.Task01;
/*
create a sub class of person called Employee
				attributes: name, age, gender, Salary, employeeID, jobTitle
				methods: work, setEmployeeInfo, toString
 */
public class Employee extends Person{  // Relationship: Employee IS A Person
    /*
    name        (inherited)     also setPersonInfo(), eat(), sleep(), walk(), drink()    (inherited)
    age         (inherited)
    gender      (inherited)
    Salary
    employeeID
    jobTitle


    setEmployeeInfo()
    work()
    toString()
     */

    // public instance variables
    public double salary;
    public long employeeID;
    public String jobTitle;

    // methods
    // setEmployeeInfo() : to initialize all 6 variables inherited and declared here
    // we can use setPersonInfo() method from Person class
    public void setEmployeeInfo(String name,int age,char gender,double salary,long employeeID,String jobTitle){
        setPersonInfo(name, age, gender); // when this method executed it will assign name, age, gender
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // work()
    public void work(){
        System.out.println(name+" is working");
    }
    //toString()
    public String toString(){
         return "Employee name: "+name+"\nAge: "+age+"\nGender: "+gender
                +"\nJob Title: "+jobTitle+"\nSalary: "+salary+"\nEmployee ID: "+employeeID;
    }
}
