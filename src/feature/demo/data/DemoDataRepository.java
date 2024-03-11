package feature.demo.data;

import feature.demo.data.local.DemoMemDataSource;
import feature.demo.domain.Demo;

public class DemoDataRepository {

    private DemoMemDataSource demoMemDataSource;

    public DemoDataRepository(DemoMemDataSource demoMemDataSource) {
        this.demoMemDataSource = demoMemDataSource;
    }

    public void saveDemo(Demo demo) {
        demoMemDataSource.save(demo);
    }

    public Demo getDemo(String id){
        return demoMemDataSource.findById(id);
    }
}
