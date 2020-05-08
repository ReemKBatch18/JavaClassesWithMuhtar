package day08_IfStatements;
import java.util.Scanner;
public class timer2 {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the number of minutes");
        int minutes=scan.nextInt();
        for (int i=minutes; i > 0 ;--i) {
            if( i< 0 )
                break;
            for (int z=59; z >0 ; --z) {
                System.out.println((i-1)+" minutes and "+z+" seconds left");
                Thread.sleep(1000);
            }
        }
        System.out.println(" \n \t \t********************************************* ");
        System.out.println("  \t \t***                                       *** ");
        System.out.println("   \t \t***  Times is Up, Please take your seats! *** ");
        System.out.println("    \t \t***                                       *** ");
        System.out.println("     \t \t********************************************* ");
    }
}
