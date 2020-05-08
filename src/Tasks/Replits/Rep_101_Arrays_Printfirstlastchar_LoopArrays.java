package Tasks.Replits;
/*
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.
Example:
words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne
 */
import java.util.Scanner;

public class Rep_101_Arrays_Printfirstlastchar_LoopArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for (String each : words){
            System.out.println(each.charAt(0)+""+each.charAt(each.length()-1));
        }

    }
}
