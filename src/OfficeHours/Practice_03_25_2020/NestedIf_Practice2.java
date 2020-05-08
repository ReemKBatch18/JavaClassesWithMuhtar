package OfficeHours.Practice_03_25_2020;

public class NestedIf_Practice2 {

    public static void main(String[] args) {

          /*
        for the loan:
            if he/she has a job that pays > 50000$  ==> might be eligible
                    if he/she has good credit
                           if job history is more than or equal to 2 ==> then eligible
         */

        int salary = 450000;
        int creditscore = 750;
        byte jobHistory = 1;

        if(salary > 50000){  // might be eligible

            if(creditscore > 650){ // might be eligible

                if(jobHistory>=2){ // eligible for loan
                    System.out.println("You are qualified");

                }else{ // not eligible due to job history
                    System.out.println("You do not have enough job history, come back later");
                }


            }else{ // not eligible due to credit score
                System.out.println("You do not have good credit score");
            }


        }else{
            System.out.println("You need have a job that pays $50000");
        }









    }


}
