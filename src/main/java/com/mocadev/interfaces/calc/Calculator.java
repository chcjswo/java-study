package com.mocadev.interfaces.calc;

public class Calculator implements Calc {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int times(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }

    public void showInfo() {
        System.out.println("Calc 인터페이스를 구현 합니다.");
    }
}
