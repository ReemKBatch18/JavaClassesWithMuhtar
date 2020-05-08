package day25_MethodsRecap;

public class class06_Methods_FrequencyOfString {

    public static void main(String[] args) {

        // we need to find out how many times a string has been in another string
        // but we need to remove each string that is checked so that we do not recheck it again

        String str1 = "javajavajavajava";
        String str2 = "java";

        // first we need a variable to count how many times
        int count = 0 ;

        if (str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2, "");
        }

        System.out.println(str1);

        String a = "python python python python";
        String b = "python";
        int num1 = Frequency(a,b); // 4
        System.out.println(num1);


    }

    public static int Frequency (String str1, String str2){
        int count = 0;
        while (str1.contains(str2)){
            count++;
            str1= str1.replaceFirst(str2, "");
            // we need to make sure that we are not counting the same index over and over again
        }
        return count;
    }
}
