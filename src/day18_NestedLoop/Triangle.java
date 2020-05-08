package day18_NestedLoop;

public class Triangle {

    public static void main(String[] args) {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         */

       int i = 1;
       while (i<=7){
           int z = 1;
           while (z<=i){
               System.out.print("* ");
               z++;
           }
           System.out.println();

           i++;
       }

        System.out.println("======================================================");
            // My way... I dont' know how it worked
     int b = 1;
      while(b <= 7) {// true

          int a = 7; //
          while (a >= b) { //true
              System.out.print("* "); // print star space then repeat
              a--;
          }
         System.out.println();
        b++;
      }

        System.out.println("=======================================================");
        // Muhtar's way:

        int z2 = 7;
        while(z2 >= 1){

            int i2 = 1;
            while(i2 <= z2){
                System.out.print("* ");
                i2++;
            }

            System.out.println();


            z2--;
        }











    }
}
