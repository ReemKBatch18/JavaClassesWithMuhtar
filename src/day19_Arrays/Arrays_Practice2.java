package day19_Arrays;

public class Arrays_Practice2 {
    public static void main(String[] args) {

        int[] arr = {10,20,30};
        System.out.println(arr.length); // 3 this is one way to initialize size

        int[] arr2 = new int[5]; // another way to initialize size
        // in this case without giving value, default value 0 will be initialized to each element [0,0,0,0,0]
        // 0 is default for int, short, byte, long

        System.out.println(arr2[0]);// will print default 0
        System.out.println(arr2[1]); //will print default 0

        String[] Testers = new String[3];//we want to place those names in this array {"Reem", "Maya", "Nana"};
         // index: 0 , 1 , 2
        // String default value is null
        // now we assign values
        Testers[0] = "Reem";
        System.out.println(Testers[0]);//Reem
        System.out.println(Testers[1]);//null
        System.out.println(Testers[2]);//null

        Testers[2] ="Maya";
        System.out.println(Testers[2]); //Maya
        System.out.println(Testers.length);

        Testers[1] = "Nana";
        System.out.println(Testers[1]); //Nana

        System.out.println("==================================================================");


       //TASK
        // Create array called students, with length 10 , then use scanner to input names of students and assign into array

        String[] students = new String[10];
        //Write program that asks "enter a name" 10 times, and store each name in the array students






    }
}
