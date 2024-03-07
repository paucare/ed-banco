package feature.bankaccount.data;

import feature.bankaccount.domain.BankAccount;
import feature.bankaccount.domain.BankAccountRepository;
import feature.customer.data.CustomerDataRepository;

import java.util.HashMap;
import java.util.Map;

public class BankAccountDataRepository implements BankAccountRepository {
    public Map<String, BankAccount> bankAccountMap=new HashMap<>();
    public static BankAccountDataRepository instance = null;

    private BankAccountDataRepository(){

    }

    public static BankAccountDataRepository getInstance() {
        if (instance == null) {
            instance = new BankAccountDataRepository();
        }
        return instance;
    }

    @Override
    public void save(BankAccount bankAccount) {
        bankAccountMap.put(bankAccount.AccountNumber,bankAccount);
    }

    @Override
    public BankAccount obtain(String accountNumber) {
       return bankAccountMap.get(accountNumber);
    }
}
