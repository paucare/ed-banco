package feature.products.domain;

public class FixedTerm extends BankProducts{

    private String durtoinMonths;
    private String interestsAplly;

    public FixedTerm(String code, String name, String descriptin, String durtoinMonths, String interestsAplly) {
        super(code, name, descriptin);
        this.durtoinMonths = durtoinMonths;
        this.interestsAplly = interestsAplly;
    }

    public String getDurtoinMonths() {
        return durtoinMonths;
    }

    public void setDurtoinMonths(String durtoinMonths) {
        this.durtoinMonths = durtoinMonths;
    }

    public String getInterestsAplly() {
        return interestsAplly;
    }

    public void setInterestsAplly(String interestsAplly) {
        this.interestsAplly = interestsAplly;
    }
}
