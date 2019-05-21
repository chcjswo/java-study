package com.mocadev.abstractcar;

public class AICar extends Car {
    @Override
    public void drive() {
        System.out.println("AI Drive");
        System.out.println("자동차가 알아서 방향을 바꿉니다.");
    }

    @Override
    public void stop() {
        System.out.println("스스로 멈춥니다.");
    }
}
