package OfficeHours_wSaim.Practice_05_09_2020;
/*
Given a string, return a version without both the first and last char of the string.
The string may be any length, including 0.
withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
 */
public class c05_WithoutEnd {
    public String withouEnd2(String str) {
        if (str.length()>=2){
            return str.substring (1,str.length()-1);
        }else
            return "";
    }
}
