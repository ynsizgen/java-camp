package Service;

import Model.Admin;
import Model.Product;
import Model.User;

public interface IUserService {
    void add(User user);

    void update(User user);

    void updateCardInfo(String[] var1, User user);

    void showAllProducts(User user, Admin admin);

    void buyProduct(Product[] products, User user);

    void showOwnedProduct(User user);

    void changeBalance(User user, double tutar);

    void showBalance(User user);

    void delete(User user);
}