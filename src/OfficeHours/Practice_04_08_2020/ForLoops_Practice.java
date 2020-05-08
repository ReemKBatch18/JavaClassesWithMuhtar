package OfficeHours.Practice_04_08_2020;

public class ForLoops_Practice {
    public static void main(String[] args) {

        for (int i = 0; i <=5; i ++){
            System.out.println("Hello "+i); // will execute  0 1 2 3 4 5 .. (6 times)
        }
        System.out.println("=================================================");
        for (int g = 0; g <=5; g +=2){
            System.out.println("Hello "+ g);// will print 0 2 4... (3 times)
        }
        System.out.println("=================================================");
        for (int h = 1 ; h <=7 ; h +=2){
            System.out.println("Hello "+h);// start from 1 --> 3 5 7
        }
        System.out.println("=================================================");
        for (int j = 10 ; j >= 1 ; j -= 3){
            System.out.println("Hello "+j); // will print 10 7 4 1
        }
        System.out.println("=================================================");
        for (int f = 1 ; f <=4;){
            f+=2;
            System.out.println("Hello " +f); // will start printing from 3 first increases --> prints --> checks
        }






    }
}
