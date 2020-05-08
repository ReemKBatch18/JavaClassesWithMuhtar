package Tasks.Replits;
/*
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.
Example:
sentence -> "Java is fun"
reversed -> "fun is Java"
 */
import java.util.Arrays;
import java.util.Scanner;

public class Rep_103_Arrays_ReverseSentence2_LoopArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here

        String [] words = sentence.split(" "); //  [Java, is, fun]
       // System.out.println(Arrays.toString(words));
        for (int i = words.length -1 ; i >= 0 ; i--){
            reversed += words[i]+" ";

        }
        reversed = reversed.trim();


        //End your code here. do not modify below statement
        System.out.println(reversed);


    }
}
