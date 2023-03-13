package meatProducts;

import java.time.LocalDate;

public class Fish extends MeatProducts{
    public Fish(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }

    public Fish() {
    }
}
