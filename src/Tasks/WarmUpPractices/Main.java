package Tasks.WarmUpPractices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        String subject1 = scan.next();
        double grade1 = scan.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        String subject2 = scan.next();
        double grade2 = scan.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        String subject3 = scan.next();
        double grade3 = scan.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        String subject4 = scan.next();
        double grade4 = scan.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        String subject5 = scan.next();
        double grade5 = scan.nextDouble();

        String summary = "Summary: "+subject1+ " - "+grade1+ ", "+subject2+ " - "+grade2+ ", "+subject3+
                " - "+grade3+ ", "+subject4+ " - "+grade4+ ", "+subject5+ " - "+grade5;

        double average = (grade1+grade2+grade3+grade4+grade5)/5;

        System.out.println(summary);
        System.out.println("Your average score is: "+average);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");



    }
}
