package Tasks.Replits;
/*
uniqueChars is a method that you will code now, should be able to accept any string in the world and return unique characters from the parameter.
Examples:
uniqueChars("java") ==> "jav"
uniqueChars("mama") ==> "ma"
uniqueChars("spoon") ==> "spon"
 */
public class Rep_167_Methods_wStringReturn_RemoveDuplicates_Unique {
    public static void main(String[] args) {
       System.out.println( uniqueChars("BugBusters") ) ;


    }

    public static String uniqueChars(String str) {
        //TODO: write your below
String result = "";
        for (int i = 0 ; i < str.length() ; i ++){
            for (int j = 0 ; j < str.length() ; j ++){
                if (!result.contains(str.substring(i,i+1))){
                    result += str.substring(i,i+1);

                }
            }
        }
        return result;


    }
}
