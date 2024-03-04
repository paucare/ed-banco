package feature.transactions.domain;

public interface TransactionRepository {
    void save(Transaction transation);
    Transaction obtain(String id);
    public void delete(String id);
}


