package Tasks.Replits;

import java.util.Scanner;

public class Rep_Arrays_PrintFirstLastChar1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


    for ( String eachWord : words){
        System.out.println(eachWord.charAt(0)+""+eachWord.charAt(eachWord.length()-1) );
    }





    }
}
