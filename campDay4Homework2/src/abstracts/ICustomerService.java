package abstracts;

import Entities.Customer;

public interface ICustomerService {
    void save(Customer customer) throws Exception;
}
