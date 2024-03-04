package feature.transactions.domain;

public class DeleteTransactionUseCase {
     public final TransactionRepository transactionRepository;

    public DeleteTransactionUseCase(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;

    }
    public void execute(String id){
        transactionRepository.delete(id);
    }
}
