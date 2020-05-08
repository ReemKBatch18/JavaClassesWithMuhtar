package Tasks.Replits;
/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
 */
import java.util.Arrays;
import java.util.Scanner;

public class Rep_097_JavasEqualPythons_LoopString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();

        String [] arr = sentence.split(" ");
    //    System.out.println(Arrays.toString(arr)); // [We, study, java, not, python]

        int countJava = 0;
        int countPython = 0;

        for (String each : arr){
            if (each.contains("java")){
                countJava++;
            }else if (each.contains("python")){
                countPython++;
            }
        }
        if (countJava == countPython){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


    }
}
