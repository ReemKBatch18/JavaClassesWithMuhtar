package Tasks.Replits;


public class Stock {

    String tickerSymbol;
    String companyName;
    int price;
    double percentChange;
    int totalShares;
    long marketCap;

    public Stock(String tickerSymbol, String companyName, int price, int totalShares){
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
    }

    public void marketCap(){
        this.marketCap = totalShares*price;
    }
    public void adjustPrice(int value){
        this.price += value;
    }

}
