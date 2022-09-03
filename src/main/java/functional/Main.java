package functional;

import functional.util.Adder;

import java.util.function.Function;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-03
 **/
public class Main {

    public static void main(String[] args) {
        Function<Integer, Integer> adder = new Adder();
        final Integer result = adder.apply(10);
        System.out.println("result = " + result);
    }
}
