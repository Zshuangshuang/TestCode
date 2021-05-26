
public class Main {
    public static void main(String[] args) {
        Investor investor1 = new ConcreteInvestor("杨过");
        Investor investor2 = new ConcreteInvestor("小龙女");
        Stock stock = new Stock("青岛海尔",0.0);
        stock.attach(investor1);
        stock.attach(investor2);
        stock.setPrice(25.0);
    }
}
