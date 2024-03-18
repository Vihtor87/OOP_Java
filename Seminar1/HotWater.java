public class HotWater extends Product {

    private int temperature;
    public HotWater(String name, int prise) {
        super(name, prise);
    }

    public HotWater(String name, int prise, int temperature) {
        super(name, prise);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    @Override
    public String toString() {
        return String.format("name: %s, temperature: %s", name, getTemperature());
    }
}
