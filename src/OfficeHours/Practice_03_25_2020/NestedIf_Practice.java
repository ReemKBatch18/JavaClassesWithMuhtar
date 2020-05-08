package OfficeHours.Practice_03_25_2020;

public class NestedIf_Practice {

    public static void main(String[] args) {

        // we have precondition and the precondition can be evaluate to multiple scenarios
        byte weekDays = 9;

        boolean validNumber = weekDays>0 && weekDays< 8;
        String result = "";

        if(validNumber){

            if(weekDays ==1){
                result = "Monday";
            }else if(weekDays ==2){
                result = "Tuesday";
            }else if(weekDays ==3){
                result = "Wednesday";
            }else if(weekDays ==4){
                result = "Thursday";
            }else if(weekDays ==5){
                result = "Friday";
            }else if(weekDays ==6){
                result ="Saturday";
            }else{
                result = "Sunday";
            }

        }else { // not a valid number
            result ="Invalid";

        }

        System.out.println(result);






    }
}
