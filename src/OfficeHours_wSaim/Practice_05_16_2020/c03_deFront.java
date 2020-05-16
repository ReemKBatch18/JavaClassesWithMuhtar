package OfficeHours_wSaim.Practice_05_16_2020;
/*
Given a string, return a version without the first 2 chars.
Except keep the first char if it is 'a' and keep the second char if it is 'b'.
The string may be any length. Harder than it looks.
deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
 */
public class c03_deFront {  //CodingBat : String-1

    public String deFront(String str) {

        String word = str.substring(2);

        // we have to put the condition of b before condition of a
        // because we want b at second character and a at first character :

        if (str.charAt(1) == 'b'){
            word = "b" + word;
        }

        if (str.charAt(0)== 'a'){
            word = "a"+ word;
        }


        return word;
    }


    /*
    OR:

        if(str.startsWith("ab")){
            return str;
        } else if(str.startsWith("a")) {
            return "a" + str.substring(2);
        } else if(str.charAt(1) == 'b') {
            return "b" + str.substring(2);
        } else {
            return str.substring(2);
        }

     */

}
