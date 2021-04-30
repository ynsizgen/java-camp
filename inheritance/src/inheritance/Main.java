package inheritance;

public class Main {
    public static void main(String[] args) {
       IndividualCustomer izgen = new IndividualCustomer();
       izgen.customerNumber = "123";

       CorporateCustomer hepsiBurada = new CorporateCustomer();
       hepsiBurada.customerNumber = "456";

       CustomerManager customerManager = new CustomerManager();

       Customer[] customers = {izgen, hepsiBurada};

       customerManager.addMultiple(customers);

    }
}
