package fastcampus.stream.findfirstorany;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-13
 **/
public class Main {
    public static void main(String[] args) {
        final Optional<Integer> any = Stream.of(-2, 3, 2, -5, 6)
            .filter(x -> x < 0)
            .findAny();
        System.out.println("any.get() = " + any.get());

        final Optional<Integer> first = Stream.of(3, 2, -5, 6)
            .filter(x -> x > 0)
            .findFirst();
        System.out.println("first.get() = " + first.get());
    }
}
