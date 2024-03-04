package feature.products.domain;

public class GetMortgageUseCase {
    private MortgagesRepository mortgagesRepository;

    public GetMortgageUseCase(MortgagesRepository mortgagesRepository) {
        this.mortgagesRepository = mortgagesRepository;
    }

    public Mortgage execute (String code) {
        return mortgagesRepository.getMortgage(code);
    }


}
