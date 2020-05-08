package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class Single_D_Array {
    public static void main(String[] args) {

        int a = 100;
        int [] arr = {100,200,300};
            //          0  1  2
        System.out.println(arr[1]); // 200

        for (int i = 0 ; i <3 ; i++){ // i : index num of elements
           // System.out.println(i);      // 0 1 2
            int num = arr [i];
            System.out.println(num); // num: each element
        }
        System.out.println("==============================================================");
        // NOW, CAN WE DO THIS WITH A WHILE LOOP? YES WE CAN
        int j = 0 ;
        while (j < 3 ){
            int num = arr[j];
            System.out.println(num);
            j++;
        }
        System.out.println("================================================================");

        String [] names = {"reem", "anas" , "ashraf", "razan", "amjad"};
                //            0       1         2         3       4
        // how can I reverse this array elements inot another array?
        // first we declare an array then initialize the same length

        // int length = names.length; // 5
        //OR
        String [] namesRev = new String[names.length];  //  [null,null,null, null, null]
        //                                                      0  1    2     3      4

        //        i           j
       /* namesRev [0] = names [4];
        namesRev [1] = names [3];
        namesRev [2] = names [2];
        namesRev [3] = names [1];
        namesRev [4] = names [0]; */
    // to apply loop: we need 2 index variables. One for namesRev, and 2nd for names.


      /* this one is wrong :
      for (int i = 0 ; i < namesRev.length ; i ++){
            for (j = names.length-1 ; j >=0 ; ){
                namesRev [i] = names [j];
                j--;
            }
        }
        System.out.println(Arrays.toString(namesRev)); */

            int k = names.length-1;
            for (int i = 0 ; i < namesRev.length ; i ++){
                namesRev [i] = names [k];
                k--;
            }
        System.out.println(Arrays.toString(namesRev));

        System.out.println("====================================================");
        // now we can do it with While loop:
            int t = names.length-1;
            int g = 0;
            while (g < namesRev.length ){
                namesRev[g] = names [t];
                g++;
                t--;
            }
        System.out.println(Arrays.toString(namesRev));




    }
}
