package day21_MultiDimensionalArrays;

public class QuizQustion_Array_Loop_Switch {
    public static void main(String[] args) {

        int wd = 0 ; //
        String[] days = {"sun", "mon","wed","sat"};
        for (int i = 0; i < days.length ; i++){ // so this loop will execute for 4 times
            switch (days[i]){ // each time we are passing each element of the array to this switch statement
                // first time it executes "sun"= days[0] will pass --> wd = -1
                // then break statement --> exit switch statement
                // go back to the first of loop
                case "sat":
                case "sun":
                    wd -= 1;
                    break;

                case "mon": // 2nd execution of loop: this case "mon" = days[1] will get executed  --> add 1 to wd
                    wd ++; // wd = -1 +1

                case "wed": // This case "wed" gets executed after executing "mon" because there is no break statement after "mon"
                    //  wd = -1 +1 +2
                    // no break statement but nothing after
                   // so we go back to loop
                    wd += 2;
                    //3rd execution of loop: this case "wed" = days[2] gets executed --> increase wd by 2 -->
                    //  wd = -1 +1 +2 +2
                    // 4th execution of loop: case "sat" = days[3] gets executed ==> nothing happens but no break statement ==>
                    // ==> case "sun" gets executed automatically ==> decrease wd by 1 ==> then break statement exit switch
                    // loop stops executing after 4 executions
                    // Result is wd = -1 +1 +2 +2 -1


            }
        }
        System.out.println(wd);     //  -1+1+2+2-1 = 3
    }
}
