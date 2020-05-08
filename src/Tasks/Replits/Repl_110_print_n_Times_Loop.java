package Tasks.Replits;
import java.util.Scanner;
public class Repl_110_print_n_Times_Loop {
    public static void main(String[] args) {
        int j = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE

        for (j = 1; j <= n; j++) {
            System.out.print("*");
        }

    }
}
