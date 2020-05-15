package Tasks.Replits;

import java.util.Scanner;

/*
Complete a method isPalindrome() that will check if number is a palindrome. Print your result as a boolean (true or false).
Example:                        Example:
input: 1001                     input: 1234
output: true                    output: false
 */
public class Rep_154_Method_NumberIsPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        String str = ""+num;
        String revStr = "";
        for (int i = str.length()-1 ; i >=0 ; i--){
            revStr += ""+str.charAt(i);
        }
        System.out.println(str.equals(revStr));


    }
}
