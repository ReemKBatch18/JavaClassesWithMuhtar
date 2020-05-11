package day37_Constructors;

import Tasks.WarmUpPractices.CC_Employee;

public class HumanResources {
    /*
    2. create a class called HumanResources
            declare 5 variables of Employee as static
    use static block to:
            1. initialize those static variables
			2. set all the info of the Employees
 */
//we initialized these objects as static... which means we can only use them inside the class
        // the advantage of having static ==> to call them through the class name.
        // our class name here is HumanResources
        static Employee employee1 = new Employee();
        static Employee employee2 = new Employee();
        static Employee employee3 = new Employee();
        static Employee employee4 = new Employee();
        static Employee employee5 = new Employee();
// advantage of static block==> it gets executed as soon as class is called
        // this means when we call them into the bank class we will be able to see the values we initiated here
        // it doesn't matter where we declare the static block
        public static void main(String[] args) {
        }

        static {
         employee1.setEmployeeInfo("Zuleyha",1254,45874641,"QA",110000,'F');
         employee2.setEmployeeInfo("Kyle", 1123, 112345678, "SDET", 110000, 'M');
         employee3.setEmployeeInfo("Marina", 1124, 111234567, "Product Manager", 170000, 'F');
         employee4.setEmployeeInfo("Adeline", 1125, 111123456, "Scrum Master", 80000, 'F');
         employee5.setEmployeeInfo("Jazi", 1126, 111112345, "Business Analyst", 70000, 'F');
        }


        }

