package OfficeHours_wSaim.Practice_05_16_2020;
/*
Return the number of times that the string "code" appears anywhere in the given string,
except we'll accept any letter for the 'd', so "cope" and "cooe" count.
countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
 */

public class c05_CountCode {
    public int countCode(String str) {      //CodingBat: String -2
        int code = 0;
        // co*e
        // let's manually do this
        for (int i=0; i<str.length()-3; i++){

            String word = str.substring(i, i+4);
            if (word.startsWith("co") && word.endsWith("e")) {
                code++;
            }
        }
        return code;


     //****************************************************************************************


     /*
      int code = 0;
      // co*e
      // let's manually do this
        for (int i=0; i<str.length()-3; i++){

     String word = str.substring(i, i+2) + "d" +str.substring(i+3, i+4);
                                                //    str.charAt(i+3);
      if (word.equals("code")) {
      code++;
     }
   }
   return code;

     */

     //*****************************************************************************************


       /*  here using charAt() method:

        int code = 0;
        // co*e: this is what we're looking for so:
        // why don't we check character by character so:
        // if 1st char = c, next = o, after next = e

        for (int i = 0; i < str.length()-3; i ++){
          if (str.charAt(i) == 'c' && str.charAt(i+1)== 'o' && str.charAt(i+3) == 'e'){
            code ++;
          }
        }

          return code;

          */




    }

}