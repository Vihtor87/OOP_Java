public interface QueueBehaviour {
    void takeInQueue(Actor actors);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
