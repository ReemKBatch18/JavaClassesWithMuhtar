package Tasks.Replits;
/*
isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.
for example:
isEven(1) --> false
isEven(8) --> true
 */
public class Rep_158_MethodsReturn3_isEven {
    public static boolean isEven(int n){
        Boolean result;

        if (n % 2 == 0){
             result = true;
        }else {
            result = false;
        }

        return result;
    }
}
