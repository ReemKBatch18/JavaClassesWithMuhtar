package day50_Polymorphism.OOP_Review;
    /*
    Encapsulation:
                * hiding data by using PRIVATE ACCESS MODIFIER
                * Uses PUBLIC getter/setter to read and modify the private data
                * purpose of getter is to return the value of the data
                * setter to modify the data we have for the private data..> pass argument
                * if the private data is final ==> can not generate setter ==> can only generate getter

     */
public class Encapsulation {
  private String userName ="cybertek";
  // getter: must be public to be accessed and called
  // can't declare getter as static because it can't then use the instance variable (private data) unless we create the object
    public String getUserName(){
      return userName;
  }
  // setter: must be PUBLIC
        public void setUserName(String userName){
        this.userName = userName;
        }
    // access modifier by default is DEFAULT: only accessible in same package
    // in order to hide data ==> give PRIVATE access modifier ==> NO ACCESS outside this class
    //to access it outside class ==> we use getter method

}

class Test{
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
    //    System.out.println(obj.userName);
        System.out.println(obj.getUserName());

        obj.setUserName("mit");
        System.out.println(obj.getUserName());

    }
}
