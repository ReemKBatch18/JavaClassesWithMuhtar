package day25_MethodsRecap;

public class class04_WarmUp_Methods_RemoveDuplicates {
    public static void main(String[] args) {
        String str = "ABAB";

        String result = ""; // we will store the String after removing duplicates
        // I need to check characters by creating loop
        // I will check first character in str if it is contained or not in result. If not I will add it into the result
        for (int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if (!result.contains(""+ch)){ // we add "" to make char a string to be able to check if it is contained
                result += ch;
            }
        }
        System.out.println(result); // we will get the string without duplicates //AB


        String str2 = "abcabcabc";
        String result2 = RemoveDuplicates(str2);
        System.out.println(result2); // abc

        String str3 = "reem Khalil";
        String result3 = RemoveDuplicates(str3);
        System.out.println(result3); //rem Khali
    }


   // to create a method that removes duplicate, we need to make the return typ STring:
    public static String RemoveDuplicates(String str){

        String result = ""; // we will store the String after removing duplicates
        // I need to check characters by creating loop
        // I will check first character in str if it is contained or not in result. If not I will add it into the result
        for (int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if (!result.contains(""+ch)){ // we add "" to make char a string to be able to check if it is contained
                result += ch;
            }
        }
        return result;
    }
}
