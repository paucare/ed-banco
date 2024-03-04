package feature.transactions.data;

import feature.transactions.domain.Transaction;
import feature.transactions.domain.TransactionRepository;

import java.util.Map;
import java.util.TreeMap;

public class TransactionDataRepository implements TransactionRepository {
    private static TransactionDataRepository instance = null;
    private Map<String, Transaction> localDataSource = new TreeMap<>();

    public static TransactionDataRepository newInstance() {
        if (instance == null) {
            instance = new TransactionDataRepository();
        }
        return instance;
    }

    @Override
    public void save(Transaction transation) {
        localDataSource.put(transation.id, transation);
    }
    @Override
    public Transaction obtain(String id){
        return localDataSource.get(id);
    }
    public void delete (String id){
        localDataSource.remove(id);
    }
}
