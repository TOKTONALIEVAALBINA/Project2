package wheatProducts;

import java.time.LocalDate;

public class Bread extends WheatProducts{
    public Bread(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }

    public Bread() {
    }
}
