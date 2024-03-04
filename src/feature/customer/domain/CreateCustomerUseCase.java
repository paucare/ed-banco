package feature.customer.domain;

public class CreateCustomerUseCase {

    public final CustomerRepository customerRepository;

    public CreateCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public final void execute(Customer customer){
        customerRepository.save(customer);
    }
}
