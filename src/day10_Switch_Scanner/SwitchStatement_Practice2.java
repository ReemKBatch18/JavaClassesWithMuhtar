package day10_Switch_Scanner;

public class SwitchStatement_Practice2 {

    public static void main(String[] args) {


        int num = 0;

        switch (1) {
            case 1:
                num += 3;


            case 2:
                num += 2;


            case 3:
                num += 10;
                break;


            default:
                num -= 5;

        }


        System.out.println(num); // watch for break;


        }


    }




