package OfficeHours.Practice_04_08_2020;

public class ForLoop_Task {
    public static void main(String[] args) {

        /*
        Print all numbers 0 ~100 that can be divisible by 3 or 5
         */
        for (int i = 0  ; i <= 100; i ++){
            if (i % 3 == 0 || i % 5 == 0){
                System.out.print(i+ " ");
            }
        }
        System.out.println("==================================");

        String name = "Reem Khalil";
        String revName = "";

        int lastIndex = name.length() - 1;
        for (int i = lastIndex ; i >= 0; i --){
            revName += name.charAt(i);

        }
        System.out.println(revName); //lilahK meeR
        System.out.println("=========================================");

            if (name.equals(revName)) {
                System.out.println(name + " is palindrome name");
            } else {
                System.out.println(name + " is not palindrome name");
            }

        System.out.println("========================================");
        /// using substring method:
        String result2 = "";
        for (int i2 = lastIndex; i2  >=0 ; i2--){
            result2 = result2 + name.substring(i2, i2 +1);
                                    //Anna   // (3 , 4) ---> a last character
                                            // (2 , 3) ---> n
                                            // (1 , 2) ---> n
                                            // (0 , 1) ---> A
        }
        System.out.println(result2);

        System.out.println("================================");








    }
}
