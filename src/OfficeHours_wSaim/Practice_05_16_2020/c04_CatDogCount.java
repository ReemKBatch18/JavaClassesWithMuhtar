package OfficeHours_wSaim.Practice_05_16_2020;
/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.
catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */
public class c04_CatDogCount {

    public boolean catDog(String str) {

        int countDog = 0;
        int countCat = 0;
        for (int i = 0 ; i < str.length() ; i++){

            if (str.contains("cat")){
                countCat++;
                str = str.replaceFirst("cat","");
            }
            if (str.contains("dog")){
                countDog++;
                str = str.replaceFirst("dog", "");
            }
        }
        return countDog == countCat;


        /*
        int cat = 0;
        int dog = 0;

        for (int i = 0 ; i <str.length()-2 ; i ++){ // str.length()-2 to include the last character
            String word = str.substring(i , i + 3);
            if (word.equals("cat")) {
            cat ++;
            }
            if (word.equals("dog")){
            dog++;
            }
         }

            return cat == dog;

  */



    }

}
