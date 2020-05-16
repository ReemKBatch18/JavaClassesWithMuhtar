package Tasks.Replits;
/*
Write a class named Accumulator containing:
An instance variable named sum of type integer.
A constructor that accepts an integer parameter,
whose value is used to initialize the sum instance variable.
A method named getSum that returns the value of sum.
A method named add that accepts an integer parameter.
The value of sum is increased by the value of the parameter.
A method named remove that accepts an integer parameter.
The value of sum is decreased by the value of the parameter.
Override a toString method so it returns 'Sum is: X' where X is the sum instance variable.
 */
public class Accumulator {
    //An instance variable named sum of type integer.
    int sum;

    //A constructor that accepts an integer parameter,
    //whose value is used to initialize the sum instance variable.
    public Accumulator(int sum){
        this.sum = sum;
    }

    //A method named getSum that returns the value of sum.
    public int getSum(){
        return sum;
    }

    //A method named add that accepts an integer parameter.
    //The value of sum is increased by the value of the parameter.
    public void add(int a){
        sum += a;
    }

    //A method named remove that accepts an integer parameter.
    //The value of sum is decreased by the value of the parameter.
    public void remove(int b){
        sum -= b;
    }

    //Override a toString method so it returns 'Sum is: X' where X is the sum instance variable
    public String toString () {
        return "Sum is: " + sum;
    }



}
