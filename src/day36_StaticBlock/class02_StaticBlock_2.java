package day36_StaticBlock;

import day02_Variables.TellMeAboutYourself;
import day34_CustomClass.Tester;

public class class02_StaticBlock_2 {
    static int a;
    static int b;
    int c;
// yesterday we created our Tester class.
// I want my tester to be used everywhere. Can I make it static? yes I can:
    static Tester tester1 = new Tester();

    // I will use it here in the main method like this:
    public static void main(String[] args) {
        tester1.setTesterInfo("Jean", 123,"SDET",120000);
        System.out.println(tester1); // it prints tester's info that were provided.
        // after we ran the main method, these information were set.
        // But can I call my static tester1 into another class? Yes I can by calling this class's name
        // But the thing is the information above will not show when I call it because they were given after I ran main method here.
        // we can try in class Test
        // But if we initialize this tester1 outside this main method and in the static block and we call it into another class ==> it will show values

    }

    static{
        a=100;
        b= 200;
        //c= 300; // static only accepts static variables
        if (100>200){
            a=100;
        }else{
            b=200;
        }
        tester1.setTesterInfo("Jean", 123,"SDET",120000);
    }
}
