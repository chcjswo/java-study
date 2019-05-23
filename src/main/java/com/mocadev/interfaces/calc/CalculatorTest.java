package com.mocadev.interfaces.calc;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        Calculator c = new Calculator();
        System.out.println(c.add(num1, num2));
        System.out.println(c.sub(num1, num2));
        System.out.println(c.times(num1, num2));
        System.out.println(c.divide(num1, num2));
        c.showInfo();
    }
}
