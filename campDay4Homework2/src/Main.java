import Entities.Customer;
import abstracts.BaseCustomerManager;
import concretes.CustomerCheckManager;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {

        LocalDate date = LocalDate.of(1993,5,17);
        Customer customer1 = new Customer(1,"Yunus","Ün",date,"1234567890");

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
        customerManager.save(customer1);
    }
}
