package feature.products.data;

import feature.products.domain.Mortgage;
import feature.products.domain.MortgagesRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class MortgagesDataRepository implements MortgagesRepository {

    private Map<String, Mortgage> dataStore = new TreeMap<>();

    private static MortgagesDataRepository instance = null;

    public static MortgagesDataRepository newInstance() {
        if (instance == null) {
            instance = new MortgagesDataRepository();
        }
        return instance;
    }

    @Override
    public void save(Mortgage mortgage) {
        dataStore.put(mortgage.code, mortgage);
    }

    @Override
    public Mortgage getMortgage(String code) {
        return dataStore.get(code);
    }
}
