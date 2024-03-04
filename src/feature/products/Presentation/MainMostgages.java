package feature.products.Presentation;

import feature.products.data.MortgagesDataRepository;
import feature.products.domain.GetMortgageUseCase;
import feature.products.domain.Mortgage;
import feature.products.domain.CreateMortgagesUseCase;

public class MainMostgages {
    public void save(Mortgage mortgage) {
        CreateMortgagesUseCase createMortgagesUseCase = new CreateMortgagesUseCase(
                new MortgagesDataRepository());
        createMortgagesUseCase.execute(new Mortgage(
                "1",
                "Hipoteca mixta",
                "Hipoteca con el Euribor",
                "01-01-2022",
                "31-01-2060",
                "1.5",
                "200.000"
        ));
    }

    public static void getMortgage(String code) {
        GetMortgageUseCase getMortgageUseCase = new GetMortgageUseCase(MortgagesDataRepository.newInstance());
        getMortgageUseCase.execute(code);
    }
}
