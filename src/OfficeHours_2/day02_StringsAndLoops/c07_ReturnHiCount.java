package OfficeHours_2.day02_StringsAndLoops;
/*
Return the number of times that the string "hi" appears anywhere in the given string.
countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
 */
public class c07_ReturnHiCount {
    public int countHi(String str) {

        int count = 0;
        while (str.contains("hi")){
            count ++;
            str = str.replaceFirst("hi","");
        }
        return count;

        /*
        OR:
        int count = 0;
       for (int i = 0 ; i < str.length()-1; i ++){
         String word = str.substring(i, i+2);
         if (word.equals("hi"))  count++;
        }
       return count;
         */

    }


}
