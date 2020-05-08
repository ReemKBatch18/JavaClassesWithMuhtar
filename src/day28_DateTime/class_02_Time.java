package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class class_02_Time {

    public static void main(String[] args) {
        /*
        LocalTime : hours, minutes, seconds
        LocalTime now = LocalTime.now(); ==> returns current time
        LocalTime time1 = LocalTime.of(hour, minutes, second)
        */


        LocalTime time1 = LocalTime.now();
        System.out.println(time1);      //      ==> this will print current time

        LocalTime time2 = LocalTime.of(15,30,45);
        System.out.println(time2);      //      ==> 15:30:45
    }
}
