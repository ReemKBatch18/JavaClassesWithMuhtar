package day47_Abstraction;

public class c04_FireFox extends c01_RemoteWebDriver{

    public void get(String URL){
        System.out.println("Opening "+ URL +" in firefox browser");
    }

    public void quit(){
        System.out.println("Closing firefox browser");
    }
}
