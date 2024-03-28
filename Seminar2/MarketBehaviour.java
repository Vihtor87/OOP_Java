import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actors);
    void releaseFromMarket(Actor actors);
    void update();
}
