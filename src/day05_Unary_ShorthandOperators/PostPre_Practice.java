package day05_Unary_ShorthandOperators;

public class PostPre_Practice {

    public static void main(String[] args) {

        int a1 = 50;
        a1= --a1 + a1++ + a1-- + a1++;
        // 49+49+50+49 =197
        System.out.println(a1); //197

        int x= 4;
        int y = x * 4 - x++;
        //      16 - 4
        System.out.println(y); //12

        int a = 1;
        a = -a-- + a++ / -a-- * --a;
        //  -1 + 0 / -1 * -1
        // -1 + 0 * -1
        // -1


        System.out.println(a);

    }
}
