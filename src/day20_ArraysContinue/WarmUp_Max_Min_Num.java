package day20_ArraysContinue;

import java.util.Scanner;

/*
1. write a program that can find the maximum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
2. write a program that can find the minimum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE
 */
public class WarmUp_Max_Min_Num {
    public static void main(String[] args) {

        int[] arr = {21,13,74,105,66,700,85,1009};
        int lastindex = arr.length -1;
        int max = arr[0];
 // for now I assume that first index is my max then I compare with each element to see which value is more, then I assign it to it
        int min = arr[0];
        System.out.println(lastindex); // 7



        for (int i=0 ;  i<=lastindex; i++){      // i represents index numbers of elements in array
            if (arr[i] > max){      // we use if statement to compare each element @ index i to the value of max
                                    // Then if it is greater we assign the greater value to max
     // array's index are compared with each other, whichever is greater will be assigned to max
                max = arr[i];
            }
            if (arr[i] < min){
    // array's index are compared with each other, whichever is smaller will be assigned to min
                min = arr[i];
            }
        }
        System.out.println(max);        //  1009
        System.out.println(min);        //  13



    }
}
