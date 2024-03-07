package feature.bankaccount.domain;

public class CreateBankAccountUseCase {
    public final BankAccountRepository bankAccountRepository;

    public CreateBankAccountUseCase(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    public final void execute(BankAccount bankAccount){
        bankAccountRepository.save(bankAccount);
    }
}
