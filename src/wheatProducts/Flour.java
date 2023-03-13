package wheatProducts;

import java.time.LocalDate;

public class Flour extends WheatProducts{
    public Flour(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }

    public Flour() {
    }
}
