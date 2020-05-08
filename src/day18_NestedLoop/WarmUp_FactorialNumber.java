package day18_NestedLoop;


import java.util.Scanner;

/*
2. write a program that can retunr the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
 */
public class WarmUp_FactorialNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");

        long num = s.nextLong(); // only because Long range is larger than int
        long result = 1; // has to be 1 because if 0 , then any number will be 0

        while (num >= 1){
            //result *= num;
            result = result * num;
              num--;
        }

        System.out.println(result);

int z = 5;
for (int i = 5; i>0; i--){
    z+=i;
}
        System.out.println(z);




    }
}
