package com.mocadev.fastcampus.functional.lambda;

import java.util.function.Function;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-03
 **/
public class Adder implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer x) {
        return x + 10;
    }
}
