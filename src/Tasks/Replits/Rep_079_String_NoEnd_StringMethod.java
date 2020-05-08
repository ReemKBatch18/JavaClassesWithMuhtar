package Tasks.Replits;

import java.util.Scanner;

public class Rep_079_String_NoEnd_StringMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();

        System.out.println(txt.substring(0,txt.length()-1));
    }
}
