package feature.bankaccount.domain;

public class GetBankAccountUseCase {
    private BankAccountRepository bankAccountRepository;

    public GetBankAccountUseCase (BankAccountRepository bankAccountRepository){
        this.bankAccountRepository = bankAccountRepository;
    }

    public BankAccount execute(String accountNumber){
        return this.bankAccountRepository.obtain(accountNumber);
    }


}
