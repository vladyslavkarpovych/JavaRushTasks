package com.javarush.task.task36.task3601;

import java.util.List;
import java.util.Set;

public class Model {
    private Service service = new Service();

    public List<String> getStringDataList() {
        return service.getData();
    }
}
