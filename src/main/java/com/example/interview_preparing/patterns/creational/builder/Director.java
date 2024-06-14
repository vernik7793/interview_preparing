package com.example.interview_preparing.patterns.creational.builder;

public class Director {
    public Object construct() {
        return new CarBuilderImpl()
                .addParktronic("super parktronic")
                .addLight("yellow light")
                .getResult();
    }
}
