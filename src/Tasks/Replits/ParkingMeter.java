package Tasks.Replits;
/*
Write a class named ParkingMeter containing:
Two instance variables named timeLeft and maxTime of type int. The value of timeLeft should be initialized to 0.
A constructor accepting a single integer parameter whose value is used to initialize the maxTime instance variable.
A method named add that accepts an integer parameter. If the value of the parameter is equal to 25, the value of timeLeft is increased by 30;
    otherwise no increase is performed. Furthermore, the increase occurs only if the value of timeLeft will not exceed the value of maxTime.
    add returns a boolean value: true if timeLeft was increase, false otherwise.
A method named tick that accepts no parameters and returns no value.
    tick decreases the value of timeLeft by 1, but only if the value of timeLeft is greater than 0.
A method named isExpired that accepts no parameters.
    isExpired returns a boolean value: true if the value of timeLeft is equal to 0; false otherwise.
 */
public class ParkingMeter {
    int timeLeft = 0 ;
    int maxTime;

    public ParkingMeter(int maxTime){
        this.maxTime = maxTime;
    }

    public boolean add(int a){
        if (a == 25 & (a + timeLeft)<= maxTime){
            timeLeft += 30;
            return true;
        }else{
            timeLeft = timeLeft;
        }
        return false;
    }

    public void tick(){
        if(timeLeft > 0){
            timeLeft = timeLeft -1;
        }
    }

    public boolean isExpired(){
        if (timeLeft == 0 ){
            return true;
        }
        return false;
    }
/*
  public boolean add(int x) {
    boolean result = false;
    if(x == 25 && (timeLeft+25) <= maxTime) {
      timeLeft+=25;
      result = true;
    }
    return result;
  }
  public void tick() {if(timeLeft>0) {timeLeft-=1;}}
  public boolean isExpired() {return (timeLeft==0) ? true : false;}
}
 */


}
