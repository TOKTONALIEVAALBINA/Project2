package productStore;
import java.util.ArrayList;
import java.util.List;

public class StoreDao {


    private List<Product> products = new ArrayList<>();


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
