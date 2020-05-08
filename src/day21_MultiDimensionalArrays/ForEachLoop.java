package day21_MultiDimensionalArrays;

import com.sun.org.apache.xml.internal.utils.StringToIntTable;

public class ForEachLoop {
    public static void main(String[] args) {
        /* for (DataType variableName : ArrayName){
             }
        // dataType must match wih Array's data type
           in the for each loop the iterator always starts at first index 0 and ends at the last index of the Array
        */
        // advantage is we don't have to worry about initialization, condition or iterator
        //you only use when you don't need to provide the index numbers.. because you won't be able to
       //""for each loop"": is loop that's already been iterated.. number of executions is already decided
        // number of executions depends on data structure... on how many elements there are.. no iterator needed
        // we can not use it if we do not have a data structure first
        // we can not use it if we need to start loop from the last index
        int [] nums = {1,2,3,4};

        for (int eachElement : nums){
            System.out.println(eachElement);
        }

        String [] students = {"rr","bb", "na", "la"};// we have data structure--> we can use for each loop
        // so if I just want to print out the elements separately:
        for (String eachStudent : students){// this variable eachStudent represents each element of the string Array
            System.out.println(eachStudent);
           }

        System.out.println("================================================");

        //Task: print all data that is more than 5, if it is less we should skip it
        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
        for (int each : arr1) { // variable each will represent each of the elements in the array
            if (each < 5 ){
                continue;
            }
            System.out.println(each); //much simpler.. no need to worry about condition of the loop
        }
        System.out.println("=================================================");

        // Task : reverse sentence ==> we can not do it with for each loop
        String sentence = "I like Java"; // reverse to: Java like I

        // we need to call split method first not the charAt() method because we have words not chars
        // split method will return us a string array that's why we can assign it to a String array variable
        String [] words = sentence.split(" "); // [I, like , Java]

        // if i want to declare a for_each_loop --> my data type would be String
        for (String eachWord : words){ // 0 ~ 2
            System.out.println(eachWord);
        }
        // to print in reverse order , we use regular for loop that starts from last index
        for (int i = words.length-1; i >=0 ; i--){  // i: represents each element in our string array
            System.out.println(words[i]);
            }




    }
}
