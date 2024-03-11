package feature.demo.data.local;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import feature.demo.domain.Demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;

public class DemoMemDataSource {

    private static DemoMemDataSource instance = null;

    private Map<String, Demo> dataStore = new TreeMap<>();

    private DemoMemDataSource() {

    }

    public void save(Demo model) {
        dataStore.put(model.getId(), model);
    }

    public void saveList(List<Demo> models) {
        for (Demo demo : models) {
            save(demo);
        }
    }

    public Demo findById(String id) {
        return dataStore.get(id);
    }

    public List<Demo> findAll() {
        return dataStore.values().stream().toList();
    }

    public void delete(String modelId) {
        dataStore.remove(modelId);
    }

    public static DemoMemDataSource getInstance() {
        if (instance == null) {
            instance = new DemoMemDataSource();
        }
        return instance;
    }
}
