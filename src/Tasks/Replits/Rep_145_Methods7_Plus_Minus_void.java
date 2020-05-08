package Tasks.Replits;

import java.util.Scanner;

public class Rep_145_Methods7_Plus_Minus_void {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }


    public static void plus_minus(int array[]){

       int countPos = 0;
       int countNeg = 0;
       int countZero = 0;
       String result = "";
        for (int each : array){
           if (each > 0){
               countPos++;
           }else if (each < 0) {
               countNeg++;
           }else{
               countZero++;

           }

       }
        System.out.println("positives:"+countPos+", negatives:"+countNeg+ ", zeros:"+countZero);



    }
}
