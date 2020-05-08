package Tasks.Replits;

import java.util.Scanner;
//Print out the number of times that the string "hi" appears anywhere in the given string
public class Rep_091_Count_Hi_Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count =0;




        for (int h = 0; h <=str.length()-2; h++ ){

                if ( str.charAt(h)=='h' && str.charAt(h+1) =='i') {
                    count++;
                }

        }
        System.out.println(count);






    }
}
