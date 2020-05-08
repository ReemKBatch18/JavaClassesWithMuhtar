package day27_DateTime;
/*
3. write a method that can print out the unique elements from an int array
					Ex: {1,1,2,3,3} ==> 2
						{6,6,7,7,8,9} ==> 8 9
4. write a method that can print out the unique elements from a double array
					Note: Apply method overloading
 */
public class class_02_WarmUp_UniquesFromArray_Methods {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3}; //2
        //            0 1 2 3 4
        // assume we don't know the elements.. can we apply loop to find out unique? yes we can.
        // How can I get the element at index 0? I just use: arr [0]
        // I will apply the loop to find out if this element arr[0] is unique or not
        // can we do this with for each loop? yes we can:

        for (int each2 : arr) {      // we create this loop to be able to repeat the below steps for each elelment
            int count = 0;   // I need to be able to count the occurrences of the element ==> int count =0;

            // becuase we need to repeat those following steps for each index.., we place them in a loop
            for (int each : arr) {   // each : each element of the array
                if (each == each2) {
                    count++; // helps to count how many times element at each index  occurred
                }
            }
            if (count == 1) {
                System.out.println(each2);
            }
        } // if we do with regular for loop ==> each == arr[i]

        uniqueEelement(arr);

        double[] arr2 = {1.5, 23.1, 5.4, 88.1};

        uniqueElement(arr2);


    }

    // HERE IS METHOD TO PRINT OUT UNIQUE ELEMENTS FROM AN INT ARRAY
    public static void uniqueEelement(int[] arr) {
        for (int each2 : arr) {      // we create this loop to be able to repeat the below steps for each element
            int count = 0;   // I need to be able to count the occurrences of the element ==> int count =0;

            // becuase we need to repeat those following steps for each index.., we place them in a loop
            for (int each : arr) {   // each : each element of the array
                if (each == each2) {
                    count++; // helps to count how many times element at each index  occurred
                }
            }
            if (count == 1) {
                System.out.println(each2);
            }
        } // if we do with regular for loop ==> each == arr[i]

    }

    public static void uniqueElement(double[] arr) {

        for (double each2 : arr) {

            int count = 0;
            for (double each : arr) {
                if (each == each2) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(each2);
            }

        }

    }
}
