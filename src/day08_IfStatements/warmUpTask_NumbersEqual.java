package day08_IfStatements;

public class warmUpTask_NumbersEqual {
    public static void main(String[] args) {
        double n1 = 1;
        double n2 = 2;
        double n3 = 3;
        boolean n1equaln2 = n1 ==n2 && n1!=n3;
        boolean n2equaln3 = n2 ==n3 && n2!=n1;
        boolean n1equaln3 = n1 ==n3 && n1!=n2;
        boolean n1n2n3equal = n1==n3 && n1==n2;
        boolean nonEqual = n1 !=n2 && n1!=n3 && n2!=n3;

        if (n1equaln2){
            System.out.println(n1+ " & " +n2+ " are equal");
        }
        if (n2equaln3){
            System.out.println(n2+ " & " +n3+ " are equal");
        }
        if (n1equaln3){
            System.out.println(n1+ " & " +n3+ " are equal");
        }
        if (n1n2n3equal){
            System.out.println("all equal");
        }
        if(nonEqual){
            System.out.println("none of them are equal");
        }

            }
}
