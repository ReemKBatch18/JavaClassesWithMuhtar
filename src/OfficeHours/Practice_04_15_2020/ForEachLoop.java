package OfficeHours.Practice_04_15_2020;

public class ForEachLoop {
    /*
        for each loop: \\
                for (DataType   VariableName:  ArrayName){
                }
                DataType MUST match ArrayName type

    */

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};

        for (int num  :  arr){
            if (num == 3){
             //   continue; // we use continue to print all nums without 3
                break; // we use break if we want to print only what's before it ...like 1,2 in this case
            }
            System.out.println(num);
        }

        System.out.println("=========================================");

        int [] arr2 = {1,2,3,4,5,6,7,8,9,10};
        // print only even numbers:
        for (int num : arr2){
            if (num % 2 == 0)       // or we can use continue to skip odd numbers
                System.out.println(num);
        }





    }
}
