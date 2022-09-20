package com.mocadev.fastcampus.stream.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-09
 **/
public class Main {
    public static void main(String[] args) {
        final List<Integer> integers = Arrays.asList(3, 3, 7, 4, 7, 5);
        final List<Integer> collect = integers.stream().distinct().collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}
