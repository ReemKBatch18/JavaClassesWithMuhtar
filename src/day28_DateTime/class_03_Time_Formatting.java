package day28_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class class_03_Time_Formatting {

    public static void main(String[] args) {

         /*
        Time formatting:
        hours: hh
        minutes : mm
        second : ss
        am/pm : a
         */

        LocalTime time1 = LocalTime.of(16,30,15);
        System.out.println(time1);              //      16:30

        // Now in order to format time differently we import the formatter class import java.time.format.DateTimeFormatter

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a"); // we add a to add am or pm

        System.out.println(time1.format(dtf)); //       04:30:15 PM

        LocalTime time2 = LocalTime.of(10,0,30);
        System.out.println(time2);              // 10:00:30

        System.out.println(time2.format(dtf));  // 10:00:30 AM

        // if no minutes or seconds entered ==> 00

        // we can use the methods we learned with date: isAfter(), isBefore(), isEqual()

        boolean result1 = time1.isAfter(time2);         //true
        System.out.println(result1);
    }
}
