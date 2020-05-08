package day19_Arrays;

public class Arrays_Practice1 {

    public static void main(String[] args) {

        String[] friends = { "Kuzzat" , "Asiya" , "Saim" , "Akbar", "Marufjon", "Guljannat" , "Murodil"};
                    //          0          1         2        3        4             5           6

        /*
        System.out.println(   friends[6]   );
              String s1 =    friends[2];
        System.out.println(s1);
         */

        for(int i = 0; i <= 6; i++) {
            String name = friends[i];
            System.out.println(name);
        }

            String[] emails = {"reem@yahoo.com", "reem@gmail.com", "reem@hotmail.com","reem@outlook.com"};
            //print out all the users who registered with their gmail..
            // so we need to check all strings .. that's a loop
            // we need  a condition.. that's if statement
            // max: 4

            for (int i = 0; i <= 3; i++){       // this loop will execute 4 times
                String email = emails[i];       //  to retrieve each element in the array
                if (email.endsWith("@gmail.com")){  //  To apply our condition to each element of array
                    System.out.println(email);      //  reem@gmail.com
                }
                 }
    }
}
