package day45_Exceptions;

public class c01_WarmUp_PushUp {

    public static void main(String[] args) {

        //20 pushups , 1 second between each
        int pushups= 0;

        while (pushups <20){
            System.out.println("pushup "+(pushups+1));
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }
            pushups++;
        }


    }

}
