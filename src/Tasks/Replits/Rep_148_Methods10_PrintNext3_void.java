package Tasks.Replits;

import java.util.Scanner;

public class Rep_148_Methods10_PrintNext3_void {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();
        next3(num);


    }

    public static void next3(int number){

        System.out.println((number+1)+" "+(number+2)+" "+(number+3));
    }
}
