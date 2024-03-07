package feature.customer.presentation;

import feature.customer.data.CustomerDataRepository;
import feature.customer.domain.CreateCustomerUseCase;
import feature.customer.domain.Customer;
import feature.customer.domain.DeleteCustomerUseCase;
import feature.customer.domain.GetCustomerUseCase;

public class CustomerPresentation {

    public static void save(Customer customer) {
        CreateCustomerUseCase createCustomerUseCase = new CreateCustomerUseCase(CustomerDataRepository.getInstance());
        createCustomerUseCase.execute(customer);
    }

    public static void deleteCustomer(String dni) {
        DeleteCustomerUseCase deleteCustomerUseCase = new DeleteCustomerUseCase(CustomerDataRepository.getInstance());
        deleteCustomerUseCase.execute(dni);
    }

    public static Customer obtain(String dni) {
        GetCustomerUseCase getCustomerUseCase = new GetCustomerUseCase(CustomerDataRepository.getInstance());
        Customer customer = getCustomerUseCase.execute(dni);
        System.out.println(customer.dni);
        return customer;
    }
}
