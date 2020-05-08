package Tasks.Replits;

import java.util.Scanner;
/*
Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */
public class Rep_115_Arrays_FindingMaxLength_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();
                    }
                //write your code below
            /*
        words[0].length() = 3;
        words[1].length() = 5;
        words[2].length() = 11;
        words[3].length() = 5 ;
        words[4].length() = 17;
            */


            int max = 0;

            for (int i = 0 ; i < words.length ; i ++){
                if (words[i].length() > max){
                    max = words[i].length();


                }
            }

        System.out.println(max);






    }
}
