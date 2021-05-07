
public class Customer {
    public static void main(String[] args) {
        //生产宝马320
        FactoryBM320 factoryBM320 = new FactoryBM320();
        //生产对应车的配件
        factoryBM320.createEngine();
        factoryBM320.createAirCondition();
        //生产宝马230
        FactoryBM230 factoryBM230 = new FactoryBM230();
        //生产宝马230的配件
        factoryBM230.createEngine();
        factoryBM230.createAirCondition();
    }
}
