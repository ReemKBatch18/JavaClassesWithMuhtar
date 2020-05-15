package day40_Encapsulation;

public class c05_Person {

    public String name;

    private long SSN;
    private int ID;

    public c05_Person(String name){
        // how can we initialize this name we're passing to the instance variable?
        // by using this.instanceVariable = localVariable
        this.name = name;
    }


    // we need to generate getter to return SSN:
    // preferred name is getVariableName()
    // better to be public access modifier (so it can be used in other packages)
    // Return type MUST match our instance variable type:
         public long getSSN(){
        return SSN;
    }


    // we ned to generate setter to set SSN:
    // preferred name is setVariableName()
    // better to be public access modifier to be used everywhere
    // return type is void because we are not returning anything
    // we must pass an argument (parameter)
    // argument dataType MUST match private instance variable dataType: long here
         public void setSSN(long SSN){
        this.SSN = SSN;
    }

    // Now we need to repeat the same steps above
    // to generate getter and setter method to return ID:
    public int getID() {
        return ID;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    // Here I will create a setter for both variables SSN , ID
    // it's not recommended because I will have set both always at the same time
    public void setSSNAndID(long SSN, int ID){
        // here I can call the two setter methods:
        setSSN(SSN);
        setID(ID);
        //or:
        //this.SSN = SSN;
        // this.ID = ID;
    }





}
