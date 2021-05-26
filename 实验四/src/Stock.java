import java.util.ArrayList;

public class Stock {
    private ArrayList<Investor> investors;
    private String stockName;
    private double price;
    public Stock(String stockName,double price){
        this.stockName = stockName;
        this.price = price;
        investors = new ArrayList<Investor>();
    }
    public void attach(Investor investor){
        investors.add(investor);
    }
    public void detach(Investor investor){
        investors.remove(investor);
    }
    public void setStockName(String stockName){
        this.stockName = stockName;
    }
    public String getStockName(){
        return stockName;
    }
    public void setPrice(double price){
        double range = Math.abs(price-this.price)/this.price;
        this.price = price;
        if (range >= 0.05){
            this.notifyInvestor();
        }
    }

    public double getPrice() {
        return price;
    }
    public void notifyInvestor(){
        for (Investor investor : investors){
            investor.response(this);
        }
    }
}
