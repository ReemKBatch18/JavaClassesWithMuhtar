package Tasks.Replits;
/*
In mathematics, the factorial of a positive integer n, denoted by n!, is the product of all positive integers less than or equal to n.  Calculate factorial and output result to the console.
Example:
input: 5
output: 120
 */
import java.util.Scanner;
public class Rep_092_Factorial_Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        int result = 1;    // result = (n-0) * (n-1)* (n-2)*(n-3)*(n-4);


        for (int i = 0 ; i < n ; i++){
            result *= (n-i);
        }
        System.out.println(result);











    }
}
