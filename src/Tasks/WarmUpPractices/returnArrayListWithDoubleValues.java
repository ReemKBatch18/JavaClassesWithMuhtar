package Tasks.WarmUpPractices;

import java.util.ArrayList;
import java.util.Arrays;

/*
take an arrayList and return it with values doubled:
[2,3,5] ==> [4,6,10]
Try solving without creating new ArrayList using set() and get()
 */
public class returnArrayListWithDoubleValues {
    public static ArrayList<Integer> doubleTheList(ArrayList<Integer> nums){
        for (int i = 0 ; i < nums.size() ; i++){
            nums.set(i, nums.get(i) *2);
            // we use set() method to replace the values in the arrayList
            // set() method uses (int index # ) with (Integer element ) of the arrayList
            // get() method uses index number and returns us the element of arrayList at that index
            }
        return nums; // we return the same list since we have changed the values inside multiplying by 2
    }


    // Now let's try it using our main method:
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(2,3,5));
        System.out.println(myList);     // [2,3,5]
        // now we will call the method we created: doubleTheList() and print like this:
        System.out.println(doubleTheList(myList));      // [4,6,10]


    }
}
