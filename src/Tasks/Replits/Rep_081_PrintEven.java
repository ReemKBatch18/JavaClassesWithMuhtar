package Tasks.Replits;

public class Rep_081_PrintEven {
    public static void main(String[] args) {


        for (int i = 2; i <= 100 ; i +=2){
           if (i%2 == 0){
               System.out.print(i + ", ");
           }
        }
    }
}
