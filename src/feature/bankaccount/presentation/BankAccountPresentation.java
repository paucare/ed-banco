package feature.bankaccount.presentation;

import feature.bankaccount.data.BankAccountDataRepository;
import feature.bankaccount.domain.*;
import feature.customer.data.CustomerDataRepository;
import feature.customer.domain.Customer;
import feature.customer.domain.GetCustomerUseCase;
import feature.customer.presentation.CustomerPresentation;
import feature.transactions.domain.Transaction;

import java.security.GeneralSecurityException;
import java.util.ArrayList;

public class BankAccountPresentation {
    public static void save(BankAccount bankAccount) {
        CreateBankAccountUseCase createBankAccountUseCase = new CreateBankAccountUseCase(BankAccountDataRepository.getInstance());
        createBankAccountUseCase.execute(bankAccount);
    }

    public static BankAccount obtain(String accountNumber) {
        GetBankAccountUseCase getBankAccountUseCase
                = new GetBankAccountUseCase(BankAccountDataRepository.getInstance());
        BankAccount bankAccount = getBankAccountUseCase.execute(accountNumber);

        System.out.println(bankAccount);

        return bankAccount;
    }

    public static void addTransaction(String accountNumber, Transaction transaction) {
        AddTransactionInBankAccountUseCase useCase
                = new AddTransactionInBankAccountUseCase(BankAccountDataRepository.getInstance());
        useCase.execute(accountNumber, transaction);

        GetBankAccountUseCase getBankAccountUseCase
                = new GetBankAccountUseCase(BankAccountDataRepository.getInstance());
        BankAccount bankAccount = getBankAccountUseCase.execute("1");
        System.out.println(bankAccount);
    }
}
