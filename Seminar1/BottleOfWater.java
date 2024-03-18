public class BottleOfWater extends Product {

    private int volume;
    public BottleOfWater(String name, int prise) {
        super(name, prise);
    }
    public BottleOfWater(String name, int prise, int volume) {
        super(name, prise);
        this.volume = volume;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("name: %s, volume: %s", name, getVolume());
    }
}
