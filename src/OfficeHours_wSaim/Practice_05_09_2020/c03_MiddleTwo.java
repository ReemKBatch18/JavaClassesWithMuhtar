package OfficeHours_wSaim.Practice_05_09_2020;
/*
Given a string of even length, return a string made of the middle two chars,
so the string "string" yields "ri". The string length will be at least 2.
middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
 */
public class c03_MiddleTwo {
    public String middleTwo(String str) {
        if (str.length()>=2){
            return  str.substring(str.length()/2-1, str.length()/2+1);
        }else{
            return str;
        }


   /*
   //Saim's
   int mid1 = str.length()/2 - 1;
   int mid2 = str.length()/2;

   String word = "" + str.charAt(mid1) + str.charAt(mid2);
   return word;

   //OR
   return str.substring (mid1, mid2+1);

   //OR
   return str.substring(mid1, mid1+2);

   */

    }

}
