package day18_NestedLoop;

public class do_While_Practice {
    // print all even numbers between 0 ~ 100 in the same line separated by a space

    public static void main(String[] args) {

        int num = 0;

        do{
            if (num %2 == 0 ){   // condition to print even numbers
                System.out.print(num + " "); // will print all even numbers
            }
            num++;
        }while (num <= 100);

        System.out.println();
        System.out.println("=============================");

        int num2 = 0;
        do {
            if (num2 % 2 != 0){
                System.out.print(num2 + " "); // will print all odd numbers
            }
            num2++;
        }while(num2<=100);

        System.out.println();
        System.out.println("=============================");

        int i = 1;
        do{
            i++;            // because we placed i++ before print statement, it started printing from 2 to 6
            System.out.print(i+ " "); // it's going to start from 2 because we increased it by 1 --> 2 3 4 5 6
        }while (i <= 5);

        System.out.println();
        System.out.println("=============================");

        int n = 1;
        do{
            System.out.print(n + " "); // 1 2 3 4 5
            n++;            // because we placed n++ after print statement it prints from 1 till 5
        }while (n<=5);

        System.out.println();
        System.out.println("=============================");

        int z = 1;
        do {
            System.out.print(z+ " "); // 1 2 only.. because it breaks right after 2
            if (z == 2 ){
                break;
            }
            z++;
        }while (z<=5);

        System.out.println();
        System.out.println("=============================");

        int y = 1;
        do{
            if(y == 3){
                y++;   //u need to make sure the iterator is not skipping, so that the condition will eventually be false
                //if we don't have this y ++ before continue; the system will keep running without printing anything.
                continue;
            }
            System.out.print(y+ " "); // to skip 3 --> 1 2 4 5 skipping 3
            y++;
        }while (y <=5);

        System.out.println();
        System.out.println("=============================");

        int t = 1;
        do{
            if ( t % 2 != 0){
                t++;
                continue;
            }
            System.out.print(t +" "); //to print even numbers by skipping odd numbers
            t++;
        }while (t <= 100);

        System.out.println();
        System.out.println("=============================");

        int x = 1;
        do{
            if (x % 2 ==0){
                x++; // to make sure the iterator (increment) is not skipping
                continue;
            }
            System.out.print(x+ " ");
            x++;  // we need this otherwise it will keep printing 1 infinitely
        }while (x <=100);



    }
}
