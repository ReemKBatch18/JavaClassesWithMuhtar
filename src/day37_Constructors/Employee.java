package day37_Constructors;

public class Employee {
    /*
Task01:
	1. Create a class called Employee
			instance variables:
					name, id, ssn, jobTitle, salary, gender
			actions:
					setEmployeeInfo(): can initialize all the instance variables
					toString(): can return the info of the employee as string
 */
   // Here we will create our instance variables for our class
        String name;
        long id;
        int ssn ;
        String jobTitle;
        double salary;
        char gender;

        // here we create our setInfo method. Can we create this method as static? No we cannot.
        // Because we are using instance variables in this method ==> we need to create instance method
        public void setEmployeeInfo(String name,long id, int ssn, String jobTitle, double salary, char gender){
            // parameters are the arguments we are declaring then we initialize them to the instance variables of each object
            // since we called our parameters that exact same name like our inst var ==> we have to use this. to refer to ins var
            this.name = name;
            this.id = id;
            this.ssn = ssn;
            this.jobTitle = jobTitle;
            this.salary = salary;
            this.gender = gender;
            // now every time I call this method from the object ==> I'll be able to initialize all variables of this object
            // every single object has its own copy of instance variables
        }

       // now we need to create our toString() method.
    // this method gets executed automatically when we pass our object in the print method
    // return type is String
    // In this method we specify how we want to print the object
        public String toString(){
            return "Name : " +name+ ", SSN: "+ssn+", ID: "+id+"Gender: " +gender
                    +", Job Title: "+ jobTitle+ ", Salary: $"+salary;
        }
}
