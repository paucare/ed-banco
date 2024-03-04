package feature.products.domain;

public class Card extends BankProducts{

    private String cardNumber;
    private String expirationDate;

    public Card(String code, String name, String descriptin, String cardNumber, String expirationDate) {
        super(code, name, descriptin);
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
