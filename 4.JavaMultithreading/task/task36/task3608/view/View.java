package com.javarush.task.task36.task3608.view;


import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;

/**
 * Created by Dmitry on 20.03.2016.
 */
public interface View
{
    void refresh(ModelData modelData);
    void setController(Controller controller);
}
