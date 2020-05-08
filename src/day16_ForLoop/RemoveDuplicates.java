package day16_ForLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "ABAB";


        String result = "";  // "AB" we store the expected result in this variable

        for(int i=0; i <= str.length()-1 ; i++){  // 0 , 1, 2 ,3
            /*
            if( !result.contains( ""+str.charAt(i)) ) {
                result += str.charAt(i);
            }
             */

            if(result.contains( ""+str.charAt(i) )){
                // if the string result does not contains str.charAt(i), then we concat it to the result,
                // if it does we will not concat it to the result
                continue;
            }

            result += str.charAt(i);

        }

        System.out.println(result);



    }

}
