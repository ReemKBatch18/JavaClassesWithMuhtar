package day22_Arrays_Loops;
/*
 write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
 it's similar to the task 97 in repl.it,
 You MUST use arrays and for each loop
 */
public class WarmUp_Frequency_Java_Python_ {
    public static void main(String[] args) {

        String sentence = "I like java and javascript";
        int countJava = 0;              // 2
        int countPython = 0;

        // Split sentence with " " ===> String Array. Elements are the words in the sentence:   I, like, java, and , javascript
        // Assign it to a String Array variable becuase split will return us String Array
       String [] words =  sentence.split(" "); // [I, like, java, and , javascript]

        // use for each loop
        for (String eachWord : words){
// this loop will get executed 5 times because 5 is the size of the data structure we have here which is String Array: words[]
            if (eachWord.contains("java")){
                countJava++;
            }
            if (eachWord.contains("python")){
                countPython++;
            }
        }
        System.out.println(countJava);
        System.out.println(countPython);



    }
}
