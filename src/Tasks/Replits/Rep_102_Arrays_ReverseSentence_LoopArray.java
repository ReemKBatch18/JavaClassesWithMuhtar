package Tasks.Replits;
/*
Given a String variable sentence, write code to type each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java
 */
import java.util.Arrays;
import java.util.Scanner;

public class Rep_102_Arrays_ReverseSentence_LoopArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String sentence = input.nextLine();

        //TODO: Type your code below

        String[] Words = sentence.split(" ");
       // System.out.println(Arrays.toString(Words));    //    [Java, is, fun]Java = Words[0], is = Words[1], fun = Words[2]

        String revSentence = "";                     //  [fun, is, Java] fun = RevWords [0], is = RevWords[1] , Java =RevWords[2]

        for (int i = Words.length - 1; i >= 0; i--) {
            revSentence += Words[i]+" ";

        }
        //System.out.println(revSentence);
        String [] revString = revSentence.split(" ");
        for (String each : revString){
            System.out.println(each);
        }



    }
}
