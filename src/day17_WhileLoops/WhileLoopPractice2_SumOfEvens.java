package day17_WhileLoops;

public class WhileLoopPractice2_SumOfEvens {
    public static void main(String[] args) {

        for (int i = 0 ; i <= 10; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        int sum = 0;
        int i = 0;
        while (i <= 10 ){
            if (i % 2 == 0){
                //System.out.println(i);
                sum +=i;
            }
            i++;
        }
        System.out.println(sum);

    }
}
