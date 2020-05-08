package Tasks.WarmUpPractices;

public class CalculateSalaryAfterTax {


        /*
        Create a class called salary calculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
			ex:
				if:
					rate = 55;
					stateTax = 0.04;
					federalTax =0.22;
					weeklyHours = 40;

         */
        public static void main(String[] args) {
// Before declaring variables: DataType -> VariableName = Data;
        double hourlyRt=55;
        double stateTxRt=0.04;
        double federalTxRt=0.22;
        byte weeklyHrs =40;
        byte totalWeeks = 52;
// salary = hourlyRt * weeklyhrs* 52
        double salary = hourlyRt * weeklyHrs * totalWeeks;
// salary before tax

            //stateTax = salary* stateTaxRate
            double stateTax = salary* stateTxRt;

            //federalTax = salary*federalTxRt
            double federalTax = salary *federalTxRt;

            //totalTax = stateTax + federalTax
            double totalTax = stateTax + federalTax;

            //salaryAfterTx = salary - stateTax - federalTax
            // or salaryAfterTx = salary - (stateTax + federalTax)
            //double salaryAfterTax = salary - (stateTax + federalTax); or
            double salaryAfterTax = salary - totalTax;

            System.out.println("Your salary is: $" +salary);
            System.out.println("State tax is: $" +stateTax);
            System.out.println("Federal Tax is: $"  + federalTax);
            System.out.println("Total Tax is: $" + (stateTax+federalTax));
            System.out.println("The salary after tax is: $" +salaryAfterTax);


    }
}
