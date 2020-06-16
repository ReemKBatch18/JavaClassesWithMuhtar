package OfficeHours_wSaim.Practice_06_10_2020;

public class c04_User {
    public static void main(String[] args) {
        c03_FacebookUser user = new c03_FacebookUser("java5", "kajava5desa");
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        // we put our rule in the set method not in constructor so that if user decided to change user name or password later he won't be able to

        c03_FacebookUser user2 = new c03_FacebookUser("jamesB", "pass07", "James Bond");

        System.out.println(user2.getUsername());
        System.out.println(user2.personalUrl);
        System.out.println(user2.accountLength);
        System.out.println(user2.getFullName());
    }
}
