package day17_WhileLoops;

public class Remove_Duplicates_Frequency {
// write a program that counts how many times text is repeated
    public static void main(String[] args) {

        String str = "I like java java and javascript".toLowerCase();  //  is fun is cool

        int count = 0 ;

        String word = "java".toLowerCase();  // ignoring the case sensitiveity by converting both string to lowercase

        while(str.contains(word)){

            count++;
            str = str.replaceFirst(word, "");
            // after counting the first "Java",w e need to remove it from the str so that we don't count it again

        }


        System.out.println(count);


    }
}
