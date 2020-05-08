package day06_Shorthand_LogicalOperators;

public class ShorthandOperators {

    public static void main(String[] args) {

        int x= 20;
            x +=10; //x = x + 10 = 30

        System.out.println(x); // 30

            x += 60; // x= x + 60 = 90
        System.out.println(x); // 90

        String schoolname = "CyberTek";
               schoolname += 12345; // schoolname = schoolname12345
        System.out.println(schoolname); // CyberTek12345

        System.out.println('a' + 'b');
        //                  97 + 98 ==> 195

        char ch1 = 'a';
             ch1 += 'b';
        System.out.println(ch1); // character

        int num = 'z';
            num += 'x';
        System.out.println(num);

        int A = 100;
            A -= 90; // 100 - 90 = 10
        System.out.println(A);

        int B = 200;
            B -= A; // B = 200 -10 = 190
        System.out.println(B);

        int q = 20;
        int p = q*=20*3;
             // q*= 60; // q =q * 60
        System.out.println(p);

        int num1 = 300;
            num1  /= 2; // num1 = num1 / 2
        System.out.println(num1);

        int num2 = 400;
            num2 /= 20 + 10; // num2 = num2 / 20 + 10   first we add left side then divide
                            // num2 = 400 / 30      13.33333
                            // num2 = 13
        System.out.println(num2);

        int num3 = 300;
            num3 %= 10 + 20; // num3 %= 30
                            // num3 = 300 % 30 = 0
        System.out.println(num3);

        int n1 = 400;
            n1 %= 3*15; // n1 %=45
                        // n1 = n1 % 45
                        //n1 = 400 % 45 =40
        System.out.println(n1);


    }
}
