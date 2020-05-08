package day06_Shorthand_LogicalOperators;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean result1 = true;
        System.out.println(!result1);// false

        boolean result2 = !(10 +15 > 15); // false
        System.out.println(result2);

        boolean result3 = !true == !false; // false
                        // false == true ==> false
        System.out.println(result3);

      boolean r2 = 10 > 15 && 15 < 13;
                // false && false ====> false
        System.out.println(r2);

        boolean r3 = 'a' == 'b' -1 && 'b' + 1 =='c';
                // true && true --> true
        System.out.println(r3);
    }
}
