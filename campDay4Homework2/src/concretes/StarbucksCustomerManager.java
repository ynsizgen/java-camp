package concretes;

import Entities.Customer;
import abstracts.BaseCustomerManager;
import abstracts.ICustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private final ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        if(customerCheckService.CheckIdRealPerson(customer)) {
            super.save(customer);
        }else {
            throw new Exception("Not a valid person");
        }

    }

    private void CheckIdRealPerson(Customer customer) {

    }
}
