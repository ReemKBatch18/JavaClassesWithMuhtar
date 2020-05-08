package Tasks.Replits;
/*
Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */
import java.util.Scanner;

public class Rep_115_Arrays_FindingMaxLength_String {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below

        String longest = "";
        for (String each1: words){
            for (String each2 : words){
                if (each2.length() > each1.length()){
                    longest = each2;
                }
            }

        }
        System.out.println(longest);

    }
}
