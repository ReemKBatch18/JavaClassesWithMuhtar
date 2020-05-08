package day34_CustomClass;

public class class06_ScrumTeam_CapitalOne {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setTesterInfo("Muhtar", 123, "Manual Tester", 70000);
        // How can I add this tester into scrumteam? I need to call hireTester() method
        // once tester is hired, his name should be added to testersTeam

        ScrumTeam scrum = new ScrumTeam();
        scrum.hireTester(tester1);
        // so how many testers i'm supposeed to have in this ArrayList testersTeam when I hire one tester? one tester
        System.out.println(scrum.testersTeam.size()); // 1

        // what if I fire this tester? size of testersTeam = 0 (by calling fireTester()method
        scrum.fireTester(123);
        System.out.println(scrum.testersTeam.size()); // 0






    }
}
