package feature.transactions.domain;

public class GetTransactionUseCase {
    TransactionRepository transactionRepository;

    public GetTransactionUseCase(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }
    public void execute(String id){
        transactionRepository.obtain(id);
    }
}
