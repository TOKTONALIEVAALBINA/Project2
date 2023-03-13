package meatProducts;

import java.time.LocalDate;

public class Sausage extends MeatProducts{
    public Sausage(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }

    public Sausage() {
    }
}
