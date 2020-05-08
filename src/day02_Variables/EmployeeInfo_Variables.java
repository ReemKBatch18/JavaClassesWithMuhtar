package day02_Variables;

public class EmployeeInfo_Variables {
    /*
    Create a class called EmployeeInfo_Variables:
            print:
                your company's name
                your name
                your EmployeeId
                your JobTitle
                your Salary

     */

    public static void main(String[] args) {
        String employeeName = "Andrea";
        String companyName = "Oracle";
        int employeeId = 9;
        String jobTitle = "QA";
        double salary = 100000.5;
        long ssn = 123456789;
/*
        System.out.println("Employee Name: " +employeeName);
        System.out.println("Company Name: " +companyName);
        System.out.println("Employee ID:" +employeeId);
        System.out.println("Job Title: " +jobTitle);
        System.out.println("Salary: " +salary);
        System.out.println("Social Security Number: " +ssn);
*/

        System.out.println("Employee Name: " +employeeName + "\nCompany Name: " +companyName +
                "\nEmployee ID: " +employeeId + "\nJob Title: "+jobTitle);
// getting the same result by writing one line and adding \n for new lines.


    }


}
