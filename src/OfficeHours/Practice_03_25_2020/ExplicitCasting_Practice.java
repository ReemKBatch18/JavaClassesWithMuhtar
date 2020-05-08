package OfficeHours.Practice_03_25_2020;

public class ExplicitCasting_Practice {

    public static void main(String[] args) {

        byte bnum =100;
        short snum = bnum; // the reason it compiled is there is auto implicit casting smaller to larger
        // short snum = (short)bnum; This is called implicit casting

        int iNum =200;
        // short sNum = iNum; this is wrong.. compiler error
        short sNum = (short)iNum; //explicit casting

        //float fNum = 0.5; needs casting because 0.5 is automatically double which is larger
        float fNum = (float)0.5;
        System.out.println(fNum); // will return 0.5
        //or
        float fNum2 = (long)0.5;
        // but this will return us 0.0 because long is a whole number so 0 then float is 0.0
        System.out.println(fNum2); // will return 0.0

        //long lNum = 4.5; this is wrong because decimal is double and double is larger than long
        long lNum = (long)4.5; // or we can do (int) or (short) or (byte)
        System.out.println(lNum);// should return 4 because long is a whole number2.

        System.out.println(9/2); //4
        System.out.println(9/(float)2); //4.5

        System.out.println(10.0 /3); // 3.333333333335









    }
}
