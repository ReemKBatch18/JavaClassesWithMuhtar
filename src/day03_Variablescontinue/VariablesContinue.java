package day03_Variablescontinue;

public class VariablesContinue {

    public static void main(String[] args) {

        boolean result1 = true;
        boolean result2 = false;

        boolean result3 = 10 > 9;
        System.out.println(result3);
        //result 3 will print the word: true

        boolean r2 = "batch 17" == "batch 18";
        System.out.println(r2); //false

        System.out.println("===================================================================================");

        char ch1 = 'A';
        System.out.println(ch1); //A

        char ch2 = 4500;
        System.out.println(ch2); // will print a character equivalent to this number from Aecci table

        char ch4 = 100;
        System.out.println(ch4); // prints d which is equivalent to number 100

        char ch5 = 'D';
        System.out.println(ch5); // prints D

        int num1 = 'D'; //number,
        System.out.println(num1); // 68 because int only prints numbers so it printed what's equivalent to D

        char a1 = 'z';
        //byte b1 = a1; // can not be done because char is larger than byte
        byte b1 = 'z';
        System.out.println(b1); // 122 which is < 127 the maximum

        //short s1=a1; // can not be done because char is larger than short
        int i1 =a1; // int is larger than char
        System.out.println(i1);





    }
}
