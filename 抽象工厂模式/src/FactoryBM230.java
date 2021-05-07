
public class FactoryBM230 implements AbstractFactory{
    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public AirCondition createAirCondition() {
        return new AirConditionB();
    }
}
