package Tasks.Replits;
/*
Given method called cube. Write all required code inside this method in order  to asks the user
for a number and then prints the cubed value of that number:
Example:
input: 5
output: 125
 */
import java.util.Scanner;

public class Rep_141_Methods_FindCube {

    public static void cube()
    {
        //your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(n*n*n);

    }//end cube

    public static void main(String[] args) {
        cube();
    }
}
