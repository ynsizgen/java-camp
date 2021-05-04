
package Service;

import Model.Admin;
import Model.Product;

public interface IAdminService {
    void add(Admin admin);

    void showAmountEarned(Admin admin);

    void add(Product product);

    void showAllProducts(Product[] products, Admin admin);

    void changeDiscount(double tutar, Product product, Admin admin);
}
