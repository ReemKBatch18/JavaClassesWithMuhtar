package day14_StringClass;


import java.util.Scanner;

public class stringClassWarmUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word1");
        String word1 = scan.next();
        System.out.println("Enter word2");
        String word2 = scan.next();

        System.out.println(word1.concat(word2).concat(word2).concat(word1));

        System.out.println("Enter first word");
        String first = scan.next();
        System.out.println("Enter second word");
        String second = scan.next();
        System.out.println(first.substring(1).concat(second.substring(1)));

    }
}
