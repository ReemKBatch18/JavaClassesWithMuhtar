package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;

/*
// task
        // create a map, and store your class mates names with birthdays
 */
public class c02_Maps_Practice1 {

    public static void main(String[] args) {

        LinkedHashMap<String, LocalDate> classMates = new LinkedHashMap<>();
        // which method to use to add values to this Map? put() method
        classMates.put("Taha", LocalDate.of(1998, 07, 16));
        classMates.put("Saban", LocalDate.of(1900, 01, 30));
        classMates.put("Anil", LocalDate.of(1453,01,01));
        classMates.put("Anna", LocalDate.of(1990,2,28));
        classMates.put("Namik", LocalDate.of(1453,01,01)); // the value is duplicated but accepted
        classMates.put("Yucel", LocalDate.of(2005, 12, 28));

        System.out.println(classMates);
        //{Taha=1998-07-16, Saban=1900-01-30, Anil=1453-01-01, Anna=1990-02-28, Namik=1453-01-01, Yucel=2005-12-28}
        // the value is duplicated but accepted
        // but if duplicate the key ==> it will take the latter one added
        classMates.put("Namik", LocalDate.of(1990,04,05));
        classMates.put("Anil", LocalDate.now());

        System.out.println(classMates);
        //{Taha=1998-07-16, Saban=1900-01-30, Anil=2020-06-29, Anna=1990-02-28, Namik=1990-04-05, Yucel=2005-12-28}

        // size is same because we only added duplicate keys ==> will replace existing ones

        // to remove:
        classMates.remove("Anil");
        System.out.println(classMates); // now I will have 5 total
        // {Taha=1998-07-16, Saban=1900-01-30, Anna=1990-02-28, Namik=1990-04-05, Yucel=2005-12-28}

        // how can I get the Birthday date of a Key? by getting the key
        System.out.println(classMates.get("Namik")); // The last value entered will be printed: 1990-04-05

        // To check if someone is contained in the list or not ==> Use the containsKey(key) method ==> returns boolean
        // If it returns boolean, I can assign it to boolean
        boolean r1 = classMates.containsKey("Muhtar");
        System.out.println(r1);     // false

        // I want to check if someone is born on this date: 1990-04-05
        // I can use containsValue method
        boolean r2 = classMates.containsValue(LocalDate.of(1990, 04, 05));
        System.out.println(r2);







    }
}
