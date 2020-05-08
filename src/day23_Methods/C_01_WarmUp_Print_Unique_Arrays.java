package day23_Methods;
/*
1.  Write a program that can print out the unique values from a String Array
            Ex: if arr -> {"A", "A", "B", "C", "C"}
                output: B
                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C
            MUST use for each loop
 */
public class C_01_WarmUp_Print_Unique_Arrays {
    public static void main(String[] args) {

        //Unique means only occured 1 time. If we count occurance of each value--> count =1 means unique

        String [] arr = {"A", "B", "A", "C"};

        // we need to compare each element with others to see how many times each element is repeated in the String.
        // we can use loop for repetitive action

        int count=0;

        for (String each : arr){
            // goal is to find out how many times "A" occured in this array
            if (each.equals("A")){
                count++;
            }// if this condition became true two times in this loop count will be 2
        }
        System.out.println(count);
        // if "A" count is 2 we don't print it. We need if statement
        if (count == 1 ) {       // count ==1 : character is unique
            System.out.println("A");
        }

        // we need to create a loop that will execute for as many times as the length of the array: outer loop


        for (String each2 : arr){       // each2 : each element in the array
            // we can place the above for each loop inside here to be repeated
            // This loop will run for each element in the String  ; 3 elements --> loop runs 3 times

            int count1 = 0;
            for (String each : arr){       // each : each element in the array
                //this loop finds out how many times an element is occuring in a string
                // This loop will compare each element (running from outer loop) with all other elements

                if (each.equals(each2)){
                    count1++;
                }
            }

            if (count1 == 1 ){       // if character is unique
                System.out.println(each2);
            }
        }
        System.out.println("=====================================================");

        // Now we will do it with regular for loop
        // we need to compare first element with itself then with next then with next
        // we need to count the occurances of each element in the array

        String [] arr2 = {"A", "A", "B", "C", "C"};
                //          0   1    2    3    4

        for (int j = 0; j < arr2.length; j++) {   // outer loop will repeat 5 times or as many times as length of array

            // these steps help me find how many times each specific element occurs in the array
            //we need to repeat these steps as many times as the length of array --> repeat 5 times
            int count2 = 0;
            for (int i = 0; i < arr2.length; i++) {         //      i : each element in the array
                // inner loop will repeat as many times as length of array to compare each element to others
                if (arr2[i].equals(arr2[j])) {
                    // i = 0 means "A" is compared with "A" ==> count2++;


                    count2++;
                }
            }
            if (count2 == 1) {
                System.out.println(arr2[j]);
            }

        }






    }
}
