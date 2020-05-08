package Tasks.Replits;
/*
Given a String variable sentence, write code to type each word in separate lines.

Example:
sentence -> "Java is fun"
Print
Java
is
fun
 */

import java.util.Scanner;

public class Rep_106_Arrays_SplitSentence_LoopString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();

        //type your code below

        String [] words = sentence.split(" ");
        for (String each : words){
            System.out.println(each);
        }


    }
}
