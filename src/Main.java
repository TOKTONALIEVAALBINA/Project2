import dairyProducts.DairyProducts;
import dairyProducts.Milk;
import meatProducts.MeatProducts;
import productStore.Manager;
import productStore.Product;
import productStore.StoreDao;
import productStore.StoreServiceImpl;
import wheatProducts.WheatProducts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<Product>products1 = new ArrayList<>();
        products1.add(new MeatProducts(1, "sausage", "TOIBOSS", LocalDate.of(2023, 4, 22)));
        products1.add(new MeatProducts(2, "sausage", "TOIBOSS", LocalDate.of(2022, 5, 22)));
        products1.add(new MeatProducts(3, "sausage", "TOIBOS", LocalDate.of(2023, 2, 22)));
        products1.add(new DairyProducts(4, "Milk", "MILKA", LocalDate.of(2023, 3, 22)));
        products1.add(new DairyProducts(5, "Milk", "MILKA", LocalDate.of(2022, 4, 22)));
        products1.add(new DairyProducts(6, "Yogurt", "MIILLKKAA", LocalDate.of(2024, 4, 22)));
        products1.add(new WheatProducts(7, "Bread", "NUR", LocalDate.of(2023, 4, 22)));
        products1.add(new WheatProducts(8, "Pasta", "NUR", LocalDate.of(2023, 3, 3)));
        products1.add(new WheatProducts(9, "Breaad", "NUUR", LocalDate.of(2020, 3, 3)));
        products1.add(new MeatProducts(10, "Flour", "NURA", LocalDate.of(2023, 4, 22)));


        StoreServiceImpl storeService = new StoreServiceImpl();
        storeService.addNewProducts(products1);
        System.out.println("**********");
        storeService.sortByDate(products1);
        Manager manager = new Manager();
        storeService.getAllProducts(manager.getLogin(),manager.getPassword(),products1);

    }
}