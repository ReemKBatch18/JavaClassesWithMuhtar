package day39_AccessModifiers;
/*
2. create a class called Employee:
				instance variables:
						name, jobTitle, ID, salary
				add a constructor that can initialize name of employee
				add a constructor that can initialize name, jobTitle of the employee
							(apply constructor call to initialize the name)
				add a constructor that can initialize name, jobTitle, ID of the employee
							(apply constructor call to initialize the name and jobTitle)
				add a constructor that can initialize name, jobTitle, ID, salary of employee
							(apply constructor call to initialize the name, jobTitle, ID)
				add toString method
 */
public class Employee {
    String name;
    String jobTitle;
    long id;
    double salary;
    char gender;
    static String companyName = "Bank of America"; // static variable = ONE copy for all employees

    // 1st Constructor to initialize name of employee: needs 1 argument
    public Employee(String name){
        // here I will assign ins var 'name' to the parameter 'name' I'm passing here
        this.name = name;
    }

    // 2nd Constructor to initialize name, jobTitle of the employee : needs 2 arguments
    // we will call 1st constructor here at first step
    public Employee(String name, String jobTitle){
        this(name); // this.name = name;
        // here I will assign jobtitle to the jobtitle I'm passing
        this.jobTitle = jobTitle;
    }

    // 3rd Constructor to initialize name, jobTitle, id of the employee : needs 3 arguments
    // we will call constructor here at first step:
    public Employee(String name, String jobTitle, long id){
        this(name, jobTitle); // after this step, those arguments will be initialized to the ins var name, jobTitle
        // Here I will assign id to id I am passing
        this.id = id;
    }

    // 4th Constructor to initialize name, jabTitle, id, and salary of employee: needs 4 arguments:
    // we will call 3rd constructor here at first step:
    public Employee(String name, String jobTitle, long id, double salary){
        this(name, jobTitle, id); // after this step, those arguments will be initialized to the ins variables
        // here we will assign ins var 'salary' to argument 'salary' that I'm passing here
        this.salary = salary;
    }

    // 5th Constructor to initialize name, jabTitle, id, salary and gender of employee: needs 5 arguments:
    //    // we will call 3rd constructor here at first step:
        public Employee(String name, String jobTitle, long id, double salary, char gender) {
            this(name, jobTitle, id, salary); // after this step, those arguments will be initialized to the ins variables
          // here we will assign argument 'gender' to ins var 'gender' that I'm passing here
            this.gender = gender;
        } // this constructor will help us initialize all ins var of each employee





    // toString() Method:
    public String toString(){
        return "Name: "+name+", ID: "+id+", Job Title: "+jobTitle+", Company Name: "+companyName +", Salary: $"+salary+", Gender: "+gender;
    }

}
