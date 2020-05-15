package day40_Encapsulation;

public class c08_CredentialsObjects {

    public static void main(String[] args) {

        c07_Credentials AnnaFacebook = new c07_Credentials();

        System.out.println(AnnaFacebook.getUserName()); // null : we have not set them yet
        System.out.println(AnnaFacebook.getPassWord()); // null : we have not set them yet

        // to set UserName and PassWord => we use setter method to set private variables:

        AnnaFacebook.setUserName("A.Paliura");
        AnnaFacebook.setPassWord("1234567");

        // Now if we try to print them using the getter method ==> it will return us the values:
        System.out.println(AnnaFacebook.getUserName()); //A.Paliura
        System.out.println(AnnaFacebook.getPassWord()); // ******* because that is what we used to get it in the getter method




    }
}
