package feature.products.domain;

public interface MortgagesRepository {
    void save(Mortgage mortgage);

    public Mortgage getMortgage (String code);

}
