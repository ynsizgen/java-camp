
package Manager;

import Model.Admin;
import Model.Product;
import Service.IAdminService;

public class AdminManager implements IAdminService {
    public AdminManager() {
    }

    public void add(Admin admin) {
        System.out.println("Admin kayıt edildi. : " + admin);
    }

    public void showAmountEarned(Admin admin) {
        System.out.println("Kazanılan toplam para: " + admin.getAmountEarned());
    }

    public void add(Product product) {
        System.out.println(product.getProductName() + " isimli ürün eklendi!");
    }

    public void showAllProducts(Product[] products, Admin admin) {
        admin.setProducts(products);
        System.out.println("Tüm ürünler: ");

        for (Product product:products) {
            System.out.println(product);
        }


    }

    public void changeDiscount(double tutar, Product product, Admin admin) {
        product.setDiscount(tutar);
        System.out.println(product + " indirimli fiyatı değişti. Yeni Tutar: " + product.getDiscount());
    }
}
