package OfficeHours_wSaim.Practice_05_09_2020;
/*
Given a string, return a string where for every char in the original, there are two chars.
doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */
public class c06_DoubleChar {
    public String doubleChar(String str) {

       String result = "";
        for (int i = 0; i < str.length(); i ++){
            result += str.charAt(i)+""+str.charAt(i);
            // OR:
            // result += str.substring(i, i+1) + str.substring(i, i+1);
        }
        return result;
    }
}
