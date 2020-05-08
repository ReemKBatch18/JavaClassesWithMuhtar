package day07_IfStatements;

public class warmup_task_minimum {
    public static void main(String[] args) {
        /*
        3. write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)
         */
        double a = 100;
        double b = 200;
        double c = 300;

        boolean aMin = a < b && a < c;
        boolean bMin = b < a && b < c;
        boolean cMin = c < a && c < b;
        if (aMin){
            System.out.println(a+ "is minimum number");
        }
        if (bMin){
            System.out.println(b + "is minimum number");
        }
        if (cMin){
            System.out.println(c + "is minimum number");
        }

    }
}
