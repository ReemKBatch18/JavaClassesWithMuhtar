package day24_Methods;



import java.util.Arrays;

public class C_08_ReturnMethod_Practice_Max_Min {
/*
Create a function that returns max num from any array
 */
    public static int maxNum (int[] arr){
        // first we sort array - ascending order
        // then we return last index
        Arrays.sort(arr);

        return arr[arr.length-1]; // This can be assigned to another variable to make  it useful
    }

    public static int minNum (int[] arr){
        // first we sort array in ascending order
        // then we return first index
        Arrays.sort(arr);

        return arr[0];  // This can be assigned to another variable to be re-used
    }


    /// THIS IS OUR MAIN METHOD TO CALL OTHER METHODS:
    public static void main(String[] args) {
        int [] arr = {8,56,87,42,21,0};

        // to find max number from this arr , we can call maxNum method and pass the array name
        // we can assign the max number immediately to a variable called max of an int type
        int max = maxNum(arr);
        System.out.println(max); // 87

        int min = minNum(arr);
        System.out.println(min); // 0
    }
}
