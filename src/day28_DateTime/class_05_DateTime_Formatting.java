package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class class_05_DateTime_Formatting {

    public static void main(String[] args) {

        LocalDateTime datetime1 = LocalDateTime.of(2015,12,25,11,30,45);

        System.out.println(datetime1);

        // I want to print it in this format: Fri 12/25/2015 11:30 am
        // is possible to print this pattern by using DayTimeForatter? yes it is

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE MM/dd/yyyy hh:mm:ss a");
        System.out.println(datetime1.format(dtf));      // Fri 12/25/2015 11:30:45 AM

        // I want to print it in this format:  12/25/2015 11:30 am, Fri
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a, EEE");
        System.out.println(datetime1.format(dtf1));      // 12/25/2015 11:30:45 AM, Fri

        // If I don't want the seconds and the year, I do the following
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE MM/dd hh:mm a");
        System.out.println(datetime1.format(dtf2));     //  Friday 12/25 11:30 AM









    }
}
