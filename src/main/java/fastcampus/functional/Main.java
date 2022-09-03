package fastcampus.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-04
 **/
public class Main {

    public static void main(String[] args) {
        Predicate<Integer> isPositive = (Integer x ) -> x > 0;
        System.out.println("isPositive = " + isPositive.test(1));
        System.out.println("isPositive = " + isPositive.test(-1));

        final List<Integer> integers = Arrays.asList(10, -1, -2, 5, 0);
        System.out.println("integers = " + filter(integers, isPositive));
        System.out.println("integers = " + filter(integers, isPositive.negate()));
        System.out.println("integers = " + filter(integers, isPositive.or(x -> x == 0)));
        System.out.println("integers = " + filter(integers, isPositive.and(x -> x % 2 == 0)));
    }

    public static <T> List<T> filter(List<T> inputs, Predicate<T> condition) {
        List<T> output = new ArrayList<>();
        for (T input : inputs) {
            if (condition.test(input)) {
                output.add(input);
            }
        }
        return output;
    }
}
