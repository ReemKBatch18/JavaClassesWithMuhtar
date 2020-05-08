package day30_ArrayList;

import java.util.ArrayList;

/*
 5. write a program that can combine two String arrays into one arrayList
    		ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
public class class04_WarmUp_CombineArrays {
    public static void main(String[] args) {

        String [] arr1 = {"a","b","c"};
        String [] arr2 = {"d","e","f","g"};
        ArrayList <String> list = new ArrayList<>(); // this is the list to add elements to it

        // first we will do it with regular for loop
        for (int i = 0 ; i < arr1.length ; i++){
            // to retrieve each element from array arr1[] and will return me string
            String eachElement = arr1[i];
            list.add(eachElement); // or we can put (arr1[i])
        }
        // we need another loop for the second String array arr2. We can use for each loop
        for (String eachElement :arr2){
            list.add(eachElement);
        }

        System.out.println(list);       //  [a, b, c, d, e, f, g]
    }
}
