package day05_Unary_ShorthandOperators;

public class PrimitiveCastings {

    public static void main(String[] args) {

        int a = 10;
        long b = a; //implicit casting is done automatically
                // b= 10L
        int a1 = 100;
        long b1 = (long) a1;

        //Explicit casting:
        int Inum = 100;
        byte Bnum = (byte) Inum;

        short Snum = (byte) Inum;
        short Snum2 = (short) Inum;

        double Dnum = 5.5;
        float Fnum = (int) Dnum; //5.5
        System.out.println(Fnum); //5.0

        double D1 = 10.5;
        long L1 = (long) D1; // or (int) or (short) or (byte)
        System.out.println(L1);



    }
}
