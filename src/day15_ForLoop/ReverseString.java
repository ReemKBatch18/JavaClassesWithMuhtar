package day15_ForLoop;

public class ReverseString {

    public static void main(String[] args) {

        String str = "universal";  //avaJ
        //    0123

        String reverse1 = "" + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);

        int lastIndexnum = str.length()-1;

        for (int i = lastIndexnum; i>=0; i--){
           // System.out.print(str.charAt(i));
        }

        String reverese2 = "";
        for (int i = lastIndexnum; i>=0; i--){
            reverese2 +=str.charAt(i);
        }
        System.out.println(reverese2);




    }
}
