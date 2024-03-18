import java.util.List;

public class VendingMachineHotWater implements VendingMachine {

    private final List<Product> productList;
    private int cash;

    public VendingMachineHotWater(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                cash += product.getPrise();
                return product;
            }
        }
        return null;
    }

    public HotWater getProduct(String name, int temperature) {
        for (Product product : productList) {
            if (product instanceof HotWater) {
                if (product.getName().equals(name) && ((HotWater) product).getTemperature() == temperature) {
                    return (HotWater) product;
                }
            }
        }
        return null;
    }
}
