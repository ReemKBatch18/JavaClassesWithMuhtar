package day24_Methods;
/*
3. write a method that can identify if a string is palindrome
			ex: palindrom("level")  ==> true
				palindrome("Cybertek") ==> false
 */
public class C_03_WarmUps_MethodsPractice_Palindrome {
    public static void palindrome (String str){
        String reversed = ""; // this is where reversed word will be kept
        // we create a loop to reverse the word using a loop that starts from last index with decrement
        for (int i = str.length()-1 ; i >= 0 ; i--){
            // to concat character of str word to reversed, we can use charAt() method
            reversed += str.charAt(i);
        }
        // then we print the reversed word
        System.out.println(str.equalsIgnoreCase(reversed));
    }


    // HERE IS OUR MAIN METHOD TO TRY OUR METHOD
    public static void main(String[] args) {

        palindrome("level");        // will print true
    }
}
