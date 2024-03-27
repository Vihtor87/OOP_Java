import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private final List<Actor> queue;

    public Market(List<Actor> queue) {
        this.queue = queue;
    }

    @Override
    public void acceptToMarket(Actor actors) {
        System.out.println(String.format("%s приходит в магазин", actors));
        queue.add(actors);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        queue.remove(actors);
        System.out.println(actors.getName() + " покинул магазин");
    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Actor actors) {

    }

    @Override
    public void takeOrders() {

    }

    @Override
    public void giveOrders() {

    }

    @Override
    public void releaseFromQueue() {

    }
}
