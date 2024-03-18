public abstract class Product {

    public Product(String name, int prise) {
        this.name = name;
        this.prise = prise;
    }

    public String name;
    public int prise;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    @Override
    public String toString() {
        return String.format("name: %s, prise: %s", name, prise);
    }

}
