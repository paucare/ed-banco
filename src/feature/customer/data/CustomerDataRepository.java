package feature.customer.data;

import feature.customer.domain.Customer;
import feature.customer.domain.CustomerRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CustomerDataRepository implements CustomerRepository   {

    public final Map<String, Customer> customerMap = new HashMap<>();

    public static CustomerDataRepository instance = null;

    public static CustomerDataRepository getInstance() {
        if (instance == null) {
            instance = new CustomerDataRepository();
        }
        return instance;
    }

    @Override
    public void save(Customer customer) {
        customerMap.put(customer.dni, customer);

    }

    @Override
    public void delete(String dni) {
        customerMap.remove(dni);
    }

    @Override
    public Customer obtain(String dni) {
        return customerMap.get(dni);
    }
}
