
public class HeroBuilder extends ActorBuilder{
    @Override
    public void buildType() {
        actor.setType("英雄");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("就那样吧");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("风衣");
    }

    @Override
    public void buildHairstyle() {
       actor.setHairstyle("短发");
    }
}
