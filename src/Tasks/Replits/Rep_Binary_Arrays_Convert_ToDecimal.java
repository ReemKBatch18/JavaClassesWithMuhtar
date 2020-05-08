package Tasks.Replits;

import java.util.Scanner;

/*
Binary number is a number expressed in the base-2 numeral system or binary numeral system,
which uses only two symbols: typically 0 (zero) and 1 (one). Each digit is referred to as a bit.
Given an array binary with 8 integers (0s or 1s), write java program to calculate decimal value
and print out to console. Feel free to use additional arrays or formulas.
Example:
binary -> [0, 0, 0, 0, 0, 0, 1, 1]
print 3
binary -> [0, 0, 1, 0, 0, 0, 1, 1]
print 35
binary -> [1, 1, 1, 1, 1, 1, 1, 1]
print 255
 */
public class Rep_Binary_Arrays_Convert_ToDecimal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        for(int i =0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }

        //TODO: Write your code below

        for (int i = 0 ; i < binary.length ; i++){
            if (binary[i] == 1){
                binary[binary.length-1] = 1;
                for (int j = binary.length-2 ; j>=0 ; j --){
                    binary [j] = binary[j+1] * 2;
                    System.out.println(binary[j]);
                }


            }


            /*
            binary[binary.length-1] = 1;    // binary [last index] = 1
            binary[binary.length-2] = 1*2;  // binary [last index-1] = 1*2 (=2)
            binary[binary.length-3] = 2*2;  // binary [last index-2] = 1*2*2 (=4)
            binary[binary.length-4] = 4*2;  // binary [last index-3] = 1*2*2*2(=8)
            */
        }

    }
}
