package Manager;

import Model.Admin;
import Model.Product;
import Model.User;
import Service.IUserCheckService;
import Service.IUserService;
import java.io.PrintStream;

public class UserManager implements IUserService, IUserCheckService {
    public UserManager() {
    }

    public void add(User user) {
        if (!this.checkIfRealPerson(user)) {
            System.out.println("Hatalı tc");
        } else {
            System.out.println("User kayıt edildi. : " + user);
        }

    }

    public void update(User user) {
        System.out.println("User güncellendi. : " + user);
    }

    public void updateCardInfo(String[] cards, User user) {
        user.setCards(cards);
        System.out.println("Card info değiştirildi. " + user);
    }

    public void showAllProducts(User user, Admin admin) {
        Product[] products = admin.getProducts();
        System.out.println("Satışta ki ürünler");
        for (Product product:products) {
            System.out.println(product);
        }

    }

    public void buyProduct(Product[] products, User user) {
        user.setOwnedProducts(products);
        System.out.println("Tebrikler ürünleri satın aldınız. :");

        for (Product product:products) {
            System.out.println(product.getProductName()+" "+product.getDiscount());
            changeBalance(user, product.getDiscount());
        }

    }
    public void showOwnedProduct(User user) {
        System.out.println("Satın alınan ürünler: ");
        Product[] products = user.getOwnedProducts();

        for (Product product:products) {
            System.out.println(product);
        }

    }
    public void changeBalance(User user, double tutar) {
        double temp = user.getBalance() - tutar;
        user.setBalance(temp);
    }

    public void showBalance(User user) {
        System.out.println("Bakiye: " + user.getBalance());
    }

    public void delete(User user) {
        System.out.println("User silindi. " + user);
    }

    public boolean checkIfRealPerson(User user) {
        int nationalityNumberLength = user.getNationalityId().length();
        return nationalityNumberLength == 11;
    }
}