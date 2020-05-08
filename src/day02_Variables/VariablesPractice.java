package day02_Variables;

public class VariablesPractice {
    public static void main(String[] args) {

        /*salary, federal tax rate, state tax, loan, ssn

         */

        int salary = 120000;
        double federalTax = 0.18;
        float stateTax = 0.065f;
        //salary after tax = salary(1-sum of taxes)
        double sumTaxes = federalTax + stateTax;
        double salaryAfterTax = salary * (1-sumTaxes);

        System.out.println(salaryAfterTax);

        System.out.println("====================================================");
        //area of the circle = r*r*pi
        double r = 5.5;
        double area = r * r * 3.14;
        System.out.println(area);
        System.out.println("====================================================");

        int kg = 90;
        double pound = kg *2.25;
        System.out.println(pound);
        System.out.println("====================================================");

        double lira = 1000;
        double liraInDollar = lira/6.15;
        System.out.println(liraInDollar);

        double rupi = 1000000;
        double rupiInDollar = rupi * 0.014;
        System.out.println(rupiInDollar);
        System.out.println("======================================================");

        double liter =10000;
        double gallon = liter/3.7;
        System.out.println(gallon);




    }
}
