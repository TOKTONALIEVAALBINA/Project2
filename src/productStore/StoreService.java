package productStore;

import dairyProducts.DairyProducts;
import meatProducts.MeatProducts;

import java.util.List;

public interface StoreService {
    void addNewProducts(List<Product> products);

    void sortByDate(List<Product> products);

    void getAllProducts(String login,int password ,List<Product>productList);
}
