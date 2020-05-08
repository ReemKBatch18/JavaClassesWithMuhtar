package OfficeHours.Practice_03_18_2020;

public class LogicalOperators_Practice {

    public static void main(String[] args) {
        // ||, &&, !

        boolean r1= "Muhtar" != "Bad Guy"; // true
        System.out.println(r1);
        boolean r2= "Muhtar" == "Bad Guy"; // false
        System.out.println(r2);

        boolean r3 = 10 >= 9;
        System.out.println(r3); // true

        boolean r4= !false == !true;
        System.out.println(r4);

        // || one is true --> true
        boolean result1 = 9 != 8 || 9 == 8;
                        // true || false ---> true
        System.out.println(result1);

        boolean result2= 'a' =='A' || 'A' == 'b';
                      //     false  || false
        System.out.println(result2);

        boolean result3 = 6>5 && 6 <4;
        System.out.println(result3);

        boolean result4 = !false !=false && !true ==false; // true && true ==> true
        System.out.println(result4);





    }
}
