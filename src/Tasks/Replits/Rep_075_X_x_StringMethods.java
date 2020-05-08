package Tasks.Replits;


import java.util.Scanner;

public class Rep_075_X_x_StringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String f = ""+word.charAt(0);
        String l = ""+word.charAt(word.length()-1);
        if (f.equalsIgnoreCase("x")&& l.equalsIgnoreCase("x")) {
            word = word.substring(1, word.length() - 1);
        }else if (f.equalsIgnoreCase("x")) {
            word = word.substring(1);
        }else if (l.equalsIgnoreCase("x")) {
            word = word.substring(0, word.length() - 1);
        }else {
            word = word;
        }
        System.out.println(word);



               }
    }