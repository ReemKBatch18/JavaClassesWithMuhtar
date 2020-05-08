package Tasks.WarmUpPractices;
/*
1. write a return method that can return the minimum number from an int array
2. write a return method that can return the minimum number from a double array
					NOTE: apply method overloading,  DO NOT USE SORT METHOD.

 */
public class Methods_ReturnMinFromArray {

    public static void main(String[] args) {
        // here we will find min number regular wa
        int [] arr = {13,2,23,14,55};       // 2
        double [] arr2 = {15,5,6,7,11,3};   // 3
        int min = arr[0];
        for (int each :arr){

            if (each<min){
                min = each;
            }
        }
        System.out.println(min);
        System.out.println(minNum(arr));
        System.out.println(minNum(arr2));
    }

    public static int minNum(int[] arr){
        // first we assume that min is first index arr[0] then we compare with other numbers in the int array
        int min = arr[0];
        for (int each: arr){
            if (each < min){
                min = each;
            }
        }
        return min;
    }

    public static double minNum(double [] arr){
        double min = arr[0];
        for (double each: arr){
            if (each < min){
                min = each;
            }
        }
        return min;
    }
}
