package OfficeHours_wSaim.Practice_06_10_2020;



public class c08_User2 {
    public static void main(String[] args) {

        c03_FacebookUser user = new c03_FacebookUser("jbond5", "009", "James Bond");
        user.createPost("My first post");
        user.createPost("today was good");
        user.createPost("Okay. Dinner is ready");

        System.out.println(user.getAllPosts());
    }
}
