package OfficeHours.Practice_03_25_2020;

public class IfElse_Practice {

    public static void main(String[] args) {

    int num = 100;

    // if else statements are used when we have two conditions
        // one condition is true and the other false
        // only only condition will be executed
        // one must be executed... never both ... and never neither nor
        //here will try odd and even numbers

       /* if (num%2==0) { //even condition
            System.out.println(num + " is even number");
        }
        if (num%2!=0) { //odd condition
            System.out.println(num + " is odd number");
        } */

       if (num%2==0){ //even condition
           System.out.println(num+ " is even number");
       }else { //odd condition
           System.out.println(num+ " is odd number");
       }


       int age = 21;

       if (age>=21){
           System.out.println("You are eligible to buy alcohol");
       }else {
           System.out.println("You are not eligible");
       }

       boolean genderMale = true;
       if (genderMale){
           System.out.println("Gender is male");
       }else {
           System.out.println("Gender is female"); // will get executed if genderMale = false
       }


       // in order to vote you need to be US citizen an u need to be more than 18 yo
        boolean usCitizen = true;
       int ageOfPerson = 30;

       if (usCitizen && ageOfPerson >=18){
           System.out.println("Eligible to vote");
       }else {
           System.out.println("Not eligible to vote");
       }
















    }

}
