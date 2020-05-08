package OfficeHours.Practice_04_22_2020;

public class class_02_methods_return {

    public static void main(String[] args) {
        //int a = sum(10,20);

        int num1 = sum2(500, 600);

        System.out.println(num1);

        System.out.println("=====================================");
        String str = "Muhtar" ;

        String reuslt = "";
        for(int i = str.length()-1; i>=0; i--){
            reuslt += str.charAt(i);
        }


        System.out.println(reuslt);
// palindrome or not
        String name = "level";
        String name2 = reverse(name);

        System.out.println(name2);

        System.out.println( name.equals(name2) );



    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }



    public static int sum2(int a, int b){

        return a+b;
    }

    public static String reverse(String str){
        String reuslt = "";
        for(int i = str.length()-1; i>=0; i--){
            reuslt += str.charAt(i);
        }
        return reuslt;
    }

    }



