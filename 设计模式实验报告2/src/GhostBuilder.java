
public class GhostBuilder extends ActorBuilder{
    @Override
    public void buildType() {
        actor.setType("坏人");
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
       actor.setCostume("坏人不配穿衣服");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }
}
