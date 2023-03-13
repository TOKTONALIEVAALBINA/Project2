package dairyProducts;

import productStore.Product;

import java.time.LocalDate;

public class DairyProducts extends Product {
    public DairyProducts(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }

    public DairyProducts() {
    }
}
