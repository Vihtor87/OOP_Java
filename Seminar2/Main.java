public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Igor");

        Market market1 = new Market();

        market1.acceptToMarket(human1);
        market1.takeInQueue(human1);
        market1.giveOrders();
        market1.takeOrders();
        market1.releaseFromQueue();
        market1.releaseFromMarket(human1);
        market1.update();
    }
}