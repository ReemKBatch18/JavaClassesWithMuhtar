package Tasks.Replits;

import java.util.Scanner;
/*
Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
such as with "javaxxx" or "xjavaxx" but not "xxjavaxx".
The string may be any length, including 0word = .
 */
public class Rep_087_HasJava_Loop_String {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

      if (word.indexOf("java")==0 || word.indexOf("java")==1 ){
          System.out.println(!exists);

        }else{
          System.out.println(exists);
        }



    }

}
