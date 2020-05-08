package day07_IfStatements;

public class warmup_task_medium {
    public static void main(String[] args) {
        /*
        4. write a java program that accepts three numbers and rteurn the mediam number
				(assume that none of them are equal)
         */
        double a = 250;
        double b = 200;
        double c = 300;

        boolean aMed = (a < b && a > c) || (a>b && a <c);
        boolean bMed = (b < a && b > c) || (b>a && b <c);
        boolean cMed = (c < a && c > b) || (c>a && c <b);
        if (aMed){
            System.out.println(a+ " is medium number");
        }
        if (bMed){
            System.out.println(b + " is medium number");
        }
        if (cMed){
            System.out.println(c + " is medium number");
        }


    }
}
