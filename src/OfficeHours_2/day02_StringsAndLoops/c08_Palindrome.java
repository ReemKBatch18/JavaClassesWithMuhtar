package OfficeHours_2.day02_StringsAndLoops;

public class c08_Palindrome {

    public static boolean isPalindrome(String str){
        // racecar
        // we will check if we start from first character that it matches the last, ==>
        // ==> then we check if second character matches the one before the last... and so forth
        // if 1st character is not the same with last ==> immediately return false
        // we will create a loop to iterate from first character to last:
        for (int i = 0 ; i < str.length() /2 ; i++){
            // we only have to check half of the string not all of it.
            // once it gets to middle it better stops because we compared all characters already
            if (str.charAt(i) != str.charAt(str.length()-1 - i)){
            // every time i increments ==> the character on other side of equation should decrement
                return false;
            }
        }
        return true; //before middle character == after middle character
    }

    // now we can try it in our main method
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));    //  true
        System.out.println(isPalindrome("asdhau"));       // false
    }

}
