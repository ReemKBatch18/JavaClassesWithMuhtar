package Tasks.Replits;

import java.util.Scanner;

public class Rep_090_Countjava_LoopString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        int count=0;
        while(true){
            if (word.contains("java")){
                count++;
                word.replace("java", "");
                System.out.println(count);
            }

        }









    }
}
