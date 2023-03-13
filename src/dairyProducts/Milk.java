package dairyProducts;

import java.time.LocalDate;

public class Milk extends DairyProducts {
    public Milk(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }

    public Milk() {
    }
}
