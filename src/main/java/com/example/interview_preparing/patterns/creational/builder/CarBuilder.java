package com.example.interview_preparing.patterns.creational.builder;

public interface CarBuilder {
    CarBuilder addParktronic(String parktronic);
    CarBuilder addLight(String light);
    Car getResult();
}
