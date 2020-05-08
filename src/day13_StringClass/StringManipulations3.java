package day13_StringClass;

public class StringManipulations3 {

    public static void main(String[] args) {

        String str = "I like Java programming, John";
         int num = str.indexOf("Joh");
        System.out.println(num);

        String str2 = "Cybertek school is awesome";
        int firstS = str2.indexOf("s"); //9
        int secondS = str2.indexOf("s "); // or int secondS = str2.indexOf("s") + 1
        System.out.println(firstS); //9
        System.out.println(secondS); //17

        int maxIndexnumber = "Cybertek".length()-1;  //8-1
        System.out.println(maxIndexnumber);

        String names = "Reem";
        int a1 = names.indexOf("k");
        System.out.println(a1);//-1 because it doesn't exist

        String fullname = "Kuzzat Altay";
        String firstName = fullname.substring(0, fullname.indexOf(" "));
        String lastName = fullname.substring(fullname.indexOf(" ")+1);

        System.out.println(firstName);
        System.out.println(lastName);









    }

}
