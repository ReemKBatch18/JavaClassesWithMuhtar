package day47_Abstraction;

import day44_Exceptions.warmUpTask.ChromeBrowser;

public class c03_driverObjects {

    public static void main(String[] args) {
        // here we will create our objects from different browsers classes
        // I will declare this URL so that I can use it when I call this get() method from different drivers
        String URL = "https://www.google.com";

        // here we will create object from chrome to call methods
        c02_Chrome driver = new c02_Chrome();
        // here we will call the first abstract method we override in the sub class chrome driver
        driver.get(URL);

        // we will call the other method quit()
        driver.quit();

        // Now we will create firefox objects
        c04_FireFox driver2 = new c04_FireFox();
        driver2.get(URL);
        driver2.quit();

        c05_Opera driver3 = new c05_Opera();
        driver3.get(URL);
        driver3.quit();



    }
}
