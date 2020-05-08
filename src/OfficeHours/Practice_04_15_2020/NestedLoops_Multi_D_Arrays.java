package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class NestedLoops_Multi_D_Arrays {
    public static void main(String[] args) {

        //                      0           1            2
        char [][] arr2D = {{'a','b'},{'c','d','e'},{'f','g','h'}};
          //                0    1


        // arr2D[0]
        for (int i = 0 ; i <arr2D[0].length ; i++){
            System.out.println(arr2D[0][i]);            // a b c
        }

        // arr2D [1]
        for (int i = 0 ; i <arr2D[1].length ; i++){
            System.out.println(arr2D[1][i]);            // d e
        }

        // can we apply a loop to print all elements in a 2 D array
        for (int j = 0 ; j < arr2D.length ; j ++){          //  j : index nums of 1 D array
            // since we want to repeat printing all elements... we place them in this loop
            for (int i = 0 ; i <arr2D[j].length ; i++){     //  i : index nums of elements
                System.out.println(arr2D[j][i]);
                // when j is 0 inner loop will repeat 2 times
                // when j is 1 inner loop will repeat 3 times
                // when j is 2 inner loop will repeat 3 times
            }
        }
        System.out.println("=======================================================");


        //  arr2D = {{'a','b'},{'c','d','e'},{'f','g','h'}};
        //               0           1            2

        // How many indexes do I have ? 3 indexes. Each index is a single char array so we can declare it

        for (char [] each1DArray : arr2D){
    //       System.out.println(Arrays.toString(each1DArray)); [a, b] //[c, d, e] //[f, g, h]
           // Now we need another for each loop to print out elements:
            for (char eachElement: each1DArray){
                System.out.println(eachElement); // all elements will be printed
            }
        }









    }
}
