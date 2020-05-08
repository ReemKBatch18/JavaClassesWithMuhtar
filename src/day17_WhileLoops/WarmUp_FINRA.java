package day17_WhileLoops;
/* 3. write a program which prints out the numbers from 1 to 30:
			1. for numbers which are divisible by 3, print "FIN" instead of the number.
			2. for numbers which are divisible by 5, print "RA" instead of the number
			3. for numbers which are a divisible by both 3 and 5, print "FFINRA" instead of the number
		Ex:
			1 2 FIN 4 RA FIND .... FINDRA    */

public class WarmUp_FINRA {

    public static void main(String[] args) {
        String result = "";

        for (int i = 1 ; i <= 30 ; i++){
            if (i % 3 == 0 && i % 5 == 0){ // print all numbers divisible by both 3 , 5
                result += "FINRA ";
                //System.out.print("FINRA ");
            }else if (i % 3 == 0){          // prints numbers divisible by 3 only
                result += "FIN ";
                //System.out.print("FIN ");
            }else if (i % 5 == 0){          // prints numbers divisible by 5 only
                result += "Ra ";
                //System.out.print("RA ");
            }else{                          // prints numbers that are not divisible by 3 or 5
                result += i +" ";
               // System.out.println(i + " ");
            }
        }
        System.out.println(result);









    }
}
