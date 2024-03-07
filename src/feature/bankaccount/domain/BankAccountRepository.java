package feature.bankaccount.domain;public interface BankAccountRepository {
   void save(BankAccount bankAccount);
   BankAccount obtain(String accountNumber);
}
