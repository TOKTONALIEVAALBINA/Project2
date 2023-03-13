package wheatProducts;

import java.time.LocalDate;

public class Pasta extends WheatProducts{
    public Pasta(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }

    public Pasta() {
    }
}
