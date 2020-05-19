package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called company:
					create 3 objects of employee and set their info
					create an array of employees and store all those employee objects
					use regular for loop to print out each employee' name and employeeID
 */
public class Company {      // Company HAS A Employee

    // to call employee from this class name
    // to use it outside the block (vs local variables (after main method) can not be used outside block)
    // static variables are called global variables ==> can be used everywhere
    public static Employee emp1 = new Employee();
    public static Employee emp2 = new Employee();
    public static Employee emp3 = new Employee();

    //static block to initialize my static variables
    static{

        emp1.setEmployeeInfo("Messi", 32, 'M', 140_000, 13654,"SDET");

        emp2.setEmployeeInfo("Aigerim", 18, 'F', 130_000, 65654,"QA");

        emp3.setEmployeeInfo("Safar", 25, 'M', 128_000, 6599,"BA");

        // once class runs ==> static block gets executed ==> employee objects are set
    }



    public static void main(String[] args) {

        Employee[] employees = {emp1, emp2, emp3};

        // I will use for loop to print employees info
        for (int i = 0; i < employees.length; i++){
            //System.out.println(employees[i]); ==> this will print me all info about each employee
            // I only want to print name and id only:
            System.out.println("Name: "+employees[i].name + ", ID: "+employees[i].employeeID);
        }



        ArrayList<Employee> employeeList = new ArrayList<>();

        employeeList.addAll(Arrays.asList(emp1, emp2, emp3));








    }
}
