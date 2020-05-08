package day21_MultiDimensionalArrays;
/*
2. write a program that can return the longest string of text from a String array
3. write a program that can return the shortest string of text from a String array
 */
public class WarmUp_LongestWord_ShortestWord {

    public static void main(String[] args) {

        String [] names = {"Reemkhalil","Omer", "Muhtar","Emrah","Mohammed", "Ana"};
        // we need to find out which string has the maximum length

        int maxLengthString = names [0].length();
        // to compare we need to assume that the first word in the array has the maximum length
        // then we assign this length to an int variable maxLengthString
        // how can we get the length? we call length method = length()
        // then we need ot compare the length with length of each element in the array
        // since this is a repeated action , we create a loop
        int minLengthString = names [0].length();
        // here we also assume that the first word in the array has the shortest length then we start comparing

        String longestWord = ""; // we create this variable to assign to it later as it is the longest word
       // OR String longestWord = names[0];
        String shortestWord = ""; // we create this variable to assign to it later as it is the shortest word
      // OR String shortestWord = names[0];


        for (int i = 0 ; i <= names.length - 1 ; i ++){
            /* we can start i =1 instead of i =0 because we already assumed that max=firstword and min = firstword but
            but in this case we need to assign like this:
            String longestWord = names[0];
            String shortestWord = names[0];
            otherwise it will print empty if first word was longest or shortest
            and in that case, we don't need to compare maxLengthString with the first word
            because we already assumed that is the case*/
            if (names[i].length() >maxLengthString ){
                maxLengthString = names[i].length();
                longestWord = names[i];
            }
            if (names[i].length() <minLengthString){
                minLengthString = names[i].length();
                shortestWord = names[i];
            }
        }

        // after this loop is executed we print the longestWord and shortestWord
        System.out.println(longestWord);
        System.out.println(shortestWord);




    }
}
