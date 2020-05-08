package day25_MethodsRecap;
// First we need to call methods from Library class ==> we need to import the class Library from package RESOURCES
import RESOURCES.Library;
import day16_ForLoop.RemoveDuplicates;


public class class05_TestingMethods {
    public static void main(String[] args) {

        String str = "abcabbvvvaabbbaaaa";
        // call removeduplicats method from library class
        String result = Library.RemoveDuplicates(str);  // abcv
        System.out.println(result);

        String str1 = "aabbcdb";
        String str2 = "b";
        // call frequency method from library class
        int num1 = Library.Frequency(str1,str2);
        System.out.println(num1); // 3



        String str3 = "mmmnnnfffuuu";
        // we want to call frequency of chars method from library class
        String result3 = Library.FrequencyOfChars(str3);
        System.out.println(result3);        //      m3n3f3u3

//IF YOU CLICK ON METHOD WHILE HOLDING CTRL BUTTON IT WILL TAKE YOU TO WHERE THE METHOD IS


    }

}
