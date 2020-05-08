package Tasks.WarmUpPractices;
/*
1. write a methods that can return the maximum number between two numbers
            Ex: Max(10, 20) ==> 20
2. write a method that can identify if a string is palindrome
            ex: palindrom("level")  ==> true
                palindrome("Cybertek") ==> false

 */
public class Methods_Practice2_WarmUps {

   // Task: Return Max num
    public static void maxNum(int num1, int num2){
        System.out.println("Enter two numbers: " +num1+ ", "+num2);
        if (num1 > num2){
            System.out.println("Maximum number is: " +num1);
        }else if (num2 > num1){
            System.out.println("Maximum number is: "+ num2);
        }else{
            System.out.println("Numbers are equal");
        }
    }

    // Task: Identify palindrome
    public static void palindrome(String word){
        System.out.println("Please identify if the word: '"+word+ "' is palindrome!");
        String reversedWord = "";
        for(int i = word.length()-1; i >= 0; i-- ){
            reversedWord    +=  word.charAt(i);
        }
        boolean palindrome = word.equalsIgnoreCase(reversedWord);
        System.out.println(palindrome);
    }




    public static void main(String[] args) {
        maxNum(5,6);
        System.out.println("==============================");
        palindrome("level");
        System.out.println("==============================");
    }
}
