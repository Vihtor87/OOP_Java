import java.util.List;

public class VendingMachineForBottleOfWater implements VendingMachine {

    private final List<Product> productList;
    private int cash;

    public VendingMachineForBottleOfWater(List<Product> productList) {
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

    public BottleOfWater getProduct(String name, int volume) {
        for (Product product : productList) {
            if (product instanceof BottleOfWater) {
                if (product.getName().equals(name) && ((BottleOfWater) product).getVolume() == volume) {
                    return (BottleOfWater) product;
                }
            }
        }
        return null;
    }
}
