package day26_MethodOverloading;

public class class02_WarmUp_Unique_Characters {
    public static void main(String[] args) {

        String str = "ababbdc"; // dc are the unique characters
        String result = ""; // c : is the unique character in str. It only occurred once
        // How can I find out if character at index 0 from str is unique or not? we use frequency method

        // we need a loop with if statement to check if each character is unique or not
        for (int i = 0 ; i < str.length(); i++) {
            int num = frequency(str, str.charAt(i));

            if (num == 1) {
                result += str.charAt(i); // only characters that occurred once in the string will get concated to result
            }
        }
        System.out.println(result);     //  dc


        // We can create a method with the above steps to check which characters are unique in any given string

        // now we will try the method uniques we created here:
        String str2 = "Cybertek";
        //we will call the method uniques :
        String result2 = uniques(str2); // this will get us only characters that are unique in str2
        System.out.println(result2);        // Cybrtk

    }
 //=====================================================================================================================

    // HERE IS THE METHOD WE ARE CREATING TO FIND OUT THE UNIQUE CHARACTERS FROM ANY GIVEN STRING
    public static String uniques (String str){
        String result = "";
        for (int i = 0 ; i < str.length(); i++) {
            int num = frequency(str, str.charAt(i));

            if (num == 1) {
                result += str.charAt(i); // only characters that occurred once in the string will get concated to result
            }
        }
        return result;
    }


//======================================================================================================================
    // WE copied this method from class01 and pasted here
    public static int frequency(String str, char ch) { //This method counts char's frequency
        char[] arr = str.toCharArray();

        int count = 0;
        for (char each : arr) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }
}
