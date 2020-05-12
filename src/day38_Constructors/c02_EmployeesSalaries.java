package day38_Constructors;

public class c02_EmployeesSalaries {

    public static void main(String[] args) {

        // here we will create our object
        SalaryCalculator Zareen = new SalaryCalculator(50,40,0.0825,0.12);
        // to calculate Zareen's salary we call the method salary()
        System.out.println(Zareen.salary());
        // to print all Zareen's salary info ==> we pass the object Zareen in print statement and it will print according to toString() method :
        System.out.println(Zareen);
        /* Hourly Rate: $50.0
          Weekly Hours: 40
        Gross Salary: $96000.0
        State Tax: $7920.0
        Federal Tax: $11520.0
        Net Salary: $76560.0

        */


        System.out.println("********************************");
        // here we will create our 2nd object:
        SalaryCalculator Namik = new SalaryCalculator(62, 40, 0.0875, 0.26);
        // now we will pass our object Namik in print statement to get all details about his salary like this:
        System.out.println(Namik);
        /*
        Hourly Rate: $62.0
        Weekly Hours: 40
        Gross Salary: $119040.0
        State Tax: $10416.0
        Federal Tax: $30950.4
        Net Salary: $77673.6

         */


    }
}
