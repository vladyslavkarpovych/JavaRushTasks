package com.javarush.task.task36.task3609;

public class CarController {
    private CarModel model;
    private SpeedometerView view;

    public CarController(CarModel model, SpeedometerView view) {
        this.model = model;
        this.view = view;
    }

    public void increaseSpeed(int seconds) {
        if (model.getSpeed() < model.getMaxSpeed()) {
            int speed = model.getSpeed();
            speed += (3.5 * seconds);
            model.setSpeed(speed);
        }
        if (model.getSpeed() > model.getMaxSpeed()) {
            model.setSpeed(model.getMaxSpeed());
        }

    }

    public void decreaseSpeed(int seconds) {
        if (model.getMaxSpeed() > 0) {
            int speed = model.getSpeed();
            speed -= (12 * seconds);
            model.setSpeed(speed);
        }
        if (model.getSpeed() < 0) {
            model.setSpeed(0);
        }

    }

    public String getCarBrand() {
        return model.getBrand();
    }

    public String getCarModel() {
        return model.getModel();
    }

    public void setCarSpeed(int speed) {
        model.setSpeed(speed);
    }

    public int getCarSpeed() {
        return model.getSpeed();
    }

    public int getCarMaxSpeed() {
        return model.getMaxSpeed();
    }

    public void updateView() {
        view.printCarDetails(getCarBrand(), getCarModel(), getCarSpeed());
    }
}