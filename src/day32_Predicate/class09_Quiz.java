package day32_Predicate;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;

public class class09_Quiz {
    /*
    1. write program that removes all special characters from a list of Characters
    2. write program that removes all numbers that are divisible by 3 or 5 in arrayList
     */

    public static void main(String[] args) {

        // Question 5 on day32 ArrayList Short Quiz

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Robb", "Bran", "Rick","Bran"));

        if(names.remove("Bran")){ // removes first "Bran"
            names.remove("John"); // doesn't execute becuase there is no John to remove
        }
        System.out.println(names);      //  [Robb, Rick, Bran]

        // Question 9
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5)); // [1,2,3,4,5]
        numbers.set(0, numbers.get(4));     //  [5,2,3,4,5]
        numbers.set(4, numbers.get(0));     //  [5,2,3,4,5]
        System.out.println(numbers);        //  [5,2,3,4,5]

        // Question 11
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        // [1,2,3,4,5,6,7]
        for (Integer each : nums){
            if (each % 2 != 0){
                continue;
            // first execution of the loop is 1.
            // nothing will get printed because we have continue; which skips if number %2 != 0
            }
            System.out.print(each + " ");
            // second execution of the loop is number 2,
            break;
            // once 2 gets printed we have break; statement which exits the loop and nothing gets executed nor printed
        }










    }


}
