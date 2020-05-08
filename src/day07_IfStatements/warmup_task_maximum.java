package day07_IfStatements;
/*
	2. write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)
 */
public class warmup_task_maximum {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;

        boolean aGreater = a > b && a > c;
        boolean bGreater = b > a && b > c;
        boolean cGreater = c > a && c > b;
        if (aGreater){
            System.out.println(a+ "is maximum number");
        }
        if (bGreater){
            System.out.println(b + "is maximum number");
        }
        if (cGreater){
            System.out.println(c + "is maximum number");
        }



    }
}
