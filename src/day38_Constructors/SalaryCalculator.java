package day38_Constructors;

/*
Create class called SalaryCalculator
            instance variables:
                hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
            add a constructor can initialize those fields
            instance methods:
                salary(): returns the total salary as double
                salaryAftertax(): retuns the salary after tax as double
                stateTax(): retuns the total state tax as double
                federalTax(): retuns the total federal tax as double
                toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
 */
public class SalaryCalculator {

    // These are our instance variables
    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    // This is our Constructor that can initialize our instance variables like this:
    // The name of our Constructor method MUST match our class name
    // we provide the AccessModifier(here public) then name then we pass parameters if we need to (here we need 4 arguments)
    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate){
        // then we assign our instance variable to the values we are passing in argument
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        // This constructor method will run every time I create an object
    }

    // 1st instance method: to calculate total salary (gross income)
    public double salary(){
        return weeklyHours*hourlyRate*48 ;
    }

    // 2nd instance method: to calculate state tax
    public double stateTax(){
        return salary()*stateTaxRate;
        // total salary multiplied by state tax rate
    }

    // 3rd instance method: to calculate federal tax
    public double federalTax(){
        return salary()*federalTaxRate;
        // total salary multiplied by federal tax rate
    }

    // 4th instance method: to calculate salary after tax
    public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
        // to get net salary (after tax) we subtract taxes (both) from our total salary
    }

    // toString() method to specify how we want salary info printed:
    public String toString(){
        //  DecimalFormat DF = new DecimalFormat("0.00"); /// we can add this format to apply to salary
        return "Hourly Rate: $"+hourlyRate+
                "\nWeekly Hours: "+weeklyHours+
                "\nGross Salary: $"+salary()+
                "\nState Tax: $"+stateTax()+
                "\nFederal Tax: $"+ federalTax()+
                "\nNet Salary: $"+salaryAfterTax();
    }
}

