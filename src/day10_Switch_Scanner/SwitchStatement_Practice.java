package day10_Switch_Scanner;

public class SwitchStatement_Practice {

    public static void main(String[] args) {

        int number= 1;
        switch (number){
            case 1 :                           // we can only give number to match switch
                System.out.println("Monday");
                break; //case closed

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid");
                break;
        }






    }
}
