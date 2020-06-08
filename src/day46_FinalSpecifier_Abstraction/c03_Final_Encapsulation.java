package day46_FinalSpecifier_Abstraction;

public class c03_Final_Encapsulation {

    // instance private variables:
   final private int data1 = 200; // can never generate Setter for final variables
    private int data2 = 300;

    // let's generate public getter and setter for variables:

    public int getData1(){
        return data1;
    }

  /*  public void setData1(int data1){
    this.data1 = data1;
    }
*/
    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }
}
