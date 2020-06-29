package day54_Maps;

/*
String      : Immutable version of char sequences = once declared ==> can not be modified

StringBuilder:  Mutable version of char sequences
                Methods are synchronized = faster

StringBuffer:   Mutable version of char sequences
                All methods are synchronized = thread safe = slow
 */
public class c06_String_VS_Buffer_VS_Builder {
    public static void main(String[] args) {

        String str1 = "reem";
               str1.concat(" khalil");
        // this concat method will create a new string. It Will not modify str1 at all.
        System.out.println(str1); // String class is final

        System.out.println("********************");

        StringBuilder builder = new StringBuilder("reem");
        builder.append(" khalil");
        System.out.println(builder);        //reem khalil
        // stringbuilder is not final

        System.out.println("***********************");

        StringBuffer buffer = new StringBuffer("reem");
        buffer.append(" khalil");
        System.out.println(buffer);         //reem khalil

        System.out.println("**********************");

        String word = "abc";

        // because stringbuilder and stringbuffer are mutable I can reverse a string using the same string
        StringBuilder sb = new StringBuilder("abc");
                        sb.reverse();
        System.out.println(sb);     // cba

        word = sb.toString();
        System.out.println(word);   // cba









    }
}
