package day10_Switch_Scanner;

public class warmUpTasks_Days_Numbers_Months {
    public static void main(String[] args) {
        /*
        2. write a program that can display the days based on the numbers 1 ~ 7

         */
        byte num= 5;
        String day;
        if (num>=1&&num<=7){
           day= (num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednesday":(num==4)?"Thursday":(num==5)?"Friday"
                   :(num==6)?"Saturday":"Sunday";
            System.out.println(day);
        }else{
            System.out.println("Invalid");
        }
        System.out.println("==================================");

        String result="";//solving Days of the Week without using If
        result=(num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednesday":(num==4)?"Thursday":(num==5)?"Friday"
                :(num==6)?"Saturday":(num==7)?"Sunday":"Invalid";
        System.out.println(result
        );
        System.out.println("============================================================");

        /*
        3. write a java program that can convert numbers between 0 ~ 9 to words,
        if the number is greater than 9 or less than zero, out put should be "Invalid".
         */
        byte number = 5;
        String nameOfNumber="";
        if (number>=0&&number<=9){
            nameOfNumber=(number==0)?"Zero"
                    :(number==1)?"One"
                    :(number==2)?"Two"
                    :(number==3)?"Three"
                    :(number==4)?"Four"
                    :(number==5)?"Five"
                    :(number==6)?"Six"
                    :(number==7)?"Seven"
                    :(number==8)?"Eight"
                    :"Nine";
            System.out.println("The number: "+number + " is "+nameOfNumber);
        }else{
            System.out.println("Invalid");
        }
        System.out.println("============================");
        //Or we can do it without IF... Like this
        nameOfNumber=(number==0)?"Zero"
                :(number==1)?"One"
                :(number==2)?"Two"
                :(number==3)?"Three"
                :(number==4)?"Four"
                :(number==5)?"Five"
                :(number==6)?"Six"
                :(number==7)?"Seven"
                :(number==8)?"Eight"
                :(number==9)?"Nine":"Invalid";
        System.out.println(nameOfNumber);


        System.out.println("===========================================================");
        /*
        4. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
                28 days: 2
                30 days: 4,6, 9, 11
                31 days: 1,3,5,7,8,10,12
            MUST USE NESTED IF
         */
        byte month = 4;
        byte daysInMonth;
        if (month>=1&&month<=12){
            if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                daysInMonth=31;
                System.out.println("Month # "+month);
                System.out.println("Days in this month are " +daysInMonth+ " days");

            }else if(month==4||month==6||month==9||month==11) {
                daysInMonth = 30;
                System.out.println("Month # "+month);
                System.out.println("Days in this month are " +daysInMonth+ " days");

            }else if(month==2){
                daysInMonth=28;
                System.out.println("Month # "+month);
                System.out.println("Days in this month are " +daysInMonth+ " days");
            }


        }else{
            System.out.println("Invalid Entry");
        }

        System.out.println("================================");
        //Here's a different way too
        int num1=2;
        boolean days28= num1==2;//under what condition the month has 28 days?
        boolean days30= num1==4||num1==6||num1==9||num1==11;
        //do we need to apply another boolean or just use else block? we use else block.

        String result1 ="";
        if (num1>0 && num1<13){

            result1=(days28)?"Has 28 days":(days30)?"Has 30 days":"Has 31 days";

        }else{
            result = "Invalid";
        }
        System.out.println(result1);





    }
}
