package day34_CustomClass;
/*
create a class called Testers
			Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setTesterInfo(), smokeTesting(),  creatingTicket();
create a class called Bank Of America:
			bank of America is planning to create thier thier automation team, there fore they are hiring three testers
			create a list called AutomationTeam and store three Testers in it
			write a program that can remove the tester if he/she is manual tester
			write a program that can calculate the total budget of the Automation team
 */
public class Tester {
    String name;
    long employeeID;
    String jobTitle;
    double salary;

    public void setTesterInfo(String name, long employeeID, String jobTitle, double salary){
        // if we don't use this keyword, by default, system will call local variable not instance variable
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }// now we will create a class called bank of America

    public String toString(){
        return "Name: "+ name+", Job Title: "+jobTitle+", employee id: "+employeeID+", salary: "+salary;
    }

}
