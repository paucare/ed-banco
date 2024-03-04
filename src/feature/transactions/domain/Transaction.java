package feature.transactions.domain;

public class Transaction {
    public final String id;
    public final String description;
    private final String amount;

    public Transaction(String id, String description, String amount) {
        this.id = id;
        this.description = description;
        this.amount = amount;
    }
}
