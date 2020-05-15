package day40_Encapsulation;

public class c07_Credentials {

    // different objects will have different credentials so credentials must be instance
    private String UserName;
    private String PassWord;

    // here we will generate getter method to get our private variable
    // we have to create getter method in the same class with private variables so it can access them
    public String getUserName(){
        // getter method will return the instance variable
        return UserName;
    }

    // here we will generate setter method to set our private variable: to assign argument to instance variable
    // we have to create getter method in the same class with private variables so it can access them
    public void setUserName(String UserName){
        this.UserName = UserName;
    }

    // getter method for password:
    public String getPassWord(){
        return "*******";
    }

    // setter method for password:
    public void setPassWord(String PassWord){
        this.PassWord = PassWord;
    }






}
