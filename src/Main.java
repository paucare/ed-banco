import feature.bankaccount.domain.BankAccount;
import feature.bankaccount.presentation.BankAccountPresentation;
import feature.customer.domain.Customer;
import feature.customer.presentation.CustomerPresentation;
import feature.transactions.domain.Transaction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Crear un cliente
        createCustomer();

        //Crear cuenta bancaria
        createBankAccount();

        //Añadir una transacción
        addTransaction();
    }

    private static void createCustomer() {
        Customer customer = new Customer("1", "Name1", "Apellido1", "Dir1", "Pob1", "Cp1");
        CustomerPresentation.save(customer);
    }

    private static void createBankAccount() {
        Customer customer = CustomerPresentation.obtain("1");

        BankAccount bankAccount =
                new BankAccount("1", "0", new ArrayList<>(), customer);

        BankAccountPresentation.save(bankAccount);
    }

    private static void addTransaction(){
        BankAccountPresentation.addTransaction(
                "1", new Transaction("1", "Compra Mercadona", "12"));

    }

}