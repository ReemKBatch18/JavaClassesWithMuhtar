package day22_Arrays_Loops;
/*
 write a program that can count the even and odd number from an array of integers
                        MUST use for each loop
 */
public class WarmUp_CountEvensOdds_Loop {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        int countOddNums = 0;
        int countEvenNums = 0;

        // we need a loop to repeat checking each index whether it's odd or even

        for(int eachNum : arr){
            if (eachNum % 2 == 0){
                countEvenNums++;
            }else {

                countOddNums++;
            }
        }
        System.out.println("even numbers: "+countEvenNums);     //  even numbers: 5
        System.out.println("odd numbers: " +countOddNums);      //  odd numbers: 5

       /*
        OR WE CAN DO WITH USING CONTINUE;

        for(int each :arr){
            if (each%2 ==0){
                countEvenNums++;
                continue;
            }
            countOddNums++;
        }

        System.out.println("even numbers: "+countEvenNums+ ", odd numbers: " +countOddNums);

        */
    }
}
