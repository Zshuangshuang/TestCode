
public class ActorController {
    public Actor construct(ActorBuilder actorBuilder){
        Actor actor =  actorBuilder.createActor();
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildHairstyle();
        actorBuilder.buildCostume();
        return actor;
    }
}
