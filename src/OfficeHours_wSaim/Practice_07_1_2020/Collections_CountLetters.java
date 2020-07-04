package OfficeHours_wSaim.Practice_07_1_2020;

import java.util.LinkedHashMap;
import java.util.Map;

public class Collections_CountLetters {
    public static void main(String[] args) {
        countLetters("reem khalil");
    }

    public static void countLetters(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++){
            char key = str.charAt(i);

            if(! map.containsKey(key)){
                map.put(key,0);
            }
            // updating by 1 -- counting
            map.put(key, map.get(key)+1);
        }
    for(Character key : map.keySet()){
        System.out.println(key+" = "+ map.get(key));
    }
    }

}
