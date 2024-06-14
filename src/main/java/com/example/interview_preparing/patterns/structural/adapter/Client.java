package com.example.interview_preparing.patterns.structural.adapter;

public class Client {

    private final Target target = new Adapter();

    public void doRequest() {
        System.out.println(target.request());
    }
}
