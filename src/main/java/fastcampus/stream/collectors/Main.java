package fastcampus.stream.collectors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
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
        final List<Integer> numberList = Stream.of(3, 5, -3, 3, 4, 5)
            .collect(Collectors.toList());
        System.out.println("numberList = " + numberList);
        final Set<Integer> numberSet = Stream.of(3, 5, -3, 3, 4, 5)
            .collect(Collectors.toSet());
        System.out.println("numberSet = " + numberSet);
        final List<Integer> collect = Stream.of(3, 5, -3, 3, 4, 5)
            .collect(Collectors.mapping(x -> Math.abs(x), Collectors.toList()));
        System.out.println("collect = " + collect);
        final Set<Integer> numberSet2 = Stream.of(3, 5, -3, 3, 4, 5)
            .collect(Collectors.mapping(x -> Math.abs(x), Collectors.toSet()));
        System.out.println("numberSet2 = " + numberSet2);
        final int sum = Stream.of(3, 5, -3, 3, 4, 5)
            .collect(Collectors.reducing(0, Integer::sum));
        System.out.println("sum = " + sum);
    }
}
