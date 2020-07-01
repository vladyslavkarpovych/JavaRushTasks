package com.javarush.task.task35.task3512;

public class  Generator<T> {
    public Class<T> classT;

    public Generator(Class<T> classT) {
        this.classT = classT;
    }

    T newInstance() throws IllegalAccessException, InstantiationException {
        return classT.newInstance();
    }
}
