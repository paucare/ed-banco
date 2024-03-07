package feature.bankaccount.domain;

import feature.bankaccount.presentation.BankAccountPresentation;
import feature.transactions.domain.Transaction;

public class AddTransactionInBankAccountUseCase {

    private BankAccountRepository bankAccountRepository;


    public AddTransactionInBankAccountUseCase(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    public void execute(String bankAccountId, Transaction transaction) {
        BankAccount bankAccount = bankAccountRepository.obtain(bankAccountId);
        bankAccount.addTransaction(transaction);
        bankAccountRepository.save(bankAccount);
    }
}
