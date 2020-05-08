package Tasks.Replits;
/*
create a static method called "plus", its return is void and it gets no arguments.
It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within plus method.
Example:
enter first number:
1
enter second number:
2
result: 3
 */
import java.util.Scanner;

public class Rep_139_Methods_Void_AddNums {
    public static void main(String[] args) {
        plus();
    }

    public static void plus(){

        //your code here
        Scanner n = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = n.nextInt();
        System.out.println("enter second number:");
        int num2 = n.nextInt();
        System.out.println(num1+num2);



    }
}
