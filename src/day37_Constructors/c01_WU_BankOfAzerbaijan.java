package day37_Constructors;

import java.util.ArrayList;

/*
3. create class called BankOfAzerbaijan
		in the main method:
				1. create a List of Employees
				2. add random two employees from HumanResources to the List
				3. use for each loop to print out the employee info
				4. now go back to HumanResources class and comment out the static block
				5. repeat the step 3 to print out the employee info to compare it with previous output
 */
public class c01_WU_BankOfAzerbaijan {
    public static void main(String[] args) {


        ArrayList<Employee> list = new ArrayList<>();
        // now we are going to add our employees from HumanResources class

        list.add( HumanResources.employee3 );  // 0
        list.add(HumanResources.employee5);  // 1

        System.out.println( list.get(0) ); //Name : Marina, SSN: 111234567, ID: 1124Gender: F, Job Title: Product Manager, Salary: $170000.0
        System.out.println( list.get(1));// Name : Jazi, SSN: 111112345, ID: 1126Gender: F, Job Title: Business Analyst, Salary: $70000.0


    }
}
