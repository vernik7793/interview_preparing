package com.example.interview_preparing.patterns.structural.adapter;

public class Adapter implements Target {
    private final Adaptee adaptee = new Adaptee();

    @Override
    public String request() {
        Integer integer = adaptee.specificRequest();
        return integer.toString();
    }
}
