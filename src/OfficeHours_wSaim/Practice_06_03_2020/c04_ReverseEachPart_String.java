package OfficeHours_wSaim.Practice_06_03_2020;

public class c04_ReverseEachPart_String {

    /*
    6) Create a method that will accept a String of multiple words separated by a space
    and return the String with each part reversed.
    ex: "The house is big" ===>> ehT esuoh si gib
     */
    public static void main(String[] args) {
        System.out.println(reverseEachWord("The house is big"));
    }

    public static String reverseEachWord(String str){
        // we try to look at each word.
        // we know that every word is separated by a space
        // so I can make a String array out of this String
        // this method will split the words by space
        // and stores each word as an element in the array
        String [] words = str.split (" ");
        String finalWord = "";

        // we need two loops... one for each word .. one to reverse each word
        for (String word :words){
            String rev = "";
            for (int i = word.length()-1; i >=0 ; i--){
                rev += word.charAt(i);
            }
            finalWord += rev + " ";
        }
        return finalWord;


    }
/*
we can also create a heler method
 public static String reverseEachWord(String str) {

        String [] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        String finalWord = "";

        for(String word: words) {

            finalWord += reverse(word)+ " ";

        }

        return finalWord;

    }

    // helper method

    public static String reverse (String word) {
        String rev = "";
        for(int i = word.length()-1; i >= 0; i--) {
            rev += word.charAt(i);
        }
        return rev;
    }
 */





}
