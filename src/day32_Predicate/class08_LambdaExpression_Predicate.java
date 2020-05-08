package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class class08_LambdaExpression_Predicate {
    public static void main(String[] args) {
        /*
        Predicate: can be applied to any collection Type, we have learn ArrayList so far (as a collectionType)
        Predicate<Integer> oddNumber = p -> p % 2 != 0
        // p represents the Integer
        // -> is mandatory
         */
        // we want to remove all odd numbers

        // first we create a Predicate called oddNumber
        // second we use list.removeIf(Predicate) method and use the one we created
        // list.removeIf() : removes every single object from list with the expression of the predicate
        // removeIf() method only accepts Predicate

        Predicate<Integer> oddNumber = x -> x % 2 != 0 ;    //  x : stands for our Integer

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        // removeIf() method only accepts Predicate
        list.removeIf(oddNumber);       // removed odd numbers from list

        System.out.println(list);       //  [2, 4, 6, 8, 10]

        System.out.println("===============================================");

        // create a method to remove all numbers less than 5
        // first we create our Predicate:
        Predicate<Integer> lessThan5 = y  -> y < 5 ;       // y: stand for our Integer
        // If I have to apply to some data structure such as collection
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        // If I want to remove all numbers in this list that are less than 5 ==> use removeIf()
        // removeIf() method only accepts Predicate
        list2.removeIf(lessThan5);      //  removed all numbers that are less than 5
        System.out.println(list2);      //  [5, 6, 7, 8, 9, 10]

        System.out.println("===============================================");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("reem", "rana","amy", "soha","ruru"));
        System.out.println(names);      //  [reem, rana, amy, soha, ruru]
        // remove all names that start with r
        // first we create a Predicate called startsWithr
        // then we use removeIf() method
        // Type of Predicate must be String
        Predicate<String> startsWithr = s -> s.startsWith("r");
        // OR
        //  Predicate<String> startsWithr = s -> !s.startsWith("r"); // if we want to remove what doesnt' start with r
        // Predicate<String> startsWithr = s -> s.toLowerCase().startsWith("r"); // to ignore case sensitivity
        names.removeIf(startsWithr);
        System.out.println(names);      //   [amy, soha]

        System.out.println("===============================================");

        ArrayList<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("reem", "rana","amy", "soha","muru"));
        System.out.println(names2);     //  [reem, rana, amy, soha, muru]
        // if name starts with r or a, remove name from list
        Predicate<String> startsWithrOra = each -> each.startsWith("r") || each.startsWith("a");
        names2.removeIf(startsWithrOra); // to remove all names that start with r or with a
        System.out.println(names2);     //  [soha, muru]

        System.out.println("================================================");
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a','b','3','4','5','@','&','z'));
        // we want to remove all the digits from this list
        // we can create a Predicate for digits
        // Hint: digits start from 48 - 57 on ascci table
        Predicate<Character> digits = c -> c >=48 && c<=57 ; // all elements that represent digits will be removed
        // now we can call this method
        chars.removeIf(digits);
        // or we can use isDigit() method like this (from the Character Wrapper Class
        // Predicate<Character> digits = c -> Character.isDigit(c)
        System.out.println(chars);      //  [a, b, @, &, z]

        System.out.println("===============================================");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        // I want to remove all numbers > 5
        // I can create Predicate
        // I can pass it itself without declaring
        nums.removeIf(p -> p > 5);    // p represents our Integer. Any nubmer > 5 are removed
        System.out.println(nums);       //   [1, 2, 3, 4, 5]








    }
}
