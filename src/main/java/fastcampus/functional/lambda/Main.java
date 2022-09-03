package fastcampus.functional.lambda;

import java.util.function.BiFunction;
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

        final Function<Integer, Integer> function = (Integer x) -> x + 10;
        final Integer apply = function.apply(12);
        System.out.println("apply = " + apply);

        BiFunction<Integer, Integer, Integer> add = Integer::sum;
        final Integer addResult = add.apply(1, 2);
        System.out.println("addResult = " + addResult);
    }
}
