package day26_MethodOverloading;
/*
1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
 */
public class class01_WarmUp_Frequency_Of_Char {

    public static void main(String[] args) {
        String str = "aaa";
        char ch = 'a';
        // better to use toCharArray. method to return char Array from the above string.
        // Then we can assign char array to a variable char []
        char [] arr = str.toCharArray(); // [a,a,a]
        // is there easy way to compare ch a with each index of ch [] arr ? Yes by creating a loop
        // we can use for each loop.
        int count = 0; // to count how many times a has occurred in arr[]
        for (char each : arr){
            // we have to use == because we are comparing chars to each other
            if (each == ch){        // each: represents each element of the char array arr[]
                count++;
        // every time the loop executed it will check whether the char each matches char ch = 'a'
            }
        }
        System.out.println(count); // prints how many times == 3
        // if we have any given String and any given char to compare we can use the above steps==> we place in a method
        //==========================================================================================================


        // Here we will use the method we created below
        String str2 = "sasdlsskasdfdfdss";
        char ch2 = 's';
        int num = frequency(str2, ch2);
        System.out.println(num); // prints how many times ch2 occurred in str2 == 7
    }



    //HERE WE WILL CREATE A METHOD CALLED FREQUENCY TO RETURN US THE COUNT OF A CHAR IN A STRING

    public static int frequency (String str, char ch){ //This method counts char's frequency
        char[] arr = str.toCharArray();

        int count = 0;
        for (char each : arr){
            if (each == ch){
                count++;
            }
        }
        return count;
        // Now we created a method where we can use parameters : (string str, char ch) and it returns us an int (count)
    }
}
