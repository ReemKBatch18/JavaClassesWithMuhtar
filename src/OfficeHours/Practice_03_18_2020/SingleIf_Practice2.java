package OfficeHours.Practice_03_18_2020;

public class SingleIf_Practice2 {

    public static void main(String[] args) {

        byte age = 21;
        boolean eligibleToBuy = age > 21 || age == 21;
        if (eligibleToBuy) {
            System.out.println("You are eligible to buy alcohol");
        }

        if (!eligibleToBuy) {
            System.out.println("Go drink your milk");
        }

        boolean feeling = false;
        if (feeling == false) {
            System.out.println("don't be sad");
        }
        if (feeling == true) {
            System.out.println("stay happy");
        }
    }
}