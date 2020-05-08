package day28_DateTime;

import java.time.LocalDate;

public class class_01_WarmUp_NamesBirthdaysArrays {
    /*
1. create an array of string, store five of your friends names in it
2. create Array of localdates and store thier birthdays in the same order
3. use for loop to print out your friends' names and thier birthdays
 */
    public static void main(String[] args) {
        String [] friends = {"John", "Aaron", "Daniel"};
        LocalDate JohnBday = LocalDate.of(2020,3,5);
        LocalDate AaronBday = LocalDate.of(2000,10,12);
        LocalDate DanielBday = LocalDate.of(2010,5,6);

        LocalDate[] birthdays = {JohnBday,AaronBday,DanielBday};
        // how can I print our friends array with birthday array? I can use for loop using i to represent index number
        for (int i = 0 ; i <friends.length ; i ++){
            // to get the name of each person: String name = friends[i]
            // to get the birthday of each person: LocalDate Bday = birthdays[i]
            String name = friends[i];
            LocalDate bday = birthdays[i];
            System.out.println(name + "'s birthday is "+bday);
        }

    }
}
