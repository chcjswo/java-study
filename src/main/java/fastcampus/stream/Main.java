package fastcampus.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-09-05
 **/
public class Main {
    public static void main(String[] args) {
        final Stream<String> stream = Stream.of("tony", "chcjswo", "srun75");
        final List<String> names = stream.collect(Collectors.toList());
        System.out.println("names = " + names);

        final String[] cities = {"Seoul", "New York", "Tokyo"};
        final Stream<String> cityStream = Arrays.stream(cities);
        final List<String> cityList = cityStream.collect(Collectors.toList());
        System.out.println("cityList = " + cityList);

        final Set<Integer> numbers = new HashSet<>(Arrays.asList(3, 7, 5));
        final Stream<Integer> numberStream = numbers.stream();
        final List<Integer> numberList = numberStream.collect(Collectors.toList());
        System.out.println("numberList = " + numberList);
    }
}
