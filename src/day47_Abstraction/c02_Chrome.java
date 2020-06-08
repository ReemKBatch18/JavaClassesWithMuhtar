package day47_Abstraction;





public final class c02_Chrome extends c01_RemoteWebDriver {
// I can make this class final so that it will never get inherited

    // I can't have an abstract method (which is now inherited from super) in a regular class==> must override
    public void get(String URL){
        System.out.println("Opening "+ URL +" in chrome browser");
    }

    @Override
    public void quit(){
        System.out.println("closing the chrome browser");
    }

}
