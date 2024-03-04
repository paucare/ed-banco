package feature.transactions.presentation;

import feature.transactions.data.TransactionDataRepository;
import feature.transactions.domain.DeleteTransactionUseCase;
import feature.transactions.domain.GetTransactionUseCase;
import feature.transactions.domain.SaveTransactionUseCase;
import feature.transactions.domain.Transaction;

public class MainTransaction {
    public static void save(Transaction transaction) {
        SaveTransactionUseCase saveTransactionUseCase = new SaveTransactionUseCase(TransactionDataRepository.newInstance());
        saveTransactionUseCase.execute(transaction);
    }
    public static void obtain(String id){
        GetTransactionUseCase getTransactionUseCase = new GetTransactionUseCase(TransactionDataRepository.newInstance());
        getTransactionUseCase.execute(id);
    }

    public static void delete(String id){
        DeleteTransactionUseCase useCase = new DeleteTransactionUseCase(
                new TransactionDataRepository());
        useCase.execute(id);
    }
}
