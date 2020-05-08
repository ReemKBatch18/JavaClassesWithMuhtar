package Tasks.Replits;
/*
Create a method that gets an array of strings and a string, the method returns an int.
It counts how many times a string appears in the array and returns the count.
for example (pseudo code):
some_array = ["a","foo","bar","foo","bla"]
some_string = "foo"
count_appearance(some_array ,some_string )
will return 2 because some_array  has 2 appearances of "foo" string.
 */
public class Rep_156_Methods_wReturn_CountAppearanceOfString {
    public static void main(String[] args) {
        String [] some_array = {"a","foo","bar","foo","bla"};
        String some_string = "foo";
        // Now we try our method here :
     int count =   count_appearance(some_array,some_string);
        System.out.println(count);

    }

   public static int  count_appearance(String[] arr, String t) {
        int count = 0 ; // count : will count how many times t appears in arr[]
       for (String each : arr) { // each represents each element in the string array arr[]
           if (each == t) {
               count++;
           }
       }
       return count;

   } //end  count_appearance
}
