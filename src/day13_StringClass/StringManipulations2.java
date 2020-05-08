package day13_StringClass;

public class StringManipulations2 {

    public static void main(String[] args) {
                  //  01234567
        String str = "Cybertek School is the best";

        String schoolName = str.substring(0,8);
        System.out.println(schoolName);

        String fullName = "Kuzzat Altay";
        String firstName = fullName.substring(0,6);
        String lastName = fullName.substring(7,12);
        System.out.println(firstName);
        System.out.println(lastName);

        //fulll name = firstname lastname
        // gmail: lastname_firstname@gmail.com

        String Reem = "Reem Khalil";
        //             0123456789..
        String firstname = Reem.substring(0,4);
        String lastname = Reem.substring(5,11);
        System.out.println(firstname);
        System.out.println(lastname);

        String gmail = lastname.concat("_").concat(firstname).concat("@gmail.com");
        // String gmail = lastname +"_"+firstname+"@gmail.com";
        System.out.println(gmail);

        String s1 = "I love Java Programming Language";
        String className = s1.substring(7);
        System.out.println(className); //Java Programming Language.... it print from 7 till end

        String s2 = "I like C# Programming. I am learning C#";
        s2 = s2.replace("C#", "Java");
        System.out.println(s2);

        String name = "COVID 18";
        name = name.replace("8", "9");
        System.out.println(name);

        String r1 = "I like C#, C# is fun, C# is cool";
        //r1 = r1.replace("C#","Java"); // I like Java, Java is fun, Java is cool
        // System.out.println(r1); //  I like Java, Java is fun, Java is cool

        r1 = r1.replaceFirst("C#","Java");
        System.out.println(r1);

        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
        r2 = r2.replaceFirst("Tomorrow", "Today");
        System.out.println(r2);





    }
}
