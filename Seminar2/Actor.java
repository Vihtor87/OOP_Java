public abstract class Actor implements ActorBehaviour{
    protected final String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    public abstract String getName();

    public Actor(String name) {
        this.name = name;
    }

}
