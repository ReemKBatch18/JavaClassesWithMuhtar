package Tasks.Replits;
/*
When gears merge and work together, one teeth from each one goes in order.
Write a method mergeStrings that will return the strings merged, one letter at a time, starting with one.
Please note one and two can be of different lengths. Please look at below examples:
s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"
mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
mergeStrings("java", "selenium") ==> "jsaevlaenium"
 */
public class Rep_166_Methods_wReturn_Merge2Strings {
    public static void main(String[] args) {
        String one = "12345";
        String two = "abcde";
        String result = "";  //1a2b3c4d5e
result = one.substring(0,1) +two.substring(0,1)+one.substring(1,2)+two.substring(1,2)+one.substring(2,3)+two.substring(2,3)+one.substring(3,4)+two.substring(3,4);
        System.out.println(result);
        String[] arr = {"a","b","c"};
        String t = arr.toString();
        System.out.println(t);
    }
// By Emre Karamehmet
    public static String mergeStrings(String one, String two) {
        String result = "";
        int max = 0;

        if(one.length()>two.length()) {
            max = one.length();
        } else if(two.length() > one.length()){
            max = two.length();
        } else {
            max = two.length();
        }

        for(int x = 0; x<max; x++) {
            if(x<one.length()){
                result += one.charAt(x) + "";
            }

            if(x<two.length()) {
                result += two.charAt(x) + "";
            }
        }

        return result;

        /*
        // By Secuk Sudemirci
        public static String mergeStrings(String one, String two) {
      int forLoopSize = 0;
        String leftLetters = “”;
        String result = “”;
        char[] oneArr = one.toCharArray();
        char[] twoArr = two.toCharArray();
        if (oneArr.length > twoArr.length) {
            forLoopSize = twoArr.length;
            leftLetters = one.substring(two.length());
        } else {
            forLoopSize = oneArr.length;
            leftLetters = two.substring(one.length());
        }
        for (int i = 0; i < forLoopSize; i++) {
            result += “” + oneArr[i] + twoArr[i];
        }
        return result + leftLetters;
 */
    }


    }

