package Tasks.Replits;
/*
c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
it returns a string value that can be "profit","loss","no loss"
for example:
c_profis(100,1500)
returns : "profit"
c_profis(20,5)
returns : "loss"
c_profis(100,100)
returns : "no loss"
 */
public class Rep_159_Methods_wReturns_ProfitOrLoss {
    public static void main(String[] args) {
        // Now we can try our method
        System.out.println( c_profits(100,100));

    }

    public static String c_profits (int buyPrice,int sellPrice){
        //your code here
        if (sellPrice > buyPrice ){
            return "profit";
        }else if (sellPrice < buyPrice){
            return "loss";
        }else{
            return "no loss";
        }



    }
}
