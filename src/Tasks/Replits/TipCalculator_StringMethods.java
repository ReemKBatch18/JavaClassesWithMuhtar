package Tasks.Replits;
/*
Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:
https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8

Input:
Split:Yes
Number of people:4
Check amount:476.0
Service Quality:Excellent

Output:

Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
 */
import java.util.Scanner;

public class TipCalculator_StringMethods {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Split or No split:");
        String split = n.next();
        System.out.println("Enter number of people:");
        int num = n.nextInt();
        System.out.println("Enter check amount:");
        double checkAmount = n.nextDouble();
        System.out.println("Select service quality: ");
        String quality = n.next();
        String r = "";
        double tip =0;

        if (quality.equalsIgnoreCase("poor")){
            tip = 0.05;
        }else if (quality.equalsIgnoreCase("fair")){
            tip = 0.10;
        }else if (quality.equalsIgnoreCase("good")){
            tip = 0.15;
        }else if (quality.equalsIgnoreCase("great")){
            tip = 0.20;
        }else if (quality.equalsIgnoreCase("Excellent")){
            tip = 0.25;             }
        double totalTip = checkAmount* tip;
        double totalToPay = totalTip + checkAmount;


       if (num < 6 && num > 1 && split.equalsIgnoreCase("yes")){
            if (num == 2){
               r ="&&";
            }else if(num==3){
                r = "&&&";
           }else if (num == 4){
                r = "&&&&";
          }else if (num == 5){
                r = "&&&&&";}
       }else{
            System.out.println("");}

        System.out.println("Number of people entered: "+ r);
        System.out.println("Total to pay: " +totalToPay ); // double totalToPay = checkAmount + totalTip;
        System.out.println("Total tip: " + totalTip);  // double totalTip = checkAmount * 25/100;
        System.out.println("Total per person: " + (totalToPay/num)); // double perPerson = totalToPay / number of people;
        System.out.println("Tip per person: " + totalTip / num); //double tipPerPerson = totalTip / number of people
    }
}
