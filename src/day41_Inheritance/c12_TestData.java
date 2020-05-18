package day41_Inheritance;
// to import Data class into here: use import statement

import day41_Inheritance.c11_Data;

// But that doesn't mean we can use it's variables

public class c12_TestData {

    public static void main(String[] args) {

        /*
        I can not do the following actions:

        System.out.println(Data.a);
        Data.method1();

        System.out.println(TestData.a);
        */

        // But if I inherit class Data into here ==> then I will be able to use its accessible variables and methods
    }
}

