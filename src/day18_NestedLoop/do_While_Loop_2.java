package day18_NestedLoop;

public class do_While_Loop_2 {
    public static void main(String[] args) {

        int num = 103;  // print the numbers between 100 ~ num

       // while (num >= 100){ // will print 103 102 101 100 while condition is true
        while(num<100){ // this is false it will not execute
            System.out.println(num);
            num--;
        }
        System.out.println("====================================");

        int num2 = 103;

        do {
            System.out.println(num2);
            num2--;
            // }while(num2 >= 100); // will print 103 102 101 100 while condition is true
        }while (num2<100); // even though this is false, it will execute num2 = 103 one time.



    }
}
