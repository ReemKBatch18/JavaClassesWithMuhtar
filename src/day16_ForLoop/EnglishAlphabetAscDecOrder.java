package day16_ForLoop;

public class EnglishAlphabetAscDecOrder {
    /*
    5. Write a program that will print out all letters in English alphabet in ascending order
	6. Write a program that will print out all letters in English alphabet in descending order
     */
    public static void main(String[] args) {


        for (char i ='A'; i <='Z'; i++){
            System.out.print(i+ " ");

                    }
        System.out.println();

        for (char i = 'Z'; i >= 'A'; i--){
            System.out.print(i+ " ");
        }
        System.out.println();

        for (char i ='a'; i <='z'; i++){
            System.out.print(i+ " ");
        }

        System.out.println();

        for (char i = 'z'; i >= 'a'; i--){
            System.out.print(i+ " ");
        }
        System.out.println();


    }
}
