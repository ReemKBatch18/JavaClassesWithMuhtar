package Tasks.Replits;


import java.util.Scanner;

public class Rep_Asses_Print_Largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        //your code here

            if (num1 > num2 && num1>num3) {

                System.out.println("n1 is bigger");
            }else if (num2 >num1 && num2 >num3){

                System.out.println("n2 is bigger");
            }else {

                System.out.println("n3 is bigger");
            }
        }


    }

