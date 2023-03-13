package productStore;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class StoreServiceImpl implements StoreService {
    public StoreServiceImpl() {
        super();
    }

    StoreDao storeDao = new StoreDao();
    Manager manager = new Manager();



    @Override
    public void addNewProducts(List<Product> products) {
        List<Product> meatProducts = products.stream().filter(x -> x.getCompanyName().equals("TOIBOSS")).
                filter(z -> z.getDate().isAfter(LocalDate.now().plusDays(30))).toList();
        List<Product> dairyProducts = products.stream().filter(x -> x.getCompanyName().equals("MILKA"))
                .filter(z -> z.getDate().isAfter(LocalDate.now().plusDays(30))).toList();
        List<Product> wheatProducts = products.stream().filter(x -> x.getCompanyName().equals("NUR"))
                .filter(z -> z.getDate().isAfter(LocalDate.now().plusDays(30))).toList();
        meatProducts.forEach(System.out::println);
        dairyProducts.forEach(System.out::println);
        wheatProducts.forEach(System.out::println);

    }


    @Override
    public void sortByDate(List<Product> products) {
        products.removeIf(product -> product.getDate().isBefore(LocalDate.now()));
        List<Product> productList = products.stream().filter(x -> x.getCompanyName().equals("TOIBOSS")
                || x.getCompanyName().equals("MILKA")
                || x.getCompanyName().equals("NUR")).filter(y -> y.getDate().isAfter(LocalDate.now().plusDays(7))).toList();
        productList.forEach(product -> storeDao.getProducts().add(product));

        System.out.println("discount");
        storeDao.getProducts().forEach(System.out::println);


    }

    @Override
    public void getAllProducts(String login, int password, List<Product> products) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Write login : ");
        String login1 = myScanner.nextLine();
        System.out.println("write password : ");
        int password1 = myScanner.nextInt();
        if (login1.equals(manager.getLogin() &&
                password1 == manager.getPassword())) {

            System.out.println(storeDao.getProducts());


        }
    }
}
