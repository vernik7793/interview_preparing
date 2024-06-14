package com.example.interview_preparing.patterns.creational.builder;

public class CarBuilderImpl implements CarBuilder {

    private Car car;

    public CarBuilderImpl() {
        this.car = new Car();
    }


    @Override
    public CarBuilder addParktronic(String parktronic) {
        car.setParktronic(parktronic);
        return this;
    }

    @Override
    public CarBuilder addLight(String light) {
        car.setLight(light);
        return this;
    }

    public Car getResult() {
        return car;
    }
}
