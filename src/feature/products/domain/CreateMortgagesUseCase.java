package feature.products.domain;

public class CreateMortgagesUseCase {

    private MortgagesRepository morgagesRepository;

    public CreateMortgagesUseCase(MortgagesRepository morgagesRepository){
        this.morgagesRepository = morgagesRepository;

    }

    public void execute(Mortgage mortgage){
       morgagesRepository.save(mortgage);
    }
}
