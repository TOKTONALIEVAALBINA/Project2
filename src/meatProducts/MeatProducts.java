package meatProducts;

import productStore.Product;

import java.time.LocalDate;

public class MeatProducts extends Product {
    public MeatProducts(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }

    public MeatProducts() {
    }
}
