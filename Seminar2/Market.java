import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehaviour, QueueBehaviour {

    List<Actor> queue = new LinkedList<>();
    Queue<Actor> actorsQueue = new ArrayDeque<>();

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(String.format("%s приходит в магазин", actor.getName()));
        queue.add(actor);
    }

    @Override
    public void releaseFromMarket(Actor actors) {
        queue.remove(actors);
        System.out.println(String.format("%s покинул магазин", actors.getName()));
    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Actor actors) {
        actorsQueue.add(actors);
        System.out.println(String.format("%s встал в очередь", actors.getName()));
    }

    @Override
    public void takeOrders() {
        actorsQueue.peek().isTakeOrder();
        System.out.println(String.format("%s забрал заказ", actorsQueue.peek().getName()));
    }

    @Override
    public void giveOrders() {
        actorsQueue.peek().isMakeOrder();
        System.out.println(String.format("%s сделал заказ", actorsQueue.peek().getName()));
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(String.format("%s покинул очередь", actorsQueue.peek().getName()));
        actorsQueue.poll();
    }
}
