package day30_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
2. write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1
 */
public class class02_WarmUp_Reverse {

    public static void main(String[] args) {

        // first of all, is there any info I need to provide to the program? Yes we need ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        // we need to add 5 numbers into the list, to do that we can use loop
        // we want i to represent the elements not the index numbers
        for (int i = 1 ; i <6; i ++){
            list.add(i);
        }
        // now we print list to see if elements were added
        System.out.println(list);       //      [1, 2, 3, 4, 5]

        // now we need to reverse the list: we will use for loop starting from last index
        // we can not use for each loop in here
        // now i will represent index numbers. last index = list.size() -1
        for (int i = list.size()-1; i >= 0 ; i--){
            // first we need to retrieve the elements from the list and print them in the reverse order
            // we can use the list.get() method, it will return me integer ==> I can assign it to int
           int eachNum = list.get(i);   // unboxing
            // eachNum will be the elements starting from last index to first index
            System.out.print(eachNum+" "); // print with space 5 4 3 2 1
        }
        System.out.println();
        // what if the task was to store items in another list in reversed order?
        // first we create a list to store elements in it
        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int i = list.size()-1 ; i >= 0 ; i--){
            int eachNum = list.get(i);
            reversedList.add(eachNum);
        }
        System.out.println(reversedList);     //     [5, 4, 3, 2, 1]

    }
}
