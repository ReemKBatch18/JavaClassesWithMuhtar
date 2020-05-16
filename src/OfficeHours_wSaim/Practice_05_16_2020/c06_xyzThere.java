package OfficeHours_wSaim.Practice_05_16_2020;
/*
Return true if the given string contains an appearance of "xyz"
where the xyz is not directly preceeded by a period (.).
So "xxyz" counts but "x.xyz" does not.
xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
 */
public class c06_xyzThere { //  From CodingBat : String-2

    public boolean xyzThere(String str) {

        // I'm going to assume by default, there's no existance of xyz in the string==>
        //==> I'm gonna return false first for all. Then I will look for xyz and return true
        // true only if it doesn't start with .

        //before we start the loop, we will handle the condition whether xyz is at the beginning of a word:

        if (str.startsWith("xyz")){
            return true;
        }

        for (int i=0; i<str.length()-3; i++){
            // inside the loop we only want to check the condition that returns us true

            String word = str.substring(i, i+4);
            if (!word.startsWith(".") && word.substring(1).equals("xyz")){
           //  OR: if (!word.startsWith(".") && word.endsWith("xyz)){ return true; }
                return true;
            }

        }
        return false;
        // we assume that by default I won't find any xyz in my string so that's why I return false here
        // I will be using if and the loop to check for the true condition by checking characters inside the string
    }


}
