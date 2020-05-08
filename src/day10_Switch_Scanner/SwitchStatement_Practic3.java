package day10_Switch_Scanner;

public class SwitchStatement_Practic3 {

    public static void main(String[] args) {

        char ch ='D';
        String result="";

        switch (ch){
            case 'A':
                //System.out.println("A");
                result ="A";// without break statement we will get logic error


            case 'B':
                //System.out.println("B");
                result="B";


            case 'C':
                //System.out.println("C");
                result="C";


            case 'D':
                //System.out.println("D");
                result="D";


            default:
                //System.out.println("Invalid");
                result="Invalid";
        }
        System.out.println(result);
        // it will print ABCDInvalid if we put result+=... and we remove break


    }

}
