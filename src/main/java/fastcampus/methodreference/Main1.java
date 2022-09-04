package fastcampus.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-04
 **/
public class Main1 {
    public static int calculate(int x, int y, BiFunction<Integer, Integer, Integer> operator) {
        return operator.apply(x, y);
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public void myMethod() {
        final int calculate = calculate(10, 3, this::subtract);
        System.out.println("myMethod = " + calculate);
    }

    public static void main(String[] args) {
        final int a = Integer.parseInt("1");
        System.out.println("a = " + a);
        Function<String, Integer> str2Int = Integer::parseInt;
        final Integer apply = str2Int.apply("2");
        System.out.println("apply = " + apply);

        String str = "hello";
        boolean b = str.equals("world");
        System.out.println("b = " + b);
        Predicate<String> equalsToHello = str::equals;
        final boolean hello = equalsToHello.test("hello");
        System.out.println("hello = " + hello);

        final int calculate = calculate(1, 2, (x, y) -> x + y);
        System.out.println("calculate = " + calculate);

        final int calculate1 = calculate(5, 4, Main1::multiply);
        System.out.println("calculate1 = " + calculate1);

        final Main1 instance = new Main1();
        final int calculate2 = calculate(8, 1, instance::subtract);
        System.out.println("calculate2 = " + calculate2);

        instance.myMethod();
    }
}
