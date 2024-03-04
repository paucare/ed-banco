package feature.customer.domain;

public class DeleteCustomerUseCase {
    private CustomerRepository customerRepository;

    public DeleteCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public void execute(String dni) {
        customerRepository.delete(dni);
    }
}
