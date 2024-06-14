package com.example.interview_preparing.patterns.structural.proxy;

public class Client {
    Subject subject = new Proxy(new SubjectImpl());

    public void call() {
        Subject subject = new Proxy(new SubjectImpl());
        subject.doSomeThing();
    }
}
