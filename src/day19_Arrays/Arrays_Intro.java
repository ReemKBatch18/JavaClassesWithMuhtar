package day19_Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {

        //   int scores = 90 , 10, 20;  regular variables can only have one data

        /*
        Declaration of an Array:
				DataType[]  variableName = { data1, data2, data3 };
				// 70, 75, 85, 90, 95, 100
         */

        int[] scores = { 70, 75, 85, 90, 95, 100};
        //               0   1    2   3   4   5

        // To retrieve each element from Array: variableName[index]
        // in the example above scores[0] = 70; scores[1] = 75; scores[2] = 85;... etc
        // Since retrieving elements return us int, can we assign it to int? yes we can:

        int num1 = scores[2]; //85,  int

        System.out.println(num1);


        int num2 = scores[5]; // 100, int

        System.out.println(num2);



    }
}
