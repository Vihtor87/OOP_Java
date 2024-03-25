import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actors);
    void releaseFromMarket(List<Actor> actors);
    void update();
}
