package OfficeHours.Practice_03_18_2020;

public class ShortHandOperators_Practice {

    public static void main(String[] args) {

        // +=: addition assignment

        int a = 100;
        // a = a + 200;
           a += 200;
        System.out.println(a); // a = 300

        a += 200 * 3; // 300 + (200*3) = 900
        System.out.println(a);

        // -= subtraction assignment
        // a = a - 400
           a -= 400; // a = 500
        System.out.println(a);

        // *= multiplication assignment
        int x = 5;
            // x = x * 3; //15
        x *= 3;
        System.out.println(x);

        // /= division assignment
        int n = 900;
            // n = n / 3;
        n /= 3; // 300
        System.out.println(n);

        n /= 3*5; // n = n/15 ==> 20
        System.out.println(n);

        // %= remainder assignment
        int m = 10;
        m %= 3; //m = 1
        System.out.println(m);

        int y = 300;
        y %= 3*5;
        // y = % 15 =
        System.out.println(y);

        int t = 400;
        t %= 10*2;
        // t %= 20 --> t = t % 20;
        System.out.println(t);


    }
}
