package day34_CustomClass;

import RESOURCES.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class class05_TestersObjects_BankOfAmerica {
    public static void main(String[] args) {
        Tester tester1 = new Tester();
        // from this object, I can call setTesterInfo() method and pass info of tester
        tester1.setTesterInfo("Madina", 1112233445,"QA", 200000.00);
        // first we need to create our toString method to specify how we wnat to print out our custom class object

        Tester tester2 = new Tester();
        tester2.setTesterInfo("Venera",234567834,"Senior SDET",150000 );

        Tester tester3 = new Tester();
        tester3.setTesterInfo("Sha Rejepov",6235487,"SDET",120000);

        Tester tester4 = new Tester();
        tester4.setTesterInfo("Muhtar", 111, "Manual Tester", 120000);

        Tester tester5 = new Tester();
        tester5.setTesterInfo("John", 22222, "Uber Driver", 60000);

        // now let's create an arraylist of our team of testers
        ArrayList<Tester> testers = new ArrayList<>();
        // how can I add all these testers to this list? addAll() method,
        // use Arrays.asList()
        testers.addAll(Arrays.asList(tester1,tester2, tester3, tester4, tester5));

        // I want to write  a program that can remove all testers who are not SDET
        // I can use lambda expression and return jobTitle giving condition: if it doesn't contain SDET
        // we add ! to return us the opposite

        testers.removeIf( p -> ! p.jobTitle.contains("SDET"));
        double totalBudget= 0;
        for (Tester each: testers){ // each represents each SDET tester in the list
            System.out.println(each);
            // how can I check how much i'm paying to my SDET testers ?
            totalBudget += each.salary;
        }
        System.out.println(totalBudget);




    }
}
