package day20_ArraysContinue;

public class Array_Size {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        //            0  1  2
        // System.out.println(arr1[100]);   // array's size is fixed

        int[] nums = new int[2]; // size is 2... {0,0} default values are placed
        //   0 1
        nums[0] = 10; //{10,0}
        nums[1] = 20; //{10,20}
        //nums[2] = 30; //error message because it's over the size
        System.out.println(nums[0]); // --> 10
        System.out.println(nums[1]);//-->20

        nums = new int[3]; // Here we reinitialize the size of this array --> reset {0,0,0}
        // when we reinitialize the size of array, values of array will be reset to default values 0,0,0
        // now nums refers to the new size 3.. and it is reset {0,0,0} which means:
        // nums[0] =  0 default and nums[1] = 0 default

        System.out.println(nums[0]); // --> 0
        System.out.println(nums[1]); // --> 0
        System.out.println(nums[2]); //--> 0
    }
}
