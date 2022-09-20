package com.mocadev.fastcampus.functional.supplier;

import java.util.function.Supplier;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-03
 **/
public class Main {

    public static void main(String[] args) {
        Supplier<Double> supplier = Math::random;
        printRandom(supplier, 10);
    }

    private static void printRandom(Supplier<Double> supplier, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("supplier = " + supplier.get());
        }
    }
}
