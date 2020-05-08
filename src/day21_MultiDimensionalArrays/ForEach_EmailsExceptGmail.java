package day21_MultiDimensionalArrays;

public class ForEach_EmailsExceptGmail {
    /*
     String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elements could be more in the array
    print all the email addresses excluding the gmail addresses
      */
    public static void main(String[] args) {

        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};
        for (String each: emails){    // this loop will execute as many times as the number of elements in the Array // 4
            if (each.endsWith("@gmail.com")){  // Must use .endsWith() not .contains() because we might have a bug with contains
                continue;
            }
            System.out.println(each);
        }
        System.out.println("=================================================================");
    // or
        for (String each: emails){
            if (! each.endsWith("@gmail.com")){
                System.out.println(each);
            }
        }




    }
}
