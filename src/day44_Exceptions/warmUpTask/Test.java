package day44_Exceptions.warmUpTask;

public class Test {

    public static void main(String[] args) {

        ChromeBrowser chrome = new ChromeBrowser();
        chrome.openBrowser();   //  open chrome browser
        chrome.closeBrowser();  //  close chrome browser

        FirefoxBrowser firefox = new FirefoxBrowser();
        firefox.openBrowser();  //  open firefox browser
        firefox.closeBrowser(); //  close firefox browser

        Opera opera = new Opera();
        opera.openBrowser();    //  open opera browser
        opera.closeBrowser();   //  close opera browser

    }
}
