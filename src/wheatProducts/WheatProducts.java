package wheatProducts;

import productStore.Product;

import java.time.LocalDate;

public class WheatProducts extends Product {
    public WheatProducts(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }

    public WheatProducts() {
    }
}
