package day13_StringClass;
/*
write a java program that can convert any given numbers between 0 ~ 9 to words,
if the number is greater than 9 or less than zero, out put should be "Invalid".
            MUST use Scanner and switch statemen
 */
import java.util.Scanner;

public class numbersToWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number between 0 ~ 9");
        int num = scan.nextInt();

        switch (num){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Invalid");
                break;
           }

           String result= (num==0)?"Zero":(num==1)?"One":(num==2)?"Two":(num==3)?"Three":(num==4)?"Four":
                   (num==5)?"Five":(num==6)?"Six":(num==7)?"Seven":(num==8)?"Eight":(num==9)?"Nine":"Invalid";
        System.out.println(result);



    }
}
