package com.mocadev.abstractcar;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("=========== AI Car ============");
        Car aiCar = new AICar();
        aiCar.run();

        System.out.println("=========== 사람이 운전하는 자동차 ============");
        Car myCar = new ManualCar();
        myCar.run();
    }
}
