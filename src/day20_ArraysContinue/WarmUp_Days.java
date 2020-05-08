package day20_ArraysContinue;

import java.util.Scanner;

public class WarmUp_Days {

    public static void main(String[] args) {

        String[]days ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};  // size:7, max index: 6
                //          0       1           2           3       4           5       6

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = s.nextInt();  // 6 = Saturday
        int attempt = 1;

        while (num >7 || num<1){        // because we only have 7 days in the week: 1,2,3,4,5,6,7
            System.out.println("Invalid Entry, please re-enter a number");
            num = s.nextInt();
            attempt++;
            if (attempt==3 && (num >7 || num<1) ){
                // we have to add this condition here : (num >7 || num<1) or any 3rd attempt will print invalid and exit the loop.
                System.out.println("Invalid Entry, you already reached 3 attempts");
                System.exit(0);
            }
        }

        String result = days[num -1];

        System.out.println(result);











    }
}
