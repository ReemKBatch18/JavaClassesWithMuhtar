package OfficeHours.Practice_05_06_2020;
/*
create a class called Testers
			Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setTesterInfo(), smokeTesting(),  creatingTicket();
 */
public class Tester {

    //Attributes = instance variables that are declared in the class outside the method
    String name;
    String jobTitle;
    double salary;
    long employeeID;

    // Now we create our actions==> first action is our setInfo() method
    // in this setInfo() method we are passing parameters = local variables because they are declared within the method
    public void setInfo(String name, String jobTitle, double salary, long employeeID){
        // now I need to assign the local variables that I'm passing here in the parameters to my instance variables = the attributes
        // because the local variable has the same name like the instance variable ==> we need to use "this." keyword to call the instance variable
        this.name = name;
        this.jobTitle = jobTitle;
        this. salary = salary;
        this.employeeID = employeeID;
        // this is the method that can allow me to set the info of the object when we create it.
        // I can call this method after creating my object then set the info of each object by passing parameters
        // the only time we use "this." to call instance variable is when there is a local variable sharing the same name
    }

    public String toString(){
        // whatever I pass here to be returned ==> it will print once I pass my object tester1 in the print method
        // If I return this sentence here: return "Hello how are you"; ==> this sentence will get printed once I pass my object in the print statement
        // that's why I need to return here what I would like to see when I pass my object in the print statement like this:
        return "Name: " +name+", job title: "+jobTitle
                +", salary: $"+salary+", ID: "+employeeID;
    }

    // now we will create our second action = method smokeTesting()
    // whenever I call this mehtod from my object ==> it should say "testerName is doing smoke Testing" like this:
    public void smokeTesting(){
        System.out.println(this.name+" is doing smoke testing");
        // now we will call it from testers
    }

    // now we will create the action of creating tickets = creatingTicket() method
    // when we call this method from an object (which is tester1 or tester2) it should run like this:
    // ==> testerName is creating ticket on Jira
    public void creatingTicket(){
        System.out.println(this.name+ " is creating ticket on Jira");
    }


}
