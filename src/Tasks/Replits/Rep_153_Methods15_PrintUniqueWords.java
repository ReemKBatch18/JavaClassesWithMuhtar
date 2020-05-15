package Tasks.Replits;
/*
Complete a void method printUniqueWords() that will print only unique words from an array of strings.
Every single unique word should be printed from the new line.
Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python
 */
public class Rep_153_Methods15_PrintUniqueWords {
    public static void printUniqueWords(String[] words) {
        //WRITE YOUR CODE HERE

        for (int i = 0 ; i < words.length ; i++){
            int count=0;
            for (int j = 0 ; j < words.length; j++){
                if (words[j].equalsIgnoreCase(words[i])){
                    count++;
                }
            }
            if (count ==1){
                System.out.println(words[i]);
            }
        }


    }
}
