package feature.transactions.domain;

public class SaveTransactionUseCase {
    public final TransactionRepository transactionRepository;

    public SaveTransactionUseCase(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public void execute(Transaction transaction) {
        this.transactionRepository.save(transaction);
    }
}
