
public class FactoryBM320 implements AbstractFactory {
    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public AirCondition createAirCondition() {
       return new AirConditionA();
    }
}
