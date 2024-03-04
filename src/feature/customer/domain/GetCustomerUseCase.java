package feature.customer.domain;

import java.util.ArrayList;

public class GetCustomerUseCase {

    private CustomerRepository customerRepository;

    public GetCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;

    }

    public Customer execute(String dni){
       return customerRepository.obtain(dni);
    }

}
