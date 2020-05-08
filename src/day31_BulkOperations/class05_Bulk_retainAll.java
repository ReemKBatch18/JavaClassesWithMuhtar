package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class class05_Bulk_retainAll {
    public static void main(String[] args) {

        // retainAll(): removes all the unmatching objects. it keeps all the matching objects.

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3));
        // Only keep : 1,2,3 ==> we use retainAll() method
        // if we call removeAll() method by selecting the other numbers 6,7,8,9 we don't want

        list.retainAll(Arrays.asList(1,2,3));
        // 4,5,6 will be removed and all 1,2,3 will be kept like this: [1, 2, 3, 1, 2, 3]
        System.out.println(list);   //  [1, 2, 3, 1, 2, 3]





    }
}
