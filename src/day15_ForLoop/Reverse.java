package day15_ForLoop;

public class Reverse {



          /*
         2. write a program that can reverse the following string:
                String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method
         */

        public static void main(String[] args) {
            String str = "Java";  //avaJ
            //    0123

            String reverse1 = "" + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);

            String reverse2 = str.substring(3) +str.substring(2, 3) + str.substring(1,2) +str.substring(0,1);

            System.out.println(reverse1);
            System.out.println( reverse2);


        }

}
