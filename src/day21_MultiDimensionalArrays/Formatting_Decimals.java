package day21_MultiDimensionalArrays;

import java.text.DecimalFormat; // we need this class in order to work on decimal format

public class Formatting_Decimals {
    public static void main(String[] args) {
        DecimalFormat DF = new DecimalFormat("0.00"); // it will be rounded to second decimal: 3.33

        double a = 10.0 / 3.0;

        System.out.println(a);  //  3.3333333333333335

        System.out.println(DF.format(a));   //  3.33

        System.out.println(2.34567899); //  2.34567899

        System.out.println(DF.format(2.34567899)); // 2.35 // it round number to nearest value





    }
}
