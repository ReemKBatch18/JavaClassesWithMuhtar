package Tasks.WarmUpPractices;
/*
3. write a method that can print out the unique elements from an int array
					Ex: {1,1,2,3,3} ==> 2
						{6,6,7,7,8,9} ==> 8 9
4. write a method that can print out the unique elements from a double array
					Note: Apply method overloading
 */
public class Methods_UniqueElementFromArray {
    public static void main(String[] args) {

        //NOT COMPLETE
        int[] arr = {1,1,2,3,3}; // 2
        int count=0;
        for (int i = 0 ; i < arr.length ; i++  ){
            for (int j : arr){
                if (arr[j] == arr[i]){
                    count++;
                }
            }
        }

        }
    }


