package Tasks.Replits;
/*
extractNum
description:
a method that cleans any non number string from a string it gets
and returns the clean string
input:
-s (string)- a string the method gets
return: string: a string of numbers only
example use:
extractNum("aa2aa3") ==> 23
hint:
you can use:
 Character.isDigit(ch)
 or Conditions (on ascii table, the characters between #48 ~ #57 are digits)
 */
public class Rep_Methods_ExtractNumbers {
    public static String extractNum(String s) {
        // aa2aa3
        String result = "";
        for (int i = 0 ; i < s.length(); i ++){
            if (Character.isDigit( s.charAt(i) )){
                result += ""+s.charAt(i);
            }
        }
        return result;

    }
}
