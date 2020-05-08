package day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Developer;

public class class04_HumanResources {
   static Developer dev1 = new Developer();
    static Developer dev2 = new Developer();
    static Developer dev3 = new Developer();
    static Developer dev4 = new Developer();
    static Developer dev5 = new Developer();
    // since they're static I can call them through the class name into another class

    // here's my main method
    // if I set the dev1 info here after running the main method==> I can not use them outside this class
   /*
    public static void main(String[] args) {
      dev1.setInfo("Reem", "Developer",120000,1234);
    }
    */

   // but if I declare static block then initialize info for dev1 --> I will be able to call it outside this class
    // all static are loaded once the class is loaded
    // as soon as class is loaded, all the info are loaded
    static {
       dev1.setInfo("Reem", "Developer",120000,1234);
       // Now if we call dev1 info into another class, info will appear
       // whenever we have static variable we can always use static block to do/use it
       // if we hae a variable that can get us data from excel file ==> I can set it in static block ==> it will run once class is loaded
   }

}
