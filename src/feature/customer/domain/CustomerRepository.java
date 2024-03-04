package feature.customer.domain;

public interface CustomerRepository {

    void save(Customer customer);

    void delete(String dni);

    Customer obtain(String dni);
}
