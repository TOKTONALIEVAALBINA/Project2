package dairyProducts;

import java.time.LocalDate;

public class Yogurt extends DairyProducts {
    public Yogurt(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }

    public Yogurt() {
    }
}
