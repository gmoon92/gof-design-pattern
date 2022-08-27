package com.gmoon.designpatterns.behavioral.command.receiver;

public class Light {

    public void on() {
        System.out.println("불을 켭니다.");
    }

    public void off() {
        System.out.println("불을 끕니다.");
    }
}
