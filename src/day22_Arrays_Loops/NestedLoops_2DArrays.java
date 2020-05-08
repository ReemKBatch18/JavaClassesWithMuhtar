package day22_Arrays_Loops;



public class NestedLoops_2DArrays {
    public static void main(String[] args) {

                        //    0   1      0   1  2     0   1   2
        char [][] arr2D = { {'a','b'},{'c','d','e'},{'f','g','h','i'} };
                        //      0           1               2

        // arr2D[0] ===> {'a','b'}
        // Can we apply a loop for this single dimensional array? yes we can.
        for (int i = 0 ; i < arr2D[0].length ; i ++){ // i : index of each element in 1st 1D Array: arr2D[0]
            System.out.println(arr2D[0][i]); // with regular for loop: we have to put arr2D[j][i] to print each element
        }
        // Now, is it possible to apply the same concept for the next 1Dimensional array? yes it is:
        //arr2D[1] ===> {'c','d','e'}
        for (int i = 0 ; i < arr2D[1].length ; i ++){   // i : index of each element in 2nd 1D Array: arr2D[1]
            System.out.println(arr2D[1][i]);
        }
        // Now, is it possible to apply the concept for the last single dimensional array? yes it is:
        // arr2D[2] ===> {'f','g','h','i'}
        for (int i = 0 ; i < arr2D[2].length ; i++){    // i : index of each element in 3rd 1D Array: arr2D[2]
            System.out.println(arr2D[2][i]);
        }
        System.out.println("===================================================================");


        // we repeated the loops 3 times which is the length of the 2D array... so we can apply to a loop
        // first we initialize a variable j
        // so we use this j as the index number of each single dimensional array
        for (int j = 0 ; j < arr2D.length ; j++){
            for (int i = 0 ; i < arr2D[j].length ; i ++){
                System.out.println(arr2D[j][i]);        // This will prints all numbers in the 2 dimensional array
            }
        }



    }
}
