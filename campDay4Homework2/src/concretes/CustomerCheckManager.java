package concretes;

import Entities.Customer;
import abstracts.ICustomerCheckService;

public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public boolean CheckIdRealPerson(Customer customer) {
        return true;
    }
}
