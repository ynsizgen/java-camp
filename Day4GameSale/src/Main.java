import Manager.AdminManager;
import Manager.UserManager;
import Model.Admin;
import Model.Product;
import Model.User;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Product[] products ={};
        Admin admin = new Admin(101,"Engin","Demiroğ","eng@exp.com","1234",0.0, products);
        AdminManager adminManager = new AdminManager();
        System.out.println("1---------------------------------");
        adminManager.add(admin);
        System.out.println("2---------------------------------");
        adminManager.showAmountEarned(admin);

        System.out.println("3---------------------------------");
        Product product1 = new Product(1,"Fifa 2021",400.00,350.00);
        Product product2 = new Product(2,"Mount & Blade",200.00,150.00);
        Product product3 = new Product(3,"World Of Warcraft",300.99,200.00);

        adminManager.add(product1);
        adminManager.add(product2);
        adminManager.add(product3);
        System.out.println("4---------------------------------");
        products= new Product[]{product1, product2, product3};
        adminManager.showAllProducts(products,admin);

        System.out.println("5---------------------------------");
        adminManager.changeDiscount(300,product1,admin);

        System.out.println("6---------------------------------");
        String[] cards={};
        Product[] ownedProducts={};

        User user1 = new User(201,"Yunus","Ün","12345678901",
                "yns@exp.com","1234",cards,LocalDate.of(1993,5,17),ownedProducts,1000.0);

        UserManager userManager = new UserManager();
        userManager.add(user1);

        System.out.println("7---------------------------------");
        user1 = new User(201,"Yunus İzgen","Ün","12345678901",
                "yns@exp.com","1234",cards,LocalDate.of(1993,5,17),ownedProducts,1000.0);
        userManager.update(user1);

        System.out.println("8---------------------------------");
        cards= new String[]{"1234123412341234", "4321432143214321"};
        userManager.updateCardInfo(cards,user1);

        System.out.println("9---------------------------------");
        userManager.showAllProducts(user1,admin);
        userManager.showBalance(user1);

        System.out.println("10---------------------------------");
        Product[] choosenProducts = {product2,product3};
        userManager.buyProduct(choosenProducts,user1);

        System.out.println("11---------------------------------");
        userManager.showOwnedProduct(user1);

        System.out.println("12---------------------------------");
        userManager.showBalance(user1);
        System.out.println(user1);

        System.out.println("13---------------------------------");
        userManager.delete(user1=null);
        System.out.println(user1);
    }
}
