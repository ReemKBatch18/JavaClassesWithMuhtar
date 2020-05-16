package OfficeHours_wSaim.Practice_05_16_2020;
/*
Given a non-empty string and an int N, return the string made starting with char 0,
and then every Nth char of the string.
So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
 */
public class c02_EveryNth {         //CodingBat : Warmup -1

    public String everyNth(String str, int n) {

        // Saim's

        String word = "";

        for (int i = 0 ; i < str.length() ; i += n){  // += to add to the value to increment i
            word +=  str.charAt(i);
        }
        return word;
    }

    /*
    OR: using i % n

    String word = "";

    for (int i = 0 ; i < str.length() ; i ++){

    if (i % n  != 0 ){
        continue;
    }
    word += str.charAt(i);
    }

    return word;

    */


}
