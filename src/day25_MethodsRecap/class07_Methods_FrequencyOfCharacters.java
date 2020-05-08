package day25_MethodsRecap;

import RESOURCES.Library;

public class class07_Methods_FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aabbcc"; // Expected Result is : a2b2c2  frequency of characters
        // The letters from expected result is abc which is str with removed duplicates
        // We can call the method we created to remove duplicates
        String NonDup = Library.RemoveDuplicates(str);
    //    System.out.println(NonDup);     //  abc

        // Now we want to know how many times the first character of NonDup had occurd in str
      //  char ch = NonDup.charAt(0); // a I want to know how many times this char a occured in str
        // is there anyway to convert this char ch to a string to check how many times it occured in str
       // String ch= "" +NonDup.charAt(0);
      //  Library.Frequency(str, ch); // This will tell me how many times ch = a occured in str = aabbcc

     //   int num = Library.Frequency(str, ch);
     //  System.out.println(ch +num); // a2

        // we need ot create a loop that will execute as many times as the length of NonDup
        // and we copy top steps to it

        String result = "";
        for (int i = 0 ; i < NonDup.length(); i++){
           String ch = ""+NonDup.charAt(i);
           int num = Library.Frequency(str,ch);
     //       System.out.print(ch +num);  //  a2b2c2
            result += ch +num;
        }
        System.out.println(result);

    }

    // THIS METHOD WILL RETURN US FREQUENCY OF CHARACTERS FROM ANY STRING
    public static String FrequencyOfChars(String str){
        String NonDup = Library.RemoveDuplicates(str);
        String result = "";     //  this will contain the frequency of chars
        for (int i = 0 ; i < NonDup.length(); i++){
            String ch = ""+NonDup.charAt(i);
            int num = Library.Frequency(str,ch);
             result += ch +num;
        }
        return result;
    }
}
