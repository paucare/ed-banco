package feature.bankaccount.domain;

import feature.customer.domain.Customer;
import feature.transactions.domain.Transaction;

import java.util.ArrayList;

public class BankAccount {
    public final String AccountNumber;
    public final String Saldo;
    public final ArrayList<Transaction> transactions;

    public final Customer customer;

    public BankAccount(String accountNumber, String saldo, ArrayList<Transaction> transactions, Customer customer) {
        AccountNumber = accountNumber;
        Saldo = saldo;
        this.transactions = transactions;
        this.customer = customer;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public String getSaldo() {
        return Saldo;
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

}
