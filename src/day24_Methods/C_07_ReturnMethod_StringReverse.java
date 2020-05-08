package day24_Methods;

public class C_07_ReturnMethod_StringReverse {

    //HERE IS OUR MAIN METHOD TO CALL OTHER METHODS:
    public static void main(String[] args) {
        Reverse("Cybertek");    //ketrebyC

        String name = Reverse2 ("Reem"); // here we can assign the value of the reversed word to a string and use it
        System.out.println(name);
    }

    // This void method will create reversed String out of the word
    public static void Reverse(String str){
        String RevWord = "";

        for (int i = str.length()-1 ; i >= 0 ; i--){
            RevWord += str.charAt(i);
        }
        System.out.println(RevWord);
        System.out.println("========================================================");
    }


    // Now we will create a return method.. instead of void we use String Then return it and use
    public static String Reverse2 (String str) {
        String RevWord2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            RevWord2 += str.charAt(i);
        }

        return RevWord2;

    }
}
