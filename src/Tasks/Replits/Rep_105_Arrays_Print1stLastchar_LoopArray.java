package Tasks.Replits;
/*
Given a String array words, iterate through each word and print first and last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]
 */
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Rep_105_Arrays_Print1stLastchar_LoopArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        //TODO: Write your code below
       // String [] names = {"reem", "rami", "hayat","ibrahim","khalil"};
        //String [] firLas = { rm, ri, ht, im, kl};


        for (int i = 0 ; i < words.length ; i ++){ //   i represents index number in Array words


                words[i] = words[i].charAt(0)+ ""+words[i].charAt(words[i].length()-1);


        }
        System.out.println(Arrays.toString(words));









    }
}
