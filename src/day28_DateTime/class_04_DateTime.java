package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class class_04_DateTime {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);         //      current date and time

      //  LocalDateTime dt2 = LocalDateTime.of(LocalDate, LocalTime);

        // In order to get this date and time  2020-03-20  11:25:30  we do the following:

        // First we declare date:
        LocalDate date = LocalDate.of(2020,3,20);
        // Then we declare time:
        LocalTime time = LocalTime.of(11,25,30);

        // I want to combine both together:
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        // now when we print we will get the result above:
        System.out.println(dateTime);           //      2020-03-20T11:25:30

        LocalDateTime dateTime2 = LocalDateTime.of(2020,3,20,11,25,30);
        System.out.println(dateTime2);          //      2020-03-20T11:25:30

        // In order to format the above we can use DateTimeFormatter.
        // If we don't provide date it won't print date for example, if we provide all, it will format it that way

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd"); // if I don't provide year in format it won't print year
        LocalDate date2 = LocalDate.of(2020,4,19);
        System.out.println(date2.format(dtf)); // 04/19




    }
}
