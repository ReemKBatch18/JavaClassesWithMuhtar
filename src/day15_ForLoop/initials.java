package day15_ForLoop;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter first name");
        String first = n.next();
        System.out.println("Enter last name");
        String last = n.next();

        String firstInitial = first.substring(0,1).toUpperCase();
        String lastInitial = last.substring(0,1).toUpperCase();
        System.out.println(firstInitial.concat(lastInitial));

        /*
      1.  String initials = first.substring(0,1).toUpperCase() + last.substring(0,1).toUpperCase();
        System.out.println(initials)

      2.  String initials = "" + first.charAT(0) + last.charAt(0);
          //returning us string with "", otherwise it will return us numbers
          initials = initials.toUpperCase();
          System.out.println(initials);

      3. String initials = first.substring(0,1) + last.substring(0,1);
         initials = initials.toUpperCase();
         System.out.println(initials);
         */



    }
}
