package day27_DateTime;
import java.time.LocalDate;
public class class_03_Dates {
    public static void main(String[] args) {

    // to use date, we need to import LocalDate class ==> import java.time.LocalDate;

      LocalDate  date1 = LocalDate.of(2020,10,25);
        System.out.println(date1);
        LocalDate birthday = LocalDate.of(1976,10,31);
        System.out.println(birthday);

        /*
        METHODS
        isAfter(): returns boolean
        isBefore(): returns boolean
        isEqual(): returns boolean
        isLeap(): returns boolean
         */

        // Method : isAfter()
        date1.isAfter(birthday); // true or false? ==> it is true
        // since it returns me a boolean expression, I can assign it to boolean
        boolean result1 = date1.isAfter(birthday);
        System.out.println(result1); // true

        // Method : isBefore()
        birthday.isBefore(date1);
        // since it returns me a boolean expression, I can assign it to boolean
        boolean result2 = birthday.isBefore(date1); // true or false? ==> it is true
        System.out.println(result2); // true

        // Method: isEqual()
        birthday.isEqual(date1);
        // since it returns me a boolean expression, I can assign it to boolean
        boolean result3 = birthday.isEqual(date1); // true or false? ==> it is false
        System.out.println(result3); // false

        // Method: isLeap()
        birthday.isLeapYear();      // 1976 is a leap year ==> true
        // since it returns me a boolean expression, I can assign it to boolean
        boolean result4 = birthday.isLeapYear(); // true or false? ==> it is true
        System.out.println(result4);  // true

        System.out.println("========================================================");


        // LocalDate now : declares current date, today's date
        LocalDate now = LocalDate.now();    // 2020-04-23
        System.out.println("Today is: "+now);   // will print ==>  Today is: 2020-04-23

        LocalDate RahmanBDay = LocalDate.of(1990,04,25);
        // we can get month from above:
        int month = RahmanBDay.getMonthValue();
        int days = RahmanBDay.getDayOfMonth();
        int year = RahmanBDay.getYear();
        System.out.println(month);
        System.out.println(days);
        System.out.println(year);

        // we cannot assign the current date now to a string. First we have to convert it to a string like this:
      // using toString() method ==> converts date to a string
        String str = now.toString();
        System.out.println(str);        // 2020-04-23
        // ==> Now I can apply string manipulation to this str

        System.out.println(str.replace("-", " "));  // 2020 04 23

        // Pattern of date: month/day/year


    }

}
