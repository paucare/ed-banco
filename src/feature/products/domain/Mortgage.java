package feature.products.domain;

public class Mortgage extends BankProducts{

    public final String initDate;
    public final String endDate;
    public final String interests;
    public final String amount;

    public Mortgage(String code, String name, String descriptin, String initDate, String endDate, String interests, String amount) {
        super(code, name, descriptin);
        this.initDate = initDate;
        this.endDate = endDate;
        this.interests = interests;
        this.amount = amount;
    }
}
