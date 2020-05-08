package Tasks.Replits;

import java.util.Scanner;

/*
max function gets two ints, x and y.
x is the test case, y is what we test against.
if  x is bigger then y return y
in any other case return x.
for example:
max(1,10)
returns 1
max(11,5)
returns 5
 */
public class Rep_157_Methods_Return2max {
    public static int max (int x,int  y){
        int num;
      if (x > y){
        num = y;
      }else{
          num = x;
      }
       return num;
    }


}
