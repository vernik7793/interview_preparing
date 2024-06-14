package com.example.interview_preparing.patterns.structural.proxy;

public class Proxy implements Subject {
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void doSomeThing() {
        System.out.println("before subject");
        subject.doSomeThing();
        System.out.println("after subject");
    }
}
